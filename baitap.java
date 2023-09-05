import java.util.*;

class baitap1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("xin moi ban nhap 3 canh tam giac :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ( a*a == b*b + c*c || b*b == c*c + a*a || c*c == b*b + a*a){
                System.out.println("Ba canh nay hop thanh tam giac vuong");
            }
            else {
                System.out.println("3 canh nay hop thanh 1 tam vuong");
            }
        }
    }
}

class baitap2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("xin moi ban nhap so luong phan tu :");
            int n = sc.nextInt();
            double sum = 0;
            int []arr = new int[n];
            System.out.println("Nhap cac phan tu cua mang :");
            for (int i = 0; i < n ; i++){
                arr[i]= sc.nextInt();
            }
            for (int i = 0; i < n; i++){
                sum+= arr[i];
            }
            double tb =  sum/n;
            System.out.print("ket qua tb cua mang :" + tb);
        }
    }
}

class baitap3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("xin moi ban nhap gia tri a va b :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            while (a != b) {
                if (a > b) {
                    a = a - b;
                }
                else {
                    b = b - a;
                }
            }
            System.out.println("Uoc chung lon nhat cua a va b : " + a);
        }
    }
}

class baitap4 {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("xin moi ban nhap gia tri c va d :");
            int c = sc.nextInt();
            int d = sc.nextInt();
            int max = 0;
            if (c > d) {
                max = c;
            }
            else {
                max = d;
            }
            for (int i = max; i <= c*d; i++) {
                if (i % c == 0 && i % d == 0) {
                    System.out.println("Boi chung nho nhat : " + i);
                }
            }
        }
    }
}

class baitap5 {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int f0 = 1, f1 = 1, fn = 1;
            int n = sc.nextInt();
            while (n > 20) {
                System.out.println("ban hay nhap lai !");
                n = sc.nextInt();
            }
            if (n == 0) {
                System.out.println("So fibo bang : " + 1);
            }
            else if (n == 1) {
                System.out.println("So fibo bang : " + 1);
            }
            else {
                for (int i = 2; i <= n; i++) {
                    fn = f0 + f1;
                    f1 = f0;
                    f0 = fn;
                }
            }
            System.out.println("So fibo thu " + n + " bang : " + fn);
        }
    }
}


