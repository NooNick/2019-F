package lesson_7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int food = 0;
        int hungry;
        Cat[] cat = new Cat[5];


        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat("Барсик" + (i + 1), random.nextInt(100) + 50);
        }
        Plate plate = new Plate(300);


        do {
            hungry = 0;
            plate.plus(food);
            for (Cat cat1 : cat) {
                cat1.eat(plate);
                cat1.info();
                if (!cat1.isSatiety()) {
                    hungry++;
                }
            }

            plate.info();
            if (hungry > 0) {
                System.out.print(hungry +" кот(ов) осталось голодных! сколько досыпать корма? (0 - выйти) :");
                food = scanner.nextInt();
            } else {
                food = 0;
            }


        } while (food != 0);


    }
}
