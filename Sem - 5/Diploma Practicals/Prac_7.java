package Java_clg_Prac;

class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
    this.rollno=rollno; // using this keyword to prevent name ambiguity between class objects and arguments.//  
    this.name=name;  
    this.fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  

class Prac_7{  
    public static void main(String args[]){  
        Student s1=new Student(111,"ankit",5000f);  
        Student s2=new Student(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
    }}  
    