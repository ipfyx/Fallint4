/**
 * Detaille des caracteristiques d'une base (infrastructure constructible)
 */

package Characters;
import java.io.*;

public class Base implements java.io.Serializable{
	boolean wall;
	boolean tent;
	int health_bonus;
	
	public Base () {
		/*
		 * se stock dans environment sous la forme d'une liste de boolean, le premier pour savoir si le mur est construit ou non,
		 * le deuxieme pour la tente, etc
		*/
		
		wall = false;
		tent = true;
	}

}
