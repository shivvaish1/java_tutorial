import java.util.Scanner;

public class characterpattern {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch='A';
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
