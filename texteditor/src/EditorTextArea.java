
import javafx.scene.control.TextArea;

 
public class EditorTextArea {

	// init text area
	private static TextArea textArea = new TextArea();

	// set pre-defined size
	public static TextArea createTextArea(int width, int height) {

		textArea.setPrefSize(width, height);

		return textArea;
	}

	public static TextArea getTextArea() {

		return textArea;
	}	
}
