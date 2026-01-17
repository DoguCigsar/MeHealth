package org.dogu_bhavya.mehealth;
import org.dogu_bhavya.mehealth.Scenemanager;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import static javafx.application.Application.launch;
public class Journal extends VBox
{
    public Journal(Scenemanager sm)
    {
        setPadding(new Insets(20));
        setSpacing(15);

        Label title = new Label("Journal");

        TextArea write = new TextArea();
        Button saveBtn = new Button("Save");
        Button mainmenuBtn = new Button("Back");
        mainmenuBtn.setOnAction(e -> sm.MainMenu());
        write.setPromptText("Write about day");
        getChildren().addAll(title, write,mainmenuBtn,saveBtn);

    }
}
