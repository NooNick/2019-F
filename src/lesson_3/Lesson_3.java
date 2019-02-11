package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {


    public static void main(String[] args) {
        System.out.println("Загаданно число от 0 до 9");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int y;
        int x;
        do {
            x = random.nextInt(10);

            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + ") Введите число " + x);
                y = sc.nextInt();

                if (x < y) {
                    System.out.println("меньше " + y);
                }
                if (x > y) {
                    System.out.println("больше " + y);
                }
                if ((x < y) && (i == 2)) {
                    System.out.println("увы загаданное число меньше " + y + " вы проиграли");
                }
                if ((x > y) && (i == 2)) {
                    System.out.println("увы загаданное число больше " + y + " вы проиграли");
                }
                if (x == y) {
                    System.out.println("Вы выйграли");
                    break;
                }
            }

            System.out.print("Повторить игру еще раз? 1 – да / 0 – нет  :");
            y = sc.nextInt();
        } while (y != 0);
    }
}
