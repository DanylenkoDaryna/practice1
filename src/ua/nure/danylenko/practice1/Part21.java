package ua.nure.danylenko.practice1;

public class Part21 {

    public static void main(String[] args){

        int arrSize = Integer.parseInt(args[0]);
        int[][] arr = new int[arrSize][arrSize] ;

        int x = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = x+1;
                x=x+1;
            }
        }
        showMatr(arr);
        transpose(arr);

    }

    private static void showMatr(int[][] matr){

        for (int[] aMatr : matr){
            for (int anAMatr : aMatr){
                System.out.print(anAMatr + " ");
            }
            System.out.println();
        }
    }


    private static void transpose(int[][] matr){

        int matrSize = matr.length;
        int[][] res  = new int[matrSize][matrSize] ;
        for (int i = 0; i < matrSize; ++i) {
            for (int j = 0; j < matrSize; ++j) {
                res[i][j] = matr[j][i];
            }
        }
        showMatr(res);
    }
}
