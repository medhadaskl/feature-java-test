import java.util.*;
public class ReverseLinkedList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of linked list: ");
        int s = scanner.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("Enter value on the list : ");
        for(int i=0;i<s;i++){
            int num = scanner.nextInt();
            ll.add(num);
        }
        System.out.println("The list: "+ll);
        Collections.reverse(ll);
        System.out.println("The list after reversed : "+ll);
    }
}
