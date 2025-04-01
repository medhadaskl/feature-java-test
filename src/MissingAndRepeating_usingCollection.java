import java.util.*;
public class MissingAndRepeating_usingCollection {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }

            int repeating = -1;
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        repeating = list.get(i);
                        break;
                    }
                }
                if (repeating != -1) {
                    break;
                }
            }

            int missing = -1;
            for (int i = 1; i <= n; i++) {
                if (!list.contains(i)) {
                    missing = i;
                    break;
                }
            }


            System.out.println("Repeating number is " + repeating);
            System.out.println("Missing number is " + missing);


            scanner.close();
        }

}
