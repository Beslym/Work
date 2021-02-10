package geekbrains.lesson_Guess_the_number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson3 {
    private static final int minRange = 0;
    private static final int maxRange = 9;
    private static final int tryNumbers = 3;
    private static Scanner scanner = new Scanner(System.in);

    private static String triesCount(int tryTimes) {
        int t1;
        int t2;
        t1 = tryTimes % 10;
        t2 = tryTimes % 100;

        if (t1 == 1 && t2 != 11) {
            return "попытка";
        } else if (t1 >= 2 && t1 <= 4 && (t2 < 10 || t2 >= 20)) {
            return "попытки";
        } else {
            return "попыток";
        }
    }

    private static void guessNumber(int cpuNum) {
        int tryTimes = tryNumbers;

        while (tryTimes > 0) {
            System.out.printf("Введите число от %d до %d: ", minRange, maxRange);
            try {
                int userNum = scanner.nextInt();
                if (userNum < cpuNum && tryTimes != 1) {
                    System.out.print("Ваше число меньше загаданного.\n");
                } else if (userNum > cpuNum && tryTimes != 1) {
                    System.out.print("Ваше число больше загаданного.\n");
                } else if (userNum == cpuNum) {
                    System.out.println("Поздравляем! Вы угадали число!\n");
                    break;
                }
                tryTimes--;

                if (tryTimes > 0) {
                    String tries = triesCount(tryTimes);
                    System.out.printf("Остал%cсь %d %s.\n\n", (tries.equals("попытка")) ? 'а' : 'о', tryTimes, tries);
                } else {
                    System.out.printf("У вас не осталось попыток. Было загадано число %d.\nВы проиграли.\n\n", cpuNum);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка! Некорректный формат данных.\n");
                scanner.next();
            }
        }
    }

    private static boolean exitGame() {
        int exit;

        System.out.print("Хотите поиграть снова?\n1 – Да / 0 – Выход из программы: ");
        while (true) {
            try {
                exit = scanner.nextInt();
                if (exit < 0 || exit > 1) {
                    System.out.print("Введите 1, или 0: ");
                } else {
                    System.out.println();
                    return exit != 0;
                }
            } catch (InputMismatchException ex) {
                System.out.print("Ошибка! Попробуйте снова: ");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        do {
            int cpuNum = (int) (Math.random() * maxRange);
            System.out.printf("Игра предлагает угадать число, загаданное компьютером." +
                    "\nКоличество попыток: %d.\n\n", tryNumbers);
            guessNumber(cpuNum);
        } while (exitGame());
        System.out.println("Игра окончена.\nЗавершение работы программы.");
        scanner.close();
    }
}

