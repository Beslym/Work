package geekbrains.lesson_Guess_HomeWork;

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    private String getName() {
        return name;
    }

    private int getAppetite() {
        return appetite;
    }

    private boolean isSatiety() {
        return satiety;
    }

    void info() {
        System.out.printf("\nКот %s имеет аппетит в %d%% и подходит к тарелке с едой.\n", getName(), getAppetite());
        System.out.printf("Кот %s %s", getName(), isSatiety() ?
                "хорошо поел и довольный уходит.\n" : "не хочет есть из тарелки, где мало еды.\n");
    }

    void eat(Plate p) {
        if (!isSatiety() && p.decreaseFood(getAppetite())) {
            satiety = true;
        }
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int x) {
        int delta = food - x;
        if (delta < 0) {
            return false;
        }
        food -= x;
        return true;
    }

    public void info() {
        System.out.printf("\nТарелка наполнена едой на %d%%.", food);
    }

    public void addFood(int add) {
        System.out.printf("\nДобавляем еду в тарелку >>> %d%%.", add);
        food += add;
    }
}

public class Lesson7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Мурзик", 35),
                new Cat("Вейдер", 20),
                new Cat("Маркиз", 15),
                new Cat("Люк", 40),
        };

        System.out.println("Коты хотят покушать и просят насыпать им корм.");
        Plate plate = new Plate(80);

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(50);
        plate.info();
        System.out.println();
    }
}