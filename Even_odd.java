import java.util.*;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Even or Odd: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println(n +" is Even numbar");
        }
        else{
            System.out.println(n +" is Odd numbar");

        }
        sc.close();
    }

}
