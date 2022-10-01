import java.util.Scanner;

public class NestedIfElseReview {
    public static void main(String[] args) {


        String username = "Admin";
        String password = "admin123";

        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Enter username:");
        String usernameFromUser = sc.nextLine();

        if (usernameFromUser.equals(username) ) {
            System.out.println("Enter password:");
            String passwordFromUser = sc.nextLine();

            if (passwordFromUser.equals(password)) {
                System.out.println("Login successful!");

            } else {
                System.out.println("wrong password");

            }
        }else {
            System.out.println("invalid username");

        }
*/

        System.out.println("Please enter a number between 1 and 4:");
        int num = sc.nextInt();

             if (num > 0 && num <= 4) {
             } else if (num == 1) {
                 System.out.println("Spring");
             } else if (num == 2) {
                 System.out.println("Summer");
             } else if (num == 3) {
                 System.out.println("Autumn");
             } else if (num == 4) {
                 System.out.println("Winter");

             }else {
                 System.out.println("invalid input");
             }

        }




    }

