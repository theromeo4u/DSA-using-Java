import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int ans = (int)Math.pow(num,pow);
        System.out.println(ans);
        //int ans2=1;
       // while (pow>0) {
        //    ans2*=num;
        //    pow--;
        //}
        //System.out.println(ans2);
        sc.close();
    }
}
