package CWH_JAVA_CODE;

import java.lang.Thread;

class Mythread extends Thread{
    int  i = 0;
    @Override
    public void run(){
        while(i < 4000){
            System.out.println("My cooking thread is running ...");
            System.out.println("I am happy.");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    int  i = 0;
    @Override
    public void run(){
        while(i < 4000){
            System.out.println("My thread2 for chatting with her...");
            System.out.println("I am sad.");
            i++;
        }
    }
}


public class cwh_70_extend_thread_clas {
    public static void main(String args[]) {
        Mythread2 t2 = new Mythread2();
        Mythread t1 = new Mythread();
        t1.start();
        t2.start();
    }
}