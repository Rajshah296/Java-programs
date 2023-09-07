package CWH_JAVA_CODE;

import java.util.Scanner;
public class CWH_Recursion {
    // How to find Factorial ? 
    // static int facto(int n){return n == 1 || n == 0 ? 1 : n * facto(n - 1);}

    static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{

            return (fibo(n - 1) + fibo(n - 2));
        }
    }
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        int n;
        int i = 0;
        System.out.println("Please enter upto how many numbers you want the fibonacci series : ");
        n = s1.nextInt();
        if(n < 0){
            System.out.println("Invalid Input. Please try again.");
        }
        else if(n == 1 || n == 0){
            System.out.println("\nThe fibonacci series generated is : ");
            System.out.println("0");
        }
        else{
            System.out.println("\nThe fibonacci series generated is : ");
            for(int c = 1; c <= n ; c++){
                System.out.println(fibo(i));
                i++;
            }
        }
        s1.close();
    }
}

