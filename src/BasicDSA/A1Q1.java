import java.util.*;
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        Assignment1Q1 at=new Assignment1Q1();
        int temp=num;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        temp=num;
        int sum=0;
        while (temp !=0){
            int n=temp%10;
            sum += at.power(n,count);
            temp=temp/10;

        }
        if(sum==num){
            return true;
        }
        else
            return false;
    }
}
public class A1Q1 {
    public static int power(int x,int y){
        int pow=1;
        for(int i=1;i<=y;i++){
            pow= pow * x;
        }
        return  pow;
    }
    public static void main(String[] args) {

        ArmstrongOrNot an=new ArmstrongOrNot();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }

        System.out.println(an.armstrongCheck(num));

    }
}
