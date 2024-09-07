package java_13_generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("C", "D", "E"));

        Set<String> resultSet = union(set1, set2);
        System.out.println(resultSet);
    }

    // Generic methods
    // Define generic types in <> before return type.
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // public static Set union(Set set1, Set set2) {
    // Set result = new HashSet(set1);
    // result.addAll(set2);
    // return result;
    // }
}

/*
 * Generic methods infer type from arguments.
 */