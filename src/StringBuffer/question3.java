package StringBuffer;

public class question3 {
    public static void main(String[] args) {
        String str = "This method returns the reversed object on which it was called";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}