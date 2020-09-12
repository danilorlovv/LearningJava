package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        String morda = "|0_0|";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        String startText = scan.nextLine();
        System.out.println("You entered this: " + startText);
        String newText1 = "";
        String newText = "";
        for (int i=0; i < startText.length(); i++)
        {
            if (Character.isLetter(startText.charAt(i)))
            {
                if ((isVowel(startText.charAt(i))))
                    newText1 += morda;
                else
                    newText1 += startText.charAt(i); //1234142
            }
        }



        System.out.println("We got you this: " + newText1);
        for (int i=0; i < startText.length(); i++)
        {
            if (Character.isLetter(startText.charAt(i)))
            {
                if (Character.isLowerCase(startText.charAt(i)))
                    newText += Character.toUpperCase(startText.charAt(i));
                else
                    newText += Character.toLowerCase(startText.charAt(i));
            }
        }



        System.out.println("We got you this: " + newText);
    }
    public static char[] vowels = new char[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'Y', 'y'};
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