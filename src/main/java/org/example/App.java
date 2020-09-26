package org.example;
import org.example.chatutils.ChatBot;
import org.example.utils.AppConstants;
import org.example.utils.StringUtils;

import java.util.Scanner;
public class App 
{

    public static void main(String[] args )
    {
        String startText;
        Scanner scan = new Scanner(System.in);
        System.out.println(AppConstants.GREETINGS_TEXT);
        String readOption = scan.nextLine();
        switch (readOption) {
            case AppConstants.OPTION_1:
                System.out.println(AppConstants.OPTION_TEXT);
                startText = scan.nextLine();
                String textWithMorda = StringUtils.vowelsToMorda(startText);
                System.out.println(AppConstants.REPLY_TEXT + textWithMorda);
                break;
            case AppConstants.OPTION_2:
                System.out.println(AppConstants.OPTION_TEXT);
                startText = scan.nextLine();
                String textUpperToLower = StringUtils.upperToLower(startText);
                System.out.println(AppConstants.REPLY_TEXT + textUpperToLower);
                break;
            case AppConstants.OPTION_3:
                ChatBot chatBot = new ChatBot();
                System.out.println(AppConstants.START_CHAT);
                        while (true){
                            startText = scan.nextLine();
                            if (StringUtils.getAnswerFromChatBot(startText, chatBot)) break;
                        }
                        break;
            default:
                System.out.println(AppConstants.ERROR_TEXT);
        }
    }

}