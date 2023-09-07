package CWH_JAVA_CODE;

public class CWH_Var_Args_033 {

    static int sum(int x, int ...arr)
    {
        // If you want some arguments to be passed compulsarily then you can pass them just as I passed x.  
        //Arguments available as int[] arr
        int result = x;
        for (int a : arr) {
            result += a;          
        }
        return result;
    }
    public static void main(String args[]) {
        System.out.println("Welcome to VarArgs Tutorial !");
        System.out.println("The sum of Nothing is : " + sum(1));
        System.out.println("The sum of 3,4 and 5 is : " + sum(3, 4, 5));
        System.out.println("The sum of 1,2,3,4 and 5 is : " + sum(1,2, 3, 4, 5));

    }
}