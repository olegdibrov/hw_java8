import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        List<String> newList = list.stream().map(String::toUpperCase).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(newList);
    }
}
