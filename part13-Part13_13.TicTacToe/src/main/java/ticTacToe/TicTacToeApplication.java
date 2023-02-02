package ticTacToe;

import com.sun.javafx.scene.control.LabeledText;
import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    String turn = "X";
    int gameState = 9;
    Label turnLabel = new Label();
    GridPane tictac = new GridPane();
    String tiles[][] = new String[3][3];
    boolean winner = false;

    @Override
    public void start(Stage stage) throws Exception {
        fillTiles();
        BorderPane window = new BorderPane();

        turnLabel.setText("Turn: " + turn);

        turnLabel.setFont(Font.font("Monospaced", 40));
        window.setTop(turnLabel);
        window.setCenter(tictac);

        //Buttons creation
        Button btn1 = new Button(" ");
        btn1.setFont(Font.font("Monospaced", 40));
        Button btn = new Button(" ");
        btn.setFont(Font.font("Monospaced", 40));
        Button btn2 = new Button(" ");
        btn2.setFont(Font.font("Monospaced", 40));
        Button btn3 = new Button(" ");
        btn3.setFont(Font.font("Monospaced", 40));
        Button btn4 = new Button(" ");
        btn4.setFont(Font.font("Monospaced", 40));
        Button btn5 = new Button(" ");
        btn5.setFont(Font.font("Monospaced", 40));
        Button btn6 = new Button(" ");
        btn6.setFont(Font.font("Monospaced", 40));
        Button btn7 = new Button(" ");
        btn7.setFont(Font.font("Monospaced", 40));
        Button btn8 = new Button(" ");
        btn8.setFont(Font.font("Monospaced", 40));
        Button btn9 = new Button(" ");
        btn9.setFont(Font.font("Monospaced", 40));

        //Buttons adding and padding
        tictac.add(btn1, 0, 0);
        tictac.add(btn2, 1, 0);
        tictac.add(btn3, 2, 0);
        tictac.add(btn4, 0, 1);
        tictac.add(btn5, 1, 1);
        tictac.add(btn6, 2, 1);
        tictac.add(btn7, 0, 2);
        tictac.add(btn8, 1, 2);
        tictac.add(btn9, 2, 2);
        tictac.setHgap(10);
        tictac.setVgap(10);
        tictac.setPadding(new Insets(10, 10, 10, 10));

        btn1.setOnAction((event) -> {
            if (btn1.getText().isBlank() && (!winner)) {
                tiles[0][0] = turn;
                btn1.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();

            }
        });
        btn2.setOnAction((event) -> {
            if (btn2.getText().isBlank() && (!winner)) {
                tiles[0][1] = turn;
                btn2.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();
            }
        });
        btn3.setOnAction((event) -> {
            if (btn3.getText().isBlank() && (!winner)) {
                tiles[0][2] = turn;
                btn3.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();
            }
        });
        btn4.setOnAction((event) -> {
            if (btn4.getText().isBlank() && (!winner)) {
                tiles[1][0] = turn;
                btn4.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();
            }
        });
        btn5.setOnAction((event) -> {
            if (btn5.getText().isBlank() && (!winner)) {
                tiles[1][1] = turn;
                btn5.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();
            }
        });
        btn6.setOnAction((event) -> {
            if (btn6.getText().isBlank() && (!winner)) {
                tiles[1][2] = turn;
                btn6.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();
            }
        });
        btn7.setOnAction((event) -> {
            if (btn7.getText().isBlank() && (!winner)) {
                tiles[2][0] = turn;
                btn7.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();
            }
        });
        btn8.setOnAction((event) -> {
            if (btn8.getText().isBlank() && (!winner)) {
                tiles[2][1] = turn;
                btn8.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();
            }
        });
        btn9.setOnAction((event) -> {
            if (btn9.getText().isBlank() && (!winner)) {
                tiles[2][2] = turn;
                btn9.setText(getNextTurn());
                turnLabel.setText("Turn: " + turn);
                checkGameState();
            }
        });

        Scene view = new Scene(window);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);

    }

    private String getNextTurn() {
        if (turn.equals("X")) {
            this.turn = "O";
            return "X";
        }
        this.turn = "X";
        return "O";
    }

    private void checkGameState() {
        gameState--;
        if (gameState == 0) {
            turnLabel.setText("The end!");
        }
        if (winner) {
            turnLabel.setText("The end!");

        }
        checkWinner();
    }

    private void checkWinner() {
        // First diagonal
        if ((tiles[0][0].equals(tiles[1][1])) && (tiles[1][1].equals(tiles[2][2]))) {
            turnLabel.setText("The end!");
            winner = true;
            return;
        }
        // Second diagonal
        else if ((tiles[0][0].equals(tiles[0][1])) && (tiles[0][1].equals(tiles[0][2]))) {
            turnLabel.setText("The end!");
            winner = true;
            return;
        }
        // First horizontal
        else if ((tiles[0][0].equals(tiles[0][1])) && (tiles[0][1].equals(tiles[0][2]))) {
            turnLabel.setText("The end!");
            winner = true;
            return;
        }
        // Second horizontal
        else if ((tiles[1][0].equals(tiles[1][1])) && (tiles[1][1].equals(tiles[1][2]))) {
            turnLabel.setText("The end!");
            winner = true;
            return;
        }

        //Third horizontal
        else if ((tiles[2][0].equals(tiles[2][1])) && (tiles[2][1].equals(tiles[2][2]))) {
            turnLabel.setText("The end!");
            winner = true;
            return;
        }

        //First vertical
        else if ((tiles[0][0].equals(tiles[1][0])) && (tiles[1][0].equals(tiles[2][0]))) {
            turnLabel.setText("The end!");
            winner = true;
            return;
        }

        //Second vertical
        else if ((tiles[0][1].equals(tiles[1][1])) && (tiles[1][1].equals(tiles[1][2]))) {
            turnLabel.setText("The end!");
            winner = true;
            return;
        }

        //Third vertical 
        else if ((tiles[2][0].equals(tiles[2][1])) && (tiles[2][1].equals(tiles[2][2]))) {
            turnLabel.setText("The end!");
            winner = true;
            return;
        }

    }

    private void fillTiles(){
        for (int i = 0; i < 3; i++){
            for (int j = 0 ; j < 3; j++){
                tiles[i][j] = String.valueOf(i) + String.valueOf(j);            
            } 
        }
    }
}
