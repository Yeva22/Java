import java.util.SplittableRandom;

public class StringMethodsReview {
    public static void main(String[] args) {

 //charAt()
 String text = "Monday"; //index 0,  is M, 1 is o, 2 is n...etc
        System.out.println(text.charAt(3));
        System.out.println(text.charAt(5));

  //equals();
        String s1 = "Welcome";
        String s2 = "Welcome";

        System.out.println(s1.equals(s2));

  //substring()
        //use 1 returns from given index onward
        String text2 = "Monday";
        System.out.println(text2.substring(2));
        //use 2 returns from given index to other indicated index
       //last index position is never included,
        // only the one right before it
        String text3 = "Hello Monday";
        System.out.println(text3.substring(5));
        System.out.println(text3.substring(6,9));
        System.out.println(text3.substring(8,10));
        System.out.println(text3.substring(0, 5));

        //trim
        //removes spaces only in beginning and end of string

        String text4 = "  Hello & Welcome to New Java Class!  ";
        System.out.println(text4);
        System.out.println(text4.trim());

        //compareTo()
        //aA123agnfig
        //123agnfig
        //checks string based on the  value of
        // characters numerical and alphabetical
        //works numerically from 0 to 9(like calculator), ignores zeros


        String str1 = "1";
        String str2 = "a";
        System.out.println(str1.compareTo(str2));


//practice
        String out = "<<>>";
        String word = "Hello";
//<<hello>>

    }
}
