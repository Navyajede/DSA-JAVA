package arrays;
public class secmaxinarray {
    public static void main(String[] args) {
        int[] arr = {10,30,657,677,677};
        int max=arr[0];
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
                
            }
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }

            

        }
        System.out.println(max2);
    }
    
}
