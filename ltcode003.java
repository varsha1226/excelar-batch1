public class LTCode003 {
    public int myAtoi(String s) {
        s = s.trim();  
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int index = 0;

        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        int result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0'; 
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return sign * result;
    }

    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();  
        System.out.println(solution.myAtoi("42"));          
        System.out.println(solution.myAtoi(" -042"));       
        System.out.println(solution.myAtoi("1337c0d3"));    
        System.out.println(solution.myAtoi("0-1"));        
        System.out.println(solution.myAtoi("words and 987")); 
    }
}