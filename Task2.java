package lesson8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the present position of chess figure (Example: e 2): ");

        String input = scanner.next();
        int xInitial = getIntCoordinateFromString(input.charAt(0));
        int yInitial = Integer.parseInt(Character.toString(input.charAt(1))) - 1;

        System.out.println("Enter the desired position of chess figure (Example: e 2): ");

        input = scanner.next();
        int xMove = getIntCoordinateFromString(input.charAt(0));
        int yMove = Integer.parseInt(Character.toString(input.charAt(1))) - 1;

        if (checkMove(xInitial, yInitial, xMove, yMove)) {
            System.out.println("This move is possible");
        } else {
            System.out.println("This move is not possible");
        }

    }

    public static boolean checkMove(int x1, int y1, int x2, int y2) {
        if (x2 > 7 || x2 < 0 || y2 > 7 || y2 < 0) return false;

        if ((Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 1)
            || (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getIntCoordinateFromString(char xChar) {
        int result = -1;
        switch (xChar) {
            case 'a':
                result = 0;
                break;
            case 'b':
                result = 1;
                break;
            case 'c':
                result = 2;
                break;
            case 'd':
                result = 3;
                break;
            case 'e':
                result = 4;
                break;
            case 'f':
                result = 5;
                break;
            case 'g':
                result = 6;
                break;
            case 'h':
                result = 7;
                break;
        }
        return result;
    }
}
