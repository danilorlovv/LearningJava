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
        String newText = "";
        for (int i=0; i < startText.length(); i++)
        {
            if (Character.isLetter(startText.charAt(i)))
            {
                if ((isVowel(startText.charAt(i))))
                    newText += morda;
                else
                    newText += startText.charAt(i);
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