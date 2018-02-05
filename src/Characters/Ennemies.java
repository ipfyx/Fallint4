/**
 * Extension de la classe characters pour definir les ennemies du jeu, regroupes en groupe aussi
 */

package Characters;
import java.util.ArrayList;

import Characters.Group;
import java.io.*;
import java.io.*;
public class Ennemies implements java.io.Serializable{

	public int action_point;

	public int health;
	public int strength;
	public int position_x;
	public int position_y;
	public String name;
	
	public Inventory inventory = new Inventory();
	
	public Ennemies(String name){
		this.name = name;
		this.health = 20;
		this.strength = 3;
		this.inventory.food = 5;
		this.inventory.water = 5;
		this.inventory.wood = 5;
	}
	
	public Ennemies (int health, int strength, int food, int water, int wood, String name, int x, int y) {
		if (health <= 0) throw new IllegalArgumentException("Cannot generate a ennemy with 0 health");
		if (strength < 0) throw new IllegalArgumentException("Cannot generate a ennemy with negative strength");
		if (food < 0) throw new IllegalArgumentException("Cannot generate a ennemy with negative foof");
		if (water < 0) throw new IllegalArgumentException("Cannot generate a ennemy with negative water");
		if (wood< 0) throw new IllegalArgumentException("Cannot generate a ennemy with negative wood");
		if (x < 0 || x > 30 || y < 0 || y > 30) throw new IllegalArgumentException("Cannot place ennemy out of bounds");
		
		
		else {
			this.health = health;
			this.strength = strength;
			this.inventory.food = food;
			this.inventory.water = water;
			this.inventory.wood = wood;
			this.name = name;
			this.position_x = x;
			this.position_y = y;
		}
		
	}
	
	public void displayEnnemy() {
		System.out.println("health =" + this.getHealth()+ " force =" + this.getStrength() + ",x=" + this.getPosition_x() + ",y=" + this.getPosition_y()+ ",food=" + this.inventory.food + ",water=" + this.inventory.water + ",action_point=" + this.action_point);
	}

	public int getAction_point() {
		return action_point;
	}

	public void setAction_point(int action_point) {
		this.action_point = action_point;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getPosition_x() {
		return position_x;
	}

	public void setPosition_x(int position_x) {
		this.position_x = position_x;
	}

	public int getPosition_y() {
		return position_y;
	}

	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	
}
