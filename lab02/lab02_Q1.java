import java.util.Scanner;

public class lab02_Q1 {

    public static void main(String[] args)
    { 
    Scanner in = new Scanner(System.in);
    
    //ask the volume of spehere and define it
    System.out.print("Please enter the volume of the sphere: ");
    double volume = in.nextDouble();

    //calculate radius length 
    double lengthOfRadius = Math.pow(3.0*volume/(4.0*Math.PI),1.0/3.0);

    //calculate its surface area
    double surfaceArea = 4.0*Math.PI*Math.pow(lengthOfRadius,2.0);

    //print the results
    System.out.println("The radius of the sphere is: " + String.format("%14.1f",lengthOfRadius));
    System.out.println("The surface area of the sphere is: " + String.format("%8.1f",surfaceArea));
    }
    }

