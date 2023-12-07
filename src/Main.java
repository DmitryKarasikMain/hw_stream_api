import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("================= 1 задание =================");
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


        createRandomIntStream()
                .mapToObj(x -> Integer.toString(x))
                .forEach(x -> System.out.println(x));
        System.out.println(nums);
        System.out.println(evenNumsCount);
        System.out.println(intStreamSum);
        System.out.println("================= 2 задание =================");

        List<String> strs = List.of(
                "qwe", "QWErty", "xzcv 123", "a",
                "sfgsdg s", "xz23a sdasda", "a2", "sdgs"
        );

        strs.stream()
                .filter(x -> x.length() > 3)
                .map(x -> x.toUpperCase())
                .forEach(x -> System.out.println(x));
    }

    public static IntStream createRandomIntStream() {
        return new Random()
                .ints(1000, 10, 10000);
    }
}