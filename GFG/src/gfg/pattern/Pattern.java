package gfg.pattern;

public class Pattern {
    public static void main(String[] args) {
        new PrintPattern().printPattern(4);
    }
}

class PrintPattern {
    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                for (int k = 1; k <= 1; k++) {
                    System.out.print(j);
                    System.out.print(" ");
                    if (j==1 && k==1) {
                        System.out.print("$");
                    }
                }
            }
        }
    }
}

