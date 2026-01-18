import java.util.Scanner;

public class lab04_Q1 {
    public static void main(String[] args) {
        //write a loop that constantly asks for prompt from the user
        while(true)
        {
        //define values before entering the loop
        int output = 1;
        int constantValue = 1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int enteredNumber = sc.nextInt();
            //write an if statement that tests whether the entered number is greater than zero
            if(enteredNumber>0)
            {
                while(enteredNumber>=constantValue)
                {
                    output = output*constantValue;
                    constantValue++;
                }
                System.out.println("Factorial of " + enteredNumber + " is " + output);
            }
           //finish the program if entered number is lower than zero
            else
            {
                System.out.println("Program finished.");
                return;
            }
        }
        
    }
}