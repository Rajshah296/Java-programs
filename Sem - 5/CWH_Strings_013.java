package CWH_JAVA_CODE;
import java.util.Scanner;

// Strings are immutable(cannot be changed).//

public class CWH_Strings_013 {
    public static void main(String[] args) {
        String name = "Raj"; 
        //This is how u declare a string.
        System.out.println(name);


        Scanner sc = new Scanner(System.in); 
        // - This is how you take a string from user.
        String st = sc.nextLine();
        System.out.println(st); 
        sc.close();
        name=name.replace('R', 'T');
        System.out.println(name);
    }
}
