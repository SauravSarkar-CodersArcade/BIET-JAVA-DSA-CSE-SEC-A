package com.biet.dsa.dataStructures.nonLinear.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
// In Java => PriorityQueue is a MinHeap by default
// In C++ => priority_queue is a MaxHeap by default
public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>
                (Collections.reverseOrder());
        maxHeap.offer(6);
        maxHeap.offer(8);
        maxHeap.offer(9);
        maxHeap.offer(2);
        maxHeap.offer(4);
        maxHeap.offer(1);
        maxHeap.offer(3);
        maxHeap.offer(10);
        System.out.println(maxHeap);
        System.out.println(maxHeap.poll());
    }
}
