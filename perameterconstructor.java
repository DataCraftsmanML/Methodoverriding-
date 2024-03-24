class Student{

  String name;
  int age;


    public void printoutput(){

     System.out.println(this.name);
     System.out.println(this.age);
    }

    Student(String name, int age){

  this.name = name;
  this.age = age;

    }

  //   Student(){

  //     System.out.println("Student");

  //   }

}

public class perameterconstructor{

   public static void main(String args[]){

      Student s1 = new Student("jia",12);
       s1.printoutput();
       
      
   }

}   
  

