public class PalindromeChecker {
 public static int isPalindrome(int x) {
        
        if (x <= 0) {
            return -1;
        }
        String strX = Integer.toString(x);
        String reversedStrX = new StringBuilder(strX).reverse().toString();
        if (strX.equals(reversedStrX)) {
            return 1; 
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
   
        System.out.println(isPalindrome(232));  
        System.out.println(isPalindrome(345));  
        System.out.println(isPalindrome(-121));  
        System.out.println(isPalindrome(0));     
    }
}