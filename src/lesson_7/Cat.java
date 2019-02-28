package lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }



    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (!satiety) {
            if (plate.decreaseFood(appetite)) {
                this.satiety = true;
            }
        }
    }

    public void info() {
        System.out.println(name + " - сытость: " + satiety);
    }
}
