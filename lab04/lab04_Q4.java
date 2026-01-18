import java.util.Scanner;

public class lab04_Q4
{
    public static void main (String[] args) 
    {
        //ask the user for input
        System.out.print("Enter a positive number: ");  
        Scanner sc = new Scanner(System.in); 
        int x = sc.nextInt();

        while (true)
        {
            //set the values before executing
            int sumOfPrimeNumbers = 0;
            int numberOfPrimes = 0;
            int primeNumber = 2;

            System.out.print("Prime numbers: ");
            //start the loop and find the primes until the upper limit
            while(primeNumber<x)
            {
                boolean findPrime = true;
                int primeCheck = 2;
                while(primeCheck*primeCheck<=primeNumber)
                {
                    if(primeNumber%primeCheck==0)
                    {
                        findPrime = false;
                        break;
                    }
                    primeCheck++;
                }
                
                if(findPrime)
                {
                    System.out.print(primeNumber + " ");
                    sumOfPrimeNumbers = sumOfPrimeNumbers + primeNumber;
                    numberOfPrimes++;
                }
                primeNumber++;
            }
            //print the results
            System.out.println(" ");
            System.out.println("Sum of primes: " + sumOfPrimeNumbers);
            System.out.println("Count of primes: " + numberOfPrimes);

            //ask the user whether the program will continue
            Scanner sc2 = new Scanner(System.in); 
            System.out.print("Do you want to calculate again? (yes/no): ");
            String answer = sc2.nextLine();

            if(answer.contains("yes"))
            {
                System.out.print("Enter a positive number: ");   
                Scanner sc3 = new Scanner(System.in); 
                int userInput = sc3.nextInt();
                x = userInput;
            }
            else
            {
                System.out.println("Program finished.");
                return;
            }
        }
    }    
}