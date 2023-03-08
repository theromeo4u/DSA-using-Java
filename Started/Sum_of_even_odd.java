import java.util.Scanner;

public class Sum_of_even_odd {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int even=0,odd=0;
    int digit;
    while (n>0) {
        digit=n%10;
        if (digit%2==0) {
            even += digit;
        } else {
            odd += digit;
        }
        n=n/10;
       
    }
    
    System.out.println(even + " " + odd);
    sc.close();
   }
}
