package Java_clg_Prac;
import java.io.*;
import java.util.Scanner;

public class Prac_24 {
    public static void main(String args[]) {
        // Code to create File. 
            try{
                File myFile = new File("cwh111file.txt");
                myFile.createNewFile();
            }
            catch(IOException e){
                System.out.println("Unable to create this file.");
                e.printStackTrace();
            }
        // Code to write a File.
                try {
                    FileWriter myfileWriter = new FileWriter("cwh111file.txt");
                    myfileWriter.write("This is a first file from this Java course.\nThis is a new Line.");
                    myfileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Unable to write to this file. ");
            }
        // Code to read a File.
            try { 
                File myFile = new File("cwh111file.txt");
                Scanner sc = new Scanner(myFile);
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    System.out.println(line);
                }

                sc.close();
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        // Code to delete the File.
            File myFile = new File("cwh111file.txt");
            if(myFile.delete()){
                System.out.println("I have deleted " + myFile.getName());
            }
            else{
                System.out.println("Some error occured while deleting this file.");
            }
    }
}