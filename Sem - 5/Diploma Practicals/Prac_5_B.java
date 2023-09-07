

public class Prac_5_B {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Java");
        // capacity() method
        System.out.println("The capacity is : " + sb.capacity()); // capacity = 16bits + length
        //append() method   
        sb.append(" is good.");
    }
}