package bitManipulation;

public class setBit {
    public static void main(String[] args) {
        int n = 5;//0101
        int position = 1;
        int bitMask = 1 << position;

        int newNumber = n | bitMask;
        System.out.println(newNumber);
    }
}
