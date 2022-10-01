import java.util.Scanner;

public class Week1Ast2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        //Task 1
        // Ask user to enter an int (as a Uni Code from ASCII table)
        // and Print a char value of that unicode in Console.
        // Example : user enter 65 and output in console will be A.

        System.out.println("Please chose and enter a value from ASCII Table:");
        int chV = sc.nextInt();
        String value = String.valueOf(chV);
        System.out.println(value + " is the letter J");


        //Task 2
        //Ask User to enter a boolean.
        // And print the opposite of the user's input.
        // Example if user enter true print false in console,
        // and if user enters false - print true in console.

        System.out.println("True or False? The sun is a star. ");
        boolean ans = sc.hasNextBoolean();
        if (ans = true) {
            System.out.println("false");
        } else if (ans = false)
            System.out.println("true");
        else {
            System.out.println("invalid input");


        }
*/
    //Ask User to Enter 2 numbers (int) and
        // Write a Java program to print the
        // sum (addition), multiply, subtract, divide and remainder (%) of two numbers.
        // Example : Input first number: 125 Input second number: 24
        // Expected Output : 125 + 24 = 149 125 - 24 = 101 125 x 24 = 3000 125 / 24 = 5 125 mod 24 = 5

        System.out.println("Please enter first value:");
        int val1 = sc.nextInt();
        System.out.println("Please enter second value:");
        int val2 = sc.nextInt();

        int sum= (val1 + val2);
        System.out.println("the sum is" + sum);
        int diff = (val1 - val2);
        System.out.println("the difference is" + diff);
        int prod = (val1 * val2);
        System.out.println("the product is" + prod);
        int quo = (val1 / val2);
        System.out.println("the quotient is" + quo);
        int rem = (val1 % val2);
        System.out.println("the remainder is" + rem);



        //Task 4
        //Ask user to enter  2 number,
        // Write Java program to return the division value of
        // those 2 numbers & return the remainder of division.
        // Example : Input 1: 100 & Input2: 10.
        // Output: Divison of 100/10 is 10
        //Remainder of 100/10 is 0

        System.out.println("Please enter first value:");
        int value1 = sc.nextInt();
        System.out.println("Please enter second value:");
        int value2 = sc.nextInt();

        int value3= (value1 / value2);
        System.out.println("the quotient is:" + value3);
        int remainder = (value1 % value2);
        System.out.println("the remainder is:" + remainder);


    }

}


