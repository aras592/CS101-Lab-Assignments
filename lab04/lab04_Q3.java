import java.util.Scanner;

public class lab04_Q3 {

    public static void main(String[] args) {
    while(true)
    {
        //set the variables and prompt the user
        int sumOfIntegers = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int enteredNumber = sc.nextInt();

        //check the conditions for the input
        if (enteredNumber>0)
        {
            //set the value of reversed number to zero
            int reversedEnteredNumber = 0;
            while(reversedEnteredNumber>0)
            {
                //write the function calculating the reverse 
                int digitsStartingFromLeft = enteredNumber%10;
                sumOfIntegers = sumOfIntegers+digitsStartingFromLeft;
                enteredNumber = enteredNumber/10;
                reversedEnteredNumber = reversedEnteredNumber*10 + digitsStartingFromLeft;
            }
            System.out.println("Reversed number: "+reversedEnteredNumber);
            System.out.println("Sum of digits: "+sumOfIntegers);
        }
        else
        {
            System.out.println("The number exceeds 8 digits.");
            System.out.println("Program finished.");
            return;
        }
    }
           
   }
   

}