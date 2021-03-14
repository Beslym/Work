package geekbrains.lesson_Guess_HomeWork.less21;

public class Treadmill implements Obstacle {
    private final int length;

    @Override
    public boolean actWithMe(Competitor team) {
        if (team instanceof Run) {
            return ((Run) team).run(length);
        } else {
            System.out.println("Cannot run");
            return false;
        }
    }
    public Treadmill(int length) {
        this.length = length;
    }
}
