public class Student{
     private int id;
     private String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
     }

     void sayHello(){
        System.out.println("Student class");
     }

     void display(){
        System.out.println("Student class display");
     }
}