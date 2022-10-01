import java.util.Scanner;

public class MyPractice {

    public static void main(String[] args) {

        Scanner Scan2 = new Scanner(System.in);

        byte apple = 3;
        byte croutons = 4;
        short pumpkin = 6;
        short romaine = 6;
        int tomato = 4;
        int pepper = 3;
        long carrots = 5;
        long cesarDressing = 5;
        float Mustard = 6.99f;
        float grannySmithApples = 4.99f;
        double SoySauce = 9.89;
        double grilledChicken = 10.55d;
        double sumOfAllItems = (apple + pumpkin + tomato + carrots + Mustard + SoySauce);
        double sumOfAllItems2 = (croutons + romaine + pepper + cesarDressing + grannySmithApples + grilledChicken);

        System.out.println("For a ceasar salad, you will need to spend:$     ");
        System.out.println(sumOfAllItems2);







    }


}
