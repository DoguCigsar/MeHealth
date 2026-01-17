package org.dogu_bhavya.mehealth;
import org.dogu_bhavya.mehealth.Scenemanager;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
public class Questions extends VBox
{
    public Questions(Scenemanager sm)
    {   setPadding(new Insets(25));
        setSpacing(15);

        Label question = new Label("Do feel that your mental health has gotten better or worse");

        ToggleGroup group = new ToggleGroup();//options
        RadioButton a = new RadioButton("Better");
        RadioButton b = new RadioButton("Worse");
        RadioButton c = new RadioButton("Same");


        a.setToggleGroup(group);
        b.setToggleGroup(group);
        c.setToggleGroup(group);


        Label q = new Label("On scale of 1 - 10 how bad or good ");

        TextField scale = new TextField();//answer area
        scale.setPromptText("1 being the worst,5 being the same and 10 being the best");



        Button enterBtn = new Button("Enter");//enter button
        enterBtn.setOnAction(e -> sm.MainMenu());

        getChildren().addAll(question, a, b, c,q,scale,enterBtn);
    }



}


