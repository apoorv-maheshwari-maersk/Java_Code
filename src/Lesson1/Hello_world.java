package Lesson1;

public class Hello_world {
    private String name;
     public void setName(String name) {
         this.name = name;
     }

public String getName(){
    return name;
}

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lesson1.Hello_world myAccount = new Lesson1.Hello_world();
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
    }
}*/

}
