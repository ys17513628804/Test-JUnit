package com.example.demo.unit;

public class MessageUtil {

    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
