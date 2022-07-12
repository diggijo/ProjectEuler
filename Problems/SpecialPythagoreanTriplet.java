package Problems;

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        for(a=1; a < b; a++)
        {
            for(b=2; b < c; b++)
            {
                for(c=3; c<500; c++)
                {
                    if((a*a) + (b*b) == (c*c) && a < b && b < c && (a + b + c) == 1000)
                    {
                        System.out.println("The 3 numbers are:" +
                                "\nA = " + a +
                                "\nB = " + b +
                                "\nC = " + c +
                                "\n\nThe product of these numbers is: " + (a*b*c));
                    }
                }
            }
        }
    }
}
