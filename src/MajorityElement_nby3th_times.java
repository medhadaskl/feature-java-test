import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement_nby3th_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter number in an array : ");
        for (int i=0; i<l;i++) {
            arr[i] = sc.nextInt();
        }
        int n = (int) Math.floor(l/3);
        Map<Integer, Integer> freqCheck = new HashMap<>();
        for (int num : arr) {
            freqCheck.put(num, freqCheck.getOrDefault(num, 0) + 1);
        }
        System.out.print("Elements that occur more than " + n + " times: \n");
        boolean present = false;
        for (Map.Entry<Integer, Integer> entry : freqCheck.entrySet()) {
            if (entry.getValue() > n) {
                System.out.print(entry.getKey()+",");
                present=true;
            }
        }
        if (!present) {
            System.out.print("None");
        }
    }
}
