package com.biet.dsa.dataStructures.collections.set;
import java.util.Set;
import java.util.TreeSet;
public class Leaderboard {
    public static void main(String[] args) {
        // Suppose we want to maintain ascending order
        // And we also want to maintain non-duplicates
        // Then we use the TreeSet Data Structure
        Set<Integer> scores = new TreeSet<>();
        scores.add(450);
        scores.add(5);
        scores.add(4);
        scores.add(450);
        scores.add(1);
        scores.add(8);
        scores.add(45);
        scores.add(450);
        System.out.println("Leader Board Stats: " + scores);
    }
}
