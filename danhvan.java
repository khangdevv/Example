import java.util.*;

class danhvan {
    public static int demso(int n) {
        int dem = 0;
        while (n != 0) {
                n = n / 10;
                dem++;
            }
        return dem;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String hang[] = {"le","muoi","tram","ngan","trieu"};
            String chuso[] = {"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
            int n = sc.nextInt();
            int sl = demso(n);
            switch (sl) {
                case 1 :
                    System.out.println(chuso[n]);
                    break;
                case 2 :
                    if (n < 20) {
                        System.out.println(hang[(n/10)%10] + " " + chuso[n%10]);
                    }
                    else {
                        System.out.println(chuso[(n/10)%10] + " muoi " + chuso[n%10]);
                    }
                    break;
                case 3 :
                    if (n == 100 || n == 200 || n == 300 || n == 400 || n == 500 || n == 600 || n == 700 || n == 800 || n == 900) {
                        System.out.println(chuso[(n/100)%10] + " tram");
                        break;
                    }
                    else if (n > 100 && n < 110) {
                        System.out.println(chuso[(n/100)%10] + " tram le " + chuso[n%10]);
                    }
                    else if (n >= 110 && n < 120) {
                        System.out.println(chuso[(n/100)%10] + " tram muoi " + chuso[n%10]);
                    }
                    else {
                        System.out.println(chuso[(n/100)%10] + " tram " + chuso[(n/10)%10] + " muoi " + chuso[n%10]);
                    }
                    break;
                case 4 :
                    if (n < 1020) {
                        System.out.println(chuso[(n/1000)%10] + " ngan khong tram " + hang[(n/10)%10] + " " + chuso[n%10]);
                    }
                    else if (n % 1000 == 100 || n % 1000 == 200 || n % 1000 == 300 || n % 1000 == 400 || n % 1000 == 500 || n % 1000 == 600 || n % 1000 == 700 || n % 1000 == 800 || n % 1000 == 900) {
                        System.out.println(chuso[(n/1000)%10] + " ngan " + chuso[(n/100)%10] + " tram ");
                    }
                    else if (n % 10 >= 20 && n % 10 < 100) {
                        System.out.println(chuso[(n/1000)%10] + " ngan khong tram " + chuso[(n/10)%10] + " muoi " + chuso[n%10]);
                    }
                    else if (n % 100 < 20) {
                        System.out.println(chuso[(n/1000)%10] + " ngan " + chuso[(n/100)%10] + " tram muoi " + chuso[n%10]);
                    }
                    else if (n % 10 % 10 == 0) {
                        System.out.println(chuso[(n/100)%10] + " ngan " + chuso[(n/100)%10] + " tram ");
                    }
                    else if (n % 1000 < 100 && n % 1000 > 10) {
                        System.out.println(chuso[(n/1000)%10] + " ngan " + chuso[(n/100)%10] + "khong tram " + chuso[(n/10)%10] + " muoi " + chuso[n%10]);
                    }
                    else if (n % 1000 >= 10 && n % 1000 < 20) {
                        System.out.println(chuso[(n/1000)%10] + " ngan " + chuso[(n/100)%10] + "khong tram muoi " + chuso[n%10]);
                    }
                    else {
                        System.out.println(chuso[(n/1000)%10] + " ngan " + chuso[(n/100)%10] + " tram " + chuso[(n/10)%10] + " muoi " + chuso[n%10]);
                    }
                }
            }
        }
    }
