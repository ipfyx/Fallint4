/**
 * Definition des objets craftable ou trouvable durant la partie, ainsi que leurs caracteristiques
 */

package Characters;
import java.io.*;
public class Objects implements java.io.Serializable{
	public int health_bonus;
	public int strength_bonus;
	public static int weigth;				//object has a weigth so their number can be limited in the inventory
	public String name;
	
	public Objects () {		
	}	
	public Objects (int health_bonus, int strength_bonus, int weigth) {
		this.health_bonus = health_bonus;
		this.strength_bonus = strength_bonus;
		this.weigth = weigth;
	}
}
