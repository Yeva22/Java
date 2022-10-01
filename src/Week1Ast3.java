public class Week1Ast3 {
    public static void main(String[] args) {

        //1. Write a Java program to get the character at the given index within the String.
        //Sample Output: Original String = Java Exercises!
        //The character at position 0 is J
        //The character at position 10 is i

        String new1 = "Java Homework";

        System.out.println(new1.charAt(3));
        System.out.println(new1.charAt(5));


//Task 2
        //2. Write a Java program to compare two strings lexicographically.
        // Two strings are lexicographically equal if they are the same
        // length and contain the same characters in the same positions.
        //Sample Output: String 1: This is Exercise 1
        //String 2: This is Exercise 2
        //"This is Exercise 1" is less than "This is Exercise 2"
        String stmt1 = "Task 2 ";
        String stmt2 = "Task 3 ";
        System.out.println(stmt1.compareTo(stmt2));


        String stmt3 = (stmt1 + "is less than" + stmt2);
        System.out.println(stmt3);

        //Task 3. Write a Java program to compare two strings
        // lexicographically, ignoring case differences.
        //Sample Output: String 1: This is exercise 1
        //String 2: This is Exercise 1
        //"This is exercise 1" is equal to "This is Exercise 1"

        String s1 = " Tik ";
        String s2 = " tik ";
        System.out.println(s1.compareToIgnoreCase(s2));


        String s3 = (s1 + " is equal to " + s2);
        System.out.println(s3);

        //task 4
        //Write a Java program to concatenate a given string to the end of another string.
        //Sample Output: String 1: Java Exercises and
        //String 2: JavaScrip Exercises
        //The concatenated string: Java Exercises and JavaScript Exercises.

        String ss1 = "Java is great and";
        String ss2 = " it is the future!";
        System.out.println(ss1 + ss2);

        //task 5
        //Write a Java program to test if a given string contains the specified sequence of char values.
        //Sample Output: Original String: PHP Exercises and Python Exercises
        //Specified sequence of char values: and
        //true
        //
        //Another Sample Output: Original String: PHP Exercises and Python Exercises
        //Specified sequence of char values: Java
        //false

        String sent1 = "Java is fun and a great tool ";
        String ch1 = "and";
        System.out.println(sent1.contains("and"));



        //Task6
        // 6. Write a Java program to check whether two String objects contain the same data.
        //Sample Output: "Stephen Edwin King" equals "Walter Winchell"? false
        //"Stephen Edwin King" equals "Mike Royko"? false "Stephen Edwin King" equals "Stephen Edwin King"? true
        String st1 = "Jen Rudenko", st2 = "Chrystal Mathers", st3 = "Jill Hoffman";
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st2.equals(st3));


        //Task 7
        // Write a Java program to get the index of all
        // the characters of the alphabet from:
        // String : "The quick brown fox jumps over the lazy dog."
        //Sample Output:
        //
        //Output should be exactly like attachment :

        String st4 = "The quick brown fox jumps over the lazy dog.";

        System.out.println(st4.charAt(0));
        System.out.println(st4.charAt(1));
        System.out.println(st4.charAt(2));
        System.out.println(st4.charAt(3));
        System.out.println(st4.charAt(4));
        System.out.println(st4.charAt(5));
        System.out.println(st4.charAt(6));
        System.out.println(st4.charAt(7));
        System.out.println(st4.charAt(8));
        System.out.println(st4.charAt(9));
        System.out.println(st4.charAt(10));
        System.out.println(st4.charAt(11));
        System.out.println(st4.charAt(12));
        System.out.println(st4.charAt(13));
        System.out.println(st4.charAt(14));
        System.out.println(st4.charAt(15));
        System.out.println(st4.charAt(16));
        System.out.println(st4.charAt(17));
        System.out.println(st4.charAt(18));
        System.out.println(st4.charAt(19));
        System.out.println(st4.charAt(20));
        System.out.println(st4.charAt(21));
        System.out.println(st4.charAt(22));
        System.out.println(st4.charAt(23));
        System.out.println(st4.charAt(24));
        System.out.println(st4.charAt(25));
        System.out.println(st4.charAt(26));
        System.out.println(st4.charAt(27));
        System.out.println(st4.charAt(28));
        System.out.println(st4.charAt(29));
        System.out.println(st4.charAt(30));
        System.out.println(st4.charAt(31));
        System.out.println(st4.charAt(32));
        System.out.println(st4.charAt(33));
        System.out.println(st4.charAt(34));
        System.out.println(st4.charAt(35));
        System.out.println(st4.charAt(36));
        System.out.println(st4.charAt(37));
        System.out.println(st4.charAt(38));
        System.out.println(st4.charAt(39));
        System.out.println(st4.charAt(40));
        System.out.println(st4.charAt(41));
        System.out.println(st4.charAt(42));
        System.out.println(st4.charAt(43));

    }

        }



