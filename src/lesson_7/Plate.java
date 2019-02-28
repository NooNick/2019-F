package lesson_7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public  void  info() {
        System.out.println("В миске осталось: " + food +  " еды");
    }

    public boolean decreaseFood(int appetite) {
        if (food >=appetite) {
            food -= appetite;
            return true;
        } else {
            return false;
        }

    }

    public void plus(int food) {
        this.food += food;
    }
}
