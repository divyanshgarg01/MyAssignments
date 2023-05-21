@FunctionalInterface
interface Arithmetic {
    double operation(int num1, int num2);
}
public class question1 {

    public double addition(int num1, int num2) {
        Arithmetic  obj = (int a, int b) -> a + b;
        return obj.operation(num1, num2);
    }

    public double subtraction(int num1, int num2) {
        Arithmetic  obj = (int a, int b) -> a - b;
        return obj.operation(num1, num2);
    }

    public double multiplication(int num1, int num2) {
        Arithmetic  obj = (int a, int b) -> a * b;
        return obj.operation(num1, num2);
    }

    public double division(int num1, int num2) {
        Arithmetic  obj = (int a, int b) -> a / (double) b;
        return obj.operation(num1, num2);
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        question1 obj = new question1();

        System.out.println(obj.addition(num1, num2));
        System.out.println(obj.subtraction(num1, num2));
        System.out.println(obj.multiplication(num1, num2));
        System.out.println(obj.division(num1, num2));

    }

}