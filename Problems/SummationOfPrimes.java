package Problems;

// Find the sum of all the primes below two million.

public class SummationOfPrimes {
    public static void main(String[] args) {
        long totalSum = 2;

        for(int i=3; i<2000000L; i+=2)
        {
            if(UsefulMethods.isPrime(i))
            {
                totalSum += i;
            }
        }

        System.out.println("The sum of all the primer numbers below two million is: " + totalSum);
    }
}
