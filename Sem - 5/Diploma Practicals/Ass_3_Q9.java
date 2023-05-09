package Java_clg_Prac;
import java.io.*;

abstract class Area{
    abstract public double area();
} 

class Circle extends Area{
    int r;
    Circle(int r){this.r = r;}
    final float PI = 3.14f;
    @Override
    public double area(){
        return PI * r * r; 
    }
}

class Rectangle extends Area{
    int length, breadth;
    Rectangle(int m, int n){
        length = m;
        breadth = n;
    }
    @Override
    public double area(){
        return length * breadth;
    }
}




public class Ass_3_Q9{
    static String superscript(String str) {
        str = str.replaceAll("0", "⁰");
        str = str.replaceAll("1", "¹");
        str = str.replaceAll("2", "²");
        str = str.replaceAll("3", "³");
        str = str.replaceAll("4", "⁴");
        str = str.replaceAll("5", "⁵");
        str = str.replaceAll("6", "⁶");
        str = str.replaceAll("7", "⁷");
        str = str.replaceAll("8", "⁸");
        str = str.replaceAll("9", "⁹");         
        return str;
    }
    
    static String subscript(String str) {
        str = str.replaceAll("0", "₀");
        str = str.replaceAll("1", "₁");
        str = str.replaceAll("2", "₂");
        str = str.replaceAll("3", "₃");
        str = str.replaceAll("4", "₄");
        str = str.replaceAll("5", "₅");
        str = str.replaceAll("6", "₆");
        str = str.replaceAll("7", "₇");
        str = str.replaceAll("8", "₈");
        str = str.replaceAll("9", "₉");
        return str;
    }
    public static void main(String args[]) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(4,2);
        System.out.println("The area of Circle is : " + c1.area() + " "+superscript("cm2"));
        System.out.println("The area of Rectangle is : " + r1.area() + " " +superscript("cm2"));

    }
}