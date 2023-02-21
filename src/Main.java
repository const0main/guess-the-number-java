import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random rand = new Random(); // обьект рандома

    public static int isInt(){
        return rand.nextInt(1,2); // возвращаем рандомное значение от 1 до 10
    }

    public static void main(String[] args) {

        System.out.println("Угадайте число ");
        System.out.print("Введите число: ");
        Scanner s = new Scanner(System.in); // читаем строку

        int number = s.nextInt(); // введеное нами число

        if(number == isInt()) // проверка
        {
            System.out.println("Вы угадали"); // вывод успешно
        }

        else { // если не уагадал
            System.out.println("Не угадали"); // вывод не успешно
            System.out.println("Число было " + isInt());
        }
    }
}