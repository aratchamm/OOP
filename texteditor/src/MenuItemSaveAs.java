import java.io.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.*;
import javafx.stage.Stage;

public class MenuItemSaveAs {

	// init menu item "save as"
	private static MenuItem menuItemSaveAs = new MenuItem("Save As");

	// add functionality to open filechooser for saving files
	public static MenuItem createMenuItemSaveAs() {
		
		menuItemSaveAs.setOnAction(action -> {
				MenuItemSaveAs.saveAsFile(Editor.getStage());
        	});

		return menuItemSaveAs;
	}

	// functionality to open filechooser and save file
	private static void saveAsFile(Stage stage) {

		FileChooser fileChooser = new FileChooser();

		TextArea textArea = EditorTextArea.getTextArea();

		String textToSave = textArea.getText(); 

        	try {

            fileChooser.getExtensionFilters().addAll(
      	 	new ExtensionFilter("Text Files", "*.txt")
		    );

			File file = fileChooser.showSaveDialog(stage);

     			if (file != null) {
                		PrintWriter fileToSave = new PrintWriter(file);
                		BufferedWriter bufferedWriter = new BufferedWriter(fileToSave);
                		bufferedWriter.write(textToSave);
                		bufferedWriter.close();
            		}
		} catch (FileNotFoundException e) {
            		System.out.println("Error: " + e);
        	} catch (IOException e) {
            		e.printStackTrace();
        	}
	}
}