package projekt;

import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

import com.opencsv.CSVReader;

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

	public static void main(String[] args) throws Exception {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Õpime valemeid");

		// Create CheckBoxes
		CheckBox box1 = new CheckBox("1ga korrutamine");
		CheckBox box2 = new CheckBox("2ga korrutamine");
		CheckBox box3 = new CheckBox("3ga korrutamine");
		CheckBox box4 = new CheckBox("4ga korrutamine");

		// Button

		button = new Button();
		button.setText("Alusta");

		button.setOnAction(e -> {
			try {
				handleOptions(box1, box2, box3, box4);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10));
		layout.getChildren().addAll(box1, box2, box3, box4, button);

		scene = new Scene(layout, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	// Handle Checkboxes
	private Object handleOptions(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4) throws Exception {
		HashMap<String, String> choice = new HashMap<String, String>();
		if (box1.isSelected()) {
			String file = "korrutamine1.csv";
			readInChoice(choice, file);

		}
		if (box2.isSelected()) {
			String file = "korrutamine2.csv";
			readInChoice(choice, file);

		}
		if (box3.isSelected()) {
			String file = "korrutamine3.csv";
			readInChoice(choice, file);

		}
		if (box4.isSelected()) {
			String file = "korrutamine4.csv";
			readInChoice(choice, file);

		}

		return null;
	}

	// Put the formulas that the user chooses into a HashMap
	public static void readInChoice(HashMap<String, String> choice, String file) throws Exception {

		CSVReader reader = new CSVReader(new FileReader(file));

		String[] nextLine;

		while ((nextLine = reader.readNext()) != null) {
			// nextLine[] is an array of values from the line
			String[] a = nextLine[0].split(";");
			choice.put(a[0], a[1]);
		}

		Set set = choice.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		reader.close();

	}

}
