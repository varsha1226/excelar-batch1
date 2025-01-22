public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10; // Get the last digit
            x /= 10; // Remove the last digit from x
            
            // Check for overflow/underflow before actually adding the digit
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }
            
            reversed = reversed * 10 + digit; // Build the reversed number
        }
        return reversed;
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        
        // Test cases
        System.out.println(ri.reverse(123));  // Output: 321
        System.out.println(ri.reverse(-123)); // Output: -321
        System.out.println(ri.reverse(120));  // Output: 21
        System.out.println(ri.reverse(1534236469)); // Output: 0 (overflow)
    }
}