package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L1 {
    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(x -> System.out.print(x));

        System.out.println();

        IntStream.range(1, 10).skip(5) // skip first 5 elements
                .forEach(x -> System.out.print(x));

        System.out.println();

        int result = IntStream.range(1, 5).sum();
        System.out.println(result);

        System.out.println();

        Stream.of("India", "UK", "US").sorted().findFirst().ifPresent(x -> System.out.println(x));
        ;

        System.out.println();

        String[] items = { "car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy" };
        Stream.of(items).filter(item -> item.startsWith("t")).sorted().forEach(item -> System.out.print(item + ", "));

        System.out.println();

        // Average of squares of integers
        Arrays.stream(new int[] { 2, 4, 6, 8, 10 })
                .map((x) -> x * x)
                .average()
                .ifPresent((avg) -> System.out.println(avg));

        System.out.println();

        List<String> itemList = Arrays.asList("car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy");
        itemList.stream().map(x -> x.toLowerCase()).filter(x -> x.startsWith("c")).sorted()
                .forEach(item -> System.out.print(item + ", "));
    }
}

/*
 * 
 * java.util.stream package
 * 
 * Intermediate operations:
 * - Return a stream so that we can chain multiple intermediate operations
 * together.
 * - Zero or more intermediate operations are allowed.
 * - Order matters: Filter first, then sort or map etc.
 * - For very large datasets, we can use ParallelStream to enable multiple
 * threads to perform operations.
 * - Examples: filter(), distinct(), map(), skip(), sorted()
 * 
 * Terminal operations:
 * - Can return void or a non-stream result such as list or single value.
 * - One terminal operation only.
 * - forEach() applies the same function to each element.
 * - collect() saves the elements into a collection.
 * - Other operations REDUCE the stream into a single value: count(), sum(),
 * max(), min(), summaryStatistics()
 * 
 * Source of stream can be collection, file or data.
 */