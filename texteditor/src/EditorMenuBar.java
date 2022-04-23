
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;


public class EditorMenuBar {

	// init menubar
	private static MenuBar menuBar = new MenuBar();

	// add menu file
	public static MenuBar createMenuBar() {
				
		Menu menuFile = MenuFile.createMenuFile();
		
		menuBar.getMenus().addAll(
			menuFile
		);

		return menuBar;
	}
}
