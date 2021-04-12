package geekbrains.lesson_Guess_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        GenericClass<String> catsNames = new GenericClass<String>(new String[]{"Lulu", "Tom"});
        GenericClass<Integer> catsAges = new GenericClass<Integer>(new Integer[]{4, 5});
        GenericClass<Double> catsWieghts = new GenericClass<Double>(new Double[]{5.5, 7.1});

        System.out.println("\nLook at the type of the array. We have: ");
        catsNames.showType();
        catsAges.showType();
        catsWieghts.showType();

        System.out.println("\nCreate the array list with old positions of elements");
        catsNames.createArrayList();
        catsAges.createArrayList();
        catsWieghts.createArrayList();

        System.out.println("\nCreate the array with new positions of elements");
        catsNames.changePositionOfElementsInArray();
        catsAges.changePositionOfElementsInArray();
        catsWieghts.changePositionOfElementsInArray();

        Box<Apple> appleBox = new Box<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();

        appleBox.addFruit(a1);
        appleBox.addFruit(a2);
        appleBox.addFruit(a3);

        System.out.println("\nThe total weight of the apple box is " + appleBox.getTotalWeight());

        Box<Orange> orangeBox = new Box<>();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();

        orangeBox.addFruit(o1);
        orangeBox.addFruit(o2);
        orangeBox.addFruit(o3);

        System.out.println("The total weight of the orange box is " + orangeBox.getTotalWeight());

        System.out.println("The result of matching boxes is " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.replaceAllFruitsToOtherBox(newAppleBox);

        Apple a4 = new Apple();
        newAppleBox.addFruit(a4);
        System.out.println("The total weight of the new apple box is " + newAppleBox.getTotalWeight());
    }
}
