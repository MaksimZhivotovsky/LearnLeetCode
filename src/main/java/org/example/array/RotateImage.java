package org.example.array;

/*
Вам дана n x n 2D-фигура matrix в виде изображения,
поверните изображение на 90 градусов (по часовой стрелке).

Вам нужно повернуть изображение на месте, то есть изменить входную двумерную матрицу напрямую.
НЕ выделяйте другую двумерную матрицу и не выполняйте поворот.

Пример 1:

Ввод: матрица = [[1,2,3],[4,5,6],[7,8,9]]
Вывод: [[7,4,1],[8,5,2],[9,6,3]]
Пример 2:

Ввод: матрица = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Вывод: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 */

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }
}
