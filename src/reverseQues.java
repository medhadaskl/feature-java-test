public class reverseQues {
    public static void main(String[] args){
        int arr[] ={1,4,8,0};
        int first=0;
        int last = arr.length -1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
