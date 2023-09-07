

class H{
    public int a,b;
    static H getobj = null;

    private H(int x, int y) // Private Constructor
    {
        a = x;
        b = y;
    }
    public int max(int x, int y) // passing by value and returning values.
    {
        return x > y ? x : y;
    }
    public void swap() // passing by reference.
    {
        this.a = this.a + this.b;
        this.b = this.a - this.b;
        this.a = this.a - this.b;
    }
    static public H getinstance(int x, int y) // method returning an object.
    {
        if(getobj == null){
            getobj = new H(x,y);
        }
        return getobj;
    }
}
public class Prac_10 {
    public static void main(String args[]) {
        H a1 = H.getinstance(5,4);
        System.out.println("Before Swapping :");
        System.out.println(a1.a);
        System.out.println(a1.b);
        
        a1.swap();
        System.out.println("After Swapping :");
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.max(5,4));
    }

}
