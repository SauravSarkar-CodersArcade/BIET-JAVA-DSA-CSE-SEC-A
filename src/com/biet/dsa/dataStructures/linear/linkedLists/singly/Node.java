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
    public void removeLast(){
        // Empty List
        if (head == null){
            System.out.println("List is empty. Can't remove tail.");
            return;
        }
        // Single Element
        if (head.next == null){
            head = null;
            size--;
            return;
        }
        // Multiple Nodes -> We need to find the last node
        Node last = head.next;
        Node secondLast = head;
        while (last.next != null){
            secondLast = last;
            last = last.next;
        }
        // We will just connect the secondLast node to null
        secondLast.next = null;
        // The last node will be automatically deleted by the JVM
    }
    public void removeTarget(String target){
        // Empty List
        if (head == null){
            System.out.println("List is empty. Can't remove target.");
            return;
        }
        // target is located @ the head node
        if (head.data.equals(target)){
            head = this.head.next;
            size--;
            return;
        }
        // target is anywhere else in the list
        Node prev = null;
        Node curr = head;
        while (curr != null && !curr.data.equals(target)){
            prev = curr;
            curr = curr.next;
        }
        // If the target is not found, curr will reach null ptr
        if (curr == null){
            System.out.println("Target not found.");
            return;
        }
        // Make the adjustments of the previous & next nodes of curr
        prev.next = curr.next;
        size--;
        System.out.println("target-node: " + target + " FOUND & DELETED");
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
        sll.removeLast();
        sll.printList();
        sll.removeTarget("classroom");
        sll.printList();
        sll.removeTarget("DSA");
    }
}

