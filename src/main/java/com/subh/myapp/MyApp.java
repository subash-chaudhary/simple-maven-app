package com.subh.myapp;

public class MyApp{

    
    private final String message = "Hello World!!!";


    public MyApp() {}

    public static void main(String[] args) {
        System.out.println(new MyApp().getMessage());
    }


    private final String getMessage() {
        return message;
    }
}