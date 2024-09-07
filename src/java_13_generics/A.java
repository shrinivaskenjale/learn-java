package java_13_generics;

public class A {
    public static void main(String[] args) {
        ContainerV1 c = new ContainerV1("Shri", 12);

        String str = (String) c.getItem1(); // Fine
        String num = (String) c.getItem2(); // Problem

        System.out.println(str);
        System.out.println(num);
    }
}

class ContainerV1 {
    private Object item1;
    private Object item2;

    public ContainerV1(Object item1, Object item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems() {
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }

    public Object getItem1() {
        return item1;
    }

    public void setItem1(Object item1) {
        this.item1 = item1;
    }

    public Object getItem2() {
        return item2;
    }

    public void setItem2(Object item2) {
        this.item2 = item2;
    }

}