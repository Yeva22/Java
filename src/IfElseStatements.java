import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {

        if(5 > 3){
            System.out.println("True");

        }

        if (10 == 10){

            System.out.println(true);

            int x = 30;
            int y = 20;

            if (x > y ){
                System.out.println("X is larger!");
            }

            String password = "admin123";
            if (password == "admin1234"){
                System.out.println("Correct Password!");


            }

        }




        //Odd and Even
        //Formula : if /a number by 2 ==> 0 its an even number
        // if result is not 0 ==> its an odd number

        int num = 10;

        if (num % 2 == 0) {

            System.out.println("This is an even number");
        }else{
            System.out.println("This is an odd number");
            //odd numbers
        }

//Task : Ask user to enter a number
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");

        int number = sc.nextInt();
        if (number % 2 == 0) {

            System.out.println("... is an even number");
        }else {
            System.out.println( "...is an odd number");


        }


///ask user to enter YOB
        //write prog to find out their age
        // if the age is >65 print : you are retired
        //else print you are not retired


        System.out.println("Please enter your year of birth:");
        int yearOfBirth = sc.nextInt();
        int age = (2022 - yearOfBirth);
        if (age > 65) {

            System.out.println("You are retired");
        }else {
            System.out.println("You are "  + age +  "and not retired.");

        }


        System.out.println(10 + " " + 10);



int i = 10, j = 12;
i += ++j;
        System.out.println(i);


        byte b1 = 5, b2 = 2;
        byte b = (byte)(b1 % b2);

        int i1 = 5, j1 = 2;
        System.out.println(i1 % j1);








    }



}
