import lombok.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person {

    private String name;
    private LocalDate  birthday;
    private int age;
    private List<Book>books= Arrays.asList();


}
