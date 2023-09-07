


class Y{
    static int x;
    void display(){
        System.out.println("The value of variable x is : " + x);
    }
}

class X extends Y{
    int x;
    // method overriding 
    @Override // Always use Override annotation while overriding the method because it helps us to find the error in overriding if we make any changes in the super class method or child class method.
    void display() 
    {
        System.out.println("The value of static variable x is : " + Y.x);
        System.out.println("The value of instance variable x is : " + x);
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    int add(int a,int b) //method overloading
    {
        return a + b;
    }
}


public class Prac_12_13{
    public static void main(String args[]) {
        Y.x = 5;
        Y a1  = new Y();
        a1.display();
        X b1 = new X();
        b1.x = 6;
        b1.display();
        System.out.println("The sum of both static and instance variables is : " + b1.add(Y.x,b1.x));
        System.out.println("The sum of static and instance variables and 10 is : "+ b1.add(Y.x, b1.x, 10));
    }
}