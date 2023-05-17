import java.util.*;

class ArmstrongNumBetweenRange{
    public  int[] armstrongNumbersInRange(int min,int max){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=min;i<=max;i++){
            Assignment1Q2 at=new Assignment1Q2();
            int temp=i;
            int count=0;
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            temp=i;
            int sum=0;
            while (temp !=0){
                int n=temp%10;
                sum += at.power(n,count);
                temp=temp/10;

            }
            if(sum==i){
                list.add(i);
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return  arr;
    }
}
public class A1Q2 {
    public static int power(int x,int y){
        int pow=1;
        for(int i=1;i<=y;i++){
            pow= pow * x;
        }
        return  pow;
    }
    public static void main(String[] args) {
        ArmstrongNumBetweenRange abr=new ArmstrongNumBetweenRange();
        int min=100; int max=999;
        int arr2[]= abr.armstrongNumbersInRange(min,max);
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }

}