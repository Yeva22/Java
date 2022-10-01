import java.util.Scanner;

public class HomeworkWeek1Ast1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//TASK 1
// ASK USER TO ENTER NUMBER OF MILES & WRITE A
// JAVA PROGRAM TO CONVERT IT INTO KM OUTPUT
// EXAMPLE: YOU ENTER ... OF MILES AND IT WILL BE ... KM

        System.out.println("Please enter number of miles....   ");
        float miles = sc.nextFloat();
        float km = (float) (miles * 1.609f);
        System.out.println(miles + "miles is equal to " + km + "kilometers" );


        //Task 2
        // ASK USER TO ENTER NUMBER OF INCHES & WRITE
        // JAVA PROGRAM TO CONVERT IT TO METERS OUTPUT :
        // YOU ENTER ... INCH & IT WILL BE ... METERS
        System.out.println("Please enter number of inches....   ");
        float inches = sc.nextInt();
        float meters = (float) (inches / 39.37f);
        System.out.println(inches + "inches is equal to " + meters + "meters" );

        // Task 3
        // Write a Java program to compute body mass index (BMI).
        //
        //OUTPUT EXAMPLE : Input weight in pounds:
        // 452 Input height in inches: 72 Expected
        // Output: Body Mass Index is 61.30159143458721
        System.out.println("Please enter your weight in pounds:   ");
        float weight = (float) sc.nextDouble();
        System.out.println("Please enter your height in inches:   ");
        float height = (float) sc.nextDouble();
        int BMI = (int) (weight / (height * height) * 703);
        System.out.println("Your BMI is...." + BMI);

        //Task 4
        //Write a Java program to takes the user for a distance (in meters)
        // and the time was taken (as three numbers: hours, minutes, seconds),
        // and display the speed, in meters per second, kilometers per hour and
        // miles per hour (hint: 1 mile = 1609 meters).
        //OUTPUT EXAMPLE: Input distance in meters: 2500 Input hour: 5
        // Input minutes: 56 Input seconds: 23 Expected Output : Your speed
        // in meters/second is 0.11691531 Your speed in km/h is 0.42089513
        // Your speed in miles/h is 0.26158804

        System.out.println("Please enter distance in meters: ");
        float meters1 = sc.nextFloat();
        float kil = (meters1 / 1000);
        float miles1 = (meters1 / 1609);
        System.out.println("Please enter time it took in hours,: ");
        float hrs = sc.nextFloat();
        float minutes = (hrs * 60);
        float sec = (minutes * 60);
        System.out.println(" Which is" + minutes + "minutes");
        System.out.println("and" + sec + "seconds: ");

        float speed1 = (meters1 / sec);
        System.out.println("Your speed in meters/second is: " + speed1);
        float speed2 = (kil / hrs);
        System.out.println("Your speed in kilometers/hour is: " + speed2);
        float speed3 = (miles1 / hrs);
        System.out.println("Your speed in miles/hour is: " + speed3);




        //Task 5
        //TASK #5: Write a Java program that accepts two integers from the
        // user and then prints the sum, the difference,
        // the product (multiply), the average, the distance
        // (the difference between integer).
        //OUTPUT EXAMPLE: Input 1st integer: 25
        // Input 2nd integer: 5
        // Expected Output : Sum of two integers:
        // 30 Difference of two integers:
        // 20 Product of two integers: 125
        // Average of two integers: 15.00
        // Difference of two integers: 20

        System.out.println("Please enter first value here: ");
        int val1 = sc.nextInt();
        System.out.println("Please enter second value here: ");
        int val2 = sc.nextInt();

        int sum = (val1 + val2);
        System.out.println("The sum is:" + sum);
        int diff = (val1 - val2);
        System.out.println("The difference is:" + diff);
        int prod = (val1 * val2);
        System.out.println("The product is:" + prod);
        int avg = (val1 / val2);
        System.out.println("The average is:" + avg);
        int rem = (val1 % val2);
        System.out.println("The remainder is:" + rem);


//TASK #6: Write a Java program that accepts
// two integer from the user , and add +1 value to the first number ,
// subtract (-1) from second number . Print both value in console.
//
//EXAMPLE INPUT : INPUT ONE: 5 INPUT TWO: 5
//EXPECTED OUTPUT: NUMBER ONE IS : 6 NUMBER TWO IS : 4

        System.out.println("Please enter first value here: ");
        int val3 = sc.nextInt();
        System.out.println("Please enter second value here: ");
        int val4 = sc.nextInt();
        System.out.println("Your results are as follows:");
        System.out.println(val3 + 1);
        System.out.println(val4 - 1);












    }
}
