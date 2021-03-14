package geekbrains.lesson_Guess_HomeWork.less21;

public class Wall implements Obstacle {
    private final int height;

    @Override
    public boolean actWithMe(Competitor team) {
        if (team instanceof Jump) {
            return ((Jump) team).jump(height);
        } else {
            System.out.println("Cannot run");
            return false;
        }
    }
    public Wall(int height) {
        this.height = height;
    }
}
