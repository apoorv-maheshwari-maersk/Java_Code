package Lesson3;

import Lesson2.Account;

public class ConstructorTest {
   public static void main(String[] arg){
      Constructor constructor1 = new Constructor("Apoorv Maheshwari");
      Constructor constructor2 = new Constructor("Stuti Goyal");

      System.out.printf("Constructor1 name is: %s%n", constructor1.getName());
      System.out.printf("Constructor2 name is: %s%n", constructor2.getName());
   }
}
