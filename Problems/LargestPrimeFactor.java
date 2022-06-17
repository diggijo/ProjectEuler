package Problems;

// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143?

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largestFactor = 1;
        long num = 1;

        while (num * num < number) {
            if (number % num == 0 && num > largestFactor)
            {
                if (UsefulMethods.isPrime(num))
                {
                    largestFactor = num;
                }
            }
            num++;
        }

        System.out.println("\nThe largest prime factor of the number 600851475143 is: " + largestFactor);
    }
}
