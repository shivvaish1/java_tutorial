import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float b = sc.nextFloat();
        sc.close(); // Close the scanner to prevent resource leak
        System.out.println(b +" " +n);
        System.out.println("Hello, World!");
    }
}
