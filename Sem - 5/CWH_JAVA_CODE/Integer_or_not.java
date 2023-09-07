package CWH_JAVA_CODE;
import java.util.Scanner;
public class Integer_or_not {
    public static void main(String args[]){
        System.out.println("Enter your number : ");
        Scanner s1 = new Scanner(System.in);
        System.out.println(s1.hasNextInt());
        s1.close();
    }    
}