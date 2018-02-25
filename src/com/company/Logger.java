package com.company;

public class Logger {

    private Logger(){
    }

    public static void logJsonChanged(){
        System.out.println("Не получилось обработать узел json дерева. Структура json у randomuser.me изменилась или другая причина");
    }
}
