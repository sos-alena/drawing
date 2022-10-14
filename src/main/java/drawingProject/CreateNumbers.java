package drawingProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CreateNumbers {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    static String item1 = " @@@@  ";
    static String item2 = "@@  @@ ";
    static String item3 = "    @@ ";
    static String item4 = "  @ @@ ";
    static String item5 = " @  @@ ";
    static String item6 = "@@@@@@ ";
    static String item7 = "  @@@  ";
    static String item8 = "@@     ";
    static String item9 = " @@@@@ ";
    static String item10 = "  @@   ";
    static String item11 = "@@@@@  ";

    public static void madenumber(String[][] numbers) {

        System.out.println("Input six digits: ");

        for (int i = 0; i < numbers.length + 1; i++) {
            int numb = inputValidateNumber();
            choosePicture(numb, i, numbers);
        }
    }

    public static void printNumber(String[][] numbers) {
        for (String[] number : numbers) {
            for (int j = 0; j < numbers.length + 1; j++) {
                System.out.print(" " + number[j] + " ");
            }
            System.out.println();
        }
    }

    public static int inputValidateNumber() {
        try {
            return Integer.parseInt(READER.readLine());
        } catch (Exception exception) {
            System.out.println("Неверное значение: " + exception.getMessage());
            System.out.println("Введите значение снова: ");
            return inputValidateNumber();
        }
    }

    public static void choosePicture(int n, int i, String[][] numbers) {

        switch (n) {
            case 0 -> {
                numbers[0][i] = item1;
                numbers[1][i] = item2;
                numbers[2][i] = item2;
                numbers[3][i] = item2;
                numbers[4][i] = item1;
            }
            case 1 -> {
                numbers[0][i] = item3;
                numbers[1][i] = item4;
                numbers[2][i] = item5;
                numbers[3][i] = item3;
                numbers[4][i] = item6;
            }
            case 2 -> {
                numbers[0][i] = item11; //item11
                numbers[1][i] = item3; //item3
                numbers[2][i] = item7; //item7
                numbers[3][i] = item8; //item8
                numbers[4][i] = item6; //item6
            }
            case 3 -> {
                numbers[0][i] = item6; //item6
                numbers[1][i] = item3; //item3
                numbers[2][i] = item6; //item6
                numbers[3][i] = item3; //item3
                numbers[4][i] = item6; //item6
            }
            case 4 -> {
                numbers[0][i] = item2; //item2
                numbers[1][i] = item2; //item2
                numbers[2][i] = item6; //item6
                numbers[3][i] = item3; //item3
                numbers[4][i] = item3; //item3
            }
            case 5 -> {
                numbers[0][i] = item6; //item6
                numbers[1][i] = item8; //item8
                numbers[2][i] = item6; //item6
                numbers[3][i] = item3; //item3
                numbers[4][i] = item6; //item6
            }
            case 6 -> {
                numbers[0][i] = item9; // item9
                numbers[1][i] = item8; // item8
                numbers[2][i] = item6; // item6
                numbers[3][i] = item2; // item2
                numbers[4][i] = item6; // item6
            }
            case 7 -> {
                numbers[0][i] = item6; //item6
                numbers[1][i] = item3; //item3
                numbers[2][i] = item10; //item10
                numbers[3][i] = item8; //item8
                numbers[4][i] = item8; //item8
            }
            case 8 -> {
                numbers[0][i] = item1; //item1
                numbers[1][i] = item2; //item2
                numbers[2][i] = item1; //item1
                numbers[3][i] = item2; //item2
                numbers[4][i] = item1; //item1
            }
            case 9 -> {
                numbers[0][i] = item1; //item1
                numbers[1][i] = item2; //item2
                numbers[2][i] = item9; //item9
                numbers[3][i] = item3; //item3
                numbers[4][i] = item1; // item1
            }
            default -> throw new NumberFormatException("It is not number, try input it again.");
        }
    }
}



