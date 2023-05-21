import java.util.Scanner;

public class A1Q5 {

    public static double calculateTaxAmount(int ctc) {
        if (ctc <= 180000) {
            return 0;
        }
        if (ctc >= 181001 && ctc <= 300000) {
            return ctc * 0.1;
        }
        if (ctc >= 300001 && ctc <= 500000) {
            return ctc * 0.2;
        }
        return ctc * 0.3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your CTC: ");
        int ctc = sc.nextInt();

        double result = calculateTaxAmount(ctc);
        System.out.println("Your tax is : " + result);
    }
}