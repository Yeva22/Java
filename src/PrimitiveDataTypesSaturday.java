import javax.xml.transform.Result;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class PrimitiveDataTypesSaturday {
    public static void main(String[] args) {


        byte apple = 3;
        short pumpkin = 6;
        int tomato = 4;
        long carrots = 5;
        float Mustard = 6.99f;
        double SoySauce = 9.89;
        double sumOfAllItems = (apple + pumpkin + tomato + carrots + Mustard + SoySauce);
        System.out.println( "Your total for today is........: " + sumOfAllItems);

        System.out.println("the price for apple is:" + apple);

        //write prog to convert farenhiet to celcius with user input

      //  System.out.println("Please enter temp in F:");
      //  float userInput = sc.nextFloat();

//        float celius = (float) ((5 * (userInput - 32.0))/9.0);
      //
        //  System.out.println(userInput + "F is " + celius + "C");

//write a Java program to convert F to C


        System.out.print("Please enter temp in F: ");
        Scanner sc = new Scanner(System.in);

     //   float userInput = sc.nextFloat();
      //  float celsius = (float) ((5 * (userInput - 32.0))/9.0);
      //  System.out.println(userInput + "F is " + celsius + "C");


        //write a Java prog to calculate the age of the year

      /*  System.out.println("Please enter year you were born in:");
        int year = sc.nextInt();
        System.out.println("Please enter current year:");
        int currentYear - year;
        int year = sc.nextInt();
        System.out.println("You are" + age + Year);
*/
        //write prog to convert Meters to Inches
        //formula: meter  = 0.0254

        System.out.println("Please enter length in Meters:");
        int meters = sc.nextInt();
        System.out.println(meters);

        double inches = (meters/ 0.0254);
        System.out.println("Length in Inches is:");


        //write a prog that asks users to input 2 numbers(int, double)
        //find sum, product, (+,-,*,/ , %)return them in console




















    }







}
