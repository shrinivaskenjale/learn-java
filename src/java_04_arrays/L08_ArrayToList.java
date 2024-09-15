package java_04_arrays;

import java.util.Arrays;
import java.util.List;

public class L08_ArrayToList {
    public static void main(String[] args) {
        // ===========
        // Example 1
        // ===========

        Integer[] numberArray = new Integer[] { 1, 2, 3 }; // int[] won't work

        List<Integer> numberList = Arrays.asList(numberArray);

        System.out.println(numberList);

        // numberList.add(5); // Exception
        // numberList.remove(0); // Exception
        numberList.set(1, 1000); // Works
        System.out.println(numberList.contains(3));

        System.out.println(numberList);

        // ===========
        // Example 2
        // ===========

        String[] namesArr = { "John", "Randy", "Brock" };
        List<String> namesList = Arrays.asList(namesArr);

        System.out.println(namesList);
        System.out.println(Arrays.toString(namesArr));

        // Changes made in either array or list are reflected in both.

        namesArr[0] = "Cody";

        System.out.println(namesList);
        System.out.println(Arrays.toString(namesArr));

        namesList.set(1, "Dolph");

        System.out.println(namesList);
        System.out.println(Arrays.toString(namesArr));

        // ===========
        // Example 3
        // ===========

        List<String> members = Arrays.asList("Larry", "Moe", "Curly");

        System.out.println(members);

    }
}

/*
 * Methods with `T... a` as parameter means method can accept variable number of
 * arguments or array of arguments.
 * 
 * Arrays.asList() has a time complexity of O(1). Because it does not create new
 * array and involves creating a wrapper around the array.
 * 
 * =======================
 * Arrays.asList(array)
 * =======================
 * 
 * Returns a fixed-size list backed by the specified array. Changes made to the
 * array will be visible in the returned list, and changes made to the list will
 * be visible in the array.
 * 
 * Note - For primitive types, array must be of wrapper classes.
 * 
 * => List<Integer> values = Arrays.asList(numbersArray);
 * 
 * All methods of List interface that don't change the size of the list can be
 * called.
 * => set(), contains(), indexOf() etc.
 * 
 * Methods of List that change the size of list throw
 * UnsupportedOperationException.
 * => add(), remove() etc.
 * 
 * =====================================================
 * Arrays.asList(element 1, element 2, element 3, ...)
 * =====================================================
 * 
 * This method also provides a convenient way to create a fixed-size list
 * initialized to contain several elements.
 * 
 * 
 * 
 * 
 * 
 */