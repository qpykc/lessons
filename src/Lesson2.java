import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by walge on 24.01.2017.
 */
//Решение факториала числа n
public class Lesson2 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int a = 1;
        for (int i = 1; i <= n; i++){
            a *= i;
        }
        System.out.println("Факториал числа " + n + " равен " + a);

    }
}
