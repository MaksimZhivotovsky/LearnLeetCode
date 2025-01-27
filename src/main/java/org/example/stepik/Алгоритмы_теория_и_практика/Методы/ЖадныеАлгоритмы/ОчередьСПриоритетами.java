package org.example.stepik.Алгоритмы_теория_и_практика.Методы.ЖадныеАлгоритмы;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
Первая строка входа содержит число операций
1
≤
n
≤
1
0
5
1≤n≤10
5
 . Каждая из последующих
n
n строк задают операцию одного из следующих двух типов:

I
n
s
e
r
t
Insert
x
x, где
0
≤
x
≤
1
0
9
0≤x≤10
9
  — целое число;
E
x
t
r
a
c
t
M
a
x
ExtractMax.
Первая операция добавляет число
x
x в очередь с приоритетами, вторая — извлекает максимальное число и выводит его.
 */
public class ОчередьСПриоритетами {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Число операций
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // max-очередь

        for (int i = 0; i < n; i++) {
            String operation = scanner.next(); // Читаем операцию
            if (operation.equals("Insert")) {
                int x = scanner.nextInt(); // Читаем число для вставки
                maxHeap.offer(x); // Вставляем в очередь
            } else if (operation.equals("ExtractMax")) {
                if (!maxHeap.isEmpty()) {
                    System.out.println(maxHeap.poll()); // Извлекаем и выводим максимальный элемент
                } else {
                    System.out.println("Queue is empty"); // Если очередь пуста
                }
            }
        }

        scanner.close();
    }
}
