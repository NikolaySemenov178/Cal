package com.company;

public class RomaConvertArab {
    int romToArab(String romans) {
        try {
            if (romans.equalsIgnoreCase("I")) {
                return 1;
            }
            if (romans.equalsIgnoreCase("II")) {
                return 2;
            }
            if (romans.equalsIgnoreCase("III")) {
                return 3;
            }
            if (romans.equalsIgnoreCase("IV")) {
                return 4;
            }
            if (romans.equalsIgnoreCase("V")) {
                return 5;
            }
            if (romans.equalsIgnoreCase("VI")) {
                return 6;
            }
            if (romans.equalsIgnoreCase("VII")) {
                return 7;
            }
            if (romans.equalsIgnoreCase("VIII")) {
                return 8;
            }
            if (romans.equalsIgnoreCase("IX")) {
                return 9;
            }
            if (romans.equalsIgnoreCase("X")) {
                return 10;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}

