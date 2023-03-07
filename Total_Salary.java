import java.util.*;
//import java.math.*;

public class Total_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextInt();
        String str = sc.next();
        char c = str.charAt(0);
        double hra,da,pf;
        int allow;
        hra = basic*20/100;
        da = basic*50/100;
        pf = basic*11/100;
        if(c=='A'){
            allow = 1700;
        }else if(c=='B'){
            allow = 1500;
        }else if (c == 'C'){
            allow = 1300;
        }else{
            allow = 1300;
        }
        double Salary = (basic + hra + da + allow - pf);
        System.out.println(Math.round(Salary));
        sc.close();
    }
    
}