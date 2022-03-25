import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultMethodTest {
    @Test
    public void list_of_string() {
        List<String> stringList = Arrays.asList("I", "am", "a", "list", "of", "Strings");
        //stringList.forEach(word-> System.out.println(word)); or
        stringList.forEach(System.out::println);
        //but you cant use method ref when u do something with word
        stringList.forEach(word-> System.out.println("Next word is "+word));
    }

    @Test
    public void list_of_map() {
    Map<String,Integer> map = new HashMap<>();
    map.put("a",1);map.put("b",2);map.put("c",3);
    //old way why should i care about the type
        for (Map.Entry<String ,Integer> entry: map.entrySet()) {
            System.out.println(entry.getValue());
        }

        for(String key:map.keySet())
        {
            System.out.println(key +" map "+map.get(key));
        }
        //with lambda
        map.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
