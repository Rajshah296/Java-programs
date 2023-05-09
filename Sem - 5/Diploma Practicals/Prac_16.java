package Java_clg_Prac;
import java.io.*;

abstract class Shape{
    abstract double area();
}

class Triangle extends Shape{
    double l,h;
    Triangle(double x, double y){
        l = x;
        h = y;
    }

    Triangle()
    {
        this.l = 3.0;
        this.h = 4.0;
    }

    double area(){
        return ((l * h)/2);
    }
}

class Circle1 extends Shape{
    double r;
    void setr(double r){this.r = r;}
    Circle1(double r){this.r = r;}
    Circle1(){r = 5.0;}
    double area(){ return Math.PI * r * r;}
}

class Rectangle1 extends Shape{
    double h,b;
    Rectangle1(){
        this.h = 5.0;
        this.b = 7.0;
    }
    Rectangle1(double h, double b){
        this.h = h;
        this.b = b;
    }
    double area(){
        return h * b;
    }
}


public class Prac_16 {
    public static void main(String args[]) {
        Circle1 c1 = new Circle1(7);
        Rectangle1 r1 = new Rectangle1(2,4);
        Triangle t1 = new Triangle(7.0,8.0);
        System.out.println("The area of Triangle is : " + t1.area());
        System.out.println("The area of Rectangle is : " + r1.area());
        System.out.println("The area of Circle is : " + c1.area());
    }
}