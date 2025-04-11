public class quesSumElement {
    public static void main(String[] args) {
        int arr[]={ 2, 4, 6, 7, 9};
        int sum = 0;
        for(int i=0;i<=arr.length;i++){
            sum= arr[i]+arr[i++];
        }
        System.out.print("Sum of array elements : "+sum);

    }
}