import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> streamBuilder = Stream.builder();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            streamBuilder.add(iterator1.next());
            streamBuilder.add(iterator2.next());
        }

        //first.forEach(System.out::println);
        return streamBuilder.build();
    }
    public static <T> Stream<T> zip2(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> streamBuilder = Stream.builder();
        Iterator<T> iterator2 = second.iterator();
        first.filter(x -> iterator2.hasNext()).forEach(x -> streamBuilder.add(x).add(iterator2.next()));
        return streamBuilder.build();
    }
    public static void main (String[]args){
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
        //Stream<Integer> stream = Main5.zip(list1.stream(), list2.stream());
        Stream<Integer> stream = Main5.zip2(list1.stream(), list2.stream());
        stream.forEach(System.out::println);
    }

}
