package practicum;

import javax.swing.border.StrokeBorder;

public class Palindrome {
    public static boolean isPalindromeLine(String str) {
        String str1 = str.replaceAll("\\s","").toLowerCase();
        System.out.println(str1);
        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb.reverse());
        return sb.reverse().toString().equals(str1);
    }


    public static void main(String[] args) {
        String str = "казак";
        String str2 = "Молебен о коне белом";

        System.out.println(isPalindromeLine(str));
        System.out.println(isPalindromeLine(str2));
    }
}
