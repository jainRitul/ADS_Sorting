import java.util.Arrays;

class KthSmallestEle {
    public static void main(String[] args) {
        int arr[] = {10,5,30,12};
        int k =2;
       
        // System.out.print(kthSmallestEle(arr,k));
        int ind = kthSmallestEleEfficient(arr,k);
        System.out.print(arr[ind] + " ");
    }
    //this algo is called as QuickSelect algo which gives worst case time complextiy of o(n^2) and on avg o(n)
    //uses the lomuto partition
    static int kthSmallestEleEfficient(int  arr[],int k){
        int l = 0;
        int r = arr.length-1;
         while(l <= r){
            int p = partition(arr,l,r);
            if(p==k-1) return p;
            else if(p > k-1)
             r = p-1;
            else l =p+1;
         }
         return -1;
    }
    static int partition(int arr[],int l,int r){
          int pivot = arr[r];
          int i = l-1;
          for(int j = l;j<=r-1;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
         }
         int temp = arr[i+1];
         arr[i+1] = arr[r];
         arr[r] = temp;
         return (i+1);
    }
    static int kthSmallestEle(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}


