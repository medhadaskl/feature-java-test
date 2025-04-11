import java.util.Scanner;

public class Rotating_array {
    static void rotateArr(int[] arr, int d) {
        d %= arr.length;
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length - d; i++){
            temp[i] = arr[d + i];
        }

        for(int i = 0; i < d; i++){
            temp[arr.length - d + i] = arr[i];
        }


        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l= sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter number in an array : ");
        for(int i =0 ; i<l;i++) arr[i] = sc.nextInt();

        System.out.print("enter total number of times array to be rotated : ");
        int d = sc.nextInt();

        System.out.print("The array  before rotation is : ");
        for(int j : arr) {
            System.out.print(j + " ");
        }


        rotateArr(arr, d);
        System.out.print("\nThe array after "+d+"th rotation is : ");
        for(int j : arr) {
            System.out.print(j + " ");
        }
    }

}
