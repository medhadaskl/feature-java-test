import  java.util.*;
public class linearSearch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  total number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number in array: ");
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter a number to search in an array: ");
        int number = sc.nextInt();

       int p= searchLinear(arr,number);

        if(p>=0){
            System.out.print(" The number is present in the array and index is : "+ p);
        }
        else{
            System.out.print("The number is not present in the array ");
        }

    }
    static int searchLinear(int[] arr,int number){
        for(int i=0; i<arr.length;i++){
            if(arr[i]== number){
                return i;
            }
        }
        return -1;
    }
}
