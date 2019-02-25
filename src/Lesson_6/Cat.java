package Lesson_6;

import java.util.Random;

public class Cat extends Animals {

    Random random = new Random();
    public Cat(String name) {
        super(name);
        MAX_RUN_DIST = random.nextInt(200)+100;
        MAX_SWIN_DIST = 0;
        MAX_JUMP_DIST = random.nextInt(3);
    }
}
