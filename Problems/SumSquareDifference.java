package Problems;

// The sum of the squares of the first ten natural numbers is 385
// The square of the sum of the first ten natural numbers is 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640.
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class SumSquareDifference {
    public static void main(String[] args) {

        int sumOfSquares = 0;
        int squareofSums = 0;
        int result = 0;

        for(int i=1; i<=100; i++)
        {
            sumOfSquares += (i * i);
            squareofSums += i;
        }

        squareofSums *= squareofSums;

        result = squareofSums - sumOfSquares;

        System.out.println("\nThe difference between the sum of the squares of the first one +" +
                "hundred natural numbers and the square of the sum is: " + result);
    }
}
