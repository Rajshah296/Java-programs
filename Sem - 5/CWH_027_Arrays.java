package CWH_JAVA_CODE;
public class CWH_027_Arrays {
    public static void main(String args[]) {
        int [] marks = {98, 45, 79, 99, 80};
        System.out.println("Printing using For Loop : \n");
        for(int i = 0; i < marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using For each Loop : \n");

        for(int element: marks){
            System.out.println(element);
        }

    }
}