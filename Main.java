package atm;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Create a bank account with an initial balance
     BankAccount myAccount = new BankAccount(1000);

     // Create an ATM instance with the bank account
     ATM myATM = new ATM(myAccount);

     // Show the ATM menu
     myATM.showMenu();
 }
}

