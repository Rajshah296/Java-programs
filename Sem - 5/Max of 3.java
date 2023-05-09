package CWH_JAVA_CODE;
import java.util.Scanner;
class Max_of_3{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        int max;
        System.out.print("enter 3 numbers");
        int num1 = s1.nextInt();
        int num2 = s1.nextInt();
        int num3 = s1.nextInt();
        s1.close();
        if(num1 > num2 && num1 > num3){max = num1;}
        else if(num2 > num1 && num2 > num3){max = num2;}
        else{max = num3;}
        System.out.println("The greatest number is : " + max);
        }
    }
