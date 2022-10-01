import java.util.Scanner;

public class wedWMika921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      //  System.out.println("What is the temperature outside today? ");
//float temp = sc.nextFloat();

//if
        //above 30 go to the beach
// between 20 and 30 > wear a t shirt
        // between 15 and 20 > wear a jacket
        //below 15> wear a coat

     /*  if (temp > 30) {
           System.out.println("Go to the beach and enjoy!");
       } else if (temp >= 20 && temp <= 30) {
           System.out.println("Wear a T Shirt");
       } else if (temp >= 15 && temp <20) {
           System.out.println("Wear a jacket");
       } else if (temp < 15) {
           System.out.println("Wear a coat");
       }



        //Write program to identify what generation belongs to//
/*
        System.out.println("Please enter your year of birth:");
       float year = sc.nextFloat();

       if (year <= 1964 && year >= 1946) {
           System.out.println("You are in the Baby Boomer Generation");
       } else if (year >= 1965 && year <= 1980) {
           System.out.println("You are in the X Generation");
       } else if (year >= 1965 && year <= 1980) {
           System.out.println("You are in the X Generation");
       } else if (year >= 1977 && year <= 1983) {
           System.out.println("You are in the Xennial Generation");
       } else if (year >= 1981 && year <= 1996) {
           System.out.println("You are in the Millenial Generation");
       } else if (year >= 1997 && year <= 2010) {
           System.out.println("You are in the Alpha Generation");

       }else
           System.out.println("incorrect value");
/*

//Write a program if customer is
 of legal age to buy alcohol age >= 21
      */
/*
        System.out.println("What year are you born in?");
        int YOB = sc.nextInt();
        int age = 2022 - YOB;
        if (age >= 21) {

            System.out.println("Customer is eligible to buy alcohol");
        }else if (age < 21) {
            System.out.println("Customer is NOT eligible to buy alcohol");
        }else {
            System.out.println("Invalid Input");
        }



//write code that generates a grade based on exam score

        System.out.println("Please enter grade precentage you recieved on exam:");
        float score = sc.nextFloat();

        if (score == 100 && score >= 90) {
            System.out.println("Your grade is A");
        } else if (score >= 80 && score <= 89){
        System.out.println(" Your grade is B");
    } else if (score >= 70 && score <= 79){
        System.out.println(" Your grade is C");
        } else if (score >= 60 && score <= 69){
            System.out.println(" Your grade is D");
        } else if ( score < 60) {
            System.out.println(" Your grade is F");
        }else{
            System.out.println("invalid input");

 */
    //check if input number is positive or negative
     /*   System.out.println("Please enter any number");
        int i = sc.nextInt();

        if (i > 0) {
            if (i % 2 == 0) {
                System.out.println(i + "is a positive and even number");
            } else {
                System.out.println(i + "is a positive odd number");
            }
        } else if (i < 0) {
            if (i % 2 == 0) {
                System.out.println(i + "is a negative and even number");
            } else {
                System.out.println(i + "is a negative odd number");
            }
        }else {
            System.out.println("invalid input");

    }


        System.out.println("Please enter first value:");
        int v1 = sc.nextInt();
        System.out.println("Please enter second value:");
        int v2 = sc.nextInt();
        System.out.println("Please enter third value:");
        int v3 = sc.nextInt();

        if (v1 > v2 ) {
            if (v1 > v3) {
                System.out.println(v1 + "is the greatest");
            } else if (v1 == v3) {
                System.out.println(v1 + "and" + v3 + "are equal and greater than " + v2);

            }
        } else if (v2 > v1) {
            if (v2 > v3) {
                System.out.println(v2 + "is the greatest");
            } else if (v2 == v3) {
                System.out.println(v2 + "and" + v3 + "are equal and greater than " + v1);

            } else if (v3 > v1) {
              if (v3 > v2){
                  System.out.println(v3 + "is the greates number");
              } else if (v2 == v3) {
                  System.out.println(v1 + "and" + v3 + "are equal and greater than " + v2);

            } else if (v1 == v2) {
                  if (v2 == v3) {
                      System.out.println("All three numbers are equal");
                  } else if (v2 < v3 ) {
                      System.out.println(v3 + "is the smallest number");

                      System.out.println("Invalid input" );

                  }
              }

              }
            }
/*
        System.out.println("Please enter first value:");
        int v1 = sc.nextInt();
        System.out.println("Please enter second value:");
        int v2 = sc.nextInt();



      */
        System.out.println("Please enter first value:");
        int v1 = sc.nextInt();
        System.out.println("Please enter second value:");
        int v2 = sc.nextInt();

        if (v1 >= v2) { //4 >= 4
            if(v1 > v2){
                System.out.println(v1 + "is the largest");
            } else if (v1 == v2) {
            System.out.println("numbers are equal");
            }
        } else if (v1 < v2) {
            System.out.println(v2 + "is the largest");
        }else {
            System.out.println("invalid input");



        }

    }



    }