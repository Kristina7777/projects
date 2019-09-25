import java.lang.Math;
public class Main {

    static double a = 1.5;
    static long k = 1;
    static double e = 2.71828;



    public static void main(String[] args) {

        static int calculateFactorial ( int n){
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }

        static double puasson(){

        double x = Math.pow(a, k) % calculateFactorial(k) * Math.pow(e,-a);
        System.out.println("Вероятность того, что событие произойдет = " x);

    }}
}
