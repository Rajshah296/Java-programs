import java.util.Scanner;
import java.lang.String;;
public class Practice_set {
    public static void main(String[] args) {
        // Problem 1
            // float total_marks_ex;
            // System.out.print("Enter the total marks for which examination was conducted:    ");
            // Scanner s1 = new Scanner(System.in);
            // total_marks_ex = s1.nextFloat();
            // System.out.println("\nNow you have to enter marks for each of the 3 subjects \n");
            // Float sub_marks_1;
            // Float sub_marks_2;
            // Float sub_marks_3;
            // System.out.println("Marks for subject 1 : ");
            // sub_marks_1 = s1.nextFloat();
            // System.out.println("Marks for subject 2 : ");
            // sub_marks_2 = s1.nextFloat();
            // System.out.println("Marks for subject 3 : ");
            // sub_marks_3 = s1.nextFloat();
            // s1.close();
            // if(((sub_marks_1+sub_marks_2+sub_marks_3) *100)/total_marks_ex >= 40 && (sub_marks_1 * 100)/(total_marks_ex/3) >=33 && (sub_marks_2 * 100)/(total_marks_ex/3) >=33 && (sub_marks_3* 100)/(total_marks_ex/3) >=33){
            //         System.out.println("Congratulations ! You have passed the exams.");
            // }
            // else{
            //     System.out.println("Unfortunately, You have not passed the exams.");
            // }
        // Problem 2
            // float taxable_income;
            // float tax = 0;
            // System.out.println("Please provide the taxable income  :    ");
            // Scanner sc = new Scanner(System.in);
            // taxable_income = sc.nextFloat();
            // if(taxable_income > 250000){
            //     if(taxable_income > 250000.0 && taxable_income <= 500000.0){
            //         tax = (taxable_income*5)/100;
            //     } 
            //     else if(taxable_income > 500000.00 && taxable_income <= 1000000.00){
            //         tax = (taxable_income * 10)/100;
            //     }
            //     else{
            //         tax = (taxable_income * 30)/100;
            //     }  
            // }
            // System.out.println(tax == 0 ? "Congrats, you will not be taxed as your taxable income is quite less." : "You will be taxed for this" + tax +"amount.");
            // sc.close();
        // Problem 3
            // int day_num;
            // Scanner sd = new Scanner(System.in);
            // System.out.println("Enter the number of the day : ");
            // day_num = sd.nextInt();
            // switch(day_num){
            //     case 1 -> System.out.println("Today is Monday.");
            //     case 2 -> System.out.println("Today is Tuesday.");
            //     case 3 -> System.out.println("Today is Wednesday.");
            //     case 4 -> System.out.println("Today is Thursday.");
            //     case 5 -> System.out.println("Today is Friday.");
            //     case 6 -> System.out.println("Today is Saturday.");
            //     case 7 -> System.out.println("Today is Sunday.");
            //     default -> System.out.println("You have provided an invalid input. Your input must be between 0 and 8(from 1 to 7).");
            // }
            // sd.close();
        // Problem 4
            // int year;
            // Scanner sy = new Scanner(System.in);
            // System.out.println(" Please enter the year to find out whether it's leap year or not : ");
            // year = sy.nextInt();
            // System.out.println(year % 4 == 0 ? "This indeed is a leap year !" : "This is not a leap year.");
            // sy.close();\
        // Problem 5 
            // String url;
            // Scanner ss = new Scanner(System.in);
            // System.out.println("Enter the URL : ");
            // url = ss.nextLine();
            // System.out.println("This website is a " + (url.endsWith(".com") ? "Commercial Website" : url.endsWith(".org") ? "Organization website" : "Indian Website"));
            // ss.close();
        
            String var;
            switch(var) {
                case "Shubham":
                    System.out.println("You are going to become an Adult!");
                    System.out.println("You are going to become an Adult!");
                    System.out.println("You are going to become an Adult!");
                    break;
                
                case "Saurabh" : 
                    System.out.println("You are going to join a Job!");
                    break;
                case "Vishaka" : 
                    System.out.println("You are going to get retired!");
                    break;  
                default : 
                    System.out.println("Enjoy Your life!");
                    break;
            }
            System.out.println("Thanks for using my Java Code!");
    }
}    