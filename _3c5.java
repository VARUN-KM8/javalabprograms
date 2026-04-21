// Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()

package first;

public class _3c5 {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty())
            return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Java is very powerful"));
    }
}