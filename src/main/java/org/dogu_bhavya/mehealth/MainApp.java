package org.dogu_bhavya.mehealth;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Scenemanager sm = new Scenemanager(stage);
        sm.Login();

        stage.setTitle("MeHealth");
        stage.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}