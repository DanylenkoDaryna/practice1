package ua.nure.danylenko.practice1;

public class Part6 {

    public static void main(String[] args){

        int matrSize = Integer.parseInt(args[0]);
        int[] arr = new int[matrSize];
        fullMatrByPrimeNums(arr);
        for(int i=0; i< arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[arr.length-1]);
    }

    private static void fullMatrByPrimeNums(int[] arr){
        int x = 2;
        for(int i=0; i<arr.length; i++){
                while(!isPrime(x)){
                    x++;
                }
                arr[i] = x;
                x++;
        }
    }

    private static boolean isPrime(int number){
        int temp = 0;
        for(int i=2; i<number; i++){
            if(number % i <= 0){
                temp++;
            }
        }
        return temp == 0;
    }
}
