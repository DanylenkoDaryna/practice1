package ua.nure.danylenko.practice1;

public class Part7 {
    private static final String ARROW =" ==> ";
    private static final String LETTER1 ="AA";
    private static final int ALPHABET= 26;
    private static final int TWOBYTES= 64;

    public static void main(String[] args){
        if("AB".equals(rightColumn(LETTER1))){
            showResult("A");
            showResult("B");
            showResult("Z");
            showResult("AA");
            showResult("AZ");
            showResult("BA");
            showResult("ZZ");
            showResult("AAA");
        }
    }

    private static void showResult(String str){
        long resNum=str2int(str);
        System.out.println(str + ARROW +
                resNum + ARROW
                + int2str(resNum));
    }

    private static long str2int(String number) {
        long res2 = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int res1 = number.codePointAt(i) - TWOBYTES;
            res2 += res1 * Math.pow(ALPHABET, (number.length()-i-1L));
        }
        return res2;
    }

    private static String int2str(long number) {
        StringBuilder chars = new StringBuilder();
        while (number > 0) {
            if (number % ALPHABET == 0) {
                chars.append('Z');
                number -= ALPHABET;
            } else {
                chars.append((char)((number % ALPHABET) + (int)'A' - 1));
            }
            number = number / ALPHABET;
        }
        return new StringBuffer(chars).reverse().toString();
    }

    private static String rightColumn(String number) {
        long firstLetter = str2int(number);
       return int2str(firstLetter + 1L);
    }
}
