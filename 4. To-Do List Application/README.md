# ✅ To-Do List Application in Java

A simple command-line Java program to manage tasks, mark them as done, and keep your daily to-do list organized.

## Features

- Add new tasks to the to-do list.
- Remove existing tasks by number.
- Mark tasks as completed.
- List all tasks with their status (done or pending).
- Handles invalid inputs gracefully with clear prompts.

## Usage

1. Clone the repository or download the source code file.
2. Compile the program with a Java compiler. For example:
   ```bash
   javac ToDoList.java
3. Run the executable:
   ```bash
   java ToDoList
4. Follow the on-screen menu to manage your tasks.

## Example

```
=== Welcome to To-Do List Application ===

Menu:
1. Add Task
2. Remove Task
3. Mark Task as Done
4. List Tasks
5. Exit
Enter your choice: 1
Enter task: Finish Java project
Task added!

Menu:
1. Add Task
2. Remove Task
3. Mark Task as Done
4. List Tasks
5. Exit
Enter your choice: 1
Enter task: Read a book
Task added!

Menu:
1. Add Task
2. Remove Task
3. Mark Task as Done
4. List Tasks
5. Exit
Enter your choice: 4

To-Do List:
1. [ ] Finish Java project
2. [ ] Read a book

Menu:
1. Add Task
2. Remove Task
3. Mark Task as Done
4. List Tasks
5. Exit
Enter your choice: 3
Enter task number to mark as done: 1
Task marked as done!

Menu:
1. Add Task
2. Remove Task
3. Mark Task as Done
4. List Tasks
5. Exit
Enter your choice: 4

To-Do List:
1. [X] Finish Java project
2. [ ] Read a book
```

## How it Works

- Users interact via a simple numbered menu.
- Tasks are stored in two lists: one for task descriptions and one for completion status.
- Tasks can be added, removed, or marked as done using the menu options.
- The list displays [X] for completed tasks and [ ] for pending tasks.
- The computer choice is randomly generated each round.
   
## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/ggsurya/Java-Projects/blob/main/LICENSE) file for details.

## 📩 Contact

**G.G. Surya**  
📧 Email: ggsuryaff@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/g-g-surya-5aa9312b4)
🔗 [GitHub](https://github.com/ggsurya)
