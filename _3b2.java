// Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()

package first;

public class _3b2 {
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("hello hello hello", "hello"));
    }
}