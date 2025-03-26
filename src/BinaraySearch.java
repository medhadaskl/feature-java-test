import  java.util.*;
public class BinaraySearch {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of element in an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers in an array :");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to be searched : ");
        int t = sc.nextInt();
        int val = binarySearch(arr,t);

        if(val>=0){
            System.out.print("The number is present in an array and index is : "+val);
        }
        else{
            System.out.println("The number does not exist in an array : ");
        }

    }
    static int binarySearch(int[] arr, int t){
        int start=0;
        int last=arr.length-1;
        while(start<=last){
            int center= (start+last)/2;
            if(arr[center]==t){
                return center;
            }
            else if (arr[center]>t){
                last=center-1;

            }
            else{
                start= center+1;
            }

        }
        return -1;

    }

}
