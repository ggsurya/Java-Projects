import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        String playAgain = "yes";

        System.out.println("=== Welcome to Rock-Paper-Scissors Game ===");

        do
        {
            System.out.print("\nEnter Rock, Paper, or Scissors: ");
            String user = sc.nextLine().trim();

            if (!user.equalsIgnoreCase("Rock") && !user.equalsIgnoreCase("Paper") && !user.equalsIgnoreCase("Scissors"))
            {
                System.out.println("Invalid choice! Please enter Rock, Paper, or Scissors.");
                continue;
            }

            int computerIndex = rand.nextInt(3);
            String computer = choices[computerIndex];

            System.out.println("\nYou chose: " + user);
            System.out.println("Computer chose: " + computer);

            if (user.equalsIgnoreCase(computer))
                System.out.println("Result: It's a tie!");
            else if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) || (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) || (user.equalsIgnoreCase("Scissors") && computer.equals("Paper")))
                System.out.println("Result: You win!");
            else
                System.out.println("Result: You lose!");

            System.out.print("\nPlay again? (yes/no): ");
            playAgain = sc.nextLine().trim();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nThank you for playing! Goodbye.");
        sc.close();
    }
}