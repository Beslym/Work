package geekbrains.lesson_Guess_HomeWork.less21;

public class Human implements Competitor, Run, Jump {
    private final int maxrun;
    private final int maxjump;

    public Human(int maxrun, int maxjump) {
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }

    public boolean jump(int distance) {
        System.out.println("Human attempts jump!");
        return maxjump >= distance;
    }

    public boolean run(int distance) {
        System.out.println("Human attempts run!");
        return maxrun >= distance;
    }
}
