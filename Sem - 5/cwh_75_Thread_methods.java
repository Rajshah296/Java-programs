package CWH_JAVA_CODE;
import java.io.*;
import java.lang.Thread;

class Mynewthr1 extends Thread{
    public void run(){
        int i = 34;
        while(true){
            System.out.println("Thank you ..." + getName());
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
            i++;
        }
    }
}

class Mynewthr2 extends Thread{
    public void run(){
        int i = 34;
        while(true){
            System.out.println("My Thank you ..." + getName());
            i++;
        }
    }
}   

public class cwh_75_Thread_methods {
    public static void main(String args[]) {
        Mynewthr1 t1 = new Mynewthr1();
        Mynewthr2 t2 = new Mynewthr2();
        t1.start();
        // try{
        //     t1.join(); // join() method is used to separate the execution of threads i.e. thread t2 won't be executed until thread t1's execution is complete. This method can generate an exception like t1 being killed or it's execution beign interrupted before completion and so it need to be handled using try-catch block.//
        // }
        // catch(Exception ex){
        //     System.out.println(ex);
        // }
        t2.start();
    }
}