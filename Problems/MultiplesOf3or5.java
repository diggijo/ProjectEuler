package Problems;

import java.util.ArrayList;

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

public class MultiplesOf3or5 {
    public static void main(String[] args) {
        int max = 1000;
        int totalSum = 0;

        for(int i = 1; i < max; i++)
        {
            if(multipleOf3or5(i))
            {
                totalSum += i;
            }
        }

        System.out.println("\nThe sum of all the multiples of 3 or 5 below 1000 is: " + totalSum);
    }

    private static boolean multipleOf3or5(int i)
    {
        if(i % 3 == 0 || i % 5 == 0)
            return true;

        return false;
    }
}
