package java_08_packages_2;

public class Animal {

}

// A class that is not public will not be imported. If you want to use it from
// another package make it public and move it to its own file.
class Tiger extends Animal {

}

/*
 * If no constructor is defined in a class, the compiler automatically provides
 * a default no-argument constructor. The access modifier of this constructor
 * will match the access level of the class. So, if the class is public, the
 * default constructor will also be public; if the class is package-private (no
 * modifier), the default constructor will also be package-private.
 */