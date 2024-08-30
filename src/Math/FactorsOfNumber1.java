package Math;

import java.util.ArrayList;
import java.util.Collections;

public class FactorsOfNumber1 {
    // Factors of a number
    // This code improves the performance, in which a linear loop for calculating factors
    // can be converted into the sqrt of n;

    public static void main(String[] args) {
        int n = 12;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);
                if(i*i != n)
                    list.add(n/i);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
