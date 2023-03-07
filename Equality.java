import java.util.*;
public class Equality {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter num1: ");
            int a = sc.nextInt();
            System.out.println("Enter num2: ");
            int b = sc.nextInt();

            if (a==b) {
                System.out.println(a +" and " +b + " are Equal" );            
            }
            else if (a>b) {
                System.out.println(a +" is Greater " );                        
            } else {
                System.out.println(b +" is Greater " );            

            }
        }
    }
    
}
