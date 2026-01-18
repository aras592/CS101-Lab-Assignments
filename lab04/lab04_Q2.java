import java.util.Scanner;

public class lab04_Q2 {
    public static void main(String[] args) {
        while(true)
        {
            //define the values
            int sumOfIntegersOfGivenNumber = 0;

            //ask for promt from the user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive number: ");
            int enteredNumber = sc.nextInt();
            
            //check whether the entered number is greater than zero
                if(enteredNumber>0)
                {
                    while(enteredNumber>0)
                    {
                        int digitsStartingFromLeft = enteredNumber%10;
                        sumOfIntegersOfGivenNumber = sumOfIntegersOfGivenNumber + digitsStartingFromLeft;
                        enteredNumber = enteredNumber/10;
                    }
                        System.out.println("Sum of digits: "+ sumOfIntegersOfGivenNumber);
                }
                else 
                {
                    System.out.println("Program finished.");
                    return;
                }
        }
    }
}