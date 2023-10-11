public class Love1 {
    public static void main(String[]args) {

        // Create four Strings
        String string1 = "living zebras ";
        String string2 = "juicy oranges ";
        String string3 = "do the victory dance ";
        String string4 = "tusk of an elephant";

        // Print all four Strings to the Screen
        System.out.println(string1 + string2 + string3 + string4);

        //Read the 1st, 7th, 8th and 12th characters from the 1st, 2nd, 3rd and 4th Strings respectively
        char a = string1.charAt(0);          //First character from the 1st String
        char b = string2.charAt(6);
        char c = string3.charAt(7);
        char d = string4.charAt(11);

        //Print out the characters combined without space forming a word
        char[] charArray = {a, b, c, d};
        System.out.println(charArray);

        //Print out the characters independently
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
