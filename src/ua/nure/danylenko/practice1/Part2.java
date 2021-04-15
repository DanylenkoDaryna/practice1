package ua.nure.danylenko.practice1;

public class Part2 {
    public static void main(String[] args){
    int add=0;
        for(int i=0; i<args.length; i++){
         add = add +  Integer.parseInt(args[i]);
        }
        System.out.println(add);
    }
}
