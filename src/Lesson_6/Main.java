package Lesson_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int runDist;
        int swinDist;
        float jumpDist;


        Scanner sc = new Scanner(System.in);
        System.out.println("Начнем тестирование Животного ");
        System.out.print("Кличка Кота :");
        Cat cat = new Cat(sc.nextLine());
        System.out.print("Кличка Собаку :");
        Dog dog = new Dog(sc.nextLine());
        System.out.print("Дистанция Забега: ");
        runDist = sc.nextInt();
        System.out.print("Дистанция Заплыва: ");
        swinDist = sc.nextInt();
        System.out.print("Высота прышка: ");
        jumpDist = sc.nextInt();
        System.out.println("тест Ката" + cat.name);
        cat.run(runDist);
        cat.swim(swinDist);
        cat.jump(jumpDist);
        System.out.println("тест Сабаки" + dog.name);
        dog.run(runDist);
        dog.swim(swinDist);
        dog.jump(jumpDist);
    }
}
