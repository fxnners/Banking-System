import java.util.Scanner;

public class Withdraw {
  private double balance;

  // Constructor 
  public Withdraw(double userBalance) {
    this.balance = userBalance;
  }

  // Methods
  
  public double getBalance() {
    return balance;
  }

  public void withdrawMoney() {
    Scanner input = new Scanner(System.in);
    System.out.println("How much would you like to withdraw? ");
    double withdrawal = input.nextDouble();

    if (withdrawal > 0) {
      balance -= withdrawal;
      System.out.println("You have withdrawn £" + withdrawal + "." + " Your new balance is now £" + balance + ".");
    } else {
      System.out.println("You cannot withdraw a negative amount.");
    }
    input.close();
  }
}
