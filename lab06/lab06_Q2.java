import java.util.Scanner;
public class lab06_Q2 {
    //validate email
    public static boolean validateEmail (String enteredEmail){
        boolean emailCheck = true;
        if(enteredEmail.contains(".")&&enteredEmail.contains("@")&&enteredEmail.contains(".edu.tr")&&(enteredEmail.indexOf('@')!=enteredEmail.indexOf('.')-1)){
            emailCheck = true;
                String nameOfStudent = enteredEmail.substring(0, enteredEmail.indexOf("."));
                System.out.println("Student Name: "+nameOfStudent);
    
                String surnameOfStudent = enteredEmail.substring(enteredEmail.indexOf(".")+1,enteredEmail.indexOf("@"));
                System.out.println("Student Surname: "+surnameOfStudent);
    
                String universityOfStudent = enteredEmail.substring(enteredEmail.indexOf("@")+1,enteredEmail.indexOf(".edu.tr"));
                System.out.println("Student Surname: "+universityOfStudent);
                
        }
        else{
            emailCheck = false;
        }
        return emailCheck;
}
public static boolean validatePassword(String enteredPassword){
    boolean checkForPassword = false;

    boolean checkForLength = false;
    boolean checkForLowerCase = false;
    boolean checkForUpperCase = false;
    boolean checkForDigit = false;
    
    if(enteredPassword.length()>8){
        checkForLength = true;
    }
    for(int a=0;a<enteredPassword.length();a++){
        char placeOfTheChar = enteredPassword.charAt(a);
        if(Character.isUpperCase(placeOfTheChar)){
            checkForUpperCase = true;
        }
        else if(Character.isLowerCase(placeOfTheChar)){
            checkForLowerCase = true;
        }
        else if(Character.isDigit(placeOfTheChar)){
            checkForDigit = true;
        }
    }
    if(checkForDigit&&checkForLength&&checkForLowerCase&&checkForUpperCase){
        checkForPassword = true;
    }
    return checkForPassword;
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the email: ");
        String enteredEmail = sc.nextLine();
        
        boolean check = true;
        while(check){
            
            if(validateEmail(enteredEmail)){
                check = false;
            }
            else{
                System.out.print("The email is not valid, please enter a valid email: ");
                enteredEmail = sc.nextLine();
            }
        }
        
        System.out.print("Enter the password: ");
        String enteredPassword = sc.nextLine();

        if(validatePassword(enteredPassword)){
        }
        else{
            System.out.print("The password is not valid, please enter a valid password: ");
            enteredPassword = sc.nextLine();
        }
        
    }
}
