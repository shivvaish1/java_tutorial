import java.util.Scanner;

public class binomial {
    public static int facto(int a){
        int i;int m=1;
        for(i=1;i<=a;i++){
            m *= i;
        }
        return m;
    }
    public static int bincoeff(int n, int r){
        int a = facto(n);
        int b = facto(r);
        int c = facto(n-r);
        int bc = a/(b*c);
        return bc;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bincoeff(n, r));
    }
}
