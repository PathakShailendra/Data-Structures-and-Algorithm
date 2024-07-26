package Math;

public class FactorsOfNumber2 {
    // Factor of a number without extra space
    // this code does not use any extra spaces and sorting technique hence
    // the performance increases

    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0) {
                if (i * i != n) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }
}
