package com.biet.oops.pillars.inheritance.multiLevel;
public class SimpleCalculator {
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void subtract(int a, int b){
        System.out.println(a-b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void square(int x){
        System.out.println(x * x);
    }
    void division(int a, int b){
        System.out.println(a / b);
    }
}
class Main {
    public static void main(String[] args) {
        SimpleCalculator c1 = new SimpleCalculator();
        AdvancedCalculator c2 = new AdvancedCalculator();
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        System.out.println("=========================================================");
        c1.add(1,2);
        System.out.println("=========================================================");
        c2.add(10,20);
        c2.subtract(5,2);
        System.out.println("=========================================================");
        c3.add(1,5);
        c3.subtract(3,0);
        c3.division(20,5);
        c3.square(100);
        System.out.println("=========================================================");
    }
}
class A{

}
class B{

}
//class C extends A, B { Not Possible
//
//}