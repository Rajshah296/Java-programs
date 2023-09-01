package Java_clg_Prac;
import java.io.*;
import java.util.Scanner;
public class Prac_3 {
    public static void main(String args[]) {
        int num,rem,rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        int num2 = num;
        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println("The reverse number of "+ num2 +" is : " + rev);
        sc.close();
    }
}