package Lesson4;//

import java.io.PrintStream;

public class Increment {
   public Increment() {
   }

   public static void main(String[] args) {
      int c = 5;
      System.out.printf("c before post-increment: %d%n", c);
      System.out.printf("     post-incrementing: %d%n", c++);
      System.out.printf("c after post-increment: %d%n", c);
      System.out.println();

      c = 5;
      System.out.printf("c before pre-increment: %d%n", Integer.valueOf(c));
      PrintStream var10000 = System.out;
      Object[] var10002 = new Object[1];
      c = c + 1;
      var10002[0] = c;
      var10000.printf("     pre-incrementing: %d%n", var10002);
      System.out.printf("c after pre-increment: %d%n", c);
   }
}
