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

    Stage stage;

    @Override
    public void start(Stage stage){
        //create border panes to define outer and inner region
        BorderPane borderOuter = new  BorderPane();
        BorderPane borderInner = new BorderPane();

        //set border outer
        borderOuter.setTop(new EmptyPane(100,75,100,75, false));
        borderOuter.setRight(new EmptyPane(100,75,100,75, false));
        borderOuter.setBottom(new EmptyPane(50,75,100,75, false));
        borderOuter.setLeft(new EmptyPane(0,75,0,75, false));
        borderOuter.setCenter(borderInner);

        //stack pane holds label for welcome message
        StackPane innerTop = new StackPane();
        Label innerTopLabel = new Label("Welcome to the Bridge App");
        innerTopLabel.setFont(new Font("Ariel", 45));
        innerTop.getChildren().add(innerTopLabel);

        //stack pane holds label for description message
        StackPane innerCenter = new StackPane();
        Label innerCenterLabel = new Label("This Quiz application is designed to help students with learning C++ through comparison of Java and C++");
        innerCenterLabel.setFont(new Font("Ariel", 20));
        innerCenter.getChildren().add(innerCenterLabel);

        //create buttons for quiz and lesson pages
        //TODO property binding
        HBox buttonBox = new HBox(50);
        //buttonBox.
        Button buttonLessons = new Button("Lessons");
        Button buttonQuizzes = new Button("Quizzes");

        buttonLessons.setPrefSize(200,100);
        buttonQuizzes.setPrefSize(200,100);
        //buttonBox.setPrefSize(250,250);
        //buttonQuizzes.setPrefWidth(buttonBox.getWidth() / 2);

        //set inner border regions to primary node elements
        borderInner.setTop(innerTop);
        borderInner.setCenter(innerCenter);
        borderInner.setBottom(buttonBox);

        //set button box and configure
        buttonBox.getChildren().add(buttonLessons);
        buttonBox.getChildren().add(buttonQuizzes);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);

        //construct scene
        Scene scene = new Scene(borderOuter);
        stage.setMaximized(true);
        stage.setTitle("Bridging From Java to C++");
        stage.setScene(scene);
        stage.show();
    }
}
class EmptyPane extends StackPane{
    public EmptyPane(double top, double right, double bottom, double left, boolean color){
        if(color){
            setStyle("-fx-border-color: green");
        }
        setPadding(new Insets(top, right, bottom, left));
    }
}