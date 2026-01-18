import java.util.Scanner;

public class lab02_Q3 {

    public static void main(String[] args) {

        //Ask the date and time and get the answer from the user
        System.out.print("Enter the date and time: ");
        Scanner date = new Scanner(System.in);
        String wholeDate = date.nextLine();

        //get the answer in specific format
        String[] splittedComma = wholeDate.split(",");
        String[] splittedSlash = splittedComma[0].split("/");
        String[] splittedDash = splittedComma[1].split("-");
        String[] splittedColon = splittedDash[1].split(":");

        //assign date by day, month, year, hour, minute
        String inputDate = splittedSlash[2].trim();
        String day = splittedDash[0].trim();
        String month = splittedSlash[1].trim();
        String year = splittedSlash[0].trim();
        String hour = splittedColon[0].trim();
        String minute = splittedColon[1].trim();

        //print the results line by line
        System.out.println("Date: "+inputDate);
        System.out.println("Day : "+day);
        System.out.println("Month: "+month);
        System.out.println("Year: "+year);
        System.out.println("Time: "+minute+" minutes after "+ hour);
    }
}

