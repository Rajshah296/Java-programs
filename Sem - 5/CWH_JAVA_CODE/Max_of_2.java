package CWH_JAVA_CODE;
import java.util.Scanner;

public class Max_of_2 {
    public static void main(String args[]) {
        System.out.println("Enter 2 numbers : ");
        Scanner s1 = new Scanner(System.in) ;
            int num1 = s1.nextInt();
            int num2 = s1.nextInt();
            if (num1 != num2){
                System.out.println("The max of 2 given numbers is : " + (num1 > num2 ? num1 : num2));}
            else{
                System.out.println("Both numbers are equal.");
            }
            s1.close();
        }
    }
