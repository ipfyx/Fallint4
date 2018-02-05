/**
 * Package main qui permet le deboggage et l'initialisation de la partie graphique
 * 
 * @author Guillaume
 *
 */

package preloader;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.text.Font;


public class Main extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		Parent root;
		try
		{
			root = FXMLLoader.load(getClass().getResource("/graphic_interface_views/Main_menu.fxml"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("FallInt");
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	
	
	
	
	
}
