package CWH_JAVA_CODE;


class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    int i = 34;
    public void run(){
        int i = 34;
        while(true){
            System.out.println("Thank you ..." + getName());
        }
    }
}

public class cwh_74_Thread_priorities {
    public static void main(String args[]) {
        //Ready Queue : T1,T2,T3,T4,T5
        Mythr1 t1 = new Mythr1("thread 1");    
        Mythr1 t2 = new Mythr1("thread 2");    
        Mythr1 t3 = new Mythr1("thread 3");    
        Mythr1 t4 = new Mythr1("thread 4");    
        Mythr1 t5 = new Mythr1("thread 5(most important)");    
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}