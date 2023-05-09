import java.io.*;
import java.util.Scanner;
public class Chapter_07_Practice_set {
    // Problem 1
        // static void table(int n){
        //     for(int i = 1 ; i <= 10 ;i++){
        //         System.out.println(n + " * " + i + " = " + " " + n * i);
        //     }
        // }

    // Problem 2 : Write a function to print the following pattern : 
        // *
        // * *
        // * * *
        // * * * * 
        // * * * * *
        // Answer   
                // static void pattern(int n){
                //     for(int i = 1 ; i <= n ; i++){
                //         for(int j = 0 ; j < i ;j++){
                //             System.out.print("* ");
                //         }
                //         System.out.println("");
                //     }
                // }
    // Problem 3 : Write a recursive function to calculate sum of first n natural numbers.
    
        // static int sum(int n){
        //     if(n == 0 || n == 1){
        //         return n;
        //     }
        //     return n + sum(n - 1);
        // }
    // Problem 4 : Write a function to print the following pattern : 
        // * * * * *
        // * * * * 
        // * * *
        // * * 
        // * 
        // Answer   
                // static void pattern2(int n){
                //     for(int i = 1 ; i <= n ; i++){
                //         for(int j = 0 ; j <= n - i ;j++){
                //             System.out.print("* ");
                //         }
                //         System.out.println("");
                //     }
                // }
    // Problem 5 : Write a function to print nth term of fibonacci series using recursion.
        // static int prob_5(int n){return n == 1 || n == 2 ? 1 : prob_5(n - 1) + prob_5(n - 2); }
    //  Problem 6 : Write a function to find average of set of numbers passed as arguments.
        // static int average(int ...arr){
        //     int avg = 0;
        //     for (int element : arr) {
        //         avg += element;
        //     }
        //     avg /= arr.length;
        //     return avg;
        // }
    // Problem 7 : Repeat 4 using recursion.
    //     static void pattern_using_recursion(int n){
    //         if(n == 0){
    //             return;
    //         }
    //         for(int i = 0 ; i < n ; i++){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //         pattern_using_recursion(n - 1);
    //     }
    // Problem 8 : Repeat 2 using recursion.
        // static void pattern2_using_recursion(int n){
        //     boolean cond = (n!=0);
        //     if(cond){
        //         pattern2_using_recursion(n - 1);
        //         for(int i = 0 ; i < n ; i++){
        //             System.out.print("* ");
        //         }
        //         System.out.println();
        //     }

        // }
    // Problem 9 : Write a Java function to convert celcius to Fahrenheit.
            // static float C_to_F(float celcius){
            //     return celcius == 0.0f ? 32.0f : ((celcius * 9) / 5) + 32 ;
            // }
    // Problem 10 : Repeat 3 using iterative approach.

        // static int sum3(int n){
        //     if(n > 0){
            
        //         int result = 0 ;
        //         for(int i = 1 ; i <= n ; i ++){
        //             result += i;
        //         }
        //         return result;
        //     }
        //     else{return 0;}
        // }

    public static void main(String args[]) {
        
    }
}