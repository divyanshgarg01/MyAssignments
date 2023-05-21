import java.util.Scanner;

public class A1Q4 {
    public static String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60){
            return "passed";
        }
        else if(subject1Marks>60 && subject2Marks>60 || subject2Marks>60 && subject3Marks>60 || subject1Marks>60 && subject3Marks>60) {
            return "promoted";
        }
        return "failed";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double subject1Marks= sc.nextDouble();
        double subject2Marks= sc.nextDouble();
        double subject3Marks= sc.nextDouble();
        System.out.println(declareResults( subject1Marks,subject2Marks,subject3Marks));
    }
}