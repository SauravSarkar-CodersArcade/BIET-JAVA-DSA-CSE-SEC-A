package com.biet.dsa.dataStructures.collections;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumberGenerator {
    public static void generateBinary1ToN(int N){
        Queue<String> q = new LinkedList<>();
        q.offer("1"); // Initial value in the queue
        while (N-- > 0){
            // POP
            String current = q.poll();
            // PRINT
            System.out.print(current + " ");
            // CONCATENATE 0 then 1 & ADD back to QUEUE
            q.offer(current + "0");
            q.offer(current + "1");
        }
    }
    public static void main(String[] args) {
        int N = 5;
        generateBinary1ToN(N);
    }
}
