import java.util.Scanner;

public class CurrencyConverter {
   
    public void menu(){
        System.out.println("1. Convert Rupees into US Dollar: ");
        System.out.println("2. Convert US Dollar into US Japanese Yen: ");
        System.out.println("3. Convert Russian Rubel into Chinese Yuan: ");
        System.out.println("4. Convert US Dollar into Singapore Dollar : ");
        System.out.println("5. Exit : ");
        System.out.print("\nSelect any Number from the above options to Convert the Given Currency :- ");
        Scanner sc = new Scanner(System.in);
        float opt = sc.nextInt();

        if (opt == 1) {
            rupee_to_Dollar();
        }
        else if (opt == 2) {
            dollar_to_yen();
        }
        else if (opt == 3) {
            rubel_to_yuan();
        }
        else if (opt == 4) {
            dollar_to_dollar();
        }
        else if (opt == 5) {
            exit();
        }
        else{
            System.out.println("Enter a Valid option from the Menu.\n");
    }
}

    public void rupee_to_Dollar(){
        System.out.print("\nEnter the Amount to Convert:- ");
        Scanner sc = new Scanner(System.in);
        float fun1 = sc.nextFloat();
        fun1 = fun1 / (float) 83.85;
        System.out.println("\nAmount will be: " + fun1 + " US Dollars.\n");
        menu();
        System.out.print("\n");
    }

    public void dollar_to_yen(){
        System.out.print("\nEnter the amount to Convert:- ");
        Scanner sc = new Scanner(System.in);
        float fun2 = sc.nextFloat();
        fun2 = fun2 / (float)144.50;
        System.out.println("\nAmount will be: " + fun2 + " Japanese Yens.\n");
        menu();
    }

    public void rubel_to_yuan(){
        System.out.print("\nEnter the Amount to Convert:- ");
        Scanner sc = new Scanner(System.in);
        float fun3 = sc.nextFloat();
        fun3 = fun3 / (float)0.077;
        System.out.println("\nAmount will be: " + fun3 + " Chinese Yuans.\n");
        menu();
    }

    public void dollar_to_dollar(){
        System.out.print("\nEnter the Amount to Convert:- ");
        Scanner sc = new Scanner(System.in);
        float fun4 = sc.nextFloat();
        fun4 = fun4 / (float)1.30;
        System.out.println("\nAmount will be: " + fun4 + " Singapore Dollars.\n");
        menu();
    }

    public void exit(){
        System.out.println("\n\t\t\t_____Have a Nice Day_____\n");
    }

    public static void main(String[] args) {
        System.out.println("\n\t\t\t_____Currency Converter_____\n");
        CurrencyConverter obj = new CurrencyConverter();
        obj.menu();
    }
    
}

