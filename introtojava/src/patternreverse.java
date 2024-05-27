import java.util.*;

public class patternreverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=n;i!=0;i--){
            for(int s=1;s<=i;s++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}