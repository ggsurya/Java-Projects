import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> done = new ArrayList<>();
        int choice;

        System.out.println("=== Welcome to To-Do List Application ===");

        do
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt())
            {
                sc.next();
                choice = 0;
            }
            else
            {
                choice = sc.nextInt();
                sc.nextLine();
            }

            switch (choice)
            {
                case 1 ->
                {
                    System.out.print("Enter task: ");
                    String task = sc.nextLine().trim();
                    if (!task.isEmpty())
                    {
                        tasks.add(task);
                        done.add(false);
                        System.out.println("Task added!");
                    }
                    else System.out.println("Invalid input!");
                }
                case 2 ->
                {
                    listTasks(tasks, done);
                    System.out.print("Enter task number to remove: ");
                    int n = sc.nextInt(); sc.nextLine();
                    if (n > 0 && n <= tasks.size())
                    {
                        tasks.remove(n - 1);
                        done.remove(n - 1);
                        System.out.println("Task removed!");
                    }
                    else System.out.println("Invalid task number!");
                }
                case 3 ->
                {
                    listTasks(tasks, done);
                    System.out.print("Enter task number to mark as done: ");
                    int n = sc.nextInt(); sc.nextLine();
                    if (n > 0 && n <= tasks.size())
                    {
                        done.set(n - 1, true);
                        System.out.println("Task marked as done!");
                    }
                    else System.out.println("Invalid task number!");
                }
                case 4 -> listTasks(tasks, done);
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 5);

        sc.close();
    }

    static void listTasks(ArrayList<String> tasks, ArrayList<Boolean> done)
    {
        if (tasks.isEmpty())
        {
            System.out.println("No tasks to show.");
            return;
        }
        System.out.println("\nTo-Do List:");
        for (int i = 0; i < tasks.size(); i++)
        {
            System.out.printf("%d. [%s] %s%n", i + 1, done.get(i) ? "X" : " ", tasks.get(i));
        }
    }
}