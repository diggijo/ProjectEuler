package Solved;

import java.util.ArrayList;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        int divisors = 0;
        int largest = 0;
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        //Stuck in an infinite loop
        for(long i=1L; i<number; i++)
        {
            divisors = 0;

            if(number%i == 0)
            {

                for(long j=1L; j<=i; j++)
                {
                    if(i%j == 0)
                    {
                       divisors++;
                    }
                }

                if(divisors==2)
                {
                    System.out.println(i);
                    primeFactors.add((int) i);
                }
            }
        }
    }
}
