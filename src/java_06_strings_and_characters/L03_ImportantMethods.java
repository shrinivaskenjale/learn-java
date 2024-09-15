package java_06_strings_and_characters;

import java.util.Arrays;

public class L03_ImportantMethods {
    public static void main(String[] args) {
        // ====================
        // str1.equals(str2)
        // ====================

        // Checks equality of two strings.

        System.out.println("shrinivas".equals("shrinivas")); // true

        // ===========================================
        // str1.equalsIgnoreCase(str2)
        // ===========================================

        // Checks equality of two strings by ignoring case.

        System.out.println("SHRINIVAS".equalsIgnoreCase("Shrinivas")); // true

        // ===============
        // str.length()
        // ===============

        // Returns string length.

        System.out.println("shrinivas".length()); // 9

        // ===================
        // str.charAt(index)
        // ===================

        // Returns character at given index.

        // We get StringIndexOutOfBoundsException exception if we try to access the
        // character beyond length of the string.

        char firstLetter = "Shrinivas".charAt(0);
        System.out.println(firstLetter); // 'S'

        // ===========================================
        // str.substring(fromIndex)
        // str.substring(fromIndex, toIndex)
        // ===========================================

        // Returns substring of a string between fromIndex and toIndex(excluded).
        // Size of the substring will be toIndex-fromIndex.
        // toIndex is optional.

        String myString = "Shrinivas Kenjale";
        String fromStartIndex = myString.substring(10);
        String fromStartToEndIndex = myString.substring(0, 4);

        System.out.println(fromStartIndex); // Kenjale
        System.out.println(fromStartToEndIndex); // Shri

        // ====================
        // str.indexOf(key)
        // str.indexOf(key, from index)
        // ====================

        // Returns the index of the first occurence of the key string if present else
        // -1.

        System.out.println("shrinivas kenjale".indexOf("kenjale")); // 10
        System.out.println("shrinivas kenjale".indexOf("coder")); // -1

        // =====================
        // str.contains(key)
        // =====================

        // Checks presence of key string in original string.

        System.out.println("Shrinivas Kenjale".contains("nivas")); // true

        // ========================
        // str.replace(old, new)
        // ========================

        // Returns new string by replacing all occurences of specified single character
        // or String value with given value.

        // Replacing characters.
        System.out.println("shrinivas".replace('s', 'k')); // "khrinivak"

        // Replacing substring.
        System.out.println("Hello Shrinivas! Shrinivas".replace("Shrinivas", "Shri")); // "Hello Shri! Shri"

        // ================================
        // str.replaceAll(regex, new)
        // ================================

        // Difference between replace() and replaceAll() is that replaceAll() can take
        // regex.

        System.out.println("Hello Shrinivas! Shrinivas".replaceAll("Shrinivas", "Shri")); // "Hello Shri! Shri"

        // ==============================
        // str.replaceFirst(regex, new)
        // ==============================

        // Returns new string by replacing the first occurence of matching pattern.

        System.out.println("Hello Shrinivas! Shrinivas".replaceFirst("Shrinivas", "Shri")); // "Hello Shri! Shrinivas"

        // =====================
        // str1.concat(str2)
        // =====================

        // Concatenates two strings and returns new string

        String fullName = "Shrinivas".concat("Kenjale");
        System.out.println(fullName); // "ShrinivasKenjale"

        // =====================
        // str.toUpperCase()
        // =====================

        // Returns new string in uppercase.

        System.out.println("shrinivas".toUpperCase()); // "SHRINIVAS"

        // =====================
        // str.toLowerCase()
        // =====================

        // Returns new string in lowercase.

        System.out.println("SHRINIVAS".toLowerCase()); // "shrinivas"

        // ============
        // str.trim()
        // ============

        // Returns new string by removing all white spaces from beginning and ending of
        // the string.

        System.out.println("   \n  Whitespaces are removed here.  ".trim());

        // ================
        // str.isEmpty()
        // ================

        // Checks whether string is empty.
        // Empty means string having length 0.

        System.out.println("".isEmpty()); // true
        System.out.println(" ".isEmpty()); // false
        System.out.println("shrinivas".isEmpty()); // false

        // ================
        // str.isBlank()
        // ================

        // Checks whether string is empty or only contains whitespaces.

        System.out.println("".isBlank()); // true
        System.out.println(" \n ".isBlank()); // true
        System.out.println("shrinivas".isBlank()); // false

        // =======================
        // str.startsWith(key)
        // =======================

        // Checks if string starts with key.

        System.out.println("shrinivas".startsWith("shri")); // true

        // Check starting from index.
        System.out.println("shrinivas".startsWith("vas", 6)); // true

        // =====================
        // str.endsWith(key)
        // =====================

        // Checks if string ends with key.

        System.out.println("shrinivas".endsWith("vas")); // true

        // ====================
        // str.toCharArray()
        // ====================

        // Returns character array of given string.

        char[] characters = "shrinivas kenjale".toCharArray();

        System.out.println(characters[0]); // 's'
        System.out.println(characters[1]); // 'h'
        System.out.println(characters[2]); // 'r'
        System.out.println(characters[3]); // 'i'

        // ========================
        // str.split(separator)
        // ========================

        // Divides the string at the specified regex pattern and returns an array of
        // substrings.

        String[] splitString = "My name is Shrinivas".split(" ");

        System.out.println(splitString[0]); // "My"
        System.out.println(splitString[1]); // "name"

        // ====================================
        // String.join(delimiter, iterable)
        // ====================================

        // Joins elements of the iterable and returns a string.

        System.out.println(String.join("-", splitString)); // "My-name-is-Shrinivas"
        System.out.println(String.join(" ", Arrays.asList("Tech", "Mahindra")));

        // ===============================================
        // String.valueOf(primitives / char[] / object)
        // ===============================================

        // Converts different types of values into string.

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        System.out.println(String.valueOf(vowels)); // "aeiou"

        // For char[], println() automatically calls String.valueOf().
        System.out.println(vowels); // "aeiou"

        System.out.println(vowels.toString()); // [C@4617c264

        // ====================
        // String reversal
        // ====================

        // String class does not have reverse() method, we need to convert the input
        // string to StringBuffer/StringBuilder instance, which has reverse() method and
        // reverses original string.

        String city = "satara";
        StringBuilder citySB = new StringBuilder(city);
        citySB.reverse();
        System.out.println(citySB); // "aratas"

        city = citySB.toString();
        System.out.println(city); // "aratas"

    }
}
