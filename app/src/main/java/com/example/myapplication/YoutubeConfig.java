package com.example.myapplication;

public class YoutubeConfig {

    public YoutubeConfig(){

    }

    // API_KEY = AIzaSyBk8ULPxAAQvXfU9Gc2qpMwySl-5-HVZu0
    private static final String API_KEY = "AIzaSyBk8ULPxAAQvXfU9Gc2qpMwySl-5-HVZu0";

    public static String getApiKey(){ // because API_KEY is private
        return API_KEY;
    }
}
