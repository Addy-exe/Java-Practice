import java.util.Scanner;

class ArraysInDetail{

    static int min(int arr[]){
        int min = arr[0];
        for(int i=1;i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int index = min(arr);
        System.out.println("Min element in Array is : " + index);

        //Finding the last index of array
        int last = arr.length - 1;

        //BinarySearch b1 = new BinarySearch();
        //int srchKey = b1.binarySearch(arr,0,last,3);
        int srchKey = BinarySearch.binaryRecursionSrch(arr,0,last,4);
        System.out.println("Element Found At Index : " + srchKey);
    }

}

class BinarySearch{

    public static int binaryRecursionSrch(int a[],int first,int last,int key){

        if(last>=first){
            int mid = (last + first)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[mid] > key){
                // Search in left Sub Array
                return binaryRecursionSrch(a,first,mid-1,key);
            }else{
                // Search in right Sub Array
                return binaryRecursionSrch(a,mid+1,last,key);
            }
        }
        return 0;
    }

    public int binarySearch(int a[],int first,int last,int key){

        int mid = (first + last)/2;
        while(first <= last){
            if(a[mid] == key){
                return mid;
            }

            if(a[mid] < key){
                first = mid + 1;
            }else if(a[mid] > key){
                last = mid - 1;
            }

            mid = (first + last)/2;
        }
        if(first > last){
            System.out.println("Element Not found");
        }
        return 0;
    }

}