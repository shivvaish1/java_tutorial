import java.util.*;

public class ffactorial {
    public static int fact(int a){
        int i=1;int m=1;
        while(i<=a){
            m *= i;
            i++; 
        }
        return m;
    }
    public static int facto(int a){
        int i;int m=1;
        for(i=1;i<=a;i++){
            m *= i;
        }
        return m;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int fa = facto(a);
        System.out.println(fa);
    }
}

