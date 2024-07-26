package Math;

public class CountOfDigitOfNumber {
    // Math level 1
    // Count digits of a number
    // We can count digits of a number using a in built function in java instead of looping on a number till it becomes 0.
    // Here Math.log10(n) function returns an double value which is 1 less than the digits of a number so we first cast that number into int and then add 1 to count the actual digit count of a number

    public static void main(String[] args) {
        System.out.println((int)(Math.log10(2396)+1));
    }
}

