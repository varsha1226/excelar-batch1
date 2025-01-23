public class demo014 {
    
        public static void main(String[] args) {
            int a = 10;
    
            System.out.println("Initial value of a: " + a);
    
            
            System.out.println("Post-increment (a++): " + a++); // Prints 10, then increments a to 11
            System.out.println("Value of a after post-increment: " + a);
    
           
            System.out.println("Pre-increment (++a): " + ++a); // Increments a to 12, then prints 12
            System.out.println("Value of a after pre-increment: " + a);
    
            
            System.out.println("Post-decrement (a--): " + a--); // Prints 12, then decrements a to 11
            System.out.println("Value of a after post-decrement: " + a);
    
           
            System.out.println("Pre-decrement (--a): " + --a); // Decrements a to 10, then prints 10
            System.out.println("Value of a after pre-decrement: " + a);
        }
    }