package Recursion;

public class PrintnTo1 {
    // print n - 1
    public static void printN(int n){
        if(n == 0)return;
        System.out.println(n);
        printN(n - 1);
    }
    public static void main(String[] args) {
        printN(5);
    }
}
