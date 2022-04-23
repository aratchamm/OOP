
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Editor extends Application {

	// set variables
	private static Stage stage;
	private static int width = 600;
	private static int height = 400;
	private static String title = "Text Editor";

 	public static Stage getStage() {
        	return stage;
    	}
	
	@Override
	public void start(Stage stage) {

		// create vbox root for menubar and textarea
		VBox root = new VBox();
		root.setPadding(new Insets(10));
        	root.setSpacing(5);

		// create menubar and textarea and add to root
		MenuBar menuBar = EditorMenuBar.createMenuBar();
		TextArea textArea = EditorTextArea.createTextArea(width, height);
		root.getChildren().addAll(menuBar, textArea);

		// create the whole thing
 		Scene scene = new Scene(root, width, height);
        	stage.setTitle(title);
        	stage.setScene(scene);
        	stage.show();
    	}
	
 	public static void main(String[] args) {
        	launch(args);
    	}
}
