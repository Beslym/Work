package geekbrains.lesson_Guess_HomeWork.less21;

public class Robot implements Competitor, Run, Jump {
    private final int maxrun;
    private final int maxjump;

    public Robot(int maxrun, int maxjump) {
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }

    public boolean jump(int distance) {
        System.out.println("Robot attempts jump!");
        return maxjump >= distance;
    }

    public boolean run(int distance) {
        System.out.println("Robot attempts run!");
        return maxrun >= distance;
    }
}
