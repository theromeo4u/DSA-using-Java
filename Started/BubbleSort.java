import java.util.*;
public class BubbleSort {
    public static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" Elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       for (int i = 0; i < n-1; i++) {
           for (int j = 0; j < n-i-1; j++) {
               if (a[j] > a[j+1]) {
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
               }
           }
       }
       PrintArray(a);
       sc.close();
    }
    
    
}
