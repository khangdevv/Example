import java.util.Scanner;
import java.lang.Math;

public class de2cau2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("xin moi ban nhap so :");
            int n = sc.nextInt();
            int so = 1, a = 10;
            for (int i = 1; i < n; i++) {
                so += a;
                a *= 10;
            }
            System.out.println("Dap so : " +(int) Math.pow(so,2));
        }
    }
}
