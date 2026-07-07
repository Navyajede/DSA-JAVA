import java.util.Scanner;

public class arraysum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements:");
        for(int i = 0; i<arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of the array is:");
        System.out.println(sum);


    }
    
}
