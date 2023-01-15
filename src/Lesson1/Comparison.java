package Lesson1;
import java.util.Scanner;
public class Comparison {
   public static void main(String[] arg){
      Scanner input = new Scanner(System.in);

      System.out.println("Enter number 1: ");
      int number1= input.nextInt();

      System.out.println("Enter number 2:");
      int number2 = input.nextInt();

      if(number1 == number2){
         System.out.printf("%d == %d%n", number1, number2 );
      }

      if(number1 != number2){
         System.out.printf("%d != %d%n", number1, number2 );
      }

      if(number1 < number2){
         System.out.printf("%d < %d%n", number1, number2 );
      }

      if(number1 > number2){
         System.out.printf("%d > %d%n", number1, number2 );
      }

      if(number1 <= number2){
         System.out.printf("%d <= %d%n", number1, number2 );
      }

      if(number1 >= number2){
         System.out.printf("%d >= %d%n", number1, number2 );
      }


   }

}
