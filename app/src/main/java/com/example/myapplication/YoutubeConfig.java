package com.example.myapplication;

public class YoutubeConfig {

    public YoutubeConfig(){

    }

    private static final String API_KEY = "";

    public static String getApiKey(){ // because API_KEY is private
        return API_KEY;
    }
}
