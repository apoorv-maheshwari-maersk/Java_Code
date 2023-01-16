package Lesson5;

public class ForStat {
   public static void main (String[] arg){
      double amount;
      double principal = 1000.0;
      double rate = 0.05;

      System.out.printf("%s %20s %n", "Year","Amount on deposit");

      for(int year =1; year<=10; year++){
         amount = principal * Math.pow(1.0 + rate, year);
         System.out.printf("%4d%, 20.2f5%n", year, amount);
      }
   }
}
