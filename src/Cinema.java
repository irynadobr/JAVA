import java.util.*;

public class Cinema {


    private TreeMap<Days, Schedule> cinema;
    private Time open;
    private Time close;

    public Cinema(int i, int i1) {
    }

    public Cinema(Time open, Time close) {
        setOpen(open);
        setClose(close);
        this.cinema = new TreeMap<>();
    }

    public TreeMap<Days, Schedule> getCinema() {
        return cinema;
    }

    public void setCinema(TreeMap<Days, Schedule> cinema) {
        this.cinema = cinema;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        if (open.getHour() == 9 && open.getMin() == 0)
            this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        if (close.getHour() == 23 && close.getMin() == 59)
            this.close = close;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema1 = (Cinema) o;
        return Objects.equals(cinema, cinema1.cinema) &&
                Objects.equals(open, cinema1.open) &&
                Objects.equals(close, cinema1.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinema, open, close);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cinema=" + cinema +
                ", open=" + open +
                ", close=" + close +
                '}';
    }


    public void addSeanses(String day, Seanse... seanses) {
        for (Seanse seanse : seanses) {
            addSeanse(day, seanse);
        }
        System.out.println("Графік сеансів кінотеатру:  " + "\r\n" + cinema +
                "open cinema: " + open + "  close cinema: " + close);
        System.out.println("-------------------------------------------------------------------------");
    }


    public void addSeanse(String day, Seanse seanse) {
        if (considerationCloseAndOpenAtFormationSeanse(seanse) == false)
            return;
        for (Days days : Days.values()) {
            if (days.name().equals(day)) {

                if (cinema.containsKey(days)) {
                    cinema.get(days).addSeanse(seanse);
                    System.out.println(day);
                    System.out.println("-------------------------------------------------------------------------");
                    return;
                }
                Schedule schedule = new Schedule();
                schedule.addSeanse(seanse);
                cinema.put(days, schedule);
                System.out.println(day);
                System.out.println("-------------------------------------------------------------------------");
                return;
            }

        }
        System.out.println("в " + day + " кінотеатр не працює, " + seanse + " не додано до графіку");
    }

    public void removeMovie(Movie movie) {
        int s = 0;
        int s1 = 0;
        System.out.println("Дні роботи кінотеатру " + cinema.keySet());
        Iterator<Schedule> scheduleIterator = this.cinema.values().iterator();
        while (scheduleIterator.hasNext()) {
            Schedule schedule = scheduleIterator.next();
            s = schedule.getSeanses().size();
            schedule.getSeanses().removeIf(seance -> seance.getMovie().equals(movie));
            s1 = schedule.getSeanses().size();
        }
        if (s1 < s) {
            System.out.println(" видалено з графіку кінотеатру фільм: " + movie.title);

        } else {
            System.out.println(" у графіку кінотеатру немає  фільму: " + movie.getTitle());
        }
    }

    public void removeSeanse(String day, Seanse seanse) {
        for (Days days : Days.values()) {
            if (days.name().equals(day)) {
                if (cinema.containsKey(days)) {
                    if (cinema.get(days).getSeanses().contains(seanse)) {
                        cinema.get(days).removeSeanse(seanse);
                        System.out.println("-------------------------------------------------------------------------");
                        return;
                    }
                }
                System.out.println("в " + day + " немає  такого сеансу, " + seanse + " не видалено");
                return;
            }
        }
        System.out.println("в " + day + " кінотеатр не працює, " + seanse + " не видалено з графіку");
    }

    public boolean considerationCloseAndOpenAtFormationSeanse(Seanse seanse) {
        if (getOpen() == null || getClose() == null) {
            System.out.println("Не введено час відкриття і закриття кінотеатру");
            return false;
        }
        int considerationCloseHourAtformationSeanse = close.getHour() - seanse.getEndTime().getHour();
        int considerationOpenHourAtformationSeanses = seanse.getStartTime().getHour() - this.open.getHour();
        if (considerationCloseHourAtformationSeanse < 0 ||
                (considerationCloseHourAtformationSeanse == 0 &&
                        (close.getMin() - seanse.getEndTime().getMin()) < 0) ||
                (considerationOpenHourAtformationSeanses < 0) ||
                (considerationOpenHourAtformationSeanses == 0 &&
                        (seanse.getStartTime().getMin() - this.open.getMin()) < 0)) {
            System.out.println("При формуванні сеансу: " + seanse + " не враховано час відкриття і закриття кінотеатру" + "\r\n" +
                    " фільм: " + seanse.getMovie().getTitle() + " не додано до графіку сеансів, " + "\r\n" + "кінотеатр в цей час зачинено.");
            System.out.println("-------------------------------------------------------------------------");
            return false;
        }
        return true;
    }

}
