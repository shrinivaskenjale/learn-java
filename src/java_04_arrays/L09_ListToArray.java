package java_04_arrays;

import java.util.ArrayList;

import java.util.List;

public class L09_ListToArray {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // =================
        // toArray()
        // =================

        Object[] array1 = list.toArray();

        for (Object obj : array1) {
            // Need to cast to the correct type
            String value = (String) obj;
            System.out.println(value);
        }

        // =================
        // toArray(array)
        // =================

        // Provide an array of the correct type and size 0
        String[] array2 = list.toArray(new String[0]);

        for (String value : array2) {
            System.out.println(value);
        }

    }
}

/*
 * The toArray() method of various collections can be used in two main
 * ways.
 * 
 * ==============================================
 * 1. toArray() - Using the no-argument version
 * ==============================================
 * 
 * The no-argument version of toArray() returns an array of Object type,
 * containing all elements of the collection.
 * 
 * =====================================================
 * 2. toArray(array) - Using the generic array version
 * =====================================================
 * 
 * This version of toArray() allows you to specify the type of the array. This
 * is preferred method as it provides type safety and avoids the need for
 * casting.
 * 
 * The second method is type-safe as it directly provides an array of the
 * correct type.
 * 
 * If the provided array is large enough to hold the collection, it is used and
 * elements of collection are copied into it starting from index 0. Beyond the
 * size of the collection, the extra elements in the array will be set to null.
 * 
 * If the provided array is smaller than list, a new array of the same type is
 * created and returned.
 * To always get new array we can pass new array of size 0.
 * 
 * This second method can be slightly more efficient if the array size is known
 * and provided appropriately, avoiding the creation of a new array.
 */