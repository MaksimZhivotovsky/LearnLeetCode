package org.example.easy;

/*
*
*Учитывая целое число x, верните, true если x это
палиндром
в противном случае false, и .



Пример 1:

Ввод: x = 121
Вывод: true
Объяснение: 121 читается как 121 слева направо и справа налево.
Пример 2:

Ввод: x = -121
Вывод:false
Пояснение: Слева направо указано -121. Справа налево становится 121-. Следовательно, это не палиндром.
Пример 3:

Ввод: x = 10
Вывод: false
Объяснение: читается как 01 справа налево. Следовательно, это не палиндром.


Ограничения:

-231 <= x <= 231 - 1


Продолжение: Можете ли вы решить эту задачу, не преобразуя целое число в строку?
*
*/

public class Problem_9_PalindromeNumber {

    public static void main(String[] args) {

//        int x = 121;
        int x = 10;

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        boolean result = true;

        if (x < 0) {
            result = false;
            return result;
        }

        char[] mass = String.valueOf(x).toCharArray();

        for (int i = 0; i < (mass.length/2) ; i++) {
            if (mass[i] != mass[(mass.length-1) - i]) {
                result = false;
                return result;
            }
        }

        return result;
    }
}
