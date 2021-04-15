package ua.nure.danylenko.practice1;

public class Part5 {

    public static void main(String[] args){

        int positiveNumb = Integer.parseInt(args[0]);
        sumOfNums(positiveNumb);
    }

    private static void sumOfNums(int number){
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number /= 10;
        }

        System.out.println(sum);
    }
}
