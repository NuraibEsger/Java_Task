import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        System.out.println();

        // Task 5
        List<String> names2 = List.of("Bob","Alice","Andrew","Charlie");
        names2.stream().filter(x -> x.startsWith("A")).findFirst().ifPresent(System.out::print);
        System.out.println();

        // Task 6
        List<Integer> numbers = List.of(3,1,4,2);
        numbers.stream().map(x -> Math.pow(x, 2)).sorted().forEach(System.out::println);

        // Task 7
        List<Integer> numbersForSum = List.of(1, 2, 3, 4, 5, 6);
        int sum = numbersForSum.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        // Task 8
        List<String> words = List.of("apple","banana","kiwi");
        Map<String, Integer> mappedWords = words
                .stream()
                .collect(Collectors.toMap(word -> word, String::length));
        System.out.println(mappedWords);

        // Task 9
        List<Integer> maxNumbers = List.of(10,50,30);
        maxNumbers.stream().max(Integer::compareTo).ifPresent(System.out::println);

        // Task 10
        List<String> groupWords = List.of("a","bb","ccc","dd");
        Map<Integer, List<String>> groupedByLength = groupWords
                .stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);

        // Task 11
        List<Integer> partitionNumbers = List.of(1,2,3,4,5);
        Map<Boolean, List<Integer>> partitionedMap = partitionNumbers
                .stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println("Even numbers (true) " + partitionedMap.get(true));
        System.out.println("Odd numbers (false) " + partitionedMap.get(false));
    }
}