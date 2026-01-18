import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Task 1
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::print);
        System.out.println();

        // Task 2
        List<String> names = List.of("java","stream","api");
        names.stream().map(String::toUpperCase).forEach(System.out::print);
        System.out.println();

        // Task 3
        List<Integer> nums =  List.of(5, 10, 15, 20);
        nums.stream().filter(x -> x > 10).forEach(System.out::print);

        // Task 4
        List<String> data = Arrays.asList("A",null,"B",null,"C");
        data.stream().filter(Objects::nonNull).forEach(System.out::print);
    }
}