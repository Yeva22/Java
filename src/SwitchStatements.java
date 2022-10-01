import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {
        // Scanner sc =

        //switch
        int n = 4;
        switch (n) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("none was found");

        }


        Scanner sc = new Scanner(System.in);

        //determine whether user inputs vowel or consenant
        System.out.println("Enter a char please:    ");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
                System.out.println(c + "is a vowel");
                break;
            case 'A':
                System.out.println(c + "is a vowel");
                break;
            case 'o':
                System.out.println(c + "is a vowel");
                break;
            case 'O':
                System.out.println(c + "is a vowel");
                break;
            case 'e':
                System.out.println(c + "is a vowel");
                break;
            case 'E':
                System.out.println(c + "is a vowel");
                break;
            case 'i':
                System.out.println(c + "is a vowel");
                break;
            case 'I':
                System.out.println(c + "is a vowel");
                break;
            case 'u':
                System.out.println(c + "is a vowel");
                break;
            case 'U':
                System.out.println(c + "is a vowel");
                break;
            default:
            System.out.println(c + " is a consenant");
        }

//asl user to enter a num between 1 and 7
        //write a switch stmt to print 1 for monday, 2 for tues, ets
        //default - invalid input

        System.out.println("Please enter a number from 1 to 7:");

        int numb = sc.nextInt();

        switch (numb){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");


        }



        //ask user to enter a number between 1 and 12
        //reference each int to months
        //if n= 12,1, 2 ==print winter
        //if n = 3-5 print spring
        //if number is 6-8 summer
        //if n is 9-11 print autumn


        System.out.println("Please enter a number between 1 and 12:");
        int m = sc.nextInt();

        switch (m) {

            case 3:
                case 4:
                case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 1:
            case 2:
                case 12:

                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid input");

        }

        System.out.println("Please enter your letter grade here:");
        char g = sc.next().charAt(0);
        switch (g) {

            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Great");
                break;
            case 'C':
            case 'c':
                System.out.println("Okay");
                break;
            case 'D':
            case 'd':
                System.out.println("You can do better");
                break;
            case 'F':
            case 'f':
                System.out.println("Something needs to change");
                break;

            default:
                System.out.println(" Not valid Grade");
        }

    }

}
