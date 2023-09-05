class Rectangle {
    private double d;
    private double r;

    Rectangle () {
    }
    
    Rectangle (double d, double r) {
    }

    public double getDai () {
        return d;
    }

    public double getRong () {
        return r;
    }

    public void set (double d, double r) {
        if (r < d) {
            this.r = r;
            this.d = d;
        }
    }

    public double dienTich () {
        return d * r;
    }

    public double chuVi () {
        return (d + r) * 2;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.set(5, 2);
        System.out.println("Dien tich hcn : " + obj.dienTich());
        System.out.println("Chu vi hcn : " + obj.chuVi());
    }
}