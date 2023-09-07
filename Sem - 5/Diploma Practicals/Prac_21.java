import java.lang.Thread;

class mythr1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thread 1");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}

class mythr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thread 2");
            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}

public class Prac_21 {
    public static void main(String args[]) {
        mythr1 t1 = new mythr1();
        mythr2 t2 = new mythr2();
        
        t1.start();
        t2.start();
    }
}