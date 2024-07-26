public class ReverseNumber {
    // reverse a number
    public static int reverse(int n, int rev){
        if(n <= 0)return rev;
        int temp = n % 10;
        rev = rev * 10 + temp;
        return reverse(n/10, rev);
    }
    public static void main(String[] args) {
        System.out.println(reverse(123 , 0));
    }
}
