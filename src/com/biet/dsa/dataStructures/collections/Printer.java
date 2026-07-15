package com.biet.dsa.dataStructures.collections;
public class Printer<T> {
    T data;
    Printer(T data){
        this.data = data;
    }
    void print(){
        System.out.println("Data: " + data);
    }
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(1);
        Printer<Float> floatPrinter = new Printer<>(1.6f);
        Printer<Double> doublePrinter = new Printer<>(2.45);
        Printer<Boolean> booleanPrinter = new Printer<>(true);
        integerPrinter.print();
        floatPrinter.print();
        doublePrinter.print();
        booleanPrinter.print();
    }
}
