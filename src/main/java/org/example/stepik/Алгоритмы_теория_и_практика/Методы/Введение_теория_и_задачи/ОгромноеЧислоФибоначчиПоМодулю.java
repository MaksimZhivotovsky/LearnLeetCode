package org.example.stepik.Алгоритмы_теория_и_практика.Методы.Введение_теория_и_задачи;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
необходимо найти остаток от деления
n
n-го числа Фибоначчи на
m
m.
 */
public class ОгромноеЧислоФибоначчиПоМодулю {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        List<Long> list = new ArrayList<>();
        long a = 0;
        long b = 1;
        long c;
        list.add(a);
        list.add(b);
        for (long i = 0; i < n; i++) {
            c= b;
            b = (a+b) % m;
            a = c;
            if (a == 0 & b == 1) break;
            list.add(b);
        }
        System.out.println(list.get((int)(n % (list.size()-1))));
    }
}
