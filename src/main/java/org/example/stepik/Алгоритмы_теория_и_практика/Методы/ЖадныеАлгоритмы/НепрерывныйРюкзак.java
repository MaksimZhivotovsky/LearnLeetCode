package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ЖадныеАлгоритмы;

import java.util.Arrays;
import java.util.Scanner;

/*
Первая строка содержит количество предметов
1
≤
n
≤
1
0
3
1≤n≤10
3
  и вместимость рюкзака
0
≤
W
≤
2
⋅
1
0
6
0≤W≤2⋅10
6
 . Каждая из следующих
n
n строк задаёт стоимость
0
≤
c
i
≤
2
⋅
1
0
6
0≤c
i
​
 ≤2⋅10
6
  и объём
0
<
w
i
≤
2
⋅
1
0
6
0<w
i
​
 ≤2⋅10
6
  предмета (
n
n,
W
W,
c
i
c
i
​
 ,
w
i
w
i
​
  — целые числа). Выведите максимальную стоимость частей предметов (от каждого предмета можно отделить любую часть, стоимость и объём при этом пропорционально уменьшатся), помещающихся в данный рюкзак, с точностью не менее трёх знаков после запятой.

Sample Input:

3 50
60 20
100 50
120 30
Sample Output:

180.000
 */
public class НепрерывныйРюкзак {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int W = scanner.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            int weight = scanner.nextInt();
            items[i] = new Item(value, weight);
        }

        Arrays.sort(items, (a, b) -> Double.compare(b.getValuePerWeight(), a.getValuePerWeight()));

        double maxValue = 0.0;

        for (Item item : items) {
            if (W == 0) {
                break;
            }

            if (item.weight <= W) {
                W -= item.weight;
                maxValue += item.value;
            } else {
                maxValue += item.getValuePerWeight() * W;
                W = 0;
            }
        }

        System.out.printf("%.6f\n", maxValue);
    }
}

class Item {
    int value; // стоимость
    int weight; // объем

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    // Метод для вычисления стоимости на единицу объема
    double getValuePerWeight() {
        return (double) value / weight;
    }
}