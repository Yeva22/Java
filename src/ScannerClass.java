import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        //create instance(object) from Scanner Class

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
     //   String name = sc.nextLine();
      //  System.out.println("Your name is" + name);


     //   String name2 = "John";
       // System.out.println(name2);

       // int numberFromUser = sc.nextInt();
       // System.out.println(numberFromUser);

        System.out.println("Enter a number one:  ");
        System.out.println("Enter a number two:  ");
        int numberFromUser= sc.nextInt();
        int numberFromUser2 = sc.nextInt();

        System.out.println( numberFromUser + numberFromUser2);

        int result = (numberFromUser + numberFromUser2);
        System.out.println("Result is : " + result);

// ask user to enter a string value
        //import scanner
        //create object from scanner class
        //print the value in console





    }



}
