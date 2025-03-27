import java.util.*;
public class BubbleSort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total element in array :");
        int n = sc.nextInt();
        System.out.println("Enter numbers in an array : ");
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        bubbleSort(arr);
        System.out.print("The sorted array is : ");

        for (int i = 0; i < n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
