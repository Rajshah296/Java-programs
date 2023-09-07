
public class Prac_18 {
    public static void main(String args[]) {
        int[] arr = new int[7];
        try
        {
            int i = arr[7];
            // this statement will not be executed
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Inside catch block!!");
        }
        finally
        {
            System.out.println("Inside finally block!!");
        }
        // rest of the program will be executed
        System.out.println("Outside try-catch-finally clause");
        
    }
}
