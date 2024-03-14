import java.util.Arrays;

class MeetingMaxGuests {
    public static void main(String[] args) {
        int arr[] = {900,940,950,1100,1500,1800};
        int dept[] =  {910,1200,1120,1130,1900,2000};
        System.out.print(maxGuest(arr,dept));
    }
    static int maxGuest(int arr[],int dept[]){
        int n  = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dept);
        int res = 1;
        int curr = 1;
        int i = 1,j=0;
        while(i<n && j<n){
            if(arr[i] <= dept[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            res = Math.max(res,curr);
        }
        return res;
    }
}
