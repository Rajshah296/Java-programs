

class parent{
    int a;
    // As I have used final keyword during method declaration, once defined this method cannot be overriden.//
    public final int geta() 
    {
        return a;
    }
    parent(int x){
        a = x;
    }
}

class child extends parent{
    int b;
    child(int m, int n){
        super(m); // Using super keyword to call the parent class constructor
        b = n;
    }

    public void display(){
        System.out.println("The value of a is : " + super.geta()); //using super keyword to call the base class method.//
        System.out.println("The value of a is : " + super.a); //using super keyword access base class data member or variable.//
        System.out.println("The value of b is : " + b);
    }

}



public class Prac_17 {
    public static void main(String args[]) {
        child c1 = new child(1, 2);
        c1.display();
    }
}