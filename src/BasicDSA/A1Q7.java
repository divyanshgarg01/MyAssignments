public class A1Q7 {
    public static boolean searchArray(int[] arr, int toCheckValue){
        for(int i=0;i<arr.length;i++){
            if( toCheckValue==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        System.out.println(searchArray(arr,valueToCheck ));
    }
}