import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Oleg");
        list.add("Ivan");
        list.add("Oleg");
        list.add("Ivan");
        list.add("Oleg");
        list.add("Ivan");
        list.add("Oleg");
        list.add("Ivan");

        String lists = IntStream.range(0, list.size())
                .filter(i -> i % 2 == 0)
                .boxed()
                .map(x -> (x + 1) + ". "  + list.get(x))
                .collect(Collectors.joining(", "));

        System.out.println(lists);
    }




}
