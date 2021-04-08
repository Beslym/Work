package geekbrains.lesson_Guess_HomeWork.app;

import Lesson8.Client.ClientChatAdapter;

public class ClientAppOne {
    public static void main(String[] args) {
        new ClientChatAdapter("localhost", 8888);
    }
}