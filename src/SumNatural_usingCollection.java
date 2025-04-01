import java.util.*;
public class SumNatural_usingCollection {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the limit: ");
            int n = sc.nextInt();

            List<Integer> numbers = new ArrayList<>();

            for (int i =0; i <=n; i++) {
                numbers.add(i);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            System.out.println("The sum of all natural numbers is " + sum);

            sc.close();
        }

}
