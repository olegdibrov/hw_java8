import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = new Double( Math.pow(2, 48)).longValue();
        List<Long> list = LongStream.iterate(1, (x) -> (a * x + c) % m ).boxed().collect(Collectors.toList());
        Stream<Long>  stream = list.stream();

    }
}
