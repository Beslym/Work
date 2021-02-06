package geekbrains.lesson_Guess_HomeWork;

public class Lesson2 {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static void task1() {
        int[] mass1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] == 0) mass1[i]++;
            else mass1[i] = --mass1[i];
            System.out.print(mass1[i] + " ");
        }
    }

    public static void task2() {
        int[] mass2 = new int[8];
        for (int i = 0, j = 0; i < mass2.length; i++, j += 3) {
            mass2[i] = j;
            System.out.print(mass2[i] + " ");
        }
    }

    public static void task3() {
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] < 6) mass3[i] *= 2;
            System.out.print(mass3[i] + " ");
        }
    }

    public static void task4() {
        int[][] mass4 = new int[5][5];
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4[i].length; j++){
                if (i==j || i==mass4[i].length -1 -j) mass4[i][j]++;
                System.out.print(mass4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
