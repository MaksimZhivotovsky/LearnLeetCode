package org.example.array;

/*
Дан целочисленный массив nums, поверните его вправо на k шагов, где k — неотрицательное число.

Пример 1:

Ввод: nums = [1,2,3,4,5,6,7], k = 3
Вывод: [5,6,7,1,2,3,4]
Пояснение:
поверните на 1 шаг вправо: [7,1,2,3,4,5,6]
поверните на 2 шага вправо: [6,7,1,2,3,4,5]
поверните на 3 шага вправо: [5,6,7,1,2,3,4]

Пример 2:

Ввод: nums = [-1,-100,3,99], k = 2
Вывод: [3,99,-1,-100]
Пояснение:
поворот на 1 шаг вправо: [99,-1,-100,3]
поворот на 2 шага вправо: [3,99,-1,-100]
 */

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
