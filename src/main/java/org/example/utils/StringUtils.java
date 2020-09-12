package org.example.utils;

public class StringUtils {
    public final static char[] vowels = new char[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'Y', 'y'};
    public final static String morda = "|0_0|";

    public static String upperToLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i < text.length(); i++)
        {
            if (Character.isLetter(text.charAt(i)))
            {
                if (Character.isLowerCase(text.charAt(i)))
                    result.append(Character.toUpperCase(text.charAt(i)));
                else
                    result.append(Character.toLowerCase(text.charAt(i)));
            }
            else {
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }

    public static String vowelsToMorda(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++)
        {
            if (Character.isLetter(text.charAt(i)))
            {
                if ((isVowel(text.charAt(i))))
                    result.append(morda);
                else
                    result.append(text.charAt(i));
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
