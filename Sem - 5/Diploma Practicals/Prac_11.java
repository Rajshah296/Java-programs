

interface E{
    int e = 5 ;
    public int gete();
}

class  A{
    int a;
    public int geta(){return a;}
    public void seta(int x){a = x;}
}

class B extends A // Single inheritance as class B extends(inherits) class A
{
    int b;
    public int getb(){return b;}
    public void setb(int x){b = x;}

}

class C extends B  // Multilevel inheritance as (class A -> class B -> class C)
{
    int c;
    public int getc(){return c;}
    public void setc(int x){c = x;}
}

class D extends B implements E // Hierarchical and Multiple inheritance because(class B -> class D && class B -> class C so hierarchical inheritance and class B -> class D && class D implements interface E so multiple inheritance).
{
    int d;
    public int getd(){return d;}
    public void setd(int x){d = x;}
    public int gete(){return e;}
}

public class Prac_11 {
    public static void main(String args[]) 
    {
        C c1 = new C();
        D d1 = new D();
        d1.seta(5);
        System.out.println("The value of d1.a is : " + d1.a);
        d1.setb(6);
        System.out.println("The value of d1.b is : " + d1.b);
        System.out.println("The value of d1.e is : " + E.e);
        c1.setc(10);
        System.out.println("The value of d1.e is : " + c1.c);

    }
}