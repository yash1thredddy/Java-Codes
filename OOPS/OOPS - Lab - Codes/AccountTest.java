// Fig. 3.9: AccountTest.java
   // Inputting and outputting floating-point numbers with Account objects.
    import java.util.Scanner;

    class Account
    {
       private double balance; // instance variable

      // Account constructor that receives two parameters
      public Account(String name, double balance)
      {
         name = name; // assign name to instance variable name

         // validate that the balance is greater than 0.0; if it's not,
         // instance variable balance keeps its default initial value of 0.0
         if (balance > 0.0) // if the balance is valid
            balance = balance; // assign it to instance variable balance
      }

      // method that deposits (adds) only a valid amount to the balance
      public void deposit(double depositAmount)
      {
         if (depositAmount > 0.0) // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
      }

      // method returns the account balance
      public double getBalance()
      {
         return balance;
      }

      // method that sets the name
      public void setName(String name)
      {
         name = name;
      }

      // method that returns the name
      public String getName()
      {
         return name; // give value of name back to caller
      } // end method getName
 } // end class Account

    public class AccountTest
    {
      public static void main(String[] args)
       {
          Account account1 = new Account("Jane Green", 50.00);
          Account account2 = new Account("John Blue", -7.53);

         // display initial balance of each object
         System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
         System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());

         // create a Scanner to obtain input from the command window
         Scanner input = new Scanner(System.in);

         System.out.print("Enter deposit amount for account1: "); // prompt
         double depositAmount = input.nextDouble(); // obtain user input
         System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
         account1.deposit(depositAmount); // add to account1's balance

         // display balances
         System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
         System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());

         System.out.print("Enter deposit amount for account2: "); // prompt
         depositAmount = input.nextDouble(); // obtain user input
         System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
         account2.deposit(depositAmount); // add to account2 balance

         // display balances
         System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
         System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());
      } // end main
  } // end class AccountTe
