package org.example.array;

/*

Учитывая целочисленный массив nums, верните true если какое-либо значение встречается в массиве
 хотя бы дважды, и верните false если все элементы уникальны.

Пример 1:

Входные данные: числа = [1,2,3,1]

Вывод: верно

Объяснение:

Элемент 1 встречается с индексами 0 и 3.

Пример 2:

Входные данные: числа = [1,2,3,4]

Вывод: false

Объяснение:

Все элементы различны.

Пример 3:

Ввод: числа = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]

Вывод: верно

Ограничения:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

//        int[] mass = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] mass = {1,2,3,4};

        System.out.println(containsDuplicate(mass));

    }
    public static boolean containsDuplicate(int[] nums) {

        boolean result = false;
        Set<Integer> mass = new HashSet<>();

        for (Integer i : nums) {

            if (!mass.add(i)) {
                result = true;
                break;
            }
        }

        return result;
    }
}
