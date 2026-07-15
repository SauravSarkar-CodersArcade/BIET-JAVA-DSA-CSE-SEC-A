package com.biet.dsa.dataStructures.collections.set;
import java.util.HashSet;
import java.util.Set;
public class Emails {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();
        emails.add("a@gmail.com");
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        emails.add("a@gmail.com");
        emails.add("f@gmail.com");
        emails.add("d@gmail.com");
        emails.add("e@gmail.com");
        emails.add("c@gmail.com");
        System.out.println(emails);
    }
}
