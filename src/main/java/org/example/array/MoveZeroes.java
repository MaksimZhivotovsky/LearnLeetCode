package org.example.array;

/*
Дан целочисленный массив nums. Переместите все 0 в конец массива, сохранив относительный
порядок ненулевых элементов.

Обратите внимание, что вы должны сделать это на месте, не создавая копию массива.

Пример 1:

Ввод: nums = [0, 1, 0, 3, 12]
Вывод: [1, 3, 12, 0, 0]
Пример 2:

Ввод: nums = [0]
Вывод: [0]


Ограничения:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] mass = {0, 1, 0, 3, 12};
        moveZeroes(mass);
        System.out.println(Arrays.toString(mass));
    }

    public static void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }

            j++;
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}
