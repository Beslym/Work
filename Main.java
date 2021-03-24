package geekbrains.lesson_Guess_HomeWork;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        doTaskOne();

        Set<String> words = new HashSet<>();
        words.add("One");
        words.add("Two");
        words.add("Three");

        Consumer<String> stringConsumer = System.out::println;
        forItem(words, stringConsumer);

        Supplier<Integer> integerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(5);
        };

        System.out.println(doubleUp(4, integerSupplier));

        String x = "kbjjkcjhjccvgcjcccj";
        Optional<String> opt = findAllChars(x, 'c');
        opt.ifPresent(System.out::println);
    }

    public static void doTaskOne() {
        List<String> words = new ArrayList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.forEach(System.out::println);
    }

    public static void forItem(Set<String> set, Consumer<String> cons) {
        set.forEach(cons);
    }

    public static int doubleUp(int index, Supplier<Integer> supplier) {
        return supplier.get() * index;
    }

    public static Optional<String> findAllChars(String target, char toFind) {
        if(target == null) {
            return Optional.empty();
        }

        return Optional.of(
                target.chars()
                        .filter(ch -> ch == toFind)
                        .mapToObj(ch -> String.valueOf((char) ch))
                        .collect(Collectors.joining(""))
        );
    }
}