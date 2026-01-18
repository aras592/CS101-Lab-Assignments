import java.util.Scanner;
import java.util.*;

public class lab03_Q3 {
    public static void main(String[] args) {
        //define username and password
        final String USERNAME = "manager";
        final String PASSWORD = "inventory";

        //define list of customers
        String customer1 = "PrimeTech";
        String customer2 = "Peak";
        String customer3 = "EcoGoods";

        //define the items as IDs
        String item1 = "Item104:Laptop";
        String item2 = "Item125:Monitor";
        int item1Number = 104;
        int item2Number = 125;

        //take the username and password from the user 
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String usernameTaken = in1.nextLine();
        
            if (!usernameTaken.equals(USERNAME)){
                System.out.println("Username not found. Goodbye!");
                return;
            }
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String passwordTaken = in2.nextLine();
           
            if (!passwordTaken.equals(PASSWORD)){
                System.out.println("Incorrect password. Goodbye!");
                return;
            }
        //display the entrance page
        System.out.println("1-Add customer");
        System.out.println("2-Delete customer");
        System.out.println("3-Add item");
        System.out.println("4-Delete item");
        System.out.println("5-Log out");
        System.out.print("Select an operation: ");
        
        Scanner in3 = new Scanner(System.in);
        int userInput = in3.nextInt();

        //add customer
        if (userInput == 1){
            Scanner in4 = new Scanner(System.in);
            System.out.print("Enter customer name: ");
            String customerName = in4.nextLine();
            if(customerName.equals(customer1)||customerName.equals(customer2)||customerName.equals(customer3) ){
                System.out.println("This customer is already in your list!");
                System.out.println("Your customers: ("+customer1+", "+customer2+", "+customer3+")");
            }
            else{
                System.out.println("New customer "+customerName+" is added!");
            System.out.println("Your customers: ("+customer1+", "+customer2+", "+customer3+", "+customerName+")");
            }
            
        }

        //delete customer
        if (userInput == 2){
            Scanner in5 = new Scanner(System.in);
            System.out.print("Enter customer name which you want to delete: ");
            String customerName1 = in5.nextLine();
            if(!customerName1.equals(customer1)&&!customerName1.equals(customer2)&&!customerName1.equals(customer3) ){
                System.out.println("You don't have any customer whose name is "+customerName1+"!");
                System.out.println("Your customers: ("+customer1+", "+customer2+", "+customer3+")");
            }
            else if(customerName1.equals(customer1)){
                System.out.println(customerName1+" is deleted succesfully from customers!");
                System.out.println("Your customers: ("+customer2+", "+customer3+")");
            }
            else if(customerName1.equals(customer2)){
                System.out.println(customerName1+" is deleted succesfully from customers!");
                System.out.println("Your customers: ("+customer1+", "+customer3+")");
            }
            else if(customerName1.equals(customer3)){
                System.out.println(customerName1+" is deleted succesfully from customers!");
                System.out.println("Your customers: ("+customer1+", "+customer2+")");
            }
        }

        //add item 
        if (userInput == 3){
            Scanner in6 = new Scanner(System.in);
            System.out.print("Enter item name: ");
            String itemName = in6.nextLine();
                Random rand = new Random();
                    int max=999, min=100;
                    int randomNumber = (rand.nextInt(max-min+1)+min);
            if(randomNumber==item1Number||randomNumber==item2Number){
                System.out.println("There is an item with the same ID "+randomNumber+", your cannot add a new item with the same ID!");
                System.out.println("Your items: "+item1+", "+item2);
            }
            else{
                System.out.println("New item with the ID "+randomNumber+" is added!");
                System.out.println("Your items: "+item1+", "+item2+", "+"Item"+randomNumber+":"+itemName);
            }
            
        }
        //delete item
        if(userInput==4){
            Scanner in7 = new Scanner(System.in);
            System.out.print("Enter item ID which you want to delete: ");
            int deletedItemID = in7.nextInt();
            if(deletedItemID==item1Number){
                System.out.println("The item with the ID "+deletedItemID+" is deleted succesfully!");
                System.out.println("Your items: "+item2);
            }
            else if(deletedItemID==item2Number){
                System.out.println("The item with the ID "+deletedItemID+" is deleted succesfully");
                System.out.println("Your items: "+item1);
            }
            else{
                System.out.println("You don't have any item with the ID "+deletedItemID+"!");
                System.out.println("Your items: "+item1+", "+item2);
            }
                
        }

        //logout
        if(userInput==5){
            System.out.println("Logged out succesfully!");
        }

        }
        
    }
