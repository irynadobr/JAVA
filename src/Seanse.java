import java.util.Objects;

public class Seanse implements Comparable<Seanse> {


    @Override
    public int compareTo(Seanse seanse) {
        int startTimeHour = this.startTime.getHour() - seanse.getStartTime().getHour();
        int startTimeMin = this.startTime.getMin() - seanse.getStartTime().getMin();
        if (startTimeHour != 0) {
            return startTimeHour;
        } else

            return startTimeMin;

    }

    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seanse() {
    }

    public Seanse(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        endTime();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seanse seanse = (Seanse) o;
        return Objects.equals(movie, seanse.movie) &&
                Objects.equals(startTime, seanse.startTime) &&
                Objects.equals(endTime, seanse.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }

    @Override
    public String toString() {
        return "\r\n" + "Seanse: " + "\r\n" +
                 movie + "\r\n" +
                " startTime=" + startTime +
                ", endTime=" + endTime +
                '-';
    }


    public void endTime() {
        int hour = this.startTime.getHour() + this.getMovie().getDuration().getHour();
        int min = this.startTime.getMin() + this.getMovie().getDuration().getMin();
        if (hour > 23) {
            hour -= 24;
        }
        if (min > 59) {
            hour += 1;
            min -= 60;
        }

        this.endTime = new Time(hour, min);

    }

}

