import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1, 2, 0", "4, 5");
        List<Integer> list1 = new ArrayList<>();
        list.stream().map(x -> x.split(",")).forEach(x -> Arrays.stream(x).map(String::trim).mapToInt(Integer::parseInt).forEach(list1::add));
        System.out.println(list1);
    }
}