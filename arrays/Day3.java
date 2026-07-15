package arrays;
public class Day3 {

    public static void main(String[] args){

        int[] num = {10,20,39,58,67,68};
        int target = 67;
        int ans = BinarySearch(num,target);
        System.out.println(ans);

    }
    static int BinarySearch(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2 ;//finding the mid index;
             
            if(target<arr[mid]){
                end= mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;

            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
