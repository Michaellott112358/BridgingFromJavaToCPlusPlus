package ccac.bridgingfromjavatocplusplus;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;



public class MenuStart extends Application {

    @Override
    public void start(Stage stage){
        //create border panes to define outer and inner region
        BorderPane borderOuter = new  BorderPane();
        BorderPane borderInner = new BorderPane();

        //set border outer
        borderOuter.setTop(new EmptyPane(100,75,100,75));
        borderOuter.setRight(new EmptyPane(100,75,100,75));
        borderOuter.setBottom(new EmptyPane(50,75,100,75));
        borderOuter.setLeft(new EmptyPane(0,75,0,75));
        borderOuter.setCenter(borderInner);

        //create stack panes to hold text for inner region nodes
        StackPane innerTop = new StackPane();
        StackPane innerCenter = new StackPane();
        innerTop.getChildren().add(new Label("Welcome to the Bridge App"));

        double test = borderInner.getMaxWidth();

        System.out.println(test);

        innerCenter.getChildren().add(new Label("This application does things"));

        //create buttons
        HBox buttonBox = new HBox();
        Button buttonLessons = new Button("Lessons");
        Button buttonQuizzes = new Button("Quizzes");

        //set border inner
        borderInner.setTop(innerTop);
        borderInner.setCenter(innerCenter);
        borderInner.setBottom(buttonBox);

        //set button box and configure
        buttonBox.getChildren().add(buttonLessons);
        buttonBox.getChildren().add(buttonQuizzes);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);

        //construct scene
        Scene scene = new Scene(borderOuter);
        stage.setTitle("Bridging From Java to C++");
        stage.setScene(scene);
        stage.show();
    }
}
class OptionButton extends Button{
    public OptionButton(String title){
        getChildren().add(new Label(title));
        setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    }
}
class EmptyPane extends StackPane{
    public EmptyPane(double top, double right, double bottom, double left){
        setStyle("-fx-border-color: green");
        setPadding(new Insets(top, right, bottom, left));
    }
}
class ButtonPane extends StackPane{
    public ButtonPane(String title){
        getChildren().add(new Button(title));
        setStyle("-fx-border-color: red");
        //setPadding(new Insets(500, 25, 500, 25));
    }
}