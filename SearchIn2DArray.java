import java.util.*;
public class SearchIn2DArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows of Array: ");
        int rows = sc.nextInt();
        System.out.print("Enter Cols of Array: ");
        int cols = sc.nextInt();
        int number[][] = new int[rows][cols];
        sc.close();
        System.out.print("Enter Elements of Array: ");
        for (int i = 0; i < rows; i++) {
            for(int j =0; j < cols;j++){
                number[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Elements to Search: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (number[i][j]==x) {
                    System.out.println(x+" is Found at location ("+i+","+j+")");
                    return;
                }
            }
            
        }
        System.out.println(x+" is not Found ");

            
    }
}