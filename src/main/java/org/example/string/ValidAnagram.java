package org.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Даны две строки s и t, верните true если t является анаграммой s, и false в противном случае.

Пример 1:

Ввод: s = "anagram", t = "angaram"

Вывод: true

Пример 2:

Ввод: s = "rat", t = "car"

Вывод: false

Ограничения:

1 <= s.length, t.length <= 5 * 104
s и t состоят из строчных английских букв.
 */
public class ValidAnagram {

    public static void main(String[] args) {

//        String s = "anagram", t = "nagaram";
//        String s = "rat", t = "car";
//        String s = "a", t = "ab";
        String s = "aacc", t = "ccac";
//        String s = "ab", t = "ba";

        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        List<String> mass = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            mass.add(String.valueOf(chars[i]));
        }

        char[] chars1 = t.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            if (!mass.contains(String.valueOf(chars1[i]))) {
                return false;
            } else {
                mass.remove(String.valueOf(chars1[i]));
            }
        }
        return true;
    }

//    public boolean isAnagram(String s, String t) {
//        char[] sc = s.toCharArray();
//        char[] tc = t.toCharArray();
//        Arrays.sort(sc);
//        Arrays.sort(tc);
//        return new String(sc).equals(new String(tc));
//    }
}
