import java.util.Scanner;
import java.util.Random;
public class Task1_NumberGame {
    public static void main(String[] args) {
        int random,guess=101,attempt;
        System.out.println("\t _____Number Guessing Game_____");
       
       //System Generated Random Number
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        random = generator.nextInt(100)+1;
        attempt = 0;
        System.out.println("\nI am thinking of a number between 0 and 100, what do you think it is\n");

        //User Input for Guessing A Random number by the user
        System.out.print("Guess the Number:- ");
        while (guess != random) {
            guess = keyboard.nextInt();
            if (guess > random) {
                System.out.println("Wrong Guess, It's Lower then the Number Choosen by Me :-");
                System.out.print("Guess Again :- ");
                attempt += 1;
            }
            else if(guess < random) {      
                System.out.println("Wrong Guess, It's Higher then the Number Choosen by Me :-");
                System.out.print("Guess Again :- ");
                attempt += 1;    
            } 
            else {
                System.out.println(random + " is the correct Answer " ); 
                attempt +=1;
                System.out.println("\n" + random + " is guessed by the user in " + attempt + "\n\n\t_____Congratulations!!!! Champion_____");
            }
           
        }

    }
}
