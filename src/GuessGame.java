import  java.util.*;
public class GuessGame {

        public static void main(String[] args)
        {

            Scanner sc = new Scanner(System.in);


            int number = (int)(100 * Math.random())+1;
            System.out.print("Enter the number of attempts you wanted :");
            int K = sc.nextInt();

            System.out.println("Guess number between 1 and 100.");
            System.out.println("You have " + K + " attempts to guess the correct number.");

            for (int i = 0; i < K; i++) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println(" Congratulations! You guessed the correct number.");
                    sc.close();
                    return;
                }
                else if (guess < number) {
                    System.out.println(" The number is greater than " + guess);
                }
                else {
                    System.out.println(" The number is less than " + guess);
                }
            }
            System.out.println("Overexceed the limit. The number is: " + number);
            sc.close();
        }


}
