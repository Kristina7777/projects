import java.lang.Math;

public class Main {

    static int k = 3; // номер студента
    static int iprnt = 10; // количество выводимых на экран чисел
    static int count = 1000; // количество случайных чисел
    static double p = 0.95; // квантиль распределения
    static double Хp; // оценка квантиля распределения

    public static void main(String[] args) {
        System.out.println("Вероятность события X < K");
        double x;
        double Summa = 0.0;
        double M = 0;  // текущее значение матожидания при равномерном распределении
        double Mx2;
        int iinterval=0;
        int i = 0;
        do {
            i++;

            x = random1();  //случайное число
            Summa = Summa + x;
            M = Summa / i; // Расчет математического ожидания Х

            Mx2 = M * M; // Расчет математического ожидания Х2

            Хp = x * p; // Оценка распределения квантиля

            if (i <= iprnt) {
                System.out.println("i=" + i + " Случайная величина:" + " " + x + " MOх:" + M + " МОх2: " + Mx2); // отображение требуемого количества чисел
                System.out.println("Оценка квантиля распределения: " + Хp);
            }

            if (x > k) { // проверка попаданий в требуемый диапазон
                iinterval++;
            }
        }
        while (i < count);
    }

      static double random1() { // выдача значения генератора

         double rnd = Math.random();
         return rnd;
        }
   }


