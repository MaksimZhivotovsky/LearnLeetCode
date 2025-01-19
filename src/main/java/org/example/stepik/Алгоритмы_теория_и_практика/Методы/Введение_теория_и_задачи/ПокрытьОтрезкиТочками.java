package org.example.stepik.Алгоритмы_теория_и_практика.Методы.Введение_теория_и_задачи;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
По данным
n
n отрезкам необходимо найти множество точек минимального размера, для которого каждый из отрезков содержит хотя бы одну из точек.

В первой строке дано число
1
≤
n
≤
100
1≤n≤100 отрезков. Каждая из последующих
n
n строк содержит по два числа
0
≤
l
≤
r
≤
1
0
9
0≤l≤r≤10
9
 , задающих начало и конец отрезка. Выведите оптимальное число
m
m точек и сами
m
m точек. Если таких множеств точек несколько, выведите любое из них.

Sample Input 1:

3
1 3
2 5
3 6
Sample Output 1:

1
3
Sample Input 2:

4
4 7
1 3
2 5
5 6
Sample Output 2:

2
3 6

 */
public class ПокрытьОтрезкиТочками {

    static class Segment {
        int left;
        int right;

        Segment(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Segment> segments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            segments.add(new Segment(l, r));
        }

        segments.sort(Comparator.comparingInt(s -> s.right));

        List<Integer> points = new ArrayList<>();
        int lastPoint = -1;

        for (Segment segment : segments) {
            if (lastPoint < segment.left) {
                lastPoint = segment.right;
                points.add(lastPoint);
            }
        }

        System.out.println(points.size());
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
