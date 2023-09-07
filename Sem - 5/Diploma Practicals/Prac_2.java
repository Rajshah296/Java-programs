import java.util.Scanner;
public class Prac_2 {
    public static void main(String args[]) {
        int size, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size = sc.nextInt();
        int [] arr1 = new int[size] ;
        for(int i = 0 ; i < size ; i++){
            System.out.println("Enter an element : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nArray before sorting is : ");
        for (int element : arr1) {
            System.out.println(element);
        }
        for(int i = 0 ; i < size ; i++){
            for(int j = i + 1 ; j < size ; j++){
                if(arr1[i] > arr1[j]){
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            } 
        }
        System.out.println("Array after sorting is : ");
        for (int element : arr1) {
            System.out.println(element);
        }
        sc.close();
    }}
