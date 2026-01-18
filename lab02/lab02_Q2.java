import java.util.Scanner;

public class lab02_Q2 {
    public static void main(String[] args) {

        //get the weight of earthlings
        
            Scanner weight1 = new Scanner(System.in);
            System.out.print("Enter the weight of the first earthling: ");
            double firstEarthling = weight1.nextInt();
        
            Scanner weight2 = new Scanner(System.in);
            System.out.print("Enter the weight of the second earthling: ");
            double secondEarthling = weight2.nextInt();

        //define the values of constants
        final double MARSconstant = 0.38;
        final double VENUSconstant = 0.91;
        final double MOONconstant = 0.166;
        final double URANUSconstant = 0.92;

        //calculate first earthling's weight on other planets
        double firstWeightOnMars = MARSconstant*firstEarthling;
        double firstWeightOnVenus = VENUSconstant*firstEarthling;
        double firstWeightOnMoon = MOONconstant*firstEarthling;
        double firstWeightOnUranus = URANUSconstant*firstEarthling;

        //calculate second earthling's weight on other planets
        double secondWeightOnMars = MARSconstant*secondEarthling;
        double secondWeightOnVenus = VENUSconstant*secondEarthling;
        double secondWeightOnMoon = MOONconstant*secondEarthling;
        double secondWeightOnUranus = URANUSconstant*secondEarthling;

        //print the results
        System.out.println("                             MARS        VENUS        MOON        URANUS" );
        System.out.println("EARTHLING ONE ("+ firstEarthling+" kg)      "+firstWeightOnMars+"         "+String.format("%.1f", firstWeightOnVenus)+"         "+String.format("%.1f",firstWeightOnMoon)+"          "+firstWeightOnUranus);
        System.out.println("EARTHLING TWO ("+ secondEarthling+" kg)     "+secondWeightOnMars+"        "+String.format("%.1f", secondWeightOnVenus)+"        "+String.format("%.1f",secondWeightOnMoon)+"          "+firstWeightOnUranus);
    }
}

