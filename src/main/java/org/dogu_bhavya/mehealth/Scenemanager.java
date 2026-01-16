package org.dogu_bhavya.mehealth;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Scenemanager
{
    private final Stage stage;

    public Scenemanager(Stage stage)
    {
        this.stage = stage;
    }
    private void setScene(Scene scene) {
        stage.setScene(scene);
    }

    public void Login() {
        setScene(new Scene(new Login(this), 420, 640));
    }

    public void Signup() {
        setScene(new Scene(new Signup(this), 420, 640));
    }

    public void MainMenu() {
        setScene(new Scene(new MainMenu(this), 600, 600));
    }

    public void SignupQuestions() {
        setScene(new Scene(new SignupQuestions(this), 600, 600));
    }
    public void Questions() {
        setScene(new Scene(new Questions(this), 600, 600));
    }

    public void Chat() {
        setScene(new Scene(new Chat(this), 600, 600));
    }

    public void Journal() {
        setScene(new Scene(new Journal(this), 600, 600));
    }

    public void Settings() {
        setScene(new Scene(new Settings(this), 600, 600));
    }

}

