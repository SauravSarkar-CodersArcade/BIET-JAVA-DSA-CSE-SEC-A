package com.biet.oops.pillars.superKeyword.methods;
public class BankAccount {
    void calculateInterest(){
        System.out.println("Interest 4%");
    }
}
class SavingsAccount extends BankAccount {
    void calculateInterest(){
        System.out.println("Interest 7%");
    }
    void display(){
        super.calculateInterest();
        this.calculateInterest();
    }
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.display();
    }
}

