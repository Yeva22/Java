public class StringBuilderClass {
    public static void main(String[] args) {
       //ways to create string
        String str = "Text";
        String str1 = new String("Text");
        //sb - updates the original string with updating changes
        StringBuilder str3 = new StringBuilder("Text");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str3);
        str.toLowerCase();
        System.out.println(str);

        System.out.println(str.concat("new text added"));
        System.out.println(str);
str3.append("Hello");
        System.out.println(str3 + "new text Added");
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Tech Nova");
        System.out.println(sb);

        //Methods:
        //append adds text
      //  System.out.println(sb.append("'s Java Class"));
        System.out.println(sb + "'s Java Class");

        //reverse
        System.out.println(sb.reverse());
        //replace it takes 2 parameters
       // System.out.println(sb.replace 1, "a", );

        //deleteCHarAt deletes a value out of the string
        System.out.println(sb.deleteCharAt(2));

    //delete  this one takes to 2 parameters (does not take last index)
        System.out.println(sb.delete(5,11));

        //insert this one adds additional text to string

        StringBuilder sb2 = new StringBuilder("Hello Welcome");
        System.out.println(sb2.insert(5, "and"));

    }
}
