package com.biet.dsa.dataStructures.collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ODR103");
        // Existence
        System.out.println("ORD102 exists? " +
                liveOrders.contains("ORD102"));
        liveOrders.remove("ODR103");
        System.out.println(liveOrders);
        liveOrders.clear(); // Clears everything
        System.out.println("Orders after closure: " + liveOrders);
    }
}
