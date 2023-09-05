import java.util.Scanner;

public class baitap4theode {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("nhap n : ");
            int [] arr;
            int j = 0;
            int [] b = new int[100];
            int n = sc.nextInt();
            while (n > 100 || n < 1) {
                System.out.println("Hay nhap lai : ");
                n = sc.nextInt();
            }
            arr = new int[n];
            nhap(arr, n);
            for (int i = 0; i < n; i++) {
                if (arr[i] % arr[j] == 0) {
                    b[arr[i]]++;
                }
                if (i != n - 1) {
                    continue;
                }
                else {
                    j++;
                }
            }
            int item = 0;
            for (int i = 0; i < n; i++) {
                if (item < b[arr[i]]) {
                    item = b[arr[i]];
                }
            }
            for (int i = 0; i < n; i++) {
                if (item == b[arr[i]]) {
                    System.out.println("phan tu do la : " + arr[i]);
                }
            }
        }
    }
    public static void nhap(int arr[], int n) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Nhap phan tu mang : ");
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
        }
    }
}
