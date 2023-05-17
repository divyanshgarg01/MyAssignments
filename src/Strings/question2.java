package String;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1=sc.nextLine();
        System.out.println("Enter the second string");
        String str2=sc.nextLine();

        System.out.println(str1.concat(str2));

    }
}