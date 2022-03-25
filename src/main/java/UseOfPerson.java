import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfPerson {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("abc", "am", "ade", "reu", "off", "lll");
        System.out.println(names);

        List<Person> people = names.stream()    //Stream<String>
                .map(name ->new Person(name))   //Stream<Person> map is not java key value pair map its to map
                .collect(Collectors.toList());  //Coverts

        System.out.println(people);

        //to use all the core of computer parallel
        List<Person> peopleAllCore = names.stream()    //Stream<String>
                .parallel()
                .map(Person::new)   //Stream<Person> map is not java key value pair map its to map
                .collect(Collectors.toList());  //Coverts
        System.out.println(peopleAllCore);

        //Stream into an array

        Person[] peopleArray = names.stream()
                .map(Person::new)
                .toArray(Person[]::new);
        System.out.println(Arrays.toString(peopleArray));
    }
}
