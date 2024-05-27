import java.util.*;
public class halfpyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
