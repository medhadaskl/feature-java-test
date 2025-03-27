import java.util.*;
public class Palindrome {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");

        String s = sc.nextLine();

        boolean res = palindrome(s);

        if (res) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s +" is not a palindrome.");
        }
    }
    static boolean palindrome(String s){
        s = s.toLowerCase();
        for(int i=0; i<s.length()/2;i++){
            if (s.charAt(i)==s.charAt(s.length()-1)){
                return true;
            }
            else {
                return false;
            }
        }
        return false;

    }
}
