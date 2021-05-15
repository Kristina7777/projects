import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        Random rnd = new Random();

        //инициализация массива
        int size = 10;
        double[] mass;
        mass = new double[size];

        System.out.print("Spawn 3 random number:");

        for (int i = 0; i < 3; i++){ //заполнение массива
            System.out.println(mass[i] = rnd.nextDouble()); //генерация случайных значений

        }


        double pro = 1;
        double sum = 0;
        //вычисление произведения и суммы
        for(int i = 0 ; i < 3; i++){
            pro*=mass[i];
            sum += mass[i];
        }


        System.out.print("Product:" + pro + "\n"); //вывод произведения
        System.out.print("Sum:" + sum); //вывод суммы

    }
}