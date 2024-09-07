package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L2 {
    public static void main(String[] args) {
        List<Integer> nums = Stream.of(5, 1, 4, 6, 5, 8, 1, 0).distinct().sorted().collect(Collectors.toList());
        System.out.println(nums);
    }
}

/*
 * java.util.stream package
 * 
 * Stream API helps to work with the collection without modifying underlying
 * collection.
 * 
 * Stream<Integer> stream = list.stream();
 * 
 * filter()
 * distinct()
 * sorted()
 * forEach()
 * count()
 * collect(Collectors.toList()) => returns list
 * map()
 * 
 * 
 * =====================
 * 1. Intermediate operations
 * If operation returns another stream.
 * filter(), distinct(), sorted() etc.
 * 
 * 2. Terminal operations
 * If operation returns non-stream type or void.
 * forEach(), count(), collect()
 * 
 * Note - Intermediate operation won't work until it is followed by any other
 * operation. They are lazy.
 * => stream.filter(); // Won't work
 * => stream.filter().count(); // Will work
 * 
 * Once a terminal operation is performed, stream is closed and no longer
 * available.
 * 
 * =====================
 * 
 * Stream<Integer> stream = Stream.of(4,6,3,2);
 * stream.map(k->k*2).forEach(k->System.out.println(k));
 * 
 * Stream<String> stream = Stream.of("a", "ab", "abc");
 * 
 * ======================
 * 
 * Primitive type streams
 * IntStream, LongStream, DoubleStream etc.
 * 
 * int[] arr = {1,2,4};
 * IntStream stream = Arrays.stream(arr);
 * 
 * ==================
 * 
 * Check method reference
 * 
 */