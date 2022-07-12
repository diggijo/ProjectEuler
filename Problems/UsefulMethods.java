package Problems;

public class UsefulMethods {
    public static boolean isPrime(long number)
    {
        int count = 0;
        long sqrt = (long)Math.sqrt(number);

        for(long i = 1; i <= sqrt; i++) {
            if(number % i == 0) {
                count++;
            }
            if(count > 1) {
                return false;
            }
        }
        return true;
    }
}
