package arrays;
import java.util.Scanner;
/**
 * arraymiss
 */
public class arraymiss {

    public static void main(String[] args) {
        System.out.println("enter the arr length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum=arr[i]+sum;
        }
        int expectedsum=(n+1)*(n+2)/2;
        int miss = expectedsum-sum;
        System.out.println(miss);
        


    }
}