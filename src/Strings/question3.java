package String;

import java.util.Locale;

public class QuestionNo3 {
    public static void main(String[] args) {
        String str="Java String pool refers to collection of Strings which are stored in heap memory";
        String temp=str;

        // 1. Lowercase
        System.out.println(temp.toLowerCase());

        // 2. Uppercase
        System.out.println(temp.toUpperCase());

        //3. replace 'a' with '$'
        System.out.println(temp.replace('a','$'));

        // 4. check original string contain word "collection
        System.out.println(str.contains("collection"));

        //5. Check if the following String “java string pool refers to collection of strings which are stored in heap memory” matches the original
        String s1="java string pool refers to collection of strings which are stored in heap memory";
        boolean matches=str.equals(s1);
        System.out.println(matches);

        //6. If the string does not match check if there is another method which can be used to check if the strings are equal

        if(!matches){
            boolean check=str.equalsIgnoreCase(s1);
            System.out.println(check);
        }
    }
}