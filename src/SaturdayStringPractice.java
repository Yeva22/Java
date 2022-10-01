import java.util.Scanner;

public class SaturdayStringPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name:");
        String username = sc.nextLine();
        String fchar = String.valueOf(username.charAt(0));
        String lchar = String.valueOf(username.charAt(username.length() - 1));

        if (fchar.equals(lchar)) {
            System.out.println(true);
        } else if (lchar.equals(lchar)) {
            System.out.println(false);
        } else {
            System.out.println("invalid input");


        }


        System.out.println("Please enter first name:");
        String fname = sc.nextLine();
        System.out.println("Please enter second name:");
        String sname = sc.nextLine();
        System.out.println("Please enter third name:");
        String tname = sc.nextLine();

        if (fname.equals(sname)) {
            System.out.println(fname + "and" + sname + "are namesakes!");
        } else if (fname.equals(tname)) {
            System.out.println(fname + "and" + tname + "are namesakes!");
        } else if (sname.equals(tname)) {
            System.out.println(sname + "and" + tname + "are namesakes!");
        } else if (!fname.equals(tname)) {
            System.out.println(fname + "and" + tname + "are namesakes!");
        } else {
            System.out.println("invalid input");

        }

        String str1 = "Java is Fun!";
        System.out.println(str1 + "has" + str1.length() + "characters");
        System.out.println(str1.charAt(0) + "is the first character");
        System.out.println(str1.charAt(5) + "is the 5th index");

        //charAt() method takes one index parameter and returns char
        char firstLetter = str1.charAt(0);
      //  String fLetterStr1 = str1.charAt(0);

        String sletter = String.valueOf(str1.charAt(1));
        System.out.println();








    }
    }

