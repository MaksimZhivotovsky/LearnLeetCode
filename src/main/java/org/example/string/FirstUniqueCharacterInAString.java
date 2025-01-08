package org.example.string;

/*
Дана строка s. Найдите в ней первый неповторяющийся символ и верните его индекс.
Если его нет, верните -1.

Пример 1:

Ввод: s = "leetcode"

Результат: 0

Объяснение:

Символ 'l' с индексом 0 — это первый символ, который не встречается ни в одном другом индексе.

Пример 2:

Ввод: s = "loveleetcode"

Результат: 2

Пример 3:

Ввод: s = "aabb"

Результат: -1

Ограничения:

1 <= s.length <= 105
s состоит только из строчных английских букв.
 */
public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {

//        String s = "loveleetcode";
        String s = "aabb";

        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }
}
