package geekbrains.lesson_Guess_HomeWork;

    class Person {
        String fio;
        String post;
        String email;
        String tel;
        double salary;
        int age;

        Person(String fio, String post, String email, String tel, int salary, int age) {
            this.fio = fio;
            this.post = post;
            this.email = email;
            this.tel = tel;
            this.salary = salary;
            if(age >= 18) {
                this.age = age;
            } else {
                System.out.println("found an employee under 18 years");
            }
        }
        int GetAge() {
            return age;
        }
        void Show() {
            System.out.println("Full name: " + fio + ", post: " + post + ", email: " +  email + ", tel: " + tel + ", salary: $" + salary + ", age:" + age + " years");
        }
    }

    public class Lesson5 {

        public static void main(String[] args) {

            Person[] persArray = new Person[5];
            persArray[0] = new Person("Lisichkin Oleg", "Director", "Lisichkin_O@gmail.com", "89332231634", 100000, 40);
            persArray[1] = new Person("Zhilinsky Denis", "Deputy Director", "Zhilinsky_D@gmail.com", "89339981754", 20000, 45);
            persArray[2] = new Person("Serafinovich Maxim", "Engineer", "Serafinovich_M@yandex.com", "89111001542", 10000, 50);
            persArray[3] = new Person("Golubeva Olga", "accountant", "Golubeva_O@mail.com", "89111554463", 7000, 42);
            persArray[4] = new Person("Lisin Maxim", "trainee", "Lisin_M@gmail.com", "89312442552", 1000, 16);
            for(Person item : persArray) {
                if(item.GetAge() > 40) item.Show();
            }
        }
    }