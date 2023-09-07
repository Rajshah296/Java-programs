import java.io.*;

class access_modifiers{
    public int  w = 5;
    protected  int x = 6;
    int y = 7;
    private int z = 8;
}

public class XXX {
    public static void main(String args[]) {
        access_modifiers asc = new access_modifiers();
        System.out.println("Public Variable : " + asc.w); // Valid because, Public variables can be accessed from anywhere
        System.out.println("Protected Variable : " + asc.x); // Valid, because Protected variables can be accessed anywhere from same Package.
        System.out.println("Default Variable : " + asc.y);// Valid, because Default variables can be accessed anywhere from same Package.
        System.out.println("Private Variable : " + asc.z); //This will throw an error because Private variables cannot be accessed outside the class
    }
}