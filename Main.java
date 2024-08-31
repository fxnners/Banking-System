import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  static ArrayList<User> users = new ArrayList<User>();

  public static void main(String[] args) {
    users.add(new User("John", "secure82", 25, 1000.00));
    users.add(new User("Alicia", "password123", 30, 110.00));
    users.add(new User("Bob", "password456", 22, 2000.00));

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your username: ");
    String enteredUsername = input.nextLine();

    User loggedInUser = null;
    for (User user : users) {
      if (user.getUserName().equals(enteredUsername)) {
        loggedInUser = user;
        break;
      }
    }

    if (loggedInUser != null) {
      boolean authentication = loggedInUser.login();
      if (authentication) {
        boolean exit = false;
        while (!exit) {
        System.out.println("Welcome to the bank please select an option> ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4 Exit");

        int choice = input.nextInt();
        switch (choice) {
          case 1:
            System.out.println("Your balance currently is £ " + loggedInUser.checkBalance());
            System.out.println();
            break;
          case 2:
            loggedInUser.depositMoney();
            break;
          case 3:
            loggedInUser.withdrawMoney();
            break;
          case 4:
            System.out.println("Thank you for visiting the online bank !");
            exit = true;
            
          //default:
            //System.out.println("Invalid choice.");
         }
        }
      } else {
        System.out.println("Invalid password.");
        
      }
    } else {
      System.out.println("User not found.");
    }
    input.close();
  }
}
