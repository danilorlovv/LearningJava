package org.example;
import java.util.Scanner;
public class App 
{
    public final static char[] vowels = new char[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'Y', 'y'};
    public final static String morda = "|0_0|";
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        String startText = scan.nextLine();
        System.out.println("You entered this: " + startText);
        String textWithMorda = vowelsToMorda(startText);
        String textUpperToLower = upperToLower(startText);
        System.out.println("We got you this: " + textWithMorda);
        System.out.println("We got you this: " + textUpperToLower);
    }

    private static String upperToLower(String text) {
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

    private static String vowelsToMorda(String text) {
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