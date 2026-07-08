public abstract class reverseanarray {
    public static void main(String[] args) {
        int[] arr = {10,20,40,42,53};
        //using two pointer technique to reverse the array
        int left=0;
        int right=arr.length-1;
        while(left!=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
