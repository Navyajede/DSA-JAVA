package Strings;

/**
 * palindrome
 */
public class palindrome {

    public static void main(String[] args) {
         
        String name = "malayalam";
        int n = name.length();
        boolean isPalindrome=false;
        for(int i=0;i<n;i++){
            if(name.charAt(i)==name.charAt(n-i-1))
                isPalindrome=true;
            else{
                isPalindrome=false;
            }
        }
        System.out.println(isPalindrome);
    }
}