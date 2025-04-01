import java.util.*;
public class add_in_collection {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the list: ");
        int s = sc.nextInt();
        System.out.println("Add number in an array : ");
        for(int i=0; i<s;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        Collections.sort(list);
        System.out.println("The overall list is :"+list);
        list.sort(Collections.reverseOrder());
        System.out.println("printing in reverse order :"+list);
    }

}
