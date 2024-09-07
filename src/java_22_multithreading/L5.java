package java_22_multithreading;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class L5 {
    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            public void run() {
                manager.displaySoldProducts();
            }
        });

        inventoryTask.start();

        Thread.sleep(2000);

        // join() waits for this thread to die.
        // inventoryTask.join();

        displayTask.start();
        // displayTaks thread prints only few items that were added until main thread
        // was sleeping.
    }
}

class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }

}

class InventoryManager {
    // List<Product> soldProductList = new ArrayList<>();
    List<Product> soldProductList = new CopyOnWriteArrayList<>();
    List<Product> purchasedProductList = new ArrayList<>();

    public void populateSoldProducts() {
        for (int i = 0; i < 1000; i++) {
            Product product = new Product(i, "Product " + i);
            soldProductList.add(product);
            System.out.println("Added: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        for (Product product : soldProductList) {
            System.out.println("Printing sold product: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 * One thread will insert items in collection whereas other thread will read the
 * items simultaneously.
 * 
 * ArrayList is not thread safe. Vector is thread safe because all the methods
 * are synchronized.
 * Vector is slower than ArrayList.
 * 
 * Concurrent Collections:
 * The java.util.concurrent package includes a number of additions to the Java
 * Collections Framework. These collections are thread safe.
 * 
 */
