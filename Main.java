package geekbrains.lesson_Guess_HomeWork;

public class Main {

    public static void main(String[] args) {
        Cat vaska = new Cat(10,2,1);
        Dog robert = new Dog(1000,1,1000);
        System.out.println(vaska.run(100));
        System.out.println(robert.run(100));
        System.out.println(vaska.jump(100));
        System.out.println(robert.jump(100));
        System.out.println(vaska.canSwim(100));
        System.out.println(robert.canSwim(100));
    }
}