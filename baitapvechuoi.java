import java.util.*;

class baitapchuoi1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int dem = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != 0) {
                    dem++;
                }
            }
            System.out.println("So luong ki tu cua chuoi : " + dem);
        }
    }
}

class baitapchuoi2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            System.out.println("Chuoi sau bien doi :");
            System.out.println(s.toUpperCase());
            System.out.println(s.toLowerCase());
            char [] s1 = s.toCharArray();
            for (int i = 0; i < s1.length; i++) {
                if (i == 0) {
                    s1[i]-=32;
                }
                else if (s1[i] == ' ') {
                    s1[i+1]-=32;
                }
            }
            s = String.valueOf(s1);
            System.out.println(s);
        }
    }
}

class baitapchuoi3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            char c = sc.next().charAt(0);
            int dem = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    dem++;
                }
            }
            if (dem != 0) {
                System.out.println("So luong ki tu " + 'c' + "trong chuoi : " + dem);
            }
            else {
                System.out.println("Khong co ki tu do trong chuoi ");
            }
        }
    }
}

class baitapchuoi4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println("So luong khoang trang : " + count);
            System.out.println("Xoa bo khoang trang : " + s.trim());
            System.out.println("Nhap them 2 chuoi moi : ");
            String s1 = sc.next();
            String s2 = sc.next();
            String S1 = s1.concat(s2);
            System.out.println("Sau khi noi : " + S1);
        }
    }
}