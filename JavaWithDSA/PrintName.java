import java.util.*;
public class PrintName {
    public static void myName(String name){
        System.out.println("Your name is: "+name);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.next();
        myName(name);
        sc.close();   }
}
