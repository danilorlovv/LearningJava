package org.example.utils;

import java.util.HashMap;
import java.util.Map;

public class AppConstants {
    public static final String GREETINGS_TEXT = "Здравствуй, я могу:\n" +
            "1) Заменить гласные буквы на морду;\n" +
            "2) A --> a\n" +
            "3) Чат с ботом\n" +
            "Что выбираете?\n";
    public static final String OPTION_TEXT = "Введите текст: ";
    public static final String REPLY_TEXT = "Получилось это: ";
    public static final String ERROR_TEXT = "Введена неправильная опция!\n" +
            "Выберете 1 или 2\n";
    public static final String OPTION_1 = "1";
    public static final String OPTION_2 = "2";

    public static final Map<String, String> DEFAULT_CHAT_DATA_SET = new HashMap<String, String>() {
        {
            put("one", "one");
            put("two", "two");
        }
    };
    public static final String IM_SORRY_TEXT = "Простите, я не знаю, что ответить! Попробуйте ещё раз.";
    public static final String OPTION_3 = "3";
    public static final String GOODBYE_TEXT = "";
    public static final String START_CHAT = "Теперь вы можете начинать общение. Напишите что-нибудь:";
}
