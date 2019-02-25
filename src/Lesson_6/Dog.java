package Lesson_6;

import java.util.Random;

public class Dog extends Animals {
    Random random = new Random();
    public Dog(String name) {
        super(name);
        MAX_RUN_DIST = random.nextInt(200)+500;
        MAX_SWIN_DIST = random.nextInt(10)+5;
        MAX_JUMP_DIST = random.nextInt(1);
    }



}
