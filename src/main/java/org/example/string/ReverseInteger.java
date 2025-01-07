package org.example.string;

/*
Учитывая 32-битное целое число со знаком x, верните его с переставленными цифрами.
Если при перестановке x значение выходит за пределы 32-битного целого числа со знаком
[-231, 231 - 1], верните 0.

Предположим, что среда не позволяет хранить 64-битные целые числа (со знаком или без знака).


Пример 1:

Ввод: x = 123
Вывод: 321
Пример 2:

Ввод: x = -123
Вывод: -321
Пример 3:

Ввод: x = 120
Вывод: 21


Ограничения:

-231 <= x <= 231 - 1
 */

import java.util.Arrays;

public class ReverseInteger {

    public static void main(String[] args) {

        int  x = -123;

        System.out.println(reverse(x));
    }

    public static int reverse(int x) {

        int result = 0;
        while(x != 0) {
            if(result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10) return 0;
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        return result;
    }
}
