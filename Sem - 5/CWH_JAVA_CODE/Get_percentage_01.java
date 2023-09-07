package CWH_JAVA_CODE;
import java.util.Scanner;
//This percentage calculator was developed by Raj Shah//
public class Get_percentage_01 {
    public static void main(String args[]){
        float percentage;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the total marks of examination: ");
        float total_marks_ex = s1.nextFloat();
        System.out.println("Enter the marks for each of the 5 subjects : ");
        System.out.println("Subject 1 : ");
        float sub1_marks = s1.nextFloat();
        System.out.println("Subject 2 : ");
        float sub2_marks = s1.nextFloat();
        System.out.println("Subject 3 : ");
        float sub3_marks = s1.nextFloat();
        System.out.println("Subject 4: ");
        float sub4_marks = s1.nextFloat();
        System.out.println("Subject 5 : ");
        float sub5_marks = s1.nextFloat();
        if(sub1_marks > total_marks_ex / 5 || sub2_marks > total_marks_ex / 5 || sub3_marks > total_marks_ex / 5 || sub4_marks > total_marks_ex / 5 || sub5_marks > total_marks_ex / 5){
            System.out.println("Invalid Input. Marks for a subject cannot be more than the total marks of examination for that subject.");
        }else{
            percentage =  (sub1_marks + sub2_marks + sub3_marks+sub4_marks + sub5_marks) * 100/total_marks_ex; 
            System.out.println("The percentage of the student are : " + percentage);
        }
        s1.close();
    }
}