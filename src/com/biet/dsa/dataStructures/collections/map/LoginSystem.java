package com.biet.dsa.dataStructures.collections.map;
import java.util.HashMap;
import java.util.Map;
public class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("admin", "admin@123");
        users.put("user1", "pass1");
        users.put("user2", "pass2");
        users.put("guest1", "guestPass");
        System.out.println("Users: " + users);
        System.out.println("Admin Password: " +
                users.get("admin"));
        users.put("admin", "admin@456"); // Update
        System.out.println("Admin Password: " +
                users.get("admin"));
        users.put("user1", "pass-user");
        System.out.println(users);
        // Use a for loop to display the K-V[Entry] pairs in the map
        for (Map.Entry<String, String> entry : users.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
