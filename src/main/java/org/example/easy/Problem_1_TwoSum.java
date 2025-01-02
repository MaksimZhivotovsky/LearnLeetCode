package org.example.easy;

import java.util.Arrays;

/*
*Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел, сумма которых
* равна target.

Вы можете предположить, что для каждого ввода будет ровноодно решение, и вы не можете использовать
* один и тот же элемент дважды.

Вы можете вернуть ответ в любом порядке.



Пример 1:

Ввод: nums = [2,7,11,15], target = 9
Вывод: [0,1]
Пояснение: Поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
Пример 2:

Ввод: nums = [3,2,4], target = 6
Вывод: [1,2]
Пример 3:

Ввод: nums = [3,3], target = 6
Вывод: [0,1]


Ограничения:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Существует только один правильный ответ.


Продолжение: можете ли вы придумать алгоритм, который будет работать быстрее O(n2) временная сложность?
*
*/
public class Problem_1_TwoSum {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 6;

        Arrays.stream(twoSum(nums, target))
                        .forEach(el -> System.out.print(el + " "));

    }
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((i != j) && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }
}
