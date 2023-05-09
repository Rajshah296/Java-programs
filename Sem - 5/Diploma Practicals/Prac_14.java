package Java_clg_Prac;
import java.io.*;

interface P1{
    int p1 = 5;
    public void display();
}

interface P2{
    int p2 = 5;
    public void display_p2();
}

interface P12 extends P1,P2 // interface P12 inherits from interface P1 and P2.//
{
    int p12 = 10;
    public void display_p12();
}

class Q implements P12{
    public void display(){
        System.out.println("The value of variable inside interface P1 is : "+ p1);
    }
    public void display_p2(){
        System.out.println("The value of variable inside interface P2 is : "+ p2);
    }
    public void display_p12(){
        System.out.println("The value of variable inside interface P12 is : "+ p12);
    }
}
public class Prac_14 {
    public static void main(String args[]) {
        Q q1 = new Q();
        q1.display();
        q1.display_p2();
        q1.display_p12();
    }
}