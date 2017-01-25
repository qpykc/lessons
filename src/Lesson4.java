import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by walge on 24.01.2017.
 */
//Создание простейших методов
public class Lesson4 {

    //Тело метода с ипользанием библиотеки Math
    // Сначала пичется тип возвращаемого значения, название, в скобках аргументы, в конце пишется  return
    // которое возвращает выход из метода
    int min(int a, int b){

        return Math.min(a, b);

    }
    //Функции могут вызывать сами себя, это называется рекурсией
    //Пример- метод расчёта факториала (n! = n * (n - 1))
    static int fact(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
     //Более простая запись условия через тернарные операции:
     //return n == 0 ? 1 : n * fact(n - 1);
        }
    }

    static void print(String s){

        System.out.println(s);
        return;

    }

    //Расчет чисел Фиббоначи через рекурсивный метод
    //Формула расчета F_1 = 1; F_2 = 1; F_n = F_n -2 + F_n - 1;
    static int fibb(int n){

        if (n == 1 || n == 2){
            return 1;
        } else return fibb(n - 2) + fibb(n - 1);

    }

    public static void main(String[] args) throws IOException {

        print("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(reader.readLine());
        print("Факториал равен " + fact(f));
        print("Число Фиббоначи равно " + fibb(f));
    }
}
