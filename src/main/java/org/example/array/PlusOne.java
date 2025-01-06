package org.example.array;

/*
Вам дано большое целое число, представленное в виде массива целых чисел digits,
где каждое digits[i] является ith цифрой целого числа.
Цифры упорядочены от старшей к младшей слева направо. Большое целое число не содержит ведущих 0's.

Увеличьте большое целое число на единицу и верните полученный массив цифр.



Пример 1:

Ввод: цифры = [1,2,3]
Вывод: [1,2,4]
Объяснение: Массив представляет собой целое число 123.
 Прибавление единицы дает 123 + 1 = 124.
 Таким образом, результатом должно быть [1,2,4].
Пример 2:

Ввод: digits = [4,3,2,1]
Вывод: [4,3,2,2]
Объяснение: Массив представляет собой целое число 4321.
 Прибавление единицы дает 4321 + 1 = 4322.
 Таким образом, результатом должно быть [4,3,2,2].
Пример 3:

Ввод: цифры = [9]
Вывод: [1,0]
Объяснение: Массив представляет собой целое число 9.
 Прибавление единицы дает 9 + 1 = 10.
 Таким образом, результатом должно быть [1,0].
 */

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

//        int[] mass = {1,2,3};
//        int[] mass = {1,2,9};
        int[] mass = {9,9};

        System.out.println(Arrays.toString(plusOne(mass)));
    }

    public static int[] plusOne(int[] digits) {

        if(digits == null || digits.length == 0)
            return new int[0];

        int carry = 1;
        for(int i = digits.length-1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if(sum >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            digits[i] = sum % 10;
        }

        if(carry == 1) {
            int[] result = new int[digits.length+1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = 1;
            return result;
        }else{
            return digits;
        }
    }
}
