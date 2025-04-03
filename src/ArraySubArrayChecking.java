import java.util.*;
public class ArraySubArrayChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the 1st array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the 2nd array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean subsetChecking = subsetChecking(arr1, arr2);

        if (subsetChecking) {
            System.out.println("Yes,The second array is a subset of the first array");
        } else {
            System.out.println("No,The second array is not a subset of the first array");
        }

    }

    public static boolean subsetChecking(int[] arr1, int[] arr2) {
        Set<Integer> s = new HashSet<>();
        for (int num : arr1) {
            s.add(num);
        }
        for (int num : arr2) {
            if (!s.contains(num)) {
                return false;
            }
        }

        return true;
    }
}
