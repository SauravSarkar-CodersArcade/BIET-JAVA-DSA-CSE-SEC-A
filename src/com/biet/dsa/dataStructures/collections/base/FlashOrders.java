package com.biet.dsa.dataStructures.collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class FlashOrders {
    public static void main(String[] args) {
        Collection<Integer> orderIDs = new ArrayList<>();
        orderIDs.add(101);
        orderIDs.add(102);
        orderIDs.add(103);
        System.out.println("Orders Received: " + orderIDs);
        System.out.println("No of active orders: " +
                orderIDs.size());
    }
}
