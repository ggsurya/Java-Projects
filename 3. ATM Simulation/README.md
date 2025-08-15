# 🏦 ATM Simulation in Java
A simple command-line Java program simulating basic ATM operations like checking balance, depositing, and withdrawing money.

## Features

- User authentication via PIN (demo PIN: 1234).
- Check current account balance.
- Deposit money into the account.
- Withdraw money from the account with balance validation.
- Handles invalid inputs and limits PIN attempts to 3.
- Simple text-based menu for easy interaction.

## Usage

1. Clone the repository or download the source code file.

2. Compile the program with a Java compiler. For example:
   ```bash
   javac ATMSimulation.java
3. Run the executable:
   ```bash
   java ATMSimulation
4. Follow the on-screen prompts to interact with the ATM.

## Example

```
(For demo purpose, please use this PIN: 1234)

=== Welcome to Simple ATM ===

Enter your PIN: 1234

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 1
Your balance: $1000.0

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 2
Enter amount to deposit: $500
Deposited successfully!

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 3
Enter amount to withdraw: $200
Withdrawn successfully!

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 4
Exiting... Thank you!
```

## How It Works

- Users have 3 attempts to enter the correct PIN.
- After successful login, a menu is displayed with options:
  - Check Balance
  - Deposit
  - Withdraw
  - Exit
- Deposits increase the account balance, withdrawals decrease it (if sufficient funds).
- Invalid choices or amounts are handled gracefully.
- The computer choice is randomly generated each round.
   
## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/ggsurya/Java-Projects/blob/main/LICENSE) file for details.

## 📩 Contact

**G.G. Surya**  
📧 Email: ggsuryaff@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/g-g-surya-5aa9312b4)
🔗 [GitHub](https://github.com/ggsurya)
