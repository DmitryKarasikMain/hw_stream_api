import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream intStream = createRandomIntStream();

        List<Integer> nums =
                intStream
                        .boxed().collect(Collectors.toList());

        intStream = createRandomIntStream();

        long evenNumsCount =
                intStream
                        .filter(x -> x % 2 == 0)
                        .count();

        intStream = createRandomIntStream();

        long intStreamSum =
                intStream
                        .reduce(0, (acc, x) -> acc + x);

        System.out.println(nums);
        System.out.println(evenNumsCount);
        System.out.println(intStreamSum);
        System.out.println("==================");

        createRandomIntStream()
                .mapToObj(x -> Integer.toString(x))
                .forEach(x -> System.out.println(x));
    }

    public static IntStream createRandomIntStream() {
        return new Random()
                .ints(1000, 10, 10000);
    }
}