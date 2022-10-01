import java.util.Scanner;

public class StringBuilderReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str2 = new String("Hello World");

        StringBuilder str = new StringBuilder("Hello World");
        //same as    System.out.println(str + " 2023");
        System.out.println(str.append(" 2023"));

        System.out.println(str);

        //reverse
        System.out.println(str.reverse());
        //***popular interview q: how do you reverse a string?
        //convert string into stringbuilder reverse it
        //and then convert back to string!

        String text = "Hello!";
        StringBuilder newText = new StringBuilder(text);
        System.out.println(text);
        System.out.println(newText);
        newText.reverse();
        System.out.println(newText);

        //revert back to string:
        String rText = newText.reverse().toString();

        //task**
        //ask user to enter text
        //print reverse version and make it all uppercase

        System.out.println("Please enter a greeting:");
        String grt = sc.nextLine();
        StringBuilder newgrt = new StringBuilder(grt);
        grt = newgrt.reverse().toString().toUpperCase();

        System.out.println(newgrt);

        String rGrt = newgrt.reverse().toString().toUpperCase();
        System.out.println(rGrt);
//deleteChartAt- removes a specific index value in string
    StringBuilder str3 = new StringBuilder("Java is FUN!");
    str3.deleteCharAt(11);
        System.out.println(str3);
        System.out.println(str.delete(5,7));
//insert -adds value chars to string based on index position

        System.out.println(str3.insert(5, " really "));
        System.out.println(str3.insert(0, "#"));






   }

    }

