import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //1, ...10;
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }
        i = 1;
        do {
            System.out.println(i);  //code
            i++;
        } while (i <= 10);

        i = 1;
        do {
            System.out.println("Jen");
            i++;
        } while (i <= 10);
//ask user to enter a number
// and print that number * your name
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int num = sc.nextInt();
        int start = 1;
        while (start <= num) {
            System.out.println("Yevgeniya");
            start++;


        }


        do {
            System.out.println("Yevgeniya");
            start++;
        } while (start <= num);


        i = 1;
        while (i <= 3) {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if (number >= 5 && number <= 10) {
                System.out.println("You got it!");
                break;
            } else {
                System.out.println("Try again!");
                i++;

            }
        }
        if (i == 4) ;
        System.out.println("Game Over");


        int in = 0;

        do {
            System.out.println(in);
            in++;
        } while (in < 5);

        int j = 0;
        while (j < 5) {
            System.out.println(j);
            System.out.println("While loop is being executed");
            j++;
        }

        int nn = 0;
        do {
            System.out.println("Yevgeniya");
            nn++;
        } while (nn < 20);

        for (int ii = 0; ii < 5; ii++) {
            System.out.println(ii + " For Loop is being executed!");

        }
        sc.nextLine();

        System.out.println("Please enter any number between 0 and 20:");
        int userInput = sc.nextInt();

        for (int iI = 0; iI < 20; iI++) {
            if (iI == userInput) {
                System.out.println(iI + " is the number you guessed!");

            }
        }
        sc.nextLine();


        System.out.println("Please write your name: ");
        String uInput = sc.nextLine();
        for (int iI = 0; iI < 5; iI++) {
            System.out.println(uInput);


        }

    }
}






