package java_13_generics;

public class B {
    public static void main(String[] args) {
        // ContainerV2 c = new ContainerV2("Shri", 12);

        ContainerV2<String, Integer> c = new ContainerV2<>("Shri", 12);

        String str = c.getItem1();
        // String num = c.getItem2(); // Compile time check
        int num = c.getItem2();

        System.out.println(str);
        System.out.println(num);

    }

}

class ContainerV2<Type1, Type2> {
    private Type1 item1;
    private Type2 item2;

    public ContainerV2(Type1 item1, Type2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems() {
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }

    public Type1 getItem1() {
        return item1;
    }

    public void setItem1(Type1 item1) {
        this.item1 = item1;
    }

    public Type2 getItem2() {
        return item2;
    }

    public void setItem2(Type2 item2) {
        this.item2 = item2;
    }

}

/*
 * Type parameters are represented by single capital letter.
 * 
 * In java
 * E - Entry
 * T - Type
 * K - Key
 * V - Value
 */