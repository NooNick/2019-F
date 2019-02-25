package Lesson_6;

public class Animals {


    public String name;
    public int MAX_RUN_DIST;
    public int MAX_SWIN_DIST;
    public float MAX_JUMP_DIST;

    public Animals(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println("пробежало " + distance + "М");
        } else {
            distance = distance - MAX_RUN_DIST;
            System.out.println("увы не добежал " + distance + "М");
        }
    }

    public void swim(int distance) {
        if (distance <= MAX_SWIN_DIST) {
            System.out.println("проплыло " + distance + "М");
        } else {
            distance = distance - MAX_SWIN_DIST;
            System.out.println("увы не до плыло " + distance + "М");
        }
    }

    public void jump(float height) {
        if (height <= MAX_JUMP_DIST) {
            System.out.println("перепрыгнуло " + height + "М");
        } else {
            height = height - MAX_JUMP_DIST;
            System.out.println("увы не до прыгнуло " + height + "М");
        }
    }

}
