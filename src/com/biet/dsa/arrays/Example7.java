package com.biet.dsa.arrays;
public class Example7 {
    public static void main(String[] args) {
        // 2D => Array of arrays
        // 2D Array, if each row length is different = Jagged Array
        int[][] matrix = {{1},
                          {4,5},
                          {7,8,9}};
        for (int r=0; r<matrix.length; r++){
            for (int c=0; c<matrix[r].length; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        for (int[] a : matrix){
            for (int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        char[][] names = {{'A','Z','I','Z'},
                          {'N','I','K','I','T','H','A'},
                          {'A','L','F','A'},
                          {'M','A','N','A','S','A'}};
        for (char[] name : names){
            for (char c : name){
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
