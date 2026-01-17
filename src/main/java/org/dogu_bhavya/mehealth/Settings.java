package org.dogu_bhavya.mehealth;
import javafx.geometry.Insets;
import org.dogu_bhavya.mehealth.Scenemanager;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import static javafx.application.Application.launch;


public class Settings extends VBox
{
    public Settings(Scenemanager sm)
    {
        setPadding(new Insets(30));
        setSpacing(20);

        Label title = new Label("Settings");

        Button logoutBtn = new Button("Log Out");//log out button
        logoutBtn.setOnAction(e -> sm.Login());
        getChildren().addAll(title, logoutBtn);

    }

}

