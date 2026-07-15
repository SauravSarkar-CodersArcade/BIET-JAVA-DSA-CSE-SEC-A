package com.biet.dsa.dataStructures.collections.queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
public class Orders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        orders.add("Order-101"); // very Strict -> Exception
        orders.offer("Order-102"); // not strict -> Ignores
        System.out.println("List of orders:" + orders);
        // poll is not strict - Ignores
        // remove is strict - Throws an exception
        System.out.println("Serving now: " + orders.remove());
        System.out.println("Serving next: " + orders.poll());
        System.out.println("Current Orders: " + orders);
        // IllegalStateException -> add()
        // NoSuchElementException -> remove()
    }
}
