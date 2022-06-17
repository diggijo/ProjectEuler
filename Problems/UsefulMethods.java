package Problems;

public class UsefulMethods {
    public static boolean isPrime(long number)
    {
        if (number <= 1)
        {
            return false;
        }

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
