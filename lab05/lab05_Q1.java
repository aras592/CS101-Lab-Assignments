import java.util.Scanner; 
public class lab05_Q1{
    public static void main(String[] args) {
        boolean checkValue = false;
        do{
        //prompst the user for input and define variable
            System.out.print("Please input the height: ");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            int constantValue1 = 0;
            
        if(userInput<=30&&userInput>0){
                checkValue=false;
        }

        //check the user input
        if(userInput<=30&&userInput>0){
            //print the head of the letters
            System.out.printf("%6s %6s","*****", "*****");
            System.out.println("");
            //create a loop for the letter "C" and "S" 
            while(((userInput-2)/2)>constantValue1){
                System.out.printf("%1s %6s","*","*");
                System.out.println();
                constantValue1++;
            }
            
            System.out.printf("%1s %11s","*","*****");
            System.out.println();
            
            while ((userInput-3)>constantValue1){
                System.out.printf("%1s %12s", "*","*");
                System.out.println();
                constantValue1++;
            }
            
            //print the tail of the letters
            System.out.printf("%6s %6s","*****", "*****");
        }
        else{
            checkValue = true;
        }
    }while(checkValue);
        
    }
}