import java.util.Scanner;
import java.util.Random;

public class Lab4 {

    public static void main(String[] args) {
        //Exercise 1
        /*int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Please choose a single digit number: ");
        x = input.nextInt();

        if (x > 0 && x < 10) {
             System.out.println("positive single digit number.");
        } else if (x < 0 && x < -10) {
            System.out.println("negative single digit number.");
        } else if (x > 10) {
            System.out.println("Not a single digit number.");
        } else if (x < -10) {
            System.out.println("Not a single digit number.");
        }
*/
        //Exercise 2
         int number;
        Scanner in = new Scanner(System.in);

        Random rand = new Random();
        int random = rand.nextInt(100)+1;

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        number = in.nextInt();
        System.out.println("Your guess is: " + number);
        System.out.print("Please type another number: ");
        number = in.nextInt();
        System.out.println("This is your second number: " + number);
    
        //System.out.println("The number was: " + random);
        //int difference = (number - random);
        //System.out.println("You were " + difference + " away from the number I guessed.");

        /*if (number > random) {
            System.out.println("Your number is too high.");
            System.out.print("Please pick another number: ");
            number = in.nextInt();
        } else if (number < random) {
            System.out.println("Your number is too low.");
            System.out.print("Please pick another number: ");
            number = in.nextInt();
        }*/

        if (number > random) {
            GuessNumberHigh(number, random);
                if (number > random) {
                    GuessNumberHigh(number, random);
                } else if (number < random) {
                    GuessNumberLow(number, random); }
        } else if (number < random) {
            GuessNumberLow(number, random);
        } else if (number == random) {
            System.out.println("That's correct! The number I chose was: " + number);}
        }

    public static void GuessNumberHigh(int number, int random) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your number is too high.");
            System.out.print("Please pick another number: ");
            number = in.nextInt();

    }

    public static void GuessNumberLow(int number, int random) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your number is too low.");
            System.out.print("Please pick another number: ");
            number = in.nextInt();
    }

}

