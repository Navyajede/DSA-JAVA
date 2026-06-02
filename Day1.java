public class Day1 {
    public static void main(String[] args) {
        //linear search
        int[] num= {10,39,58,45,38};
        int ans= LinearSearch(num, 78);
        System.out.println(ans);
        
    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i < arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;

    }
}
