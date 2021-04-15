package ua.nure.danylenko.practice1;

public class Part31 {

    public static void main(String[] args){
        System.out.println();
        int arrStrings = Integer.parseInt(args[0]);
        int arrColumns = Integer.parseInt(args[1]);
        int displacement = Integer.parseInt(args[2]);

        int[][] arr = new int[arrStrings][arrColumns] ;

        int x = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = i+j;
                x=x+1;
            }
        }
        displace(arr,arrStrings,arrColumns,displacement);
    }

    private static void displace (int[][] matr, int matrStrings, int matrColumns, int displacement) {

            for (int i = 0; i < displacement-1; ++i) {
                for (int j = 0; j < matrStrings; ++j) {
                    int temp = matr[j][0];
                    for (int m = 0; m < matrColumns - 1; m++) {
                        matr[j][m] = matr[j][m + 1];
                    }
                    matr[j][matrColumns-1] = temp;
                }
            }
            showMatr(matr);
        }


    private static void showMatr(int[][] matr){

        for (int[] aMatr : matr) {
            for (int anAMatr : aMatr) {
                System.out.print(anAMatr + " ");
            }
            System.out.println();
        }
    }

}
