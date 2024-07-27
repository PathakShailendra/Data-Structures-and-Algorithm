package Recursion;

public class FactorialOfN {
    // Calculating factorial of a number using recursion
    public static int fact(int n){
        if(n <= 0){
            return 1;
        }
        return n * fact(n -1);
    }

    public static void main(String[] args) {
        System.out.println(fact(10));
    }
}
