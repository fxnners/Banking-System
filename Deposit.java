import java.util.Scanner;

public class Deposit {
  private double balance;

  // Constructor 
  public Deposit(double userBalance) {
    this.balance = userBalance;
  }
  // Methods
  
  public double getBalance() {
    return balance;
  }
  
  public void depositMoney() {
    
    Scanner input = new Scanner(System.in);
    System.out.println("How much would you like to deposit? ");
    double deposit = input.nextDouble();
    
    if (deposit > 0) {
      balance += deposit;
      System.out.println("You have deposited £" + deposit + "." + " Your new balance is now £" + balance + ".");
    } else {
      System.out.println("You cannot deposit a negative amount.");
    }
  }
 } 
  
