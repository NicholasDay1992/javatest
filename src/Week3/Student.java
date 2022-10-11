package Week3;

public class Student 
{
    private int id;
    private String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void print()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
}
