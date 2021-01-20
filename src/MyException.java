public class MyException extends Exception {
    private String veryMesendg;

    public MyException(String message, String veryMesendg) {
        super(message);
        this.veryMesendg = veryMesendg;
    }

    public String getVeryMesendg() {
        return veryMesendg;
    }

    public void setVeryMesendg(String veryMesendg) {
        this.veryMesendg = veryMesendg;
    }
}
