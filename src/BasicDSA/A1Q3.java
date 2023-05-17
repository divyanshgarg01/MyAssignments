import java.util.*;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double res =(principalAmount*interestRate*time)/100;

        return res;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double res=0;
        res= principalAmount * (Math.pow((1 + interestRate /100), time)) - principalAmount;

        return res;
    }
}
public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Simple Interest");
        System.out.println("Enter 2 for Simple Interest");
        int n=sc.nextInt();

        SiCi cal=new SiCi();

        if(n==1){
            System.out.println("Enter the Principle Amount");
            double p=sc.nextDouble();
            System.out.println("Enter the years");
            int t=sc.nextInt();
            System.out.println("Enter the Annual Interest rate");
            double r=sc.nextDouble();


            System.out.println(cal.simpleInterest(p,t,r));


        }
        else if(n==2){
            System.out.println("Enter the Principle Amount");
            double p=sc.nextDouble();
            System.out.println("Enter the years");
            int t=sc.nextInt();
            System.out.println("Enter the Annual Interest rate");
            double r=sc.nextDouble();

            System.out.println(cal.compoundInterest(p,t,r));

        }
        else {
            System.out.println("Incorrect number");
        }
    }
}