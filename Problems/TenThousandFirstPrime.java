package Problems;

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10,001st prime number?

public class TenThousandFirstPrime {
    public static void main(String[] args) {
        long number = 1L;
        int numOfPrimes = 0;

        do{
            number += 2L;
            if(UsefulMethods.isPrime(number))
            {
                numOfPrimes++;
            }
        }while(numOfPrimes < 10000);

        System.out.println(number);
    }
}
