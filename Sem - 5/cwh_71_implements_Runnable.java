package CWH_JAVA_CODE;
import java.io.*;
import java.lang.Thread;

class MythreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
        System.out.println("I am thread 1, not a threat.");
    }
}

class MythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
        System.out.println("I am thread 2, not a threat.");
    }
}

public class cwh_71_implements_Runnable {
    public static void main(String args[]) {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}