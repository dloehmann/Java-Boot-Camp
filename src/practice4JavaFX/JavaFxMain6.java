package practice4JavaFX;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFxMain6 extends Application {

    Text scenetitle = new Text("Welcome");
    TextField userTextField = new TextField();
    TextField ageTextField = new TextField();
    Person[] persons = new Person[10];
    final Text[] actiontargets = new Text[10];

    int counter = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        grid.add(userTextField, 1, 1);
        grid.add(ageTextField, 1, 2);

        Label age = new Label("Age:");
        grid.add(age, 0, 2);

        Button btn = new Button("Show");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        for (int i = 0; i < 10; i++) {
            actiontargets[i] = new Text();
            grid.add(actiontargets[i], 1, 6 + i);
        }


        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                persons[counter] = new Person(userTextField.getText(), Integer.parseInt(ageTextField.getText()));
                actiontargets[counter].setFill(Color.FIREBRICK);
                actiontargets[counter].setText("Hello, my name is " + persons[counter].getName() + " and I am " +
                        persons[counter].getAge
                        () + " years old.");
                counter++;
            }
        });



        Scene scene = new Scene(grid, 500, 600);
        primaryStage.setScene(scene);


        primaryStage.show();
    }


}
