public class arraysearch {
    public static void main(String[] args) {
        int[] arr = {10,30,45,5,65};
        int target=5;
        boolean found = false;
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]==target){
                found = true;
                System.out.println("element found in "+i);
                break;
            }
            
            
        }
        if(!found){
                     System.out.println("element not found in the array");

        }



    }
}
