import java.util.Scanner;

class sodoku {
    public static void Insodoku(int maxtrix[][]) {
        for (int i = 0; i < dong; i++) {
            if (i != 0 && i % 3 == 0 && i != dong) {
                System.out.println("- - - - - - - - - -");
            }
            for (int j = 0; j < cot; j++) {
                if (j % 3 == 0 && j != 0 && j != cot) {
                    System.out.print("| " + maxtrix[i][j] + " ");
                }
                else {
                    System.out.print(maxtrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static int Tim(int maxtrix[][]) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; i < cot; j++) {
                if (maxtrix[i][j] == 0) {
                    return 0;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int matrix [][] = {
                {7,8,0,4,0,0,1,2,0},
                {6,0,0,0,7,5,0,0,9},
                {0,0,0,6,0,1,0,7,8},
                {0,0,7,0,4,0,2,6,0},
                {0,0,1,0,5,0,9,3,0},
                {9,0,4,0,6,0,0,0,5},
                {0,7,0,3,0,0,0,1,2},
                {1,2,0,0,0,7,4,0,0},
                {0,4,9,2,0,6,0,0,7},
            };
            Insodoku(matrix);

        }
    }
    public static final int dong = 9;
    public static final int cot = 9;
}
