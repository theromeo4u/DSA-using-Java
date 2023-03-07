import java.util.*;
public class SearchInArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int number[] = new int[size];
        sc.close();
        System.out.print("Enter Elements of Array: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.print("Enter Elements to Search: ");
        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (number[i]==n) {
                System.out.println(n+" is Found at location "+i);
                return;
            }
            
        }
        System.out.println(n+" is not Found ");

        }
}