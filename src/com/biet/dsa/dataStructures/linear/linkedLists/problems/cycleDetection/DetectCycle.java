package com.biet.dsa.dataStructures.linear.linkedLists.problems.cycleDetection;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DetectCycle {
    static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next; // 1 step at a time
            fast = fast.next.next; // 2 steps at a time
            // If slow & fast coincide, cycle, else no cycle
            if (slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node h1 = new Node(1);
        h1.next = new Node(2);
        h1.next.next = new Node(3);
        h1.next.next.next = new Node(4);
        h1.next.next.next.next = new Node(5);
        System.out.println((hasCycle(h1)) ? "Cycle" : "No Cycle");

        Node h2 = new Node(1);
        h2.next = new Node(2);
        h2.next.next = new Node(3);
        h2.next.next.next = new Node(4);
        h2.next.next.next.next = h2.next; // 4 -> 2 [Cycle]
        System.out.println((hasCycle(h2)) ? "Cycle" : "No Cycle");

    }
}
