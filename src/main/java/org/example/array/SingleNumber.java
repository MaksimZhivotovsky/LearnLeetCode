package org.example.array;

/*
Дан непустой массив целых чисел nums, в котором каждый элемент встречается дважды, кроме одного.
Найдите этот единственный элемент.

Вы должны реализовать решение с линейной сложностью по времени и
использовать только постоянное дополнительное пространство.

Пример 1:

Ввод: nums = [2,2,1]
Вывод: 1
Пример 2:

Ввод: nums = [4,1,2,1,2]
Вывод: 4
Пример 3:

Ввод: nums = [1]
Вывод: 1


Ограничения:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Каждый элемент в массиве встречается дважды, кроме одного элемента,
который встречается только один раз.
 */

public class SingleNumber {
    public static void main(String[] args) {

        int[] mass = {4,1,2,1,2};
//        int[] mass = {2,2,1};
        System.out.println(singleNumber(mass));

    }

    public static int singleNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    nums[i] = 0;
                    nums[j] = 0;
                }
            }
            if (nums[i] != 0) {
                result = nums[i];
            }
        }

        return result;
    }
}
