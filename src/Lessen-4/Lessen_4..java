package lessen_4;

import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class lessen_4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int SIZE_LESN = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = ' ';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkRndGame(DOT_X)) {
                break;
            }
            compTurn();
            printMap();
            if (checkRndGame(DOT_O)) {
                break;
            }
        }
        System.out.println("Game Over");
    }

    private static boolean checkRndGame(char dot) {
        if (checkWin(dot)) {
            System.out.println((dot == DOT_X ? "Победил Человек" : "Победил Комп"));
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        int x = 0;
        int y = 2;
        int xy = 0;
        int yx = 0;
        if (x < y) {
            xy = y - x;
        } else {
            yx = x - y;
        }


        for (int i = 0; i < SIZE; i++) {

            if (x + i - xy < SIZE || x + i - xy >= 0 || y + i - yx < SIZE || y + i - yx >= 0) {
                map[x + i - xy][i] = 'Z';
            }
            //for (int j = xy; j < SIZE; j++) {
            //map[i][j] = DOT_EMPTY;
            if (x - i + xy < SIZE || x - i + xy >= 0 || y - i + yx < SIZE || y - i + yx >= 0) {
                map[x + i - xy][i] = 'i';
            }
            //   map[i][z] = 'i';
            //}
        }

    }


    public static void printMap() {
        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите Х");
            x = scanner.nextInt() - 1;
            System.out.println("Введите Y");
            y = scanner.nextInt() - 1;
        } while (!isCellWalid(x, y));
        map[x][y] = DOT_X;
    }

    public static void compTurn() {
        int x;
        int y;
        do {

            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellWalid(x, y));
        System.out.println("Компьютер пошол{0}:{1}" + x + ":" + y);
        map[x][y] = DOT_O;
    }

    private static boolean isCellWalid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[x][y] == DOT_EMPTY;
    }

    private static boolean checkWin(char symbol) {
        int x = 0;
        int y = 2;
        int[] lesn = new int[4];
        boolean[] lesnStop = new boolean[SIZE_LESN];
        for (int i = 0; i < SIZE; i++) {
            //проверка горизонтали
            if (map[x][i] == symbol || lesnStop[1]) {
                lesn[1] = lesn[1] + 1;
            } else {
                if (x < i) {
                    lesn[1] = 0;
                } else {
                    lesnStop[1] = false;
                }
            }
            if (lesn[1] >= SIZE_LESN) {
                return true;
            }


            if (map[x][i] == symbol || lesnStop[2]) {
                lesn[2] = lesn[2] + 1;
            } else {
                if (x < i) {
                    lesn[2] = 0;
                } else {
                    lesnStop[2] = false;
                }
            }
            if (lesn[2] >= SIZE_LESN) {
                return true;
            }

        }
//проверка диагональ вниз
        int xy = 0;
        int yx = 0;
        if (x < y) {
            xy = y - x;
        } else {
            yx = x - y;
        }



        return false;
    }

}
