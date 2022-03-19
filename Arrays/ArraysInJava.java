import java.util.Arrays;

class ArraysInJava{

    private static void array2D(){
        // 2D Array
        System.out.println("\nInside function");
        boolean[][] checkArr = {{true,false,false},{true,true,false}};
        for(int j=0;j<checkArr.length;j++){
            for (int i=0;i<checkArr[j].length;i++){
                System.out.print(" " + checkArr[j][i]);
            }
        }
    }

    public static void main(String[] args){
        // Single Dimension Array
        int[] arr = {1,23,45,65,-12,-1,0,44};
        System.out.print("Elements in Array : ");
        for (int elem : arr) {
            System.out.print(" " + elem);
        }

        Arrays.sort(arr);
        System.out.print("\nElements in Array after sorting :");
        for(int i = 0;i<arr.length;i++){
            System.out.print(" " + arr[i]);
        }
        array2D();
    }

}