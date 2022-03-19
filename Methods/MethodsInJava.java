package FunctionsAndmethods.com;
import java.util.Scanner;

//Method(Functions) in JAVA :

// Creating static method
public class Main {

    // static variable
    static int var = 24;

    // static method : can be call without creating an object
    static int printNum(int n){
        System.out.println("Inside function");
        return n;
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();
        if(num == var){
            // Here printNum is a static method, it belongs to the class
            // if printNum is non-static then we have to create instance of class Main to call printNum()
            // Call for instance method shown below where Main m1 = new Main()
            // System.out.println(m1.printNum(num));
            System.out.print(printNum(num));
        }else{
            System.out.println("Invalid Enter..!");
        }
    }

}

// Creating Non-static or Instance method
class Main{

    private int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        System.out.println("Non-static or Instance Method");
        int a , b;
        int ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add :");
        a = sc.nextInt();
        b = sc.nextInt();
        FunctionsAndmethods.com.Main m = new FunctionsAndmethods.com.Main();
        ans = m.add(a,b);
        System.out.println("Sum of two number is : "+ ans);
    }

}