
public class Calculator {
    public double findAverage(double num1,double num2,double num3) {
         double avg = (double)(num1+num2+num3)/3;
         return avg;
        }
    
}
class Tester{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        double num1=12,num2=8,num3=15;
        double ans = cal.findAverage(num1,num2,num3);
        System.out.format("%.2f",ans);
        
    }
}
