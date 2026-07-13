package com.biet.dsa.dataStructures.linear.stack;
public class StringStack {
    public static final int MAX_SIZE = 5; // LIMIT
    private String[] arr = new String[MAX_SIZE];
    // Stack is empty
    private int top = -1; // [index] [Initially stack is empty]
    public void push(String data){
        if (top == MAX_SIZE - 1){
            System.out.println("Stack Overflow.");
            return;
        }
        arr[++top] = data; // First increment then insert
        System.out.println("Pushed " + data + " onto the stack.");
    }
    public String pop(){
        if (top == -1){
            System.out.println("Stack Underflow.");
            return null;
        }
        String popped = arr[top--]; // First remove then decrement
        System.out.println("Popped " + popped + " from the stack.");
        return popped; // pop() removes the element & returns it
    }
    public String peek(){
        if (top == -1){
            System.out.println("Stack Underflow.");
            return null;
        }
        return arr[top]; // peek() just shows the top element if available
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return (top == MAX_SIZE - 1);
    }
    public int size(){
        return top + 1;
    }
    public void printStackElements(){
        if (isEmpty()){
            System.out.println("Stack Underflow. Can't Display Stack.");
            return;
        }
        System.out.print("The stack elements from top are: ");
        for (int i=top; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StringStack stringStack = new StringStack();
        stringStack.push("Apple");
        stringStack.push("Mango");
        stringStack.push("Avocado");
        stringStack.printStackElements();
        System.out.println(stringStack.size());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.peek());
        System.out.println(stringStack.isFull());
    }

}
