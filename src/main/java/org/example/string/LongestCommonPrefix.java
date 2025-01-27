package org.example.string;

/*
Напишите функцию для поиска самого длинного общего префикса в массиве строк.

Если общего префикса нет, верните пустую строку "".



Пример 1:

Ввод: strs = ["flower","flow","flight"]
Вывод: "fl"
Пример 2:

Ввод: strs = ["dog","racecar","car"]
Вывод: ""
Объяснение: среди входных строк нет общего префикса.
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < Math.min(prefix.length(), strs[i].length())) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
