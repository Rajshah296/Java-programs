package CWH_JAVA_CODE;
import java.util.Scanner;

public class kilometres_to_miles {
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("How many kilometres? : ");
        float kms = s1.nextFloat();
        System.out.println("Miles = " + (kms/1.60934));
        s1.close();
    }
}
