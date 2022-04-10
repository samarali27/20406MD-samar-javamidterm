package string_problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program, `isAnagram`, to check if any two strings are anagrams

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
    original letters exactly once.

        Ex: "CAT" & "ACT",
            "ARMY" & "MARY",
            "FART" & "RAFT"
    */

    //Implement Here
          public static void main(String[] args){
              String str1 = "CAT";
              String str2 = "ACT";
              System.out.println("poth string are Anagram : " + AnagramCheck("CAT","CAT") );

          }
          public static boolean AnagramCheck(String str1, String str2){
              char[] charArrayString1 = str1.toCharArray();
              char[] charArrayString2 = str2.toCharArray();
              Arrays.sort(charArrayString1);
              Arrays.sort(charArrayString2);
              return Arrays.equals(charArrayString1,charArrayString2);
          }
}
