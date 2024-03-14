import java.util.Arrays;

class MinDiffInArr{
    public static void main(String[] args) {
        int arr[] = {5,3,8};
        System.out.println(findMinDiff(arr));
        System.out.println(findMinDiffEfficient(arr));

    }
    static int findMinDiffEfficient(int arr[]){

        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for(int i =0;i<n-1;i++){
           minDiff = Math.min(minDiff,Math.abs(arr[i+1] - arr[i]));
        }
        return minDiff;
    }
    static int findMinDiff(int arr[]){
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
               minDiff = Math.min(minDiff, Math.abs(arr[i] - arr[j]));
            }
        }
        return minDiff;
    }
}