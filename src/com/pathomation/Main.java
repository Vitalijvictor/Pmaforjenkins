package com.pathomation;

public class Main {
    public static void main(String[] args) {
        String sessionId = Core.connect("https://devtest.pathomation.com/test/pma.core.2/", "vitalij", "PMI9GH9I");
        System.out.println(sessionId);
        Core.disconnect();
    }
}
