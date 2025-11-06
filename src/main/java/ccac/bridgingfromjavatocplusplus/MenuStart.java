package ccac.bridgingfromjavatocplusplus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;


public class MenuStart extends Application {

    @Override
    public void start(Stage stage){
        //create border panes
        BorderPane borderOuter = new  BorderPane();
        BorderPane borderInner = new BorderPane();

        //Create Hbox
        HBox hbox = new HBox();

        //Create VBox
        VBox vbox = new VBox();

        //create buttons
        OptionButton buttonLessons = new OptionButton("Lessons");
        OptionButton buttonQuizzes = new OptionButton("Quizzes");
        OptionButton buttonOptions = new OptionButton("Options");

        buttonLessons.setMaxHeight(10000);


        //create empty pane
        EmptyPane emptyPane = new EmptyPane();

        //set border outer
        borderOuter.setTop(new EmptyPane());
        borderOuter.setRight(new EmptyPane());
        borderOuter.setBottom(new EmptyPane());
        borderOuter.setLeft(new EmptyPane());
        borderOuter.setCenter(borderInner);

        //set border inner
        borderInner.setTop(new Label("Welcome to the Bridge App"));
        borderInner.setCenter(new Label("This application does things"));
        borderInner.setBottom(hbox);

        //set hbox
        hbox.getChildren().add(buttonLessons);
        hbox.getChildren().add(buttonQuizzes);
        hbox.getChildren().add(buttonOptions);

        /*
        vbox.getChildren().add(new ButtonPane("Welcome to the Bridge App"));
        vbox.getChildren().add(new ButtonPane("This application does things"));
        vbox.getChildren().add(hbox);*/

        //construct scene
        Scene scene = new Scene(borderOuter);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
class OptionButton extends Button{
    public OptionButton(String title){
        getChildren().add(new Label(title));
        setHeight(5000);
        setWidth(1000);
    }
}


class EmptyPane extends StackPane{
    public EmptyPane(){
        setStyle("-fx-border-color: green");
        setPadding(new Insets(10, 12.5, 13.5, 14.5));
    }
}
class ButtonPane extends StackPane{
    public ButtonPane(String title){
        getChildren().add(new Button(title));
        setStyle("-fx-border-color: red");
        setPadding(new Insets(10, 12.5, 13.5, 14.5));
    }
}