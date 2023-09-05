import java.util.Scanner;
import java.lang.Math;

public class de2cau1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("xin moi ban nhap so luong phan tu :");
            int n = sc.nextInt();
            int arr[];
            arr = new int[1000];
            nhap(arr, n);
            sapxep(arr,n);
            System.out.println("Dap so con thieu la : " + timso(arr, n));
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
    public static int timso(int arr[], int n) {
        int d = 0;
        d = arr[1] - arr[0];
        if (d > arr[2] - arr[1]) {
            d = arr[2] - arr[1];
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] != d) {
                return Math.max(arr[i],arr[i-1]) + d;
            }
        }
        return arr[arr.length-1] + d;
    }
    public static void sapxep(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
