import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task 1
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        // Task 2
        List<String> names = List.of("java","stream","api");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}