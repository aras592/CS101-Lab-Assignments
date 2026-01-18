import java.util.Scanner;

public class lab03_Q2 {
    public static void main(String[] args) {
        //take the inputs from the user
        System.out.print("Enter the student's GPA: ");
        Scanner in1 = new Scanner(System.in);
        double studentGPA = in1.nextDouble();

        System.out.print("Enter the total number of completed credit hours: ");
        Scanner in2 = new Scanner(System.in);
        int studentCreditHour = in2.nextInt();

        System.out.print("Enter the extracurricular activity hours: ");
        Scanner in3 = new Scanner(System.in);
        int studentActivityHour = in3.nextInt();

        System.out.print("Enter the numbers of academic honors received: ");
        Scanner in4 = new Scanner(System.in);
        int studentHonorsReceived = in4.nextInt();

        System.out.print("Enter the total annual family income: ");
        Scanner in5 = new Scanner(System.in);
        double studentFamilyIncome = in5.nextInt();

        //define and calculate the students scolarship score
        int scholarshipScore;
        int baseScholarshipScore = 200;
        int addedCreditHour = 15*studentCreditHour;
        int addedActivityHour = 10*studentActivityHour;
        int addedHonorReceived = 20*studentHonorsReceived;
        int subtractFamilyIncome = 5*((int)studentFamilyIncome/5000);

            if (addedCreditHour>= 600){
            scholarshipScore = baseScholarshipScore+600;
        }
        else{
            scholarshipScore = baseScholarshipScore+addedCreditHour;
        }

            if (addedActivityHour>= 300){
            scholarshipScore = scholarshipScore+300;
        }
        else{
            scholarshipScore = scholarshipScore+addedActivityHour;
        }
        
            if (addedHonorReceived>= 100){
            scholarshipScore = scholarshipScore+100;
        }
        else{
            scholarshipScore = scholarshipScore+addedHonorReceived;
        }
        
        scholarshipScore = scholarshipScore - subtractFamilyIncome;
        System.out.println("Total scholarship score: "+scholarshipScore);

        //determine the eligibility for the scholarsip
        
        if (scholarshipScore>= 900 && studentGPA>=3.5 && studentActivityHour>=20 && studentFamilyIncome<=75000 && studentCreditHour>=30){
            System.out.println("The student is eligible for the scholarship.");
        }
        else {
            System.out.println("The student is not eligible for the scholarship. Reason:" );
        } 
            if (studentGPA<3.5){
                System.out.println("GPA is below 3.5." );
        }
            if (scholarshipScore<900){
                System.out.println("The scholarship score is below 900.");
        }
            if (studentActivityHour<20){
                System.out.println("Fewer than 20 extracurricular activity hours.");
        }
            if (studentCreditHour<30){
                System.out.println("Fewer than 30 completed credit hours");
        }
            if (studentFamilyIncome>75000){
                System.out.println("The family income exceeds $75,000");
        }
    }
}