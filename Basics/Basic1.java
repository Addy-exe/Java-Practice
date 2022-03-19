import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;           // Scanner method
import java.io.BufferedReader;

class Basic{

    // 1.(IMP) Type casting
    public static void main(String[] args){
        // implicit casting : storing smaller size variable into bigger one (int(4byte) into double(8byte))
        // java automatic handles it
        double price = 18.52;
        double finalPrice = price + 4;      // adding integer(4) to double
        System.out.println(finalPrice);

        // explicit casting : opposite
        int p = 100;
        int fp = p + (int)18.82;            // type casting 18.82 to int
        System.out.println(fp);

        // Int to String
        int numStr = 12;
        //String s = "" + numStr;
        
        System.out.println("Number converted to string : " + s);

        //constants
        final float PI = 3.14F;             // final keyword is used to declare constants
    }


    // 2.TAKING INPUT using Scanner
    public static void main(String args[]){
        System.out.println("Running....");
        // Scanner Method ( import java.util )
        // INT
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Number is :"+ num);

        //String and Char
        sc.nextLine();                              // Some problem with nextLine taking input
        System.out.println("Enter Your Name :");
        String myName = sc.nextLine();
        System.out.println(myName);

        // Float and Double and Byte
        System.out.println("Enter double number");
        double numDouble = sc.nextDouble();
        System.out.println(numDouble);
        System.out.println("Enter float and Byte");
        float numFloat = sc.nextFloat();
        byte numByte = sc.nextByte();
        System.out.println(numFloat);

        //Boolean
        System.out.println("Enter Boolean");
        boolean isRight = sc.nextBoolean();
        System.out.println("Booleaan is : "+ isRight);
    }


    // 3.INPUT WITH BufferedReader : BufferedReader class of Java is used to read the stream of characters
    // from the specified source (character-input stream). This class provides a method known as readLine()
    // which reads and returns the next line from the source and returns it in String format.
    public static void main(String args[]) throws IOException
    {
        int age;
        String name;
        float favNum;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name :");
        name = bfr.readLine();
        System.out.println("Enter Your Age: ");
        // parseInt() method of the Integer class accepts a String value, parses it as a signed decimal integer and returns it.
        age = Integer.parseInt(bfr.readLine());
        System.out.println("My Name is "+ name +" and my age is "+ age);

        //Reading Float
        System.out.println("Enter your floating point fav number :");
        favNum = Float.parseFloat(bfr.readLine());
        System.out.println(favNum);
        bfr.close();
    }


    // 4.OPERATORS & MATH CLASS
    public static void main(String args[]){
        int a = 1 , b = 2;
        int div = a / b;
        System.out.println("Div is :" + div);      //prints 0 because its integer

        int price = 5 , cost = 3;               //When 5 is divided by 3 it gives reminder of 2
        int modulo = price % cost;
        System.out.println("Modulo : " + modulo);

        // MATH Class
        System.out.println(Math.max(a,b));
        System.out.println((int)(Math.random() * 100));
    }

}
