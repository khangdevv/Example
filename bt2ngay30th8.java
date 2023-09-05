import java.lang.Math;

class phuongTrinhBachai {
    private double a;
    private double b;
    private double c;

    phuongTrinhBachai () {
    }

    phuongTrinhBachai (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setHpt(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double denlta() {
        return b * b - 4 *a * c;
    }

    public void nghiem() {
        double d = denlta();
        if (d < 0) {
            System.out.println("Phuong trinh vo nghiem .");
        }
        else if (d == 0) {
            System.out.println("Phuong trinh co nghiem kep : x1 = x2 = " + (- b / (2 * a)));
        }
        else {
            System.out.println("Phuong trinh 2 nghiem : ");
            System.out.println("x1 = " + ((- b + Math.sqrt(d)) / (2 * a)));
            System.out.println("x2 = " + ((- b - Math.sqrt(d)) / (2 * a)));
        }
    }   
}

class test {
    public static void main(String[] args) {
        phuongTrinhBachai obj = new phuongTrinhBachai();
        obj.setHpt(1,-3,2);
        System.out.println("Denlta : " + obj.denlta());
        System.out.println("ket qua cua phuong trinh : ");
        obj.nghiem();
    }
}
