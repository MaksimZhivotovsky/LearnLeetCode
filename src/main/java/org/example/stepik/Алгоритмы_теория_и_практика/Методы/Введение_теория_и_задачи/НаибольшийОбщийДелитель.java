package org.example.stepik.Алгоритмы_теория_и_практика.Методы.Введение_теория_и_задачи;

import java.util.Scanner;

/*
Задача на программирование: наибольший общий делитель


По данным двум числам
1
≤
a
,
b
≤
2
⋅
1
0
9
1≤a,b≤2⋅10
9
  найдите их наибольший общий делитель.

Sample Input 1:

18 35
Sample Output 1:

1
Sample Input 2:

14159572 63967072
Sample Output 2:

4
 */

public class НаибольшийОбщийДелитель {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long gcd = gcd(a, b);

        System.out.println(gcd);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
