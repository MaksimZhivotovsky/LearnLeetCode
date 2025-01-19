package org.example.string;

/*
Для двух строк needle и haystack верните индекс первого вхождения needle в haystack или -1
если needle не является частью haystack.



Пример 1:

Входные данные: haystack = "sadbutsad", needle = "sad"
Выходные данные: 0
Объяснение: «sad» встречается по индексу 0 и 6.
 Первое вхождение находится по индексу 0, поэтому мы возвращаем 0.
Пример 2:

Входные данные: haystack = "leetcode", needle = "leeto"
Вывод: -1
Объяснение: «leeto» не встречается в «leetcode», поэтому мы возвращаем -1.


Ограничения:

1 <= haystack.length, needle.length <= 104
haystack и needle состоят только из строчных английских символов.
 */

public class ImplementStrStr {

    public static void main(String[] args) {

//        String haystack = "sadbutsad";
//        String needle = "sad";

        String haystack = "leetcode";
        String needle = "leeto";

//        String haystack = "mississippi";
//        String needle = "issip";

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {

        int result = -1;

        if (!haystack.contains(needle)) {
            return result;
        }

        result = haystack.indexOf(needle);

        return result;
    }
}
