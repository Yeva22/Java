import java.util.Scanner;

public class PrimDataTypesSat2 {
    public static void main(String[] args) {

        Scanner newScanner1 = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int number = newScanner1.nextInt();


     //write prog with user input for minutes and convert
        // that into hours and days
        //formula minsInAYear = 60 * 24 * 365
/*
        System.out.println("Input number of min:");
        int minutes = newScanner1.nextInt();
        int minsInAYear = 60 * 24 * 365;
        int years = minutes/minsInAYear;
        System.out.println("is approx equivalent to" + years + "years");




// calculate BMI
        //formula : BMI = kg/height

        System.out.println("Please enter weight in kg:");
        double weight = newScanner1.nextDouble();
        System.out.println("Please enter height:");
        double height = newScanner1.nextDouble();
        double bmi = weight/(height/weight);
        System.out.println("Your BMI is" + weight + "Your height is:" + height + "Your BMI is:" + bmi);



        //break 5 digit number into separate numbers
        // 12345 should be separated
        System.out.println("Please enter 5 digit number:     ");
     Modules %
        int ex1 = newScanner1.nextInt();
        int n1 = ex1/10000 % 10;
        int n2 = ex1/1000 % 10;
        int n3 = ex1/100 % 10;
        int n4 = ex1/10 % 10;
        int n5 = ex1/1 % 10;
        System.out.println(n1 + "," + n2 + ", " + n3 + "," + n4 + "," + n5);
*/
        int x1 = 32, x2 = 2, x3 = 3, x = 5;
        System.out.println(x1 % 2); //32/2 = 16
        System.out.println(x1 % 3); // 32 / 10.2___ <=decimal is the remainder
        System.out.println(x1 % x); //32/5 = 5 * 6 + 2
        System.out.println(32 % 10); //remainder is 2


        // calculate BMI
        //formula : BMI = kg/height

        System.out.println("Please enter weight in kg:");
        double weight = newScanner1.nextDouble();
        System.out.println("Please enter height:");
        double height = newScanner1.nextDouble();
        double bmi = weight/(height/weight);
        System.out.println("Your BMI is" + weight + "Your height is:" + height + "Your BMI is:" + bmi);

//calculate how many hours in a week
        //formula 1 week = 24 *7

        System.out.println("Please enter number of days:");
        int numDays = newScanner1.nextInt();
        System.out.println("Please enter number of hours in a day:");
        int numbHrs = newScanner1.nextInt();
        int hoursInAWeek = (numDays * numbHrs);
        System.out.println("The total number of hours in a week is:");
        System.out.println(hoursInAWeek);








        //create prog that asks user to enter a number
        // check whether the number is odd or even
/*
        System.out.println("Please enter a 2 digit integer number:");
        int num = newScanner1.nextInt();
        int remainder = num % 2; //if remainder is 0- then it is even number,
        // otherwise it's an odd number
        boolean evenNumber = remainder == 0;
        boolean oddNumber = remainder == 1;

        System.out.println( num + "is an even number  " + evenNumber);
        System.out.println( num + "is an even number  " + oddNumber);
*/

        // modules Practice

        //System.out.println(10 % 5); //2
        //System.out.println(9 % 2); // 9/ 2 = 8 9-8 =1
        //System.out.println(5 % 5); // remainder is 0
        //System.out.println(5 % 4); // r = 1
        //System.out.println(13 % 10); // r = 3
        //System.out.println(6 % 3); // = 0
        //System.out.println(99 % 9); // r = 0
       // System.out.println(1290 % 10); = 0
     /*

      */

        int a1 = 70;
        int a2 = 90;
        boolean b1 = a1 == a2;
        System.out.println(b1);
        boolean b2 = a1 < a2;
        System.out.println(b2);
        boolean b3 = a1 > a2;










    }





    }







