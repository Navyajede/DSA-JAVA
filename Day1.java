public class Day1 {
    public static void main(String[] args) {
        //linear search
        int[] num= {10,39,58,45,38};
        int ans= LinearSearch(num, 78);
        System.out.println(ans);

        String name ="Navya Nandha";
        char target='y';
        System.out.println(StringSearch(name, target));
        
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

    static String StringSearch(String str , char target){
        if(str.length()==0){
            return "not found";

        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return String.valueOf(str.charAt(i));
            }
        }
        return "not found";
    }
}

