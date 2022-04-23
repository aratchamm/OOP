
import java.io.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MenuItemOpen {

	// init menu item "open"
	private static MenuItem menuItemOpen = new MenuItem("Load");

	// add functionality to open filechooser upon click
	public static MenuItem createMenuItemOpen() {
		
		menuItemOpen.setOnAction(action -> {
            		MenuItemOpen.openFile(Editor.getStage());
        	});

		return menuItemOpen;
	}

	// functionality to open filechooser for text and java files
	private static void openFile(Stage stage) {

		FileChooser fileChooser = new FileChooser();
		
		File file = fileChooser.showOpenDialog(stage);
		if(file.getName().endsWith(".txt")) {
			MenuItemOpen.addFileToTextArea(file);
		}
		else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("can't open");
			alert.setHeaderText("This file can't open.");
			alert.setContentText("Please changes file.");
			alert.showAndWait();
		}
		
	
	}

	// functionality to read file and add to textarea
	private static void addFileToTextArea(File file) {

		String text;

		TextArea textArea = EditorTextArea.getTextArea();
		textArea.clear();

        	try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            		while ((text = bufferedReader.readLine()) != null) {
                	textArea.appendText(text + "\n");
            		}
        	} catch (IOException e) {
            		e.printStackTrace();
        	}
	}
}