package Week3;

import java.util.ArrayList;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

 
        Student nick = new Student(251533, "Nick");
        //nick.print();

        Student onkar = new Student(125323, "Onkar");
        //onkar.print();

        Student rayan = new Student(12561263, "Rayan");
        //rayan.print();

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(rayan);
        students.add(nick);
        students.add(onkar);

        for(Student student : students)
        {
            student.print();
        }

        
        
    }     
    
}
