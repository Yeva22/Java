public class StringPractice {
    public static void main(String[] args) {
        //1 way to create a string object

        String word1 = "Hello";

        //2nd way-by using a keyword

        String word2 = new String("World!");

        //concatenation in practice
        String obj1 = word1 + " " + word2;

        int l = obj1.length();
        System.out.println(l);
        System.out.println(word1.length());
        System.out.println(word2.length());


//create 2 string objects , concatenate them, find the length of all 3 objects

        String word3 = "Good";
        String word4 = "Afternoon";
       // String word 5 = word3 + " " + word4;

       // int
        System.out.println(l);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println();

        System.out.println(word3.charAt(3));

//create one string object "Java is fun
        //return length and char at certain index
        //use l(length) and charAt method

        String wrd1 = "Java", wrd2 = "is fun";
        int le = wrd1.length(), le1 = wrd1.length();
        System.out.println(l);
        System.out.println(wrd1.charAt(3));

 String xyz = "Supercalifragilisticexpialidocious";
 int numberOfChar = xyz.length();
 int indexOfLastChar = xyz.length()-1;
        System.out.println("Number of Characters is " + numberOfChar);
        System.out.println("the last index is" + indexOfLastChar);

        System.out.println(xyz.charAt(indexOfLastChar));

  String ypr1 = "Yevgeniya", ypr2 = "Petrovna", ypr3 = "Rudenko";

  int  numberOfChar1 = ypr1.length(), numberOfChar2 = ypr2.length(), numberOfChar3 = ypr3.length();
  int totalNumOfChar2 = (ypr1.length() + ypr2.length() + ypr3.length());
        System.out.println(numberOfChar1);
        System.out.println(numberOfChar2);
        System.out.println(numberOfChar3);
        System.out.println("The total number of characters in your name is...." + totalNumOfChar2);








    }


















}
