package org.example.string;

/*
Напишите функцию, которая меняет местами символы в строке. Входные данные представлены
в виде массива символов s.

Вы должны сделать это, изменив входной массив на месте с помощью O(1) дополнительной памяти.

Пример 1:

Ввод: s = ["h","e","l","l","o"]
Вывод: ["o","l","l","e","h"]
Пример 2:

Ввод: s = ["H", "a", "n", "n", "a", "h"]
Вывод: ["h", "a", "n", "n", "a", "H"]


Ограничения:

1 <= s.length <= 105
s[i] является печатным символом ascii.
 */

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] mass = {'h','e','l','l','o'};

        reverseString(mass);
        System.out.println(Arrays.toString(mass));
    }
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char index = s[i];
            s[i] = s[(s.length-1) - i];
            s[(s.length-1) - i] = index;
        }
    }
}
