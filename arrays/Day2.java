package arrays;
import java.util.Arrays;

//bubble sort 

public class Day2 {
    public static void main(String[] args) {
        int[] arr={10,38,4,5,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;


        //totat iterations
        for(int i=0 ; i<arr.length ; i++){
            swapped = false;
            //total adjacent comparisions
            for(int j=1;j<arr.length-i;j++){
                //swap the stuff if its small
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
            break;
        }

        }
        
        
    }
    
}
