/**
 * Package Main_menu_model gerant les donnees pertinentes pour le menu principal
 * 
 * @author FallINT 4's Team
 *
 */

package graphic_interface_models;

public class Main_menu_model {
	
	private static boolean sound;
	public static boolean NewGame;


	public Main_menu_model() {
		
		sound = true;
		NewGame = true;
	}

	public static boolean isSound() {
		return sound;
	}
	
	public static boolean isNewGame() {
		return NewGame;
	}

	public static void setSound(boolean sound) {
		Main_menu_model.sound = sound;
	}
	
	public static void setNewGame(boolean NewGame) {
		Main_menu_model.NewGame = NewGame;
	}
	
}
