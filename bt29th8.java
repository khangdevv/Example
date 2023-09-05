

class MyInteger {
    private static double a = 15;
    private static double b = 5;

    public static double add() {
        return a + b;
    }

    public static double subtract() {
        return a - b;
    }

    public static double multiply() {
        return a * b;
    }

    public static double devide() {
        return a / b;
    }
    
    public static double myCompare() {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("phep cong co ket qua : " + add());
        System.out.println("phep tru co ket qua : " + subtract());
        System.out.println("phep nhan co ket qua : " + multiply());
        System.out.println("phep chia co ket qua : " + devide());
        System.out.println("phep so sanh co ket qua : " + myCompare());

    }
}