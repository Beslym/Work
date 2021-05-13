package geekbrains.lesson_Guess_HomeWork.Server;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
}
