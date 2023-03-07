import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int bin[]= new int[100];
        int dec = sc.nextInt();
        while(dec != 0){
            bin[i]=dec%2;
            dec/=2;
            i++;
        }
        System.out.print("Binary value of "+dec+" is = ");
        for (int j = 0; j < i; j++) {
            System.out.print(bin[j]);
        }
        sc.close();
    }
    
}
