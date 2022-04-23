
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
 
public class MenuFile {

	// init menu "file"
	private static Menu menuFile = new Menu("File");

	// add items "new", "open", and "save"
	public static Menu createMenuFile() {
		
		MenuItem menuItemNew = MenuItemNew.createMenuItemNew(); 
		MenuItem menuItemOpen = MenuItemOpen.createMenuItemOpen(); 
		MenuItem menuItemSaveAs = MenuItemSaveAs.createMenuItemSaveAs(); 

		menuFile.getItems().addAll(
			menuItemNew,
			menuItemOpen,
			menuItemSaveAs
		);

		return menuFile;
	}
}