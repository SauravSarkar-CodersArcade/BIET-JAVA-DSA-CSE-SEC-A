package com.biet.dsa.dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
import java.util.Queue;
public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity = new PriorityQueue<>();
        // 1 -> High Priority [Critically injured]
        // 5 -> Low Priority [Just some wounds and scratches]
        // 3 -> Medium Priority [Moderately injured]
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("Patient that gets operated first: "
        + severity.poll());
        System.out.println("Patient in queue: " + severity);
    }
}
