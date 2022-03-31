// Java implementation of the approach
class palindrome2
{
    
    // Function to return the
    // reverse of num
    static int reverse(int num)
    {
        int rev = 0;
        while (num > 0)
        {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
    
    // Function that returns true
    // if num is palindrome
    static boolean isPalindrome(int num)
    {
    
        // If the number is equal to the
        // reverse of it then it
        // is a palindrome
        if (num == reverse(num))
            return true;
    
        return false;
    }
    
    // Function to print all the
    // d-digit palindrome numbers
    static void printPalindromes(int d)
    {
        if (d <= 0)
            return;
    
        // Smallest and the largest d-digit numbers
        int smallest = (int)Math.pow(10, d - 1);
        int largest = (int)Math.pow(10, d) - 1;
    
        // Starting from the smallest d-digit
        // number till the largest
        for (int i = smallest; i <= largest; i++)
        {

            // If the current number
            // is palindrome
            if (isPalindrome(i))
                System.out.print(i + " ");
        }
    }
    
    // Driver code
    public static void main (String[] args)
    {
        int d = 42;
    
        printPalindromes(d);
    }
}
