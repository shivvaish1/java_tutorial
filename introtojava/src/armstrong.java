import java.util.*;
import java.lang.Math;
public class armstrong {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int digit = String.valueOf(a).length();
        int b, rem;
        double sum=0;
        b = a;
        for(;b!=0;){
            rem = b%10;
            sum += Math.pow(rem,digit);
            b=b/10;
        }
        scan.close();
        if (sum==a) {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
    }
}
