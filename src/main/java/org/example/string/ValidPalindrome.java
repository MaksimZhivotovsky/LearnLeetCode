package org.example.string;

/*
Фраза является палиндромом, если после преобразования всех заглавных букв в строчные
и удаления всех небуквенных и нецифровых символов она читается одинаково как в прямом,
так и в обратном направлении. К буквенно-цифровым символам относятся буквы и цифры.

Учитывая строку s, верните true если она является палиндромом, или false иначе.



Пример 1:

Ввод: s = "A man, a plan, a canal: Panama"
Вывод: true
Объяснение: "amanaplanacanalpanama" — это палиндром.
Пример 2:

Ввод: s = "race a car"
Вывод: false
Объяснение: "raceacar" не является палиндромом.
Пример 3:

Ввод: s = " "
Вывод: true
Объяснение: s — это пустая строка "" после удаления небуквенных и нецифровых символов.
Поскольку пустая строка читается одинаково в прямом и обратном направлении, она является палиндромом.


Ограничения:

1 <= s.length <= 2 * 105
s состоит только из доступных для печати символов ASCII.
 */

public class ValidPalindrome {

    public static void main(String[] args) {

//        String s = "A man, a plan, a canal: Panama";
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        char [] mass = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase().toCharArray();

        for (int i = 0; i < mass.length / 2; i++) {
            if (mass[i] != mass[(mass.length-1) - i]) {
                return false;
            }
        }

        return true;
    }
}
