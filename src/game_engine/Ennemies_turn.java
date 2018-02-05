/**
 * Gestion des tours des PNJs et de leurs IA
 */

package game_engine;
import Characters.Ennemies;
import environment.PlayableGroupList;
import Characters.Base;
import java.io.*;

public class Ennemies_turn implements java.io.Serializable{
	Base base= new Base();
	
	//Fait bouger l'ennemi totalement aléatoirement
	public void alea_move(Ennemies ennemies){
		
	}
	
	
	//Fait bouger l'ennemi en suivant le personnage
	public void target_move(Ennemies ennemies){
		
	}
	
	//Crée une base de façon aléatoire pour l'ennemi
	public Base alea_base(Ennemies ennemies, int x, int y){
		return base;
	}
	
	//Crée une base de façon stratégique par exemple proche du personnage
	public Base target_base(Ennemies ennemies, int x, int y){
		return base;
	}
	
	//Lancer un combat
	public void attack(Ennemies ennemies, Character character){
		
	}
}
