import java.util.Scanner;
import java.lang.Math;

class baitaptheode1cau1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("xin moi ban nhap so luong phan tu :");
            int n = sc.nextInt();
            int arr[] = new int[n];
            int chan[] = new int[1000];
            int le[] = new int[1000];
            int demc = 0, saochepc = 0, saochepl = 0, deml = 0;
            System.out.println("Xin moi ban nhap cac phan tu ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    chan[saochepc] = arr[i];
                    saochepc++;
                    demc++;
                }
                else {
                    le[saochepl] = arr[i];
                    saochepl++;
                    deml++;
                }
            }
            for (int i = 0; i < demc - 1; i++) {
                for (int j = i + 1; j < demc; j++) {
                    if (chan[j] < chan[i]) {
                        int temp = chan[i];
                        chan[i] = chan[j];
                        chan[j] = temp;
                    }
                }
            }
            for (int i = 0; i < deml - 1; i++) {
                for (int j = i + 1; j < deml; j++) {
                    if (le[j] < le[i]) {
                        int temp = le[i];
                        le[i] = le[j];
                        le[j] = temp;
                    }
                }
            }
            for (int i = 0; i < demc; i++) {
                System.out.print(chan[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < deml; i++) {
                System.out.print(le[i] + " ");
            }
        }
    }
}

class baitaptheode1cau2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("xin moi ban nhap so thuc n :");
            float n = sc.nextFloat();
            int dem = 0;
            double tuso = 1, mauso = 1, a, b;
            while (n != (int) n) {
                n *= 10;
                dem++;
            }
            tuso = n;
            mauso = Math.pow(10,dem);
            a = tuso;
            b = mauso;
            while (a != b) {
                if (a > b) {
                    a = a - b;
                }
                else {
                    b = b - a;
                }
            }
            System.out.println("Phan so tuong ung : " + (int) (tuso/a) + " / " + (int) (mauso/a));
        }
    }
}

class baitaptheode1cau3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int dai = 0, count = 0;
            String mso[] = {"096","097","098"};
            String mmso[] = {"0162","0163","0164","0165","0166","0167","0168","0169"};
            String s = "";
            System.out.println("xin moi ban nhap day so : ");
            do {
                String n = sc.next();
                dai = n.length();
                if (dai > 11 || dai < 10) {
                    System.out.println("So ban da nhap khong thuoc nha mang viettel ");
                    System.out.println("Ban hay nhap so khac : ");
                    n = sc.next();
                }
                else {
                    if (dai == 10) {
                        for (int i = 0; i < 3; i++) {
                            s += n.charAt(i);
                        }
                        for (int i = 0; i < 3; i++) {
                            if (s.equals(mso[i])) {
                                System.out.println("So nay thuoc nha mang viettel 10 so ");
                                count++;
                            }
                        }
                        if (count == 0) {
                            System.out.println("So nay khong thuoc nha mang viettel ");
                        }
                    }
                    else {
                        for (int i = 0; i < 4; i++) {
                            s += n.charAt(i);
                        }
                        for (int i = 0; i < 8; i++) {
                            if (s.equals(mmso[i])) {
                                System.out.println("So nay thuoc nha mang viettel 11 so ");
                                count++;
                            }
                        }
                        if (count == 0) {
                            System.out.println("So nay khong thuoc nha mang viettel ");
                        }
                    }
                }
            }
            while (dai > 11 || dai < 10);
        }
    }
}
