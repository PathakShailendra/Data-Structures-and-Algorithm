package practiceSession;

import java.util.ArrayList;
import java.util.List;

public class BinaryStrings {
    public static List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        int totalCombinations = (int) Math.pow(2, n); // Total combinations = 2^n

        for (int i = 0; i < totalCombinations; i++) {
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            result.add(binaryString);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 3; // Example ke liye n = 3
        List<String> binaryStrings = generateBinaryStrings(n);

        System.out.println("Binary strings of length " + n + ":");
        
        for (String s : binaryStrings) {
            System.out.println(s);
        }
    }
}
