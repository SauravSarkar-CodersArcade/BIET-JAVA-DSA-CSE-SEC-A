package com.biet.dsa.dataStructures.linear.linkedLists.problems.middleOfLinkedList;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MiddleOfLinkedList {
    static int findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next; // 1 step at a time
            fast = fast.next.next; // 2 steps at a time
        }
        return slow.data;
    }
    public static void main(String[] args) {
        // 1->2->3->4->5->null
        Node h1 = new Node(1);
        h1.next = new Node(2);
        h1.next.next = new Node(3);
        h1.next.next.next = new Node(4);
        h1.next.next.next.next = new Node(5);
        System.out.println("Middle Node: " + findMiddle(h1));
        // 1->2->3->4->5->6->null
        Node h2 = new Node(1);
        h2.next = new Node(2);
        h2.next.next = new Node(3);
        h2.next.next.next = new Node(4);
        h2.next.next.next.next = new Node(5);
        h2.next.next.next.next.next = new Node(6);
        System.out.println("Middle Node: " + findMiddle(h2));
    }
}
