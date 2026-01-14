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

   /* public void Login() {
        setScene(new Scene(new Login(this), 420, 640));
    }

    public void SignUp() {
        setScene(new Scene(new SignUpView(this), 420, 640));
    }

    public void MainMenu() {
        setScene(new Scene(new MainMenuView(this), 600, 600));
    }

    public void Quiz() {
        setScene(new Scene(new QuizView(this), 600, 600));
    }

    public void Chat() {
        setScene(new Scene(new ChatView(this), 600, 600));
    }

    public void Journal() {
        setScene(new Scene(new JournalView(this), 600, 600));
    }

    public void Settings() {
        setScene(new Scene(new SettingsView(this), 600, 600));
    }

    */
}

