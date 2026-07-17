package com.biet.dsa.dataStructures.nonLinear.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
// In Java => PriorityQueue is a MinHeap by default
// In C++ => priority_queue is a MaxHeap by default => Comparator
public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(6);
        minHeap.offer(8);
        minHeap.offer(9);
        minHeap.offer(2);
        minHeap.offer(4);
        minHeap.offer(1);
        minHeap.offer(3);
        minHeap.offer(10);
        System.out.println(minHeap);
        System.out.println(minHeap.poll());
    }
}
