import java.util.*;
public class Greetings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1-3: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
            System.out.println("Hello");               
                break;
            case 2:
            System.out.println("Namaste");
                break;
            case 3:
            System.out.println("Bonjour");
                break;
            default:
                System.out.println("Enter valid number");
                break;
        }sc.close();
    }
}
