import java.util.*;
public class LinkedListToArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of linked  list: ");
        int s = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("Enter Number in a linked list: ");
        for(int i=0 ; i<s ;i++){
            int num = sc.nextInt();
            ll.add(num);
        }
        System.out.println("The linked list is : "+ll);
        Integer[] arr = new Integer[ll.size()];
        ll.toArray(arr);
        System.out.print("The list after converting to array : ");
        for(int i :arr){
            System.out.print(i+" ");
        }

    }
}
