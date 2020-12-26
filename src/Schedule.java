import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {


    private Set<Seanse> seanses;


    public Schedule() {
        this.seanses = new TreeSet<>();
    }


    public Set<Seanse> getSeanses() {
        return seanses;
    }

    public void setSeanses(Set<Seanse> seanses) {
        this.seanses = seanses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(seanses, schedule.seanses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seanses);
    }

    @Override
    public String toString() {
        return "\r\n"+
                 seanses;
    }


    public void addSeanse(Seanse seanse) {
        if (seanses.contains(seanse)) {
            System.out.println("Сеанс " + seanse + " вже існує");
            return;
        }
        seanses.add(seanse);
        System.out.println(seanse + "додано до графіку сеансів");


    }


    public void removeSeanse(Seanse seanse) {
        if (seanses.isEmpty()) {
            System.out.println("Неможливо видалити " + seanse + " сеанс, в графіку не має жодного сеансу");
            return;
        }
        Iterator<Seanse> iterator = seanses.iterator();
        while (iterator.hasNext()) {
            Seanse seanseFilm = iterator.next();
            if (seanseFilm.equals(seanse)) {
                iterator.remove();
                System.out.println(seanse + "видалено з графіку");
                return;
            }
        }
        System.out.println("Такого " + seanse + " в графіку не має");
    }


}