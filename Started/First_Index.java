import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int arr[]=new int[1000];
        boolean flag = false;
        System.out.print("Enter num of element: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter num to find: ");
        int find = sc.nextInt();
		for(int i=0;i<n;i++)
        {
            if(arr[i] == find){
                
                System.out.print(arr[i]);
                flag = true;
                break;
            }
            
                
        }
        if(flag == true){
            System.out.println("Element is present at ");
        }else{
            System.out.println("Element is not present");
        }
	
sc.close();
    }
}