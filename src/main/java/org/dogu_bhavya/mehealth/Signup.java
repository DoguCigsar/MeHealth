package org.dogu_bhavya.mehealth;
import org.dogu_bhavya.mehealth.Scenemanager;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import static javafx.application.Application.launch;

public class Signup extends VBox
{
    public Signup (Scenemanager sm) {
        setPadding(new Insets(20));
        setSpacing(15);

        Label title = new Label("Signup");

        TextField userName = new TextField();
        userName.setPromptText("Username");

        PasswordField password = new PasswordField();
        password.setPromptText("Password");

        Button goBtn = new Button("Next");
        goBtn.setOnAction(e -> sm.SignupQuestions());

        getChildren().addAll(title, userName, password, goBtn);
    }
    public static void ogin(String[] args) {
        launch(args);
    }
}

