class CountInversion {
    public static void main(String[] args) {
        int arr[] = {40,30,20,10};
        System.out.println(countInversion(arr));
        System.out.println(countInversionEfficient(arr,0,arr.length));
    }
    static int countInversionEfficient(int arr[],int l,int r){
          int res= 0;
          if(l < r){
            int m = r+l/2;
            res += countInversionEfficient(arr,l,m);
            res += countInversionEfficient(arr,m+1,r);
            res += countAndMerge(arr,l,m,r);
          }return res;
    }
    static int countAndMerge(int arr[],int l,int m,int r){
       int n1 = m - l+1;
       int n2 = r-m;
       int left[] = new int[n1];
       int right[] = new int[n2];
       for(int i=0;i<n1;i++) left[i] = arr[i+l];
       for(int j=0;j<n2;j++) right[j] = arr[m+j+1];

       int i=0,j=0,k=l,res =0;
       while(i<n1 && j<n2){
        if(left[i] <= right[j]) arr[k++] = left[i++];
        else {
            arr[k++] = right[j++];
            res = res + (n1-i);
        }
       }
       while(i<n1){
        arr[k++] = left[i++];
       }
       while(j<n2){
        arr[k++] = right[j++];
       }
       return res;

    }
    static int countInversion(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j])count++;
            }
        }
        return count;
    }
}
