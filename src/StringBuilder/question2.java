package StringBuilder;

public class question2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("It is used to _ at the specified index position");
        int index = sb.indexOf("_");
        String word="insert text";
        sb.insert(index, word);
        sb.delete(index+word.length(),index+word.length()+1);
        System.out.println(sb.toString());
    }
}