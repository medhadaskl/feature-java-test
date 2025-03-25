public class questranspose {
    public static void main(String[] args){
        int M = 3;
        int N = 4;
        int A[][] = { { 1, 2,3,4 },
                    { 2, 5,6,7},
                    { 3, 3, 3, 3 } };

        int B[][] = new int[N][M], i, j;

        for (i = 0; i < N; i++){
            for (j = 0; j < M; j++){
                B[i][j] = A[j][i];
            }
        }

        System.out.print("Result matrix is : \n");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++)
                System.out.print(B[i][j] + " ");
            System.out.println("");
        }


    }

}
