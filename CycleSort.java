class CycleSort{
    public static void main(String[] args){
        int arr[] = {50,40,30,10,20};
        cycleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    static void cycleSort(int arr[])
    {
      int n = arr.length;
      for(int cs = 0;cs<n-1;cs++){
        int item = arr[cs];
        int pos = cs;
        for(int i=cs+1;i<n;i++){
            if(arr[i] < item) pos++;
        }
        int temp = arr[pos];
        arr[pos] = item;
        item = temp;

        while(pos != cs){
            pos = cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i] < item){
                    pos++;
                }
            }
            int te = arr[pos];
            arr[pos] = item;
            item = te;
        }
      }
    }
}