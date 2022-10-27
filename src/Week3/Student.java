package Week3;

import java.util.ArrayList;
import Week4.Module;

public class Student 
{
    private int id;
    private String name;

    //Constructor
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    //print method
    public void print()
    {
        System.out.println("ID: " + this.id + "\tName: " + this.name);  
    }

}
