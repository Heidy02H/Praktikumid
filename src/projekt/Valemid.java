package projekt;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Valemid extends Application {

	Stage window;
	Scene scene;
	Button button;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Õpime valemeid");

		// Checkboxes
		CheckBox box1 = new CheckBox("1ga korrutamine");
		CheckBox box2 = new CheckBox("2ga korrutamine");
		CheckBox box3 = new CheckBox("3ga korrutamine");
		CheckBox box4 = new CheckBox("4ga korrutamine");

		// Button

		button = new Button();
		button.setText("Alusta");

		button.setOnAction(e -> handleOptions(box1, box2, box3, box4));

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10));
		layout.getChildren().addAll(box1, box2, box3, box4, button);

		scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	// Handle Checkboxes
	private Object handleOptions(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4) {
		if (box1.isSelected()) {

		}
		return null;
	}

}
