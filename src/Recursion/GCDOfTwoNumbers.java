package Recursion;

public class GCDOfTwoNumbers {
    // GCD of two numbers using Recursion
    // time complexity O(min(a,b))

    public static int GCD(int a, int b){
        if(a == b)
            return a;
        if(a > b)return GCD(a-b,b);
        else return GCD(a, b-a);
    }

    public static void main(String[] args) {
        System.out.println(GCD(18,14));
        // Output : 2
    }
}
