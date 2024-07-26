package Recursion;

public class SumOfDigitOfNumber {
    // sum of digit of a number
    public static int sumDigit(int n){
        if(n <= 9)return n;
        return n % 10 + sumDigit(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(sumDigit(564));
    }
}
