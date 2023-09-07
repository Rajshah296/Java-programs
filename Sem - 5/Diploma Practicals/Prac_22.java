
import java.lang.Thread;


class even_num implements Runnable{
    int i = 1,j = 0;
    int arr1[] = new int[25];
    public void run(){
        while(i <=50){
            if(i % 2 == 0){
                arr1[j] = i;
                j++;
            }
            i++;
        }
        System.out.println("The array of even numbers formed is : ");
        for (int k = 0 ; k < arr1.length ; k++){
            System.out.println(arr1[k]);
        }
    }
}

class odd_num implements Runnable{
    int i = 1,j = 0;
    int arr2[] = new int[25];
    public void run(){
        while(i <=50){
            if(i % 2 == 1){
                arr2[j] = i;
                j++;
            }
            i++;
        }
        System.out.println("The array of odd numbers formed is : ");
        for (int k = 0 ; k < arr2.length ; k++){
            System.out.println(arr2[k]);
        }
    }
}

public class Prac_22 {
    public static void main(String args[]) {
        odd_num o1 = new odd_num();
        even_num e1 = new even_num();
        Thread gun1 = new Thread(o1);
        Thread gun2 = new Thread(e1);
        gun1.start();
        try{
            gun1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        gun2.start();
    }
}