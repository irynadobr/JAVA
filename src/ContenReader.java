import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;


public class ContenReader implements Runnable {

    private final LineStorage lineStorage;
    private BufferedReader bufferedReader;
    private AtomicBoolean linePrinted;
    private AtomicBoolean lineWriten;

    public ContenReader(LineStorage lineStorage, BufferedReader bufferedReader, AtomicBoolean linePrinted, AtomicBoolean lineWriten) {
        this.lineStorage = lineStorage;
        this.bufferedReader = bufferedReader;
        this.linePrinted = linePrinted;
        this.lineWriten = lineWriten;
    }

    @Override
    public void run() {
        String line;
        synchronized (lineStorage) {
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    lineStorage.setLine(line);

                    linePrinted.set(false);
                    lineWriten.set(false);

                    lineStorage.notifyAll();
                    try {
                        lineStorage.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            lineStorage.getIsFinished().set(true);
            linePrinted.set(false);
            lineWriten.set(false);
            lineStorage.notifyAll();
        }
    }
}
