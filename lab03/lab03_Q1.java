import java.util.Scanner;

public class lab03_Q1 {
    
    public static void main(String[] args) 
    {
    //ask the users height and weight
    System.out.print("Enter your weight in kilograms: ");
    Scanner in1 = new Scanner(System.in);
    double weight = in1.nextDouble();

    System.out.print("Enter your height in meters: ");
    Scanner in2 = new Scanner(System.in);
    double height = in2.nextDouble();

    //calculate their BMI and print
    double bodyMassIndex = weight / (height*height);
    System.out.println("Your BMI is: " + String.format("%.2f",bodyMassIndex));

    //check their BMI levels and print the results
    if (bodyMassIndex < 18.5) {
        System.out.println("You are underweight.");
    }
    else if (18.5 <= bodyMassIndex || bodyMassIndex <= 24.9){
        System.out.println("You are normal weight.");
    }
    else if (24.9 < bodyMassIndex || bodyMassIndex <= 29.9){
        System.out.println("You are overweight.");
    }
    else{
        System.out.println("Your BMI indicates that you are above the recommended range.");
    }

    
    }
}