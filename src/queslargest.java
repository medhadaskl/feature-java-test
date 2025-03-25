public class queslargest {
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 1, 4};
        int largest = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        System.out.print("The largest element in array: " + largest);

    }
}