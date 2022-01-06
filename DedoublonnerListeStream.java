import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DedoublonnerListeStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{7,4,1,6,8,3,8,4,1,1,7,4,4});
        Stream<Integer> s = list.stream().filter(i -> Collections.frequency(list, i) > 1);
        s.collect(Collectors.toSet()).forEach(System.out::println);
    }
}
