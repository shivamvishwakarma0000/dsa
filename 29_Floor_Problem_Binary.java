public class floor{
    public static void main(String[] args) {
        int[] arr= {2,3,5,6,8,9,12,15};
        int target=10;
        int ans= Floor( arr,target );
        System.out.println(arr[ans]);
    }
    static int Floor(int[] arr, int target ){
        int start =0;
        int end= arr.length-1;

        while(end>=start){
            int mid= start +(end-start)/2;
                    if(target<arr[mid]) {
                        end =mid-1;
                    }else if(target>arr[mid]){
                        start= mid+1;

                    }else{
                        return mid;
                    }
                    }
        return end;




        }
    }





