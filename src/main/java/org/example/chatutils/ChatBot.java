package org.example.chatutils;

import java.util.HashMap;
import java.util.Map;

import org.example.utils.AppConstants;
public class ChatBot {
    private Map<String, String> dataSet;

    public Map<String, String> getDataSet() {
        return dataSet;
    }

    public void setDataSet(Map<String, String> dataSet) {
        if (dataSet == null){
            System.out.println("Вы пытаетесь поместить пустое значение");
            return;
        }
        this.dataSet = dataSet;
    }

    public ChatBot (Map<String, String> inputSet){
        setDataSet(inputSet);
        System.out.println("Инициализация dataSet прошла успешно");
    }

    public ChatBot(){
        setDataSet(AppConstants.DEFAULT_CHAT_DATA_SET);
        System.out.println("Инициализация DEFAULT_CHAT_DATA_SET прошла успешно" );
    }

    public String getAnswer(String key) throws NoSuchFieldException {
        if (getDataSet().containsKey(key)){
            return getDataSet().get(key);
        }
        else{
            throw new NoSuchFieldException();
        }
    }
    //Конструктор - это, похожая на метод конструкция, которая может быть public и private, не должна ничего возвращать(return)




}
