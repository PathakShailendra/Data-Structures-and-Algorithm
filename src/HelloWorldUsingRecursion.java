public class HelloWorldUsingRecursion {
    // print hello world n times
    public static void printHello(int n){
        if(n == 0){
            return;
        }
        printHello(n-1);
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        printHello(5);
    }
}
