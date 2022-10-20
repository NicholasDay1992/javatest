package Week4;

public class Module 
{
    private String name;
    private String code;

    public Module(String name, String code)
    {
        this.name = name;
        this.code = code;
    }

    public void print()
    {
        System.out.println("Module code: " + this.code + "Module name: " + this.name);
    }
}
