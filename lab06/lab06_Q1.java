import java.util.Scanner;

public class lab06_Q1 {
    //greatest common divisor method
    public static int greatestCommonDivisor(int numberOne, int numberTwo){
        
        int greatestCD=1;
        for(int a=1; a<= numberOne && a<= numberTwo;a++ ){
            if(numberOne%a == 0 && numberTwo%a == 0){
                greatestCD = a;
            }
        }
        return greatestCD;
        }

    //least common multiplier method
    public static int leastCommonMultiple(int numberOne, int numberTwo){
        int leastCM = 1;
        int GCD = 1;
        for(int a=1; a<= numberOne && a<= numberTwo;a++ ){
            if(numberOne%a == 0 && numberTwo%a == 0){
                GCD = a;
                leastCM = (numberOne/a)*(numberTwo/a)*a;
            }
        }
        return leastCM;
    }

    //relatively prime method
    public static boolean isRelavitelyPrime(int numberOne, int numberTwo){
        
        boolean relativelyPrime;
        if(greatestCommonDivisor(numberOne, numberTwo)==1){
            relativelyPrime = true;
        }
        else{
            relativelyPrime = false;
        }
        return relativelyPrime;
    }

    //reverse binary system method
    public static long binaryReversal(int binaryNumber){
        long reversedBinaryCode = 1;
        for(int a=0; a<10 ;a++){
            if(binaryNumber%2==0&&binaryNumber!=0){
                reversedBinaryCode = reversedBinaryCode*10;
                binaryNumber = binaryNumber/2;
            }
            else if(binaryNumber%2!=0&&binaryNumber!=0){
                reversedBinaryCode = reversedBinaryCode*10;
                reversedBinaryCode = reversedBinaryCode+1;
                binaryNumber = binaryNumber/2;
            }
            else{
                a = 10;
            }
        }
        
        return reversedBinaryCode;
    }

    //binary system method
    public static long intToBinary(int binaryNumber){
        long realBinaryCode = 0;
        long newReversed = binaryReversal(binaryNumber);
        while(newReversed>0){
            long digitsStartingFromLeft = newReversed%10;
            newReversed = newReversed/10;
            realBinaryCode = realBinaryCode*10+digitsStartingFromLeft;
        }
        realBinaryCode = realBinaryCode/10;
        return realBinaryCode;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int binaryNumber = sc.nextInt();
        String reversedBinary = String.valueOf(binaryReversal(binaryNumber)).substring(1);
        while((reversedBinary.charAt(0))=='0'){
            reversedBinary=reversedBinary.substring(1);
        }

        System.out.println("Binary representation of "+binaryNumber+" is "+intToBinary(binaryNumber));

        System.out.println("Binary reversal of "+binaryNumber+" is "+reversedBinary);

        System.out.print("Enter the first number: ");
        int numberOne = sc.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = sc.nextInt();

        if(isRelavitelyPrime(numberOne, numberTwo)==true){
            System.out.println(numberOne+" and "+numberTwo+" are relatively prime.");
        }
        else{
            System.out.println(numberOne+" and "+numberTwo+" are not relatively prime.");
        }

        System.out.println("Greatest common divisor of "+numberOne +" and "+numberTwo+" is "+greatestCommonDivisor(numberOne, numberTwo));
        System.out.println("Least common multiple of "+numberOne +" and "+numberTwo+" is "+leastCommonMultiple(numberOne, numberTwo));
        
    }
}