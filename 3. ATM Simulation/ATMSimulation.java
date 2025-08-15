import java.util.Scanner;

public class ATMSimulation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String correctPin = "1234";
        double balance = 1000;
        String enteredPin = "";

        System.out.println("(For demo purpose, please use this PIN: 1234)\n");
        System.out.println("=== Welcome to Simple ATM ===\n");

        int attempts = 0;
        while (attempts < 3)
        {
            System.out.print("Enter your PIN: ");
            enteredPin = sc.nextLine().trim();
            if (enteredPin.equals(correctPin))
                break;
            else
            {
                attempts++;
                System.out.println("Incorrect PIN! Attempts left: " + (3 - attempts));
            }
        }

        if (!enteredPin.equals(correctPin))
        {
            System.out.println("Too many incorrect attempts. Exiting...");
            sc.close();
            return;
        }

        int choice;
        do
        {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt())
            {
                sc.next();
                choice = 0;
            }
            else
                choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1 -> System.out.println("Your balance: $" + balance);
                case 2 ->
                {
                    System.out.print("Enter amount to deposit: $");
                    double amt = sc.nextDouble(); sc.nextLine();
                    if (amt > 0)
                    {
                        balance += amt;
                        System.out.println("Deposited successfully!");
                    }
                    else
                        System.out.println("Invalid amount!");
                }
                case 3 ->
                {
                    System.out.print("Enter amount to withdraw: $");
                    double amt = sc.nextDouble(); sc.nextLine();
                    if (amt > 0 && amt <= balance)
                    {
                        balance -= amt;
                        System.out.println("Withdrawn successfully!");
                    }
                    else
                        System.out.println("Invalid amount or insufficient balance!");
                }
                case 4 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 4);

        sc.close();
    }
}