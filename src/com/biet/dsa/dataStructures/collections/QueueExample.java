package com.biet.dsa.dataStructures.collections;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // ☑ To enqueue items there are two methods
        // ✅ add() -> very strict offer() -> not strict
        // ☑ The dequeue items there are two methods
        // ✅ remove() -> very strict poll() -> not strict
        // ℹ offer & poll are lenient - they are not strict
        queue.add(1); // 1 // Throws an exception
        queue.offer(2); // 1 2
        queue.offer(3); // 1 2 3 // Just ignores if not possible
        queue.offer(4); // 1 2 3 4
        queue.remove(); // 2 3 4 // Throws an exception
        queue.poll(); // 3 4 // Just ignores if not possible
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
