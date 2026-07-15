package com.biet.dsa.dataStructures.collections.list;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        System.out.println("Cart Items: " + cart);
        cart.remove("Mouse"); // removing an item
        System.out.println("Cart Items after removal: " + cart);
        cart.set(1, "Mechanical Keyboard"); // updating an item
        System.out.println("Cart Items after Update: " + cart);
    }
}
