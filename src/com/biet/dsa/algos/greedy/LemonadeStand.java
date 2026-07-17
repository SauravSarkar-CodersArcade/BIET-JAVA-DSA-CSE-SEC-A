package com.biet.dsa.algos.greedy;

import java.util.Arrays;
import java.util.List;
public class LemonadeStand {
    public static boolean lemonadeChange(List<Integer> bills){
        int five = 0, ten = 0;
        for (int bill : bills){
            if (bill == 5){
                five++;
            }else if(bill == 10){
                if (five == 0) return false;
                five--;
                ten++;
            }else {
                if (ten > 0 && five > 0){
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                }else {
                    return false;
                }
            }
        }
        return true; // This means all the customers have been served
    }
    public static void main(String[] args) {
        List<Integer> bill1 = Arrays.asList(5,5,5,10,20);
        List<Integer> bill2 = Arrays.asList(5,5,10,10,20);
        System.out.println((lemonadeChange(bill1))? "Possible" : "Not Possible");
        System.out.println((lemonadeChange(bill2))? "Possible" : "Not Possible");
     }
}
