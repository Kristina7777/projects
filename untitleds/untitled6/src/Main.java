//Смешанный конгруэнтный метод

import java.lang.Math;
public class Main {

    static long a = 2;
    static long с = 1220703125;
    static long m = 15565;
    static long x0 = 1;

    public static void main(String[] args) {
        System.out.println("Генератор псевдослучайных чисел");
        long j = 1;
        long x0_save = x0;
        long x;
        do {
            x = random();
            System.out.println(j + " " + "Псевдослучайное число:" + " " +  x); // вывод след. значения псевдослучайного числа
            j++;
        }
        while ((j < 100) && (x != x0_save)); // выход по окончании выборки или повторе генератора.

    }

    static long random() { // выдача след. значения генератора
        long prom_x = (a * x0 + с) % m;
        x0 = prom_x;
        return prom_x;
    }
}

