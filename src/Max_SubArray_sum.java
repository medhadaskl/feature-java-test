import java.util.Scanner;

public class Max_SubArray_sum {
    static int maxSubArraySum(int[] arr) {
        int r = arr[0];


        for (int i = 0; i < arr.length; i++) {
            int Sum = 0;

            for (int j = i; j < arr.length; j++) {
                Sum = Sum + arr[j];
                r = Math.max(r,Sum);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter number in an array: ");
        for(int i=0;i<l;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The maximum sum of Subarray is: "+maxSubArraySum(arr));
    }
}
