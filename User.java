import java.util.Scanner;

public class User {
  private String userName;
  private String password;
  private int age;
  private double balance;

  // Constructor
  public User(String userName, String password, int age, double balance) {
    this.userName = userName;
    this.password = password;
    this.age = age;
    this.balance = balance;
  }
  
    // Methods
    public boolean login() {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your password: ");
      //String enteredUsername = input.nextLine();
      //System.out.println("Please enter your password: ");
      String enteredPassword = input.nextLine();
      return enteredPassword.equals(password);
      //return (enteredUsername.equals(userName) && enteredPassword.equals(password));
    }
  
    public String getUserName() {
      return this.userName;
    }
      
    public int getAge() {
      return this.age;
    }
      
    public double checkBalance() {
      return balance;
    }
      
    public void depositMoney() {
      Deposit deposit = new Deposit(this.balance);
      deposit.depositMoney();
    }

    public void withdrawMoney() {
      Withdraw withdraw = new Withdraw(this.balance);
      withdraw.withdrawMoney();
  }
}
