package bitManipulation;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;//0101
        System.out.println("Enter position");
        int position = sc.nextInt();
        System.out.println("Enter operation");
        int operation = sc.nextInt();
        int bitMask = 1 << position;
        if(operation == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
