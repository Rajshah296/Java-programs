package CWH_JAVA_CODE;
import java.util.Scanner; import java.util.Arrays;
public class Assignment_2_Q_9 {
    public static void main(String args[]) {
        int n;
        String[] arr_of_str;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter how many strings you want : ");
        n = s1.nextInt();
        arr_of_str = new String[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("\nEnter the "+i+"th element : ");
            arr_of_str[i] = s1.next();
        }
        System.out.println("Before sorting : ");
        for(int i = 0 ; i < n ; i++){
            System.out.println(i+"th element : " + arr_of_str[i]);
        }
        Arrays.sort(arr_of_str,String.CASE_INSENSITIVE_ORDER); // Sorting the array of strings in lexicographical order using sort() method of Arrays class in java.util package.//
        System.out.println("After sorting : ");
        for(int i = 0 ; i < n ; i++){
            System.out.println(i+"th element : " + arr_of_str[i]);
        }
        s1.close();
    }
}