public class pushingZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 1,3,0,6,88,0,4};
        int c =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
                c++;
            }
        }
        System.out.print("The array after pushing all zeros to end : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
