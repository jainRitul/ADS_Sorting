class IntersectionOfTwoSortedArr {
    public static void main(String[] args) {
        int a[] = {1,1,3,5,6,7,8,19};
        int b[] ={0,1,1,1,3,5,6,13,15,19} ;
        findIntersection(a,b);
        findIntersectionEfficient(a,b);
        
    }
    static void findIntersectionEfficient(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && a[i] == a[i-1] ){
                i++;
                continue;
            }
            if(a[i] == b[j]){
                
                   System.out.print(a[i]+" ");
                i++;
                j++;
            }else if(a[i] < b[j]){
                i++;
            }
            else j++;
        }System.out.println();return ;
    }
    static void findIntersection(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        for(int i =0;i<n;i++){
            if(i>0 && a[i] ==a[i-1])continue;
            for(int j=0;j<m;j++){
                if(a[i] == b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }System.out.println();return ;
    }
}
