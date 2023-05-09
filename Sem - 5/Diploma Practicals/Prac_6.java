package Java_clg_Prac;

public class Prac_6 {

    static int noOfObjects = 0; 
    int a;
    int b;
    // Using generic block to increase the value of the variable storing the count of number of objects created.//
    {
        noOfObjects++;
    }
    Prac_6() // Default(Simple Constructor)
    {
        a = 4;
        b = 5;
    }

    Prac_6(int x, int y) // Parameterized Constructor
    {
        a = x;
        b = y;
    }

    Prac_6(Prac_6 obj) // Copy Constructor
    {
        a = obj.a;
        b = obj.b;
    }

    public static void main(String args[]) {
        Prac_6 obj1 = new Prac_6();
        Prac_6 obj2 = new Prac_6(6,7);
        Prac_6 obj3 = new Prac_6(obj2);
        System.out.println("The number of objects created : " +Prac_6.noOfObjects); //Printing the no of objects created.
        System.out.println("Printing the variable values of object created using Default constructor : ");
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println("Printing the variable values of object created using Parameterized constructor : ");
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println("Printing the variable values of object created using Copy constructor : ");
        System.out.println(obj3.a);
        System.out.println(obj3.b);


    }
}