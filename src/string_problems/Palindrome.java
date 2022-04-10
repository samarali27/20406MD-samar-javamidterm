package string_problems;

public class Palindrome {

    /*
      A palindrome is a word that can be reversed, and still remain the same.
      Example: MOM, DAD, MADAM, RACECAR

      Create a method to check if any given String is a palindrome or not.
     */



    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }


    public static void main(String[] args) {
        // Input string
        String str = "mom";

        str = str.toLowerCase();
        if (isPalindrome(str))
            System.out.print("Yes");
        else

            // Not a palindrome
            System.out.print("No");
    }
}



