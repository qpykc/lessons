import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by walge on 24.01.2017.
 */
// Сумма чисел от 1 до введённого из консоли числа
public class Lesson1 {

    public static void main(String[] args) throws IOException {

        try {
            System.out.println("Введите число");
            BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
            String s = bR.readLine();
            int a = Integer.parseInt(s);
            int result = 0;
            for (int i = 1; i <= a; i++) {
                result += i;
            }
            System.out.println("Сумма чисел от 1 до " + a + "равна " + result);

        } catch (NumberFormatException e) {
            System.out.println("Пожалуйста введите корректное число!");
        }
    }
}
