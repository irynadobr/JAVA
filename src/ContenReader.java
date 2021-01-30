import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class ContenReader implements Runnable{
 private final LineStorage lineStorage;
 private  BufferedReader bufferedReader;

    public ContenReader(LineStorage lineStorage, BufferedReader bufferedReader) {
        this.lineStorage = lineStorage;
        this.bufferedReader = bufferedReader;
    }

    @Override
    public void run() {
        String line;
       synchronized (lineStorage){
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    lineStorage.setLine(line);
                    lineStorage.notify();
                    try {
                        lineStorage.wait();
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
           lineStorage.getIsFinished().set(true);
                        lineStorage.notify();

        }
    }
}
