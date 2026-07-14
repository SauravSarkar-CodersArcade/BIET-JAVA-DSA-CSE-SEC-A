package com.biet.dsa.dataStructures.linear.linkedLists.singly;
class LL {
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            // Initially node is connected to null
            this.next = null;
            size++; // As soon as we create a node, increment the size of the list
        }
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next; // keep moving till you reach null
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Point the new node next pointer to the head
        newNode.next = head;
        // Update the head position of the list to the newNode
        head = newNode;
    }
    public void addLast(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Check if the list is empty => this newNode is the head
        if (head == null){
            head = newNode;
            return;
        }
        // If we have multiple nodes, we need to find the last node
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        // Connect the last node {temp} to the newNode
        temp.next = newNode;
        // The last node is already connected to null in Constructor
    }
    public void removeFirst(){
        if (head == null){
            System.out.println("List is empty. Can't remove head.");
            return;
        }
        // For a single node list, the head will point to next (null)
        // For multiple nodes, the head will point to the next element
        head = this.head.next;
        size--; // removal reduces the size by 1
    }
    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("Linked List");
        sll.addFirst("learning");
        sll.addFirst("are");
        sll.addFirst("students");
        sll.addFirst("CSE-A");
        sll.printList();
        sll.addLast("in");
        sll.addLast("classroom");
        sll.addLast("number");
        sll.addLast("A-245");
        sll.printList();
        sll.removeFirst();
        sll.printList();
    }
}

