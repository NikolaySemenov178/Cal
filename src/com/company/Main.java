package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите уравнение");
        Scanner example = new Scanner(System.in);
        String s = example.nextLine();
        String[] sym = s.split("\\s*(\\s| + | - | * | / )\\s*");
        String pos1 = sym[0];
        String pos2 = sym[2];
        int a = s.indexOf("+"); // до этого способа вытащить знак додумался раньше, чем до массива и решил оставить
        int b = s.indexOf("-");
        int c = s.indexOf("*");
        int d = s.indexOf("/");
        RomaConvertArab con = new RomaConvertArab();
        int ArabOfRom1 = con.romToArab(pos1);
        int ArabOfRom2 = con.romToArab(pos2);
        int ResultAoR = 0;
        if (ArabOfRom1 > 0 & ArabOfRom1 <= 10 & ArabOfRom2 > 0 & ArabOfRom2 <= 10) {

            if (a != -1) {
                ResultAoR = ArabOfRom1 + ArabOfRom2;
            } else if (b != -1) {
                ResultAoR = ArabOfRom1 - ArabOfRom2;
            } else if (c != -1) {
                ResultAoR = ArabOfRom1 * ArabOfRom2;
            } else if (d != -1) {
                ResultAoR = ArabOfRom1 / ArabOfRom2;
            } else {
                System.out.println("неверный математический символ");
            }

            if (ResultAoR > 0) {
                System.out.println(RomanNumber.values()[ResultAoR]);
            } else {
                System.out.println("в римской системе нет отрицательных чисел");
            }
        }

             else {
            int num1 = Integer.parseInt(pos1);
            int num2 = Integer.parseInt(pos2);

            if (num1 > 0 & num1 <= 10 & num2 > 0 & num2 <= 10) {
                if (a != -1) System.out.println(num1 + num2);
                else if (b != -1) {
                    System.out.println(num1 - num2);
                } else if (c != -1) {
                    System.out.println(num1 * num2);
                } else if (d != -1) {
                    System.out.println(num1 / num2);
                } else System.out.println("неверный математический символ");}
            else
                System.out.println("создатель этого кода доучился только до 3 класса,\n" +
                        " так что числа должны быть от 1 до 10");
        }
    }
}
