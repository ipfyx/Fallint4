/**
 * Definition des materiaux de base utilises pour le craft durant la partie
 */

package Characters;
import java.io.*;
import java.util.ArrayList;

import environment.Objects_and_number;

public class Inventory implements java.io.Serializable{
	
	public static int MAX_WEIGTH = 100;
	
	public int food;
	public int water;
	public int wood;	
	
	/**
	 * Les objects sont stock dans un ArrayList de (Object,number_of_object)
	 * Object pour avoir le nom, et les bonus apportes par l'object, 
	 * et number_of_object pour compter ses occurences dans l'inventaire
	 */
	public ArrayList<Objects_and_number> objects_in_inventory = new ArrayList();
	
	public int weigth;
		
	public Inventory() {	
	food = 10 ;
	water = 10 ;
	wood = 10;
	objects_in_inventory.clear();
	}
	
	/**
	 * Pour compter le poids des ressource
	 */
	public int Weigth_Ressources(){
		int weigth=0;
		weigth = this.food + this.water + this.wood;
		return weigth;
	}
	
	/**
	 *  Pour compter le poids des objects
	 */
		public int Weigth_Object(){
		int weigth=0;
		
		for (int i=0; i < objects_in_inventory.size(); i++) {
			weigth = weigth + this.objects_in_inventory.get(i).object.weigth * this.objects_in_inventory.get(i).nbr_object;
		}		
		return weigth;
	}
	
	
	/**
	* Pour compter le poids totale
	*/	
	public void Weigth(){
		weigth = this.Weigth_Object() + this.Weigth_Ressources();
		this.weigth = weigth;
	}
	
	/**
	 * Pour ajouter un objet dans l'inventaire, 
	 * si on a deja ce type d'objet dans l'inventaire, il faut incrementer 
	 * le nombre d'occurence de cet objet de number_to_add
	 * Sinon, il faut .add cet objet avec le nombre d'occurence associée 
	 */
	
	public void AddObject (Objects object, int number_to_add) {
		
		Objects_and_number object_to_add = new Objects_and_number (object, number_to_add);
		
		for (int i=0; i < objects_in_inventory.size(); i++) {
			if (this.objects_in_inventory.get(i).object.name == object.name) {
				this.objects_in_inventory.get(i).nbr_object = this.objects_in_inventory.get(i).nbr_object + number_to_add;
				return;
			}
		}	
		this.objects_in_inventory.add(object_to_add);		
	}
	
	/**
	 * Retourne vrai si l'objet est deja dans l'inventaire
	 */
	public boolean isObjectsInInventory (Objects object) {
		boolean bool = false;
		
		for (int i=0; i < objects_in_inventory.size(); i++) {
			if (this.objects_in_inventory.get(i).object.name == object.name) {
				bool = true;
			}
		}
		return bool;
	}
	
	/**
	 * Retourne le nombre d'occurence de l'objet dans l'inventaire
	 */
	public int howManyObjectsInInventory (Objects object) {
		int number = 0;
		
		if (this.isObjectsInInventory(object) == true) {		//coucou guillaume
			for (int i=0; i < objects_in_inventory.size(); i++) {
				if (this.objects_in_inventory.get(i).object.name == object.name) {
					number = this.objects_in_inventory.get(i).nbr_object;
				}
			}
		}		
		return number;
	}
	
	/**
	 * Retourne l'indice de l'objet dans l'ArrayList de l'inventaire
	 */
	
	public int position_objects_in_inventory (Objects object) {
		int position = -1;	
		if (this.isObjectsInInventory(object) == true) {		//coucou guillaume
			for (int i=0; i < objects_in_inventory.size(); i++) {
				if (this.objects_in_inventory.get(i).object.name == object.name) {
					position=i;
				}
			}
		}
		return position;
	}
	
	/**
	 * Avant de remove x fois un objet,
	 * il faut verifier que cet objet est dans l'inventaire
	 * il faut verifier que l'objet est plus de x fois dans l'inventaire
	 * Si c'est bon, on decremente le nombre d'occurence associé, et si il passe a 0,
	 * completement remove l'objet
	 */
	public void DumpObject (Objects object, int number_to_remove) {
		Objects_and_number object_to_remove = new Objects_and_number (object, number_to_remove);
		
		if (this.isObjectsInInventory(object) == false) {
			System.out.println("Vous ne possedez pas de"+object.name);
		}
		else {
			int number_in_inventory = this.howManyObjectsInInventory(object);
			if (number_in_inventory < number_to_remove) {
				System.out.println("T'en as pas assez");
			}
			else {
				this.objects_in_inventory.get(this.position_objects_in_inventory(object)).nbr_object = this.objects_in_inventory.get(this.position_objects_in_inventory(object)).nbr_object - number_to_remove;
			}
		}
		
		if (this.objects_in_inventory.get(this.position_objects_in_inventory(object)).nbr_object == 0) {
			this.objects_in_inventory.remove(this.position_objects_in_inventory(object));
		}
	}
	
	/**
	 *  Pour compter les bonus de forces de l'inventaire
	 */
		public int Strength_from_Objects(){
		int strength=0;
		
		for (int i=0; i < objects_in_inventory.size(); i++) {
			strength = strength + this.objects_in_inventory.get(i).object.strength_bonus * this.objects_in_inventory.get(i).nbr_object;
		}		
		return strength;
	}
}