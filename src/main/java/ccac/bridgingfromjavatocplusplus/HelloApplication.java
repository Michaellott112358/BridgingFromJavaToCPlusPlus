package ccac.bridgingfromjavatocplusplus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.text.*;
import javafx.scene.control.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        //create pane
        BorderPane pane = new  BorderPane();
        //create button
        Button button = new Button("button");
        //create custom pane
        CustomPane top = new CustomPane("Top");
        top.getChildren().add(button);

        pane.setTop(top);
        pane.setRight(new CustomPane("Right"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setCenter(new CustomPane("center"));

        //construct scene
        Scene scene = new Scene(pane);
        stage.setTitle("Hello!");
        stage.setScene(scene);
    }
}

class CustomPane extends StackPane{
    public CustomPane(String title){
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: green");
        setPadding(new Insets(10, 12.5, 13.5, 14.5));
    }
}