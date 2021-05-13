package geekbrains.lesson_Guess_HomeWork.Client;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader=new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream("sample.fxml"));

        primaryStage.setTitle("Chart");
        Scene scene = new Scene(root, 375, 375);
        primaryStage.setScene(scene);
        primaryStage.show();

        Controller c = loader.getController();
        primaryStage.setOnCloseRequest(event->{
            try {
                c.Dispose();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Platform.exit();
            System.exit(0);
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
