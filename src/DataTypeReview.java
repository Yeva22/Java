public class DataTypeReview {
    public static void main(String[] args) {

        //automatic casting ==> Widening

        int num = 128;

        long num2 = num;

        byte num3 = 20;

        short num4 = num3;


//in order to fix this   we need to reassign casting


        //Narrowing or Explicit casting- when we assign a
        // larger data type into a small one
//must be done manually by placing () in front of the value and
// declaring the data type in front of it

     long num5 = (short)num4;



    }



}
