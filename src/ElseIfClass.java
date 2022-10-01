import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.Scanner;

public class ElseIfClass {
    public static void main(String[] args) {

        int x = 10, y = 20;

        if (x > y) {
            System.out.println(x + " is larger");
        } else if (x == y) {
            System.out.println("Numbers are equal");

        } else {
            System.out.println(y + " is larger");
        }


        //write prog to find the largest
        int num1 = 20; // 1 > 2 && 1 > 3
        int num2 = 30; // 2 > 1 && 2 > 3
        int num3 = 40; // 3 > 2 && 3 > 1

        //if equal- use elseif

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is the largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is the largest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + "is the largest");
        } else {
            System.out.println("Numbers are equal!");


        }


        //Ask user to input number between 1-7
//if number is 1-print monday , for 2- print tuesday, etc
//if number is not in range print invalid number
        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Please Enter a number between 1 and 7");
        int number = sc.nextInt();
        if (number == 1){

            System.out.println("Monday");
        }else if(number == 2){
            System.out.println( "Tuesday");
        }else if(number == 3){
            System.out.println( "Wednesday");
        }else if(number == 4){
            System.out.println( "Thursday");
        }else if(number == 5){
            System.out.println( "Friday");
        }else if(number == 6){
            System.out.println( "Saturday");
        }else if(number == 7){
            System.out.println( "Sunday");
        }else

        {
            System.out.println("Invalid Number");

        }
*/
        //ask user to enter 5 int
        //count how many are odd , how many are even
        //print number of evens and odds
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter  number 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter  number 2:");
        int n2 = sc.nextInt();
        System.out.println("Enter  number 3:");
        int n3 = sc.nextInt();
        System.out.println("Enter  number 4:");
        int n4 = sc.nextInt();
        System.out.println("Enter  number 5:");
        int n5 = sc.nextInt();

        if (n1 % 2 == 0 || n2 % 2 == 0 || n3 % 2 == 0 || n4 % 2 == 0 || n5 % 2 == 0) {

            evenCount++;
        } else {
            oddCount++;

        }


        //ask user ti input their mass in kg and height in meters
        //calculate bmi BMI = mass/ (height * height)
//print appropriate message on the provided values
        //all numbers should be doubles

        //int weight = 10;


        System.out.println("Please enter your weight in kg:   ");
        double weight = sc.nextDouble();
        System.out.println("Please enter your height in meters:   ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("Your BMI is....");

        if (BMI > 18.5 && BMI < 25) {
            System.out.println("You are at normal weight");
        } else if (BMI > 25 && BMI < 30) {
            System.out.println("You are overweight");
        } else if (BMI >= 30) {
            System.out.println("You are obese");
        } else if (BMI < 18.5) {
            System.out.println("You are under weight");

        }


    }






}






