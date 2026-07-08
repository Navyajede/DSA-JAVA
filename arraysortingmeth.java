import java.util.Arrays;
public class arraysortingmeth {
    public static void main(String [] args){
        int[] arr={10,87,59,69};
        System.out.println("arrays before sorting");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("arrays after sorting");
        System.out.println(Arrays.toString(arr));

    }
}
