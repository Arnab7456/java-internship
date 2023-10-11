package com.Arnab.Leetcode.solutions;

public class Unique_Paths {
    public static int uniquePaths(int m, int n) {

        return countpath(0,0,m,n);
    }
    public static int countpath(int i , int j ,int m, int n){
        if(i>=m || j>=n){
            return 0;
        }
        if(i==m-1 || j==n-1){
            return 1;
        }
        return countpath(i+1,j,m,n) + countpath(i,j+1,m,n);
    }


    public static void main(String[] args) {
        int m = 3, n = 7; // Example values
        System.out.println(uniquePaths(m, n));
    }
}
