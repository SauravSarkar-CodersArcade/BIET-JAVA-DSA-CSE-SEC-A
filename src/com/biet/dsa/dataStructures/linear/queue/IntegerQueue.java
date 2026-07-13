package com.biet.dsa.dataStructures.linear.queue;
public class IntegerQueue {
    private static final int MAX_SIZE = 5;
    private int[] arr = new int[MAX_SIZE];
    private int front;
    private int rear;
    public IntegerQueue(){
        // We will consider the queue as empty in the beginning
        front = rear = -1;
    }
    public boolean isEmpty(){
        return (rear == -1 && front == -1);
    }
    public boolean isFull(){
        return rear == MAX_SIZE - 1;
    }
    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is full.");
            return;
        }
        if (isEmpty()){
            front = rear = 0; // Empty case
        }else {
            rear++; // Case where there are more elements
        }
        arr[rear] = data;
        System.out.println("Enqueued: " + data + " into the queue.");
    }
    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty. Can't remove data.");
            return;
        } else if (front == rear) { // Single element case
            front = rear = -1;
        }else { // Multiple elements case
            front++; // Make the second element the front element
        }
    }
    public int size(){
        if (isEmpty()){
            return 0;
        }
        return rear - front + 1;
    }
    public void displayQueueElements(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("The queue elements from [F-R] are: ");
        for (int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        IntegerQueue queue = new IntegerQueue();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int x : arr){
            queue.enqueue(x);
        }
        queue.displayQueueElements();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
}
