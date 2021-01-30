import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class LineStorage {
    private String line= "";
    private  AtomicBoolean isFinished =new AtomicBoolean(false);

    public LineStorage() {
    }
    public LineStorage(String line, AtomicBoolean isFinished) {
        this.line = line;
        this.isFinished = isFinished;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public AtomicBoolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(AtomicBoolean isFinished) {
        this.isFinished = isFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineStorage that = (LineStorage) o;
        return Objects.equals(line, that.line) &&
                Objects.equals(isFinished, that.isFinished);
    }
    @Override
    public int hashCode() {
        return Objects.hash(line, isFinished);
    }
    @Override
    public String toString() {
        return "LineStorage{" +
                "line='" + line + '\'' +
                ", isFinished=" + isFinished +
                '}';
    }
}

