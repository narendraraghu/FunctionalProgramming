import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class DefaultMethodTest {
    @Test
    public void list_of_string() {
        List<String> stringList = Arrays.asList("I", "am", "a", "list", "of", "Strings");
        //stringList.forEach(word-> System.out.println(word)); or
        stringList.forEach(System.out::println);
        //but you cant use method ref when u do something with word
        stringList.forEach(word-> System.out.println("Next word is "+word));


    }
}
