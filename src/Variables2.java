public class Variables2 {

    public static void main(String[] args) {

        int year = 2023;

        System.out.println(year);

        System.out.println("Hello!");
        System.out.println("Yevgeniya");


        System.out.println(33 + 5);


        System.out.println("      =====    ");
        System.out.println("[|    o  o   |]");
        System.out.println( "|      ^    |");
        System.out.println( "|    ' _ '  |");
        System.out.println(" +-----------+");


        System.out.println(" * * * * * *========================");
        System.out.println(" * * * * * *========================");
        System.out.println(" * * * * * *========================");
        System.out.println(" * * * * * *========================");
        System.out.println(" * * * * * *========================");
        System.out.println(" * * * * * *========================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("====================================");

        String lastName = "Doe";
        String firstName = "John";


        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + lastName);
        System.out.println(firstName + "" + lastName);
        System.out.println(lastName + " " + firstName);

        //int

        //int age = 18;

        //int yearOfBirth = 2004;

       // System.out.println(age);
       // System.out.println(yearOfBirth);


        //current year -yearOfBirth

        int yearOfBirth = 1990;
        int currentYear = 2022;
        int age = currentYear - yearOfBirth;

        System.out.println(yearOfBirth);

        System.out.println(currentYear - yearOfBirth);



        int number1 = 30;
        int number2 = 40;
        int result = number1 + number2;

        System.out.println(result);







        float eggPrice = 5.00f;
        float milkPrice = 3.99f;
        float breadPrice = 4.50f;
        float appleJuice = 2.99f;
        int  arizonaDrink = 1;


        float totalPrice = eggPrice + milkPrice + breadPrice + appleJuice + arizonaDrink;


        System.out.println( "Your total price is ......$ " + totalPrice);


        //char  ==> ''

        char dollarSign = '$';
        char aSign = 'A';
        char bSign = 'B';

        System.out.println( "Your total price is ...... " + dollarSign + totalPrice);



        //boolean

        boolean yes = true;
        boolean no = false;


        // char A-Z

        //write java program to conver F to C

        float f = 146.7f;
        float resultC = 5 *(f -32) / 9;
        System.out.println(resultC);

        //Reasigning value -changing the integer value

        int x =20;
                x = 30;
                        x=40;
        System.out.println(x);

        float onionPrice =  3.77f;
         onionPrice = 4.22f;

        System.out.println(onionPrice);
        //Reasigning value

        String color = "Red";
        color = "White";

        System.out.println(color);

        String redCup = "AppleJuice";
        String whiteCup = "OrangeJuice";

        String thirdCup = redCup;
        redCup = whiteCup;
        whiteCup = thirdCup;

        System.out.println(redCup); //this should have Orange Juice
        System.out.println(whiteCup); //this should have Apple Juice

        // -add a third cup

        System.out.println(redCup);
        System.out.println(whiteCup);















    }



}
