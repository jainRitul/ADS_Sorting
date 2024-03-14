class SortAnArrayWithTwoDiffTypes {
    public static void main(String[] args) {
        int arr[] = {14,34,5,-1,3,-3,4};
        // sortArray(arr);
        // for(int i=0;i<arr.length;i++)System.out.print(arr[i] + " ");
        // sortArrayApprocah2(arr);
        // for(int i=0;i<arr.length;i++)System.out.print(arr[i] + " ");
        sortArrayApprocah3(arr);
        for(int i=0;i<arr.length;i++)System.out.print(arr[i] + " ");
    }
    static void sortArrayApprocah3(int arr[]){
        int i =-1;
        int j = arr.length;
        while (true) {
            do{
                i++;
            }while(arr[i] < 0);
            do{
                j--;
            }while(arr[j] >= 0);
            if(i >= j) return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void sortArrayApprocah2(int arr[]){
        int temp[] = new int[arr.length];
        int i=0;
        int n = arr.length;
        for(int j=0;j<n;j++){
            if(arr[j] < 0){
                temp[i] = arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j] >= 0){
                temp[i] = arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            arr[j]  = temp[j];
        }

    }
    static void sortArray(int arr[]){
        int i = -1;
        int n = arr.length;
        for(int j=0;j<n;j++){
            if(arr[j]<0){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }
}
