package java_01_basics;

public class L01_FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


/*
 * ========================
 * Java files and classes
 * ========================
 *
 * Public classes should be declared in a file named <PublicClassName>.java
 * only.
 *
 * Java files can have any no. of non-public classes.
 *
 * Therefore, one java file can have at most 1 public class.
 *
 * If file doesn't have public class, then file can be named anything.
 *
 * =======================
 * Compiling java program
 * =======================
 *
 * Compile: javac -d <path-to-create-class-files> <path-to-source-file>
 *
 * When we compile program, compiler creates `.class` files for each
 * class in the file.
 *
 * =========================
 * Running compiled code
 * =========================
 *
 * Run: java <class-name-which-has-main-method>
 *
 * ===================
 * Running .jar file
 * ===================
 *
 * Use jar command to create, extract and list the content of jar file.
 *
 * Run: java -jar <path to .jar file>
 *
 *
 */
