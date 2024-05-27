import java.util.*;

public class sumofeven_odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, c, i, odd=0, even=0;
        System.out.println("Enter Lowest Range Number:");
        a= scan.nextInt();
        System.out.println("Enter Highest Range Number:");
        c= scan.nextInt();
        for(i=a;i<=c;i++){
            if(i % 2 == 0){
                even += i;
            }
            else{
                odd += i;
            }
        }
        System.out.println(even+" "+odd);
    }
}
