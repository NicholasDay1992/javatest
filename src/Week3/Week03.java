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

 
        Student nick = new Student(17126124, "Nick");
        //nick.print();
        
        Student onkar = new Student(125323, "Onkar");
        //onkar.print();

        Student uthman = new Student(2612512, "Uthman");
        //uthman.print();

        ArrayList<Student> studentlist = new ArrayList<Student>();
        studentlist.add(nick);
        studentlist.add(onkar);
        studentlist.add(uthman);

        for(Student current : studentlist)
        {
            current.print();
            //System.out.println("ID: " + student.getID() + " , name: " + student.getName() );
        }

    }     
    
}
