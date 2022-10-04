package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();
/* 
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);
        System.out.println("nice to meet you!");

        int id = InputReader.getInt("Enter your id > ");
        System.out.println("Your ID is " + id);
*/


     // THIS IS EXERCISE 3: 
        int length = InputReader.getInt("Enter length: ");
        int height = InputReader.getInt("Enter height: ");

        int perimeter = (length + height) * 2;
        int area = length * height;

        System.out.println("The area is " + area);
        System.out.println("The perimter is: " + perimeter);

        

        //EXERCISE 4:
/* 
        int num1 = InputReader.getInt("Enter first number: ");
        int num2 = InputReader.getInt("Enter second number: ");

        int average = (num1 + num2) / 2;

        System.out.println("Average of " + num1 + " and " + num2 + " is " + average);


*/
    } 
}
