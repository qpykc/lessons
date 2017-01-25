import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Вычисление чисел Фиббоначи
// F_1 = 1
// F_2 = 1
// F_n = F_n-2 + F_n-1
/**
 * Created by walge on 24.01.2017.
 */
public class Lesson3 {

    public static void main(String[] args) throws IOException{

        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int fib1 = 1, fib2 = 1, fibn = 0;
        if (n == 1 || n == 2){
            System.out.println(1);
        }
        System.out.println(1);
        System.out.println(1);
        for (int i = 3; i<= n; i++){
            fibn = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibn;
            System.out.println(fibn);
        }

    }
}
