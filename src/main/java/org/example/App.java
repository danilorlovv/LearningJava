package org.example;
import org.example.utils.StringUtils;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        String startText = scan.nextLine();
        System.out.println("You entered this: " + startText);
        String textWithMorda = StringUtils.vowelsToMorda(startText);
        String textUpperToLower = StringUtils.upperToLower(startText);
        System.out.println("We got you this: " + textWithMorda);
        System.out.println("We got you this: " + textUpperToLower);
    }

}