// Name: Joshua Francis
// Course: CSC 135
// File Name: FInal.java

// This program draws 20 random lines with random size

//Imports I used
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Final extends Application {

    // Constant variables I used
    final int width = 500;
    final int height = 400;
    final int numberOfLines = 20;
    final int minLength = 100;
    final int maxLength = 400;
    final int startPosX = 50;
    final int startPosY = 50;
    final int gap = 15;

    public void start(Stage primaryStage) 
    {

        // Group root to hold all of the lines
        Group root = new Group();

        // Creates a random number generator object for use of the random values 
        Random gen = new Random();

        // Variable to hold the value of the current "gap" between each line (compounds)
        int gapAdd = 0;

        // Loop to write all of the lines
        for (int count = 0; count < numberOfLines; count++) 
        {
            // Creates a random number for every line in the bounds of 100 to 400. 
            int number = gen.nextInt(maxLength-minLength) + minLength;

            // Creates a line that follows all parameters given to it
            Line line = new Line(startPosX, startPosY + gapAdd, number, startPosY + gapAdd);

            //Adds that current line to the loop (Repeats 20 times)
            root.getChildren().add(line);
            gapAdd = gapAdd + gap;
        }
        // Sets color of the scene, adds the root, and sets the width and height
        Scene scene = new Scene(root, width, height, Color.YELLOW);
        // Titles the stage and sets other needed start properties
        primaryStage.setTitle("Lines");
        primaryStage.setScene(scene);
        primaryStage.show();

        // End of loop
    }

    public static void main(String[] args) {
        launch(args);
    }
}
