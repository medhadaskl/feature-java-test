import  java.util.*;
public class RemoveDuplicates {
    public static  void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        System.out.println("Enter the element in the array: ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int[] arr2 = removeDuplicate(arr,n);
        System.out.println("The array after removing duplicates : ");
        for(int i=0; i<arr2.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
    public static int[] removeDuplicate(int[] arr,int n){
        if(n==0||n==1){
            return arr;
        }
        int j =0;
        int[] temp = new int[n];
         for (int i = 0; i < n; i++) {
             boolean isDuplicate = false;
             for (int k = 0; k < j; k++) {
                 if (arr[i] == temp[k]) {
                     isDuplicate = true;
                     break;
                 }
             }
             if (!isDuplicate) {
                 temp[j++] = arr[i];
             }
         }

         int[] result = new int[j];
         for (int i = 0; i < j; i++) {
             result[i] = temp[i];
         }
         return result;


    }
}
