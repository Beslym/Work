package geekbrains.lesson_Guess_HomeWork.less23;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Лисичкин", "8456565");
        phonebook.add("Лисичкин", "5484856");
        phonebook.add("Захаренков", "22334499");
        phonebook.add("Мамонов", "22334488");
        phonebook.add("Лисичкин", "48545656");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Лисичкин");
        System.out.println(phonebook.get("Лисичкин"));
        System.out.println("Захаренков");
        System.out.println(phonebook.get("Захаренков"));
        System.out.println("Мамонов");
        System.out.println(phonebook.get("Мамонов"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Лисичкин", "5484856");
        System.out.println("Лисичкин");
        System.out.println(phonebook.get("Лисичкин"));
    }
}
