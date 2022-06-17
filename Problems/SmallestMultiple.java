package Problems;

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20?

public class SmallestMultiple {
    public static void main(String[] args) {
        long number = 0;
        long range = 20;

        do
        {
            number+=2520;
        }while (!divisibleByAll(number, range));

        System.out.println("\nThe smallest positive number that is evenly divisible by all the numbers from 1 to 20 is: " + number);
    }

    public static boolean divisibleByAll(long number, long range)
    {
        int numberOfDivisors = 0;

        for(int i=1; i<=range; i++)
        {
            if(number % i == 0)
            {
                numberOfDivisors++;
            }
        }

        if(numberOfDivisors == range)
        {
            return true;
        }

        return false;
    }
}
