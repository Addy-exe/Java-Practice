import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Java Strings are immutable which means it cannot be changed.
// Whenever we change any string a new instance is created.

class Main{

    public static void main(String[] args) throws IOException {
        //declaring a string
        String str1 = "Aditya";
        char sirName[] = {'P','a','t','i','l'};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // This code converts char[] array into string object
        String str2 = new String(sirName);

        System.out.println("Enter Your College Name :");
        String collegeName  = reader.readLine();
        System.out.println("College Name : " + collegeName);
        System.out.println("My Full Name is " + str1 + " " + str2);

        // charAt() returns char value for particular Index
        System.out.println("Char at Index of college Name is : "  + collegeName.charAt(0)
        + " & length is " + collegeName.length());

        // indexOf() return specified character value index
        System.out.println(str2.indexOf('a'));

        // Int to String Conversion
        int var = 12;
        String s = "" + var;
        System.out.println("Integer convereted "+ s);

    }

}