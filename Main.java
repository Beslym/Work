package geekbrains.lesson_Guess_HomeWork.less21;

public class Main {

    public static void main(String[] args) {

        Competitor[] team = {new Human(100, 10), new Cat(50, 5), new Robot(10, 100)};
        Obstacle[] course = {new Wall(100), new Treadmill(20)};
        for (int i = 0; i < course.length; i++) {
            for (int j=0; j< team.length; j++) {
                System.out.println(course[i].actWithMe(team[j]));
            }
        }
    }
}
