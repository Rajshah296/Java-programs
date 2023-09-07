
import java.util.Formatter;

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
        Formatter formatter = new Formatter();
        formatter.format("{}{}", str, "^2");
        str = formatter.toString();
        formatter.close();
        return str;
    }
    
    static String subscript(String str) {
        Formatter formatter = new Formatter();
        formatter.format("{}{}", str, "{0,<sub>2</sub>}");
        str = formatter.toString();
        formatter.close();
        return str;
    }
    public static void main(String args[]) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(4,2);
        System.out.println("The area of Circle is : " + c1.area() + " "+superscript("cm2"));
        System.out.println("The area of Rectangle is : " + r1.area() + " " +superscript("cm2"));

    }
}