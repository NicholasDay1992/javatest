package Week4;

import java.util.ArrayList;
import Week3.Student;

public class Week04 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 4 Java Collections, Lists, Arrays ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();


        Student nick = new Student(251533, "Nick");
        nick.print();

        Student onkar = new Student(125323, "Onkar");
        onkar.print();

        Student uthman = new Student(25142312, "Uthman");
        //uthman.print();

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(uthman);
        students.add(onkar);
        students.add(nick);

        for(Student student : students)
        {
            student.print();
        }
        
    }     
    
}
