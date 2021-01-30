public class ContenPrinter implements Runnable {
    private final LineStorage lineStorage;

    public ContenPrinter(LineStorage lineStorage) {
        this.lineStorage = lineStorage;
    }

    @Override
    public void run() {
        synchronized (lineStorage) {

          while (!lineStorage.getIsFinished().get())

          {
              try {

                  lineStorage.wait();
              }
              catch (Exception e) {
                  e.printStackTrace();
              }

              if (lineStorage.getIsFinished().get()==true) {
                  System.out.println("Done");

              }
              else {
                  System.out.println(lineStorage.getLine());
                  lineStorage.notify();
              }

}

          }
        }
    }
