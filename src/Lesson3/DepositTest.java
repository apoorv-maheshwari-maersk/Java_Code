package Lesson3;
import java.util.Scanner;
public class DepositTest {

   public static void main(String[] arg){
      Deposit account1 = new Deposit("Apoorv Maheshwari", 100.00);
      Deposit account2 = new Deposit("Stuti Goyal", -7.53);

      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1:");
      double depositAmount = input.nextDouble();
      System.out.printf("/n Adding %.2f to account1 balance %n%n", depositAmount);
      account1.deposit(depositAmount);

      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());

      System.out.print("Enter deposit amount for account2:");
      depositAmount = input.nextDouble();
      System.out.printf("\n Adding %.2f to account2 balance %n%n", depositAmount);
      account2.deposit(depositAmount);

      System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
      System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());


   }
}


