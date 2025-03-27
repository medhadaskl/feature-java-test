import java.util.Scanner;
public class QuickSort {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int N=sc.nextInt();
        System.out.println("Enter the element in the array: ");
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        sort(arr,0, N-1);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    public static void sort(int[] arr ,int l,int n){
        if (l<n)
        {
            int p = partition(arr, l, n);

            sort(arr, l,p-1);
            sort(arr, p+1, n);
        }
    }
    static int partition(int[] arr, int l, int h) {
        int pvt = arr[h];
        int i = (l - 1);
        for (int j = l; j < h; j++) {
            if (arr[j] <= pvt) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;

        return i + 1;
    }
}
