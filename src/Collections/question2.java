package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        HashSet object=new HashSet();
        System.out.println("Enter the element");
        object.add("Hello");
        object.add("Gla");
        object.add(1);
        object.add(2);
        object.add(3);
        object.add("Abhi");
        object.add("Ankur");
        object.add("Naman");
        object.add(9);
        object.add(10);

        // adding duplicate element
        object.add("Hello");
        object.add(10);

        System.out.println(object);
    }
}