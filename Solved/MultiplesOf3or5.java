package Solved;

import java.util.ArrayList;

public class MultiplesOf3or5 {
    public static void main(String[] args) {
        int max = 1000;
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        int totalSum = 0;

        for(int i = 1; i < max; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                multiples.add(i);
            }
        }

        for (Integer i: multiples)
        {
            totalSum += i;
        }

        System.out.println(totalSum);
    }
}
