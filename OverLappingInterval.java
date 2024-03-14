import java.util.Arrays;

class Interval  implements Comparable<Interval>{
    int s,e;
   
    Interval(int s,int e){
        this.s = s;
        this.e = e;
    }

    public int compareTo(Interval a){
        return this.s - a.s;
    }
};
class OverLappingInterval {
    public static void main(String[] args) {
        Interval arr[] = {new Interval(1,10),new Interval(3,5),
                          new Interval(6,8),new Interval(9,11),new Interval(13,15)};

        int n = arr.length;    
        mergeInterval(arr,n);              
    }
    static void mergeInterval(Interval[] arr,int n){
        Arrays.sort(arr);

        int res= 0;
        for(int i=1;i<n;i++){
            if(arr[res].e >= arr[i].s){
                arr[res].e = Math.max(arr[res].e , arr[i].e);
                arr[res].s = Math.min(arr[res].s , arr[i].s);
            }
            else{
                res++;
                arr[res]  = arr[i];
            }
        }
        for(int i=0;i<=res;i++){
            System.out.print("[" + arr[i].s + "," + arr[i].e +"]");
        }
        return;
    }
}

