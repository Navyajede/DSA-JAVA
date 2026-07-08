import java.util.Scanner;

public class maxofarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements:");
        for(int i = 0; i<arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
        }

        System.out.println("the max of the array is:");
        System.out.println(max);


    }
    
}
