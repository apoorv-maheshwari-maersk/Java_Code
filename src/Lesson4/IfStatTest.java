package Lesson4;

import javax.rmi.CORBA.Stub;

public class IfStatTest {
   public static void main(String[] args){
      IfStat account1 = new IfStat("Apoorv Maheshwari", 94.5);
      IfStat account2 = new IfStat("Stuti Goyal", 96.5);

      System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
      System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());

   }
}
