import java.util.*;

class StaticInitializerBlock{

    static boolean flag = false;
    static int B,H;

    //Static Initializer Block
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if(B > 0 && H > 0){
            flag = true;
        }else {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    //This can't be modified
    public static void main(String[] args){
        if(flag){
            int area = B * H;
            System.out.print(area);
        }
    }//End of main

}//End of class