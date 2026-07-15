package arrays;
import java.util.Scanner;

public class arrayq1 {
    public static void main(String [] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(i%2!=0){
                arr[i]=arr[i]*2;

            }
            else{
                arr[i]=arr[i]+10;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }

         
    }
}
