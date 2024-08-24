package Recursion;

public class subsequesces {
    public static void printAllSubsequesces(String str, int idx, String result){
        if(idx == str.length()){
            System.out.println(result);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        printAllSubsequesces(str, idx+1, result+currChar );
        // not to be
        printAllSubsequesces(str, idx+1, result);
    }
    public static void main(String[] args) {
        String str = "abc";
        printAllSubsequesces(str, 0, "");
    }
}
