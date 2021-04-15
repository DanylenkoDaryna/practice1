package ua.nure.danylenko.practice1;

public class Part4 {

    public static void main(String[] args) {

        int numbOne = Integer.parseInt(args[0]);
        int numbTwo = Integer.parseInt(args[1]);
        System.out.println(commonDivider(numbOne,numbTwo));
    }

    private static int commonDivider (int first, int seckond){
        while (first != seckond) {
            if (first > seckond) {
                first = first - seckond;
            } else {
                seckond = seckond - first;
            }
        }
        return first;
    }
}
