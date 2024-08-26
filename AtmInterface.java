import java.util.Scanner;
public class AtmInterface {
    int pin = 1234; 
        float balance; 
        
        public void checkpin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your PIN :- ");
        int enteredPin = sc.nextInt();

    //checking If Pin Entered by the user is Valid or not;
    if (enteredPin == pin) {
        menu();
    }
    else{
        System.out.println("Wrong PIN Please Enter a Valid PIN. \n ");
        checkpin();
    }
}
    
    

        public void menu(){
            System.out.println("\nPlease Enter any Option:\n");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit\n");
            System.out.print("\nChoose option from the menu: ");
    
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
    
            if (option == 1) {
                checkbalance();
            }
            else if (option == 2) {
                depositmoney();
            }
            else if (option == 3) {
                withdrawmoney();
            }
            else if (option == 4) {
                quit();
            }
            else{
                System.out.println("\nChoose a Valid Option from the above options only:\n");
            }
        }

        public void checkbalance(){
            System.out.println("\nCurrent Balance: " + balance);
            menu();
            System.out.print("Choose option from the menu: ");
        }
        
        public void depositmoney(){
            System.out.print("\nEnter the amount to Deposit: ");
            Scanner sc = new Scanner(System.in);
            float deposit = sc.nextFloat();
            balance = balance + deposit;
            System.out.println("\t\t\t_____Amount Deposited Successfully_____\n");
            menu();
            System.out.println("Choose option from the menu: ");
        }

        public void withdrawmoney(){
            System.out.print("\nEnter Amount to withdraw: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();

            if (amount > balance) {
                System.out.println("\t\t\t_____Insufficient Funds in your Account_____\n");
            }
            else{
                balance = balance - amount;
                System.out.println("\t\t\t_____Money Withdrawl Successfully_____\n");
            }
            menu();
            System.out.print("Choose option from the menu: ");
        }
        public void quit(){
            System.out.println("\n\t\t\t_____See you Soon , Have a Nice Day_____\n");
        }

    public static void main(String[] args) {
        System.out.println(" \n\t\t_____ATM Interface_____\n");

        AtmInterface obj = new AtmInterface();
        obj.checkpin();
    }
}
