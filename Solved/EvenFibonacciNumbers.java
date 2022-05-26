package Solved;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int a = 0, b = 1, c=0, max=10;
        int evenTotalSum = 0;

        do
        {
            c = a + b;
            if(c<4000000)
            {
                System.out.println(c);
                a = b;
                b = c;

                if(c%2 == 0)
                {
                    evenTotalSum += c;
                }
            }

        }while(c<4000000);

        System.out.println("The sum of the even-valued terms below four million is: " + evenTotalSum);
    }
}
