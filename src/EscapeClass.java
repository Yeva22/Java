public class EscapeClass {
    public static void main(String[] args) {
      // \t(this enters a tab into string text
        System.out.println("Java is\t FUN");
        //\b(removes one space in text)
        System.out.println("Java \bis FUN 02");
        // \n -puts everthing after it on a new line
        System.out.println("Hello \nand Welcome");
        //\r(removes everything before itself)
        System.out.println("Hello \rand Welcome");
        //\f inserts a form
        System.out.println("Java is Fun \fto learn");
        //\"\" inserts a single quotation to a string text
        System.out.println("Java is \'Fun\' to learn");
        //\"\" inserts a double quotation to a string text
        System.out.println("Java is \"Fun\" to learn");
        //\\- to insert one backward slash an
        // additional one must be added
        System.out.println("Java is Fun \\to learn");


    }
}
