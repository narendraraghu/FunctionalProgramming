package narendra;

import lombok.*;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    String name;

    public Person(String...names)
    {
        System.out.println("Vararg constructor "+ Arrays.asList(names));
        name = String.join(" ",names);
    }
}
