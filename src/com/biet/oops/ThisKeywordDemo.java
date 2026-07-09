package com.biet.oops;
public class ThisKeywordDemo {
    String i;
    void change(String i){
        this.i = i; // Fallback mechanism // remove ambiguity / confusion
    }
    void display(){
        System.out.println("The value of i is: " + i);
    }
    public static void main(String[] args) {
        ThisKeywordDemo t = new ThisKeywordDemo();
        t.change("Dhanya");
        t.display();
    }
}
