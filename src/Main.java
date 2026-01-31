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

        // Task 12
        List<Integer> duplicatedNumbers = List.of(1,2,3,2,4,3,5);
        Set<Integer> items = new HashSet<>();
        Set<Integer> duplicates = duplicatedNumbers.stream()
                .filter(x -> !items.add(x))
                .collect(Collectors.toSet());
        System.out.println("Duplicates: " + duplicates);

        // Task 13
        List<List<String>> listOfLists = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );

        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);

        // Task 14
        List<Employee> employees = List.of(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 40000)
        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .toList();

        System.out.println("Sorted by Salary: " + sortedEmployees);

        // Task 15
        double averageSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println("Average Salary: " + averageSalary);

        // Task 16
        List<String> names16 = List.of("A", "B", "C");
        names16.forEach(System.out::println);

        // Task 17
        List<Integer> nums17 = List.of(1, 4, 6, 8, 2);
        List<Integer> filtered = nums17.stream()
                .filter(n -> n > 5)
                .toList();
        System.out.println("17. > 5: " + filtered);

        // 18
        List<Integer> nums18 = List.of(1, 2, 3);
        List<Integer> doubled = nums18.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("18. Doubled: " + doubled);

        // 19
        List<String> words19 = List.of("java", "stream");
        List<Integer> lengths = words19.stream()
                .map(String::length)
                .toList();
        System.out.println("19. Lengths: " + lengths);

        // 20
        List<Integer> nums20 = List.of(1, 3, 5, 6);
        boolean anyEven = nums20.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("20. Any even? " + anyEven);

        // 21
        List<Integer> nums21 = List.of(1, 2, 3, -1);
        boolean allPositive = nums21.stream().allMatch(n -> n > 0);
        System.out.println("21. All positive? " + allPositive);

        // 22
        List<Integer> nums22 = List.of(1, 2, 3);
        boolean noneNegative = nums22.stream().noneMatch(n -> n < 0);
        System.out.println("22. None negative? " + noneNegative);

        // 23
        List<String> names23 = List.of("Banana", "Apple", "Mango");
        List<String> sortedNames = names23.stream()
                .sorted()
                .toList();
        System.out.println("23. Sorted: " + sortedNames);

        // 24
        List<Integer> nums24 = List.of(4, 1, 7, 2);
        List<Integer> descNumbers = nums24.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("24. Descending: " + descNumbers);

        // 25
        List<Integer> nums25 = List.of(9, 3, 6);
        Optional<Integer> min = nums25.stream().min(Integer::compare);
        System.out.println("25. Minimum: " + min.orElse(0));

        // 26
        List<String> names26 = List.of("Java", "Python", "C++");
        Optional<String> first = names26.stream().findFirst();
        System.out.println("26. First: " + first.orElse("None"));

        // 27
        List<Integer> nums27 = List.of(1, 2, 3, 4, 5);
        List<Integer> skipped = nums27.stream()
                .skip(2)
                .toList();
        System.out.println("27. Skipped: " + skipped);

        // 28
        List<Integer> nums28 = List.of(10, 20, 30, 40, 50);
        List<Integer> limited = nums28.stream()
                .limit(3)
                .toList();
        System.out.println("28. Limited: " + limited);

        // 29
        List<Integer> nums29 = List.of(1, 2, 2, 3, 3, 4);
        List<Integer> distinct = nums29.stream()
                .distinct()
                .toList();
        System.out.println("29. Distinct: " + distinct);

        // 30
        List<Integer> nums30 = List.of(1, 2, 3);
        List<String> strNums = nums30.stream()
                .map(String::valueOf)
                .toList();
        System.out.println("30. As Strings: " + strNums);

        // 31
        List<String> words31 = List.of("A", "B", "C");
        String joined = String.join(", ", words31);
        System.out.println("31. Joined: " + joined);

        // 32
        List<Integer> nums32 = List.of(1, 2, 3, 4);
        int sum32 = nums32.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("32. Sum: " + sum32);

        // 33
        List<String> items33 = List.of("pen", "pencil", "eraser");
        long count = items33.size();
        System.out.println("33. Count: " + count);

        // 34
        List<String> list34 = List.of();
        boolean isEmpty = list34.stream().count() == 0;
        System.out.println("34. Is Empty? " + isEmpty);

        // 35
        List<String> names35 = List.of("A", "B", "A");
        Set<String> set = new HashSet<>(names35);
        System.out.println("35. As Set: " + set);
    }
}