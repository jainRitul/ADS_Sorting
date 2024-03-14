class UnionOfSortedArr {
    public static void main(String[] args) {
        int a[] = {2,3,3,3,5,5,5};
        int b[] ={4,4};
        findUnion(a,b);
    }
    static void findUnion(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        int i=0,j=0;
        while(i<n && j<m){
            
            if(i>0 && a[i] == a[i-1]){i++;continue;}
            if(j>0 && b[j] == b[j-1]){j++;continue;}
            if(a[i] == b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }else if(a[i] < b[j]){
                System.out.print(a[i] +" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");j++;
            }

        }
        while(i<n){
            if(i>0 && a[i] != a[i-1] )
                    System.out.print(a[i] +" ");
                    i++;
        }
        while(j<m){
            if(j>0 && b[j] != b[j-1] )
                    System.out.print(b[j] +" ");
                    j++;
        }
    }
}
