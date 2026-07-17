package com.biet.dsa.algos.greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MinimumNumberOfCoins {
    public static void findMinimumCoins(List<Integer> coins, int V){
        List<Integer> result = new ArrayList<>();
        // If the array/list is not sorted, sort it
        // Collections.sort(coins);
        // Arrays.sort(arr);
        for (int i = coins.size() -1 ; i>=0; i--){
            while (V >= coins.get(i)){
                V -= coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.println("Minimum number of coins: " + result.size());
        System.out.print("Coins selected: ");
        for (int coin : result){
            System.out.print(coin + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> coins = Arrays.
                asList(1,2,5,10,20,50,100,200,500,1000,2000);
        int V1 = 91;
        findMinimumCoins(coins, V1);
        int V2 = 31;
        findMinimumCoins(coins, V2);
    }
}
