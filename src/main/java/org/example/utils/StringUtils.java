package org.example.utils;

import org.example.chatutils.ChatBot;

import java.util.Map;
import java.util.Scanner;

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

    public static boolean getAnswerFromChatBot(String startText, ChatBot chatBot) {
        if (startText.equals(AppConstants.GOODBYE_TEXT)){
            return true;
        }
        else{
            try{
                System.out.println(chatBot.getAnswer(startText));
            }
            catch (NoSuchFieldException e){
                System.out.println(AppConstants.IM_SORRY_TEXT);
            }
        }
        return false;
    }

    public static void SpeakingWithBot(Scanner scan, ChatBot chatBotLearn) {
        String startText;
        while (true) {
            startText = scan.nextLine();
            if (getAnswerFromChatBot(startText, chatBotLearn)) break;
        }
    }

    public static void QuestionsAndAnswers(Scanner scan, Map<String, String> dataSet) {
        String forLearnQuestion;
        String forLearnAnswer;
        while (true){
            System.out.println("Введите вопрос: ");
            forLearnQuestion = scan.nextLine();
            if (forLearnQuestion.equals("")){
                break;
            }
            System.out.println("Введите ответ: ");
            forLearnAnswer = scan.nextLine();
            if (forLearnAnswer.equals("")){
                break;
            }
            dataSet.put(forLearnQuestion, forLearnAnswer);
        }
    }
}
