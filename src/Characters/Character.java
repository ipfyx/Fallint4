/**
 * Definition des attributs d'un personnage
 */

package Characters;

import environment.*;
import environment.Board;
import game_engine.Game;
import java.io.*;

public class Character implements java.io.Serializable {
	
	
	private String nameCharac;
	
	public int max_health;

	public int health;

	public int strength;
	
	public int position_x;
	
	public int position_y;
	
	public Inventory inventory = new Inventory();

	public enum STATUS {
		SAIN, MALADE, EMPOISONNE
	}

	public final STATUS DEFAULT_STATUS = STATUS.SAIN;

	public STATUS statut;

	public Base base;
// Constructeur
	public Character(String name) {
		max_health = 10 ;
		health = 10 ;
		strength = 10 ;
		position_x = (environment.Board.board_type.getPlusXcoordinate()-environment.Board.board_type.getMinusXcoordinate())/2 ;
		position_y = (environment.Board.board_type.getPlusYcoordinate()-environment.Board.board_type.getMinusYcoordinate())/2 ;
		statut = DEFAULT_STATUS ;
		inventory.food = 10;
		inventory.water = 10;
		inventory.wood = 10;
		nameCharac=name;
	}
	
	public Character (String name, int health, int strength, int food, int water, int wood) {
		if (health <= 0) throw new IllegalArgumentException("Cannot generate a character with 0 health");
		if (strength < 0) throw new IllegalArgumentException("Cannot generate a character with negative strength");
		if (food < 0) throw new IllegalArgumentException("Cannot generate a character with negative foof");
		if (water < 0) throw new IllegalArgumentException("Cannot generate a character with negative water");
		if (wood< 0) throw new IllegalArgumentException("Cannot generate a character with negative wood");

		else {
			this.nameCharac = name;
			this.health = health;
			this.strength = strength;
			this.inventory.food = food;
			this.inventory.water = water;
			this.inventory.wood = wood;
		}

	}
	
	public String get_name() {
		return this.nameCharac;
	}
	
	public void set_name(String pname) {
		this.nameCharac = pname;
	}
	
	public int get_health() {
		return health;
	}

	public int get_strength() {
		return strength;
	}
	
	public int getX() {
		return position_x ;
	}

	public int getY() {
		return position_y ;
	}
	
	public STATUS get_STATUS() {
		return statut;
	}
	
	public void set_STATUS(String statut) {
		if (statut == "MALADE"){
			this.statut = STATUS.MALADE;
		}
		else if(statut == "EMPOISONNE"){
			this.statut = STATUS.EMPOISONNE;
		}
		else {
			this.statut = STATUS.SAIN;
		}
	}
	
	public String get_STATUSstr(){
		String statutstr = "";
		STATUS statut = get_STATUS();
		if (statut == STATUS.EMPOISONNE){
			statutstr = "EMPOISONNE";
		}
		else if (statut == STATUS.MALADE){
			statutstr = "MALADE";
		}
		else {
			statutstr = "SAIN";
		}
		return statutstr;
	}
	
	public int get_x() {
		return position_x;
	}
	
	public int get_y() {
		return position_y;
	}

	public void variation_health(int n) {
		if (health + n < 0) {
			health = 0;
		}
		else if(health + n > max_health){
			health = max_health;
		}
		else
			health = health + n;
	}

	public void variation_strength(int n) {
		if (strength + n < 0) {
			strength = 0;
		} else
			strength = strength + n;
	}

}