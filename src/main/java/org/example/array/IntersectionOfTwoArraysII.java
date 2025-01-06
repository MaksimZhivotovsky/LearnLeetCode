package org.example.array;

/*
Даны два целочисленных массива nums1 и nums2. Верните массив их пересечений.
Каждый элемент в результате должен встречаться столько раз, сколько он встречается в обоих массивах,
и вы можете возвращать результат в любом порядке.

Пример 1:

Ввод: nums1 = [1,2,2,1], nums2 = [2,2]
Вывод: [2,2]
Пример 2:

Ввод: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Вывод: [4,9]
Объяснение: [9,4] тоже подходит.


Ограничения:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000


Последующие действия:

Что, если заданный массив уже отсортирован? Как бы вы оптимизировали свой алгоритм?
Что делать, если размер nums1 мал по сравнению с nums2 размером s? Какой алгоритм лучше?
Что, если элементы nums2 хранятся на диске, а память ограничена и вы не можете загрузить все
элементы в память одновременно?
 */

import java.util.*;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {

//        int[] mass1 = {4,9,5};
        int[] mass1 = {1,2,2,1};
//        int[] mass2 = {9,4,9,8,4};
        int[] mass2 = {2};

        System.out.println(Arrays.toString(intersect(mass1, mass2)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> mass = new ArrayList<>();

        for (int k : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (k == nums2[j]) {
                    mass.add(k);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] result = new int[mass.size()];
        for (int i = 0; i < mass.size(); i++) {
            result[i] = mass.get(i);
        }

        return  result;

    }
}
