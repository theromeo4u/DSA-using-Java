import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter your Email ID: ");
        String email = sc.next();
        String userName = "";      
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println("Your Username is: "+userName);sc.close();
    }
}

