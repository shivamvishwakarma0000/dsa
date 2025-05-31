//https://leetcode.com/problems/find-peak-element/
//medium Question
public class PeakMountain{
    public static void main(String[] args) {
         int[] arr={0,1,5,0};
         int ans=Peak(arr);
        System.out.println(ans);
    }
    static int Peak(int[] arr){
        int start=0;
        int end = arr.length - 1;

        while(end>=start){
            int mid= start+(end-start)/2;
if(arr[mid]>arr[mid-1]{
        end=mid;
            }else{
    start=mid+1;
            }


}


return start;

    }
}
