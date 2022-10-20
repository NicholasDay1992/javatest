package Week2;

import helpers.InputReader;

public class Week02 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();
/* 
        int count = 9;
        while( count >= 0)
        {
            if(count % 3 == 0)
            {
                System.out.println(count);
            }
            count--;
        }
*/
        int number;
        String proceed;
        do
        {
            number = InputReader.getInt("Enter a times table (1-12): ");   
            for(int i = 1; i <= 12; i++)
            {
                System.out.println(i + " x " + number + " = " + (i * number) );
            }  
            proceed = InputReader.getString("Do you want to run the program again? ");  
            proceed.toLowerCase();
        }
        while(proceed.equals("y") || proceed.equals("yes") );
        System.out.println("Thank you for using this program! See you again!");
    }     
}
