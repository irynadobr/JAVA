import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class ContenPrinter implements Runnable {

    private final LineStorage lineStorage;
    private AtomicBoolean linePrinted;
    private AtomicBoolean lineWriten;
    private PrintWriter printWriter;

    public ContenPrinter(LineStorage lineStorage, AtomicBoolean linePrinted, AtomicBoolean lineWriten) throws IOException {
        this.lineStorage = lineStorage;
        this.linePrinted = linePrinted;
        this.lineWriten = lineWriten;
        this.printWriter = new PrintWriter(new FileWriter("2.txt"), true);
    }

    @Override
    public void run() {
        synchronized (lineStorage) {
            while (!lineStorage.getIsFinished().get()) {
                while (linePrinted.get()) {
                    try {
                        lineStorage.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                    if (lineStorage.getIsFinished().get()) {
                        System.out.println("CP finished");
                    } else {
                        try {
                            String s = lineStorage.getLine();
                            System.out.println(s);
                            printWriter.println(s);
                            linePrinted.set(true);
                            if (lineWriten.get()) {
                                lineStorage.notifyAll();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

