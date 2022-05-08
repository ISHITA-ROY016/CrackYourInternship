import java.util.*;
class ChocolateDistributionProblem{
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};   
        int m = 7;
        int n=arr.length;
        System.out.println(minDiff(arr,n,m)); 
    }

    private static int minDiff(int[] arr, int n, int m) {
        if(m==0 || n==0){
            return 0;
        }
        int min= Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n-m+1;i++){
            if((arr[i+m-1]-arr[i])<min){
                min=arr[i+m-1]-arr[i];
            }
        }
        return min;
    }
}
