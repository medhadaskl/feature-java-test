import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class iterateList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<String> ll = new ArrayList<String>();
        System.out.print("enter the size of the list : ");
        int s = sc.nextInt();
        System.out.println("Enter word in a list: ");
        for(int i=0 ; i<=s ;i++){
            String num = sc.nextLine();
            ll.add(num);
        }
        System.out.println("Print list after iterate it using lambda func :");
        ll.forEach((String i)-> System.out.print(i+" "));
    }
}
