package lesson_1;

public class Main {
    // целочисленные
    byte aByte = 10;
    short aShort = 100;
    int aInt = 1000;
    long aLong = 10000;
    // с точкой
    float aFloat = 10.00F;
    double aDouble = 100.00;
    // логическое
    boolean aBoolean = true;
    //символьное
    char aChar = 'a';
    // строка
    String string = "";

    public static float task3(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    public static boolean task4(int a, int b) {

        return 10 <= (a + b) && (a + b) <= 20;
    }

    public static String task5(int a) {

        if (a < 0) {
            return "отрицательное";
        } else {
            return "положительное";
        }

    }

    public static boolean task6(int a) {

        return a < 0;
    }

    public static String task7(String a) {

        return "Привет, " + a + "!";
    }

    public static boolean task8(boolean a, boolean b) {

        return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
    }

    //  (!(a < b) && !(a > b))
    // ((a >= b) && (a <= b)).
    // a == b

    public static boolean task10(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }

    public static String task11(int a, int b, int c) {

        if (a + b <= c) {
            return a + " + " + b + " = " + c;
        } else if (a + c <= b) {
            return a + " + " + c + " = " + b;
        } else if (c + b <= a) {
            return b + " + " + c + " = " + a;
        } else {
            return "условие не выполнено";
        }
    }

    public static String task12(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            return "год высокосный";
        } else {
            return "год не высокосный";
        }

    }

    public static int task13(int a, int b) {

        return a + (int) (Math.random() * (b - a));
    }

    public static int task14() {

        return (1 + (int) (Math.random() * 5)) + (1 + (int) (Math.random() * 5));
    }

    public static double task15(int t) {
        return Math.sin(2 * t) + Math.sin(3 * t);
    }

    public static String task16(int m, int d) {
        // m-месяц и d-день, лежат в промежутке от 20.03 до 20.06.
        if ((m <= 3 && d < 20) || (m < 3)) {
            return "дата лежит раньше промежутке от 20.03 до 20.06";
        } else if ((m >= 6 && d > 20) || (m > 6)) {
            return "дата лежит позже промежутке от 20.03 до 20.06";
        } else {
            return "дата лежит в промежутке от 20.03 до 20.06";
        }
    }

    //скачал пример из инета и немного переделал. 
    public static String task17(int red, int green, int blue) {
        int black = Math.min(Math.min(255 - red, 255 - green), 255 - blue);

        if (black != 255) {
            int cyan = (255 - red - black) / (255 - black);
            int magenta = (255 - green - black) / (255 - black);
            int yellow = (255 - blue - black) / (255 - black);
            return cyan + "," + magenta + "," + yellow + "," + black;
        } else {
            int cyan = 255 - red;
            int magenta = 255 - green;
            int yellow = 255 - blue;
            return cyan + "," + magenta + "," + yellow + "," + black;
        }
    }

    public static String task18(int a, int b, int c) {

        if (a == b && a == c) {
            return "Все три числа равны";
        } else {
            return "не равны";
        }
    }

    public static String task19(double x, double y) {

        if ((x >= 0 && x <= 1) && (y >= 0 && y <= 1)) {
            return "числа попадают в интервал от 0 до 1";
        } else {
            return "не попадают в интервал от 0 до 1";
        }
    }

    public static void main(String[] args) {
        System.out.println("задание 3 " + task3(1, 2, 4, 4));
        System.out.println("задание 4 " + task4(1, 6));
        System.out.println("задание 5 " + task5(0));
        System.out.println("задание 6 " + task6(-10));
        System.out.println("задание 7 " + task7("Александр"));
        System.out.println("задание 8 - 1:1 = " + task8(true, true));
        System.out.println("          - 1:0 = " + task8(true, false));
        System.out.println("          - 0:1 = " + task8(false, true));
        System.out.println("          - 0:0 = " + task8(false, false));
        System.out.println("задание 9 -  a == b");
        System.out.println("задание 10 " + task10(10, 5));
        System.out.println("задание 11 " + task11(10, 5, 5));
        System.out.println("задание 12 " + task12(2016));
        System.out.println("задание 13 " + task13(5, 10));
        System.out.println("задание 14 " + task14());
        System.out.println("задание 15 " + task15(1));
        System.out.println("задание 16 " + task16(6, 21));
        System.out.println("задание 17 CMYK(" + task17(255, 0, 0) + ")");
        System.out.println("задание 18 " + task18(200, 200, 200));
        System.out.println("задание 19 " + task19(0.222, 1.55));
    }
}
