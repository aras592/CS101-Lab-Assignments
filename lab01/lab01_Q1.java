public class lab01_Q1 {      
    public static void main( String args[] ) 
    {
    // Constants
    final int LABS_COUNT = 9;
    final double LABS_GRADE_PERCENT = 15;  // grading policy
    final double GRADE_PERCENT_PER_LAB = LABS_GRADE_PERCENT / LABS_COUNT;
        
    // Variables
    String courseAndSemester;
          
    // First initialize the course & semester information
    courseAndSemester = ("CS101 in Fall 2024");
       
    // Then print out welcome message
    System.out.println( "Hi there! Welcome to Lab 01 of " + courseAndSemester + "!" );
    System.out.println( "Here are some details about lab grades:" );
    System.out.println();
          
    // Now print out the grading policy
    System.out.println( "There are "+ LABS_COUNT + " lab sessions this semester." );
    System.out.println( "Labs make up " + LABS_GRADE_PERCENT + " % of your total grade." );
    System.out.println( "This lab: " + GRADE_PERCENT_PER_LAB + " points" );
    System.out.println( "All labs: " + LABS_GRADE_PERCENT + " points" );
    System.out.println( "Do not let the low weight fool you. Labs are extremely important!" );
          
    // Finally wish them luck and finish
    System.out.println();
    System.out.println( "Best of luck!" );
       }
    }