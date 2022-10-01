import java.util.Locale;
import java.util.Scanner;

public class ForLoopClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Please write your name: ");
        String uInput = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(uInput);
        }

        System.out.println("Please Enter your name:");
        String uName = sc.nextLine();
        System.out.println(uName.toUpperCase(Locale.ROOT));

        for (int i = 0; i < uName.length();i++){
         char x = uName.charAt(i);
         String y = String.valueOf(x).toUpperCase();
            System.out.println(y);
        }

    }
}
