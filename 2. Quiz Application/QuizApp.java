import java.util.Scanner;

public class QuizApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] questions =
        {
            "What is the capital of India?",
            "Which planet is known as the Red Planet?",
            "Which programming language is used here?"
        };

        String[][] options =
        {
            {"1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Chennai"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Venus"},
            {"1. Python", "2. C++", "3. Java", "4. Ruby"}
        };

        int[] answers = {2, 2, 3};
        int score = 0;

        System.out.println("=== Welcome to the Quiz ===");

        for (int i = 0; i < questions.length; i++)
        {
            System.out.println("\n" + questions[i]);
            for (String opt : options[i]) System.out.println(opt);

            System.out.print("Your answer (1-4): ");
            int userAns = sc.hasNextInt() ? sc.nextInt() : 0;
            sc.nextLine();

            if (userAns == answers[i])
            {
                System.out.println("Correct!");
                score++;
            }
            else
            {
                System.out.println("Wrong! Correct answer: " + answers[i]);
            }
        }

        System.out.println("\nYour total score: " + score + "/" + questions.length);
        sc.close();
    }
}