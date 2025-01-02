package org.example.easy;

/*

Напишите функцию для поиска самого длинного общего префикса в массиве строк.

Если общего префикса нет, верните пустую строку "".



Пример 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Пример 2:
Input: strs = ["dog","racecar","car"]
Output: ""

Объяснение: Здесь нет общего префикса для входных строк.


Ограничения:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] состоит только из строчных английских букв.

 */

import java.util.*;

public class Problem_14_LongestCommonPrefix {

    public static void main(String[] args) {

        String [] strs = new String[] {"flower","flow","flight"};
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
