// The package declaration should be done first.
package java_08_packages;

// Importing all public declarations using *
// import java_08_packages_2.*;

// Importing individual public classes
import java_08_packages_2.Animal;
import java_08_packages_2.Tree;

// Importing all static members 
// import static java.lang.Math.*;

// Importing individual static members
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class App {
    public static void main(String[] args) {

        Animal animal = new Animal(); // Constructor should be visible as well
        Tree tree = new Tree();
        // Tiger tiger = new Tiger(); // Not accessible because not public

        System.out.println(animal);
        System.out.println(tree);

        // Using fully qualified class name
        java.time.LocalDate date = java.time.LocalDate.now();
        System.out.println(date);

        // Statically imported static member
        System.out.println(PI);
        System.out.println(pow(3, 2));

    }
}

/*
 * 
 * ==========
 * Packages
 * ==========
 * 
 * A package is simply a container that groups related types (Java classes,
 * interfaces, enumerations, and annotations).
 * 
 * There are 2 types of packages:
 * ----------------------------------
 * 1. Built-in Package
 * => Built-in packages are existing java packages that come along with the JDK.
 * For example, java.lang, java.util, java.io
 * 
 * 2. User-defined Package
 * => Java also allows you to create packages as per your need. These packages
 * are called user-defined packages.
 * ----------------------------------
 * 
 * ======================
 * User-defined Package
 * ======================
 * 
 * To define a package in Java, you use the `package` keyword.
 * 
 * Java uses file system directories to store packages.
 * => Suppose you create Test.java file in com/test folder
 * => At the beginning of file add package statement: `package com.test;`
 * => The Test class now belongs to the com.test package.
 * 
 * 
 * Packages are represented as folders on file system. Files belonging to one
 * package are kept in one folder.
 * If package contains multiple words separated by '.' then nested folders
 * are created on file system (generally inside 'src' folder).
 * 
 * package main => src/main/
 * package com.company => src/com/company/
 * 
 * There is no limitation on how many subdirectories (package hierarchy) you can
 * create.
 * 
 * IDEs can create folder structures automatically when you create package using
 * IDE.
 * 
 * If you want to share the code with others, you have to make sure your
 * package names are unique in the WORLD! Therefore, common convention is to use
 * reverse domain name.
 * => com.company.name
 * 
 * 
 * =======================
 * Import packages
 * =======================
 * 
 * The import statement allows us to import an entire package or only certain
 * classes and interfaces defined in the package.
 * 
 * NOTE - You can only import classes, interfaces, enums and annotations that
 * are declared as `public` in other packages.
 * 
 * 
 * The import statement is written directly after the package statement
 * (if it exists) and before rest of the code.
 * 
 * To import certain class => import <package>.<class>;
 * To import whole package => import <package>.*;
 * 
 * The import statement is optional. If you want to use class/interface from a
 * certain package, you can also use its fully qualified name.
 * => java.time.LocalDate date = java.time.LocalDate.now();
 * 
 * 
 * ====================
 * Static imports
 * ====================
 * 
 * Static imports in Java allow us to import static members (variables and
 * methods) from a class so that we can use them without prefixing them with the
 * class name.
 * 
 * Syntax:
 * ------------------------------------------
 * 1. Import specific static member
 * => import static <package>.<class>.<static member>;
 * 
 * 2. Import all static members
 * => import static <package>.<class>.*;
 * ------------------------------------------
 * 
 */