package practice7ballGame;

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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BallGame extends Application {


    private static final Color SELECTED_COLOR = Color.RED;
    private static final Color DESELECTED_COLOR = Color.BLUE;
    private static final Paint ALT_SELECTED_COLOR = Color.GREEN;
    final Text actiontarget = new Text("");
    Text instruction = new Text("");
    Text lastInstruction = new Text("Click the heavier ball!");
    Circle[] circles = null;
    HBox nextHbBtn = new HBox(10);
    HBox resetHbBtn = new HBox(10);
    HBox clearHbBtn = new HBox(10);
    HBox lastInstructionHbBtn = new HBox(10);
    Stage primaryStage;
    Button nextBtn = new Button("Show Weight");
    Button clearBtn = new Button("Clear Field");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage p) {
        primaryStage = p;
        primaryStage.setTitle("Ball Game");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Text scenetitle = new Text("Ball game!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        grid.add(scenetitle, 0, 0, 3, 1);

        Text explanation = new Text("Find the heaviest ball \n by comparing the weight of two groups.\n Mark one " +
                "group " +
                "by clicking,\n the other one by double-clicking. \n Tap the button to compare. \n" +
                " You " +
                "have two tries.");
        explanation.setFont(Font.font("Tahoma", FontPosture.ITALIC, 14));
        grid.add(explanation, 4, 2, 1, 3);

        instruction.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(instruction, 0, 1, 3, 1);

        grid.add(actiontarget, 0, 9, 3, 1);

        Button resetBtn = new Button("Want another game?");
        nextHbBtn.setAlignment(Pos.BOTTOM_LEFT);
        lastInstructionHbBtn.setAlignment(Pos.BOTTOM_LEFT);
        nextHbBtn.getChildren().add(nextBtn);
        lastInstructionHbBtn.getChildren().add(lastInstruction);
        clearHbBtn.getChildren().add(clearBtn);
        resetHbBtn.setAlignment(Pos.BOTTOM_LEFT);
        clearHbBtn.setAlignment(Pos.BOTTOM_LEFT);
        resetHbBtn.getChildren().add(resetBtn);
        resetHbBtn.setVisible(false);
        nextBtn.setDisable(true);
        resetHbBtn.setVisible(false);
        lastInstruction.setVisible(false);
        grid.add(nextHbBtn, 0, 6, 3, 1);
        grid.add(lastInstructionHbBtn, 0, 6, 3, 1);
        grid.add(resetHbBtn, 0, 7, 3, 1);
        grid.add(clearHbBtn, 0, 8, 3, 1);


        nextBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.BLACK);
                actiontarget.setText(BallGameService.instance().getWeightText());
//                resetSelections();
                next();
            }
        });

        clearBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                resetSelections();
            }
        });

        Ball[] balls = BallGameService.instance().generateBalls();
        circles = new Circle[balls.length];
        for (int i = 0; i < balls.length; i++) {
            circles[i] = new Circle(25d, 25d, 25d);
            circles[i].setFill(DESELECTED_COLOR);
            grid.add(circles[i], i % 3, (i) / 3 + 2);
            final int finalI = i;
            circles[i].setOnMouseClicked(new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    if (BallGameService.instance().getRounds() < 3) {
                        balls[finalI].toggleSelectionType();
                        int selectionType = balls[finalI].getSelectionType();
                        switch (selectionType) {
                            case 0:
                                circles[finalI].setFill(DESELECTED_COLOR);
                                System.out.println("Ball " + finalI + " unselected.");
                                break;
                            case 1:
                                circles[finalI].setFill(SELECTED_COLOR);
                                System.out.println("Ball " + finalI + " selected.");
                                break;
                            case 2:
                                circles[finalI].setFill(ALT_SELECTED_COLOR);
                                System.out.println("Ball " + finalI + " alt selected.");
                                break;
                        }
                        nextBtn.setDisable(!BallGameService.instance().existBothSelections());

                    } else if (BallGameService.instance().getRounds() == 3) {
                        actiontarget.setFill(Color.FIREBRICK);
                        actiontarget.setText(BallGameService.instance().getResultText(finalI));
                        System.out.println(BallGameService.instance().getResultText(finalI));
                        next();
                    }
                }
            });
        }


        resetBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setText("");
//                BallGameService.instance().generateBalls();
                BallGameService.instance().resetRounds();
                next();
            }
        });
        Scene scene = new Scene(grid, 600, 500);
        primaryStage.setScene(scene);
        next();
        primaryStage.show();
    }

    private void next() {
        BallGameService.instance().increaseRounds();
        switch (BallGameService.instance().getRounds()) {
            case 1:
                nextHbBtn.setVisible(true);
                nextBtn.setDisable(true);
                clearHbBtn.setVisible(true);
                resetHbBtn.setVisible(false);
                lastInstructionHbBtn.setVisible(false);
                actiontarget.setText("");
                break;
            case 2:
                nextHbBtn.setVisible(true);
                nextBtn.setDisable(true);
                resetHbBtn.setVisible(false);
                clearHbBtn.setVisible(true);
                lastInstructionHbBtn.setVisible(false);
                break;
            case 3:
                nextHbBtn.setVisible(false);
                resetHbBtn.setVisible(false);
                clearHbBtn.setVisible(false);
                lastInstructionHbBtn.setVisible(true);
                break;
            case 4:
                resetBalls();
                nextHbBtn.setVisible(false);
                resetHbBtn.setVisible(true);
                clearHbBtn.setVisible(false);
                lastInstructionHbBtn.setVisible(false);
                break;
        }
        instruction.setText(BallGameService.instance().returnInstruction());
//        primaryStage.close();
        primaryStage.show();
    }

    private void resetBalls() {
        BallGameService.instance().resetBalls();
        for (Circle c : circles) {
            c.setFill(DESELECTED_COLOR);
        }
    }

    private void resetSelections() {
        BallGameService.instance().resetSelections();
        for (Circle c : circles) {
            c.setFill(DESELECTED_COLOR);
        }
    }


}
