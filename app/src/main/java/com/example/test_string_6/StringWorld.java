package com.example.test_string_6;

public class StringWorld {

    public String ReverseWorld(String worldHello) {
        StringBuffer strBuffer = new StringBuffer("Hello World");
        strBuffer.reverse();
        worldHello = strBuffer.toString();
        return worldHello;
    }

    public String SwapWorld(String worldHello) {

        String[] strings = worldHello.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]).append(" ");
        }
        return sb.toString().trim();
    }
}


