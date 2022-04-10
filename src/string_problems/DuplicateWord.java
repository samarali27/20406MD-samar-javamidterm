package string_problems;

import java.util.Objects;

public class DuplicateWord {

    private static java.lang.String String;

    public static void main(String[] args) {

        /*
         Write a java program to find duplicate words and the number of occurrences of those words in the given string.
            Also, find the average length of all the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;

        String  = String.toLowerCase();

        String[] words = String.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
                    if(count > 1 && words[i] != "0")
                        System.out.println(words[i]);
                }
            }
            }






