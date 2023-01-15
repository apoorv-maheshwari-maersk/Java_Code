package Lesson2;
import java.util.Scanner;
public class AccountTest {
   public static void main(String[] arg){
      Scanner input  = new Scanner(System.in);
      Account myAccount = new Account();

      System.out.printf("Initial name is: %s%n%n", myAccount.getName());

      System.out.println("Print your name: ");
      String theName = input.nextLine();
      myAccount.setName(theName);
      System.out.println();

      System.out.printf("Name of the object myAccount is: %n%s%n ", myAccount.getName());
   }
}
