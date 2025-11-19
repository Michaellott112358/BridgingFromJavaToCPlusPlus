package ccac.bridgingfromjavatocplusplus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LessonTopic1 extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){

    }
    public void start2(){
        //creates outer region border
        BorderPane borderOuter = new  BorderPane();

        //set border outer to empty panes with specific insets
        borderOuter.setTop(new EmptyPane(20,75,20,0, true));
        borderOuter.setRight(new EmptyPane(0,30,0,30, true));
        borderOuter.setBottom(new EmptyPane(20,30,20,0, true));
        borderOuter.setLeft(new EmptyPane(0,30,0,30, true));

        Stage stage = new Stage();

        //borderOuter.setCenter(borderInner);

        //construct scene
        Scene scene = new Scene(borderOuter);
        stage.setMaximized(true);
        stage.setTitle("Bridging From Java to C++");
        stage.setScene(scene);
        stage.show();
    }
}
