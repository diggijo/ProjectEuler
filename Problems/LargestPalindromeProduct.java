package Problems;

// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

import java.util.ArrayList;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int maxNumber = 1000;
        int result = 0;
        int largestPalindrome = 0;

        for(int i = 0; i<=maxNumber; i++)
        {
            for (int j=0; j<=maxNumber; j++)
            {
                result = i*j;

                if(isPalindrome(result))
                {
                    if(result > largestPalindrome)
                    {
                        largestPalindrome = result;
                    }
                }
            }
        }

        System.out.println("\nThe largest palindrome made from the product of two 3-digit numbers is: " + largestPalindrome);
    }

    private static boolean isPalindrome(int i)
    {
        String s = String.valueOf(i);

        if(s.length()==2)
        {
            if(s.charAt(0)==s.charAt(1))
            {
                return true;
            }
        }

        else if(s.length()==3)
        {
            if(s.charAt(0)==s.charAt(2))
            {
                return true;
            }
        }

        else if(s.length()==4)
        {
            if(s.charAt(0)==s.charAt(3) && s.charAt(1)==s.charAt(2))
            {
                return true;
            }
        }

        else if(s.length()==5)
        {
            if(s.charAt(0)==s.charAt(4) && s.charAt(1)==s.charAt(3))
            {
                return true;
            }
        }

        else if(s.length()==6)
        {
            if(s.charAt(0)==s.charAt(5) && s.charAt(1)==s.charAt(4) && s.charAt(2)==s.charAt(3))
            {
                return true;
            }
        }

        return false;
    }
}
