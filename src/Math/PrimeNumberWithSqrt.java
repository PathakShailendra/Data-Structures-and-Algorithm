package Math;

import java.util.Scanner;
public class PrimeNumberWithSqrt {
    // prime number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n == 2 || n == 3)
            System.out.println(n + " is a prime number");
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                break;
            }
            if(i == (int)Math.sqrt(n) && n % i != 0){
                System.out.println(n + " is a prime number");
            }

        }
    }
}
