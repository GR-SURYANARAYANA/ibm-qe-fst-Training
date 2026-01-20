package activities.Two;

public class SumExact {
    public static void main(String[] args) {
        int[] arr =  {10, 77, 10, 54, -11, 10};
        System.out.println(checkSum(arr));
    }

    static boolean checkSum(int[] arr){
        int sum=0;
        for(int x:arr)
            if(x == 10)
                sum+=10;
        return sum == 30;
    }
}
