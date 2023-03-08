import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Choose 1 to continue \nChoose 0 to stop: ");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter your marks obtain: ");
                int mark = sc.nextInt();
                if (mark >= 90) {
                    System.out.println("This is Good");
                } else if (mark <= 89 && mark >= 60) {
                    System.out.println("This is also Good");
                } else if (mark > 0 && mark <= 59) {
                    System.out.println("This is Good as well");
                }   
            }
        } while (n != 0);
        sc.close();
    }
}