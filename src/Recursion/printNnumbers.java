package Recursion;

public class printNnumbers {
    // Recursion
    public  static void fn(int n){
        if(n == 1)return;
        System.out.println(n);
        fn(n-1);
    }

    public static void main(String[] args) {
        fn(5);
    }
}

