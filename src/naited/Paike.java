package naited;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Paike extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 150, 150);
        primaryStage.setScene(scene);

        Circle ring = new Circle(30);
        ring.setFill(Color.YELLOW);
        stack.getChildren().add(ring);

        primaryStage.show();
		
	}

	

}
