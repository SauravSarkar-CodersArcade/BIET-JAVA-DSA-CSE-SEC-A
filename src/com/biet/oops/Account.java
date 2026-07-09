package com.biet.oops;
public class Account {
    {
        System.out.println("IIB => Instance Initializer Block - 2");
    }
    int accountNumber;
    static int totalAccounts;
    Account(){
        totalAccounts++;
        accountNumber = totalAccounts;
    }
    static void showTotalAccounts(){
        System.out.println("Total Accounts: " + totalAccounts);
    }
    public static void main(String[] args) {
        new Account();
        new Account();
        new Account();
        new Account();
        showTotalAccounts();
    }
    // static initializer block
    static {
        System.out.println("Anusha");
        System.out.println("DB");
        System.out.println("Internet");
        System.out.println("Excel|PDF");
        System.out.println("Settings");
    }
    {
        System.out.println("IIB => Instance Initializer Block - 1");
    }
}
