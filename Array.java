import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter "+i+" Element: ");
            numbers[i] = sc.nextInt();
        }
        //Output
        System.out.println("Elements of the Arrays are: ");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]+" ");
        }
        sc.close();
    }
    
}
