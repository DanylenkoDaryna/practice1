package ua.nure.danylenko.practice1;

import java.util.ArrayList;
import java.util.Comparator;

public class Part8 {

    public static void main(String[] args) {

        System.out.println("asdf".compareTo("csdf"));
        System.out.println("asdf".compareTo("asdfasdf"));
        System.out.println("арбуз".compareTo("qjrte"));
        ArrayList ar = new ArrayList();
        ar.add(9);
        ar.add(6);
        ar.add(1);
        ar.add(12);
        System.out.println(ar);
        ar.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //Integer i=(Integer)o1;
                return (Integer)o1-(Integer)o2;
            }
        });
        System.out.println(ar);
        // Collator
    }
}
