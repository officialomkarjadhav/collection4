
import java.util.*;

 class ArrayListSort    {
   

   

public static void main(String args[]) {
       
      ArrayList<Student> arraylist = new ArrayList<Student>();
   arraylist.add(new Student(222, "Messi", 29));
   arraylist.add(new Student(333, "Ronaldo", 31));
   arraylist.add(new Student(111, "john", 23));

   Collections.sort(arraylist);

   for(Student str: arraylist){
  System.out.println(str);
   }
    } {
    
}
}


public class Student implements   Comparable<Student>{
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
   
    @Override
public int compareTo(Student comparestu) {
    int compareage = comparestu.getStudentage();
    return this.studentage - compareage;
}


    private int getStudentage() {
        return studentage;
    }

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

  

   


    

   
}



