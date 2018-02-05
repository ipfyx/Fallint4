/**
' * Package CaseModel definissant les attributs de chaque hexagone du plateau, ainsi que les methodes pour les changer, et sa position sur le board
 * 
 * @author Guillaume
 *
 */

package environment;

import java.util.ArrayList;

import javax.swing.event.InternalFrameAdapter;

import Characters.Ennemies;
import Characters.Objects;
import java.io.*;

public class CaseModel implements java.io.Serializable{
	
	//Attributs de chaque case (type de terrain, nom de l'ennemi, objets presents sur la case, coordonnees de la case)
	public CaseType terrain;
	public Ennemies ennemy;
	public ArrayList<Objects_and_number> stuff = new ArrayList();
	public int[] coordinates;
	public boolean infrastructure;
	

	//Constructeur de la classe case
	public CaseModel(CaseType typeTerrain, Ennemies ennemyOnCase, ArrayList<Objects_and_number> lootedStuff, int coordinatesCase[], boolean infra) {
		
		terrain = typeTerrain;
		ennemy = ennemyOnCase;
		
		coordinates = new int [2];
		coordinates[0] = coordinatesCase[0];
		coordinates[1] = coordinatesCase[1];
		
		/** <p> deep copy du ArrayList de String lootedStuff </p>
		 * <p> permet de rendre independant la Arraylist copie de celle d'origine </p>
		 */
		for (int i = 0; i < lootedStuff.size(); i++) {
			stuff.add(lootedStuff.get(i));
		}
		//cf Character.Base pour identifier si une base est construite sur cette case ou pas
		infrastructure = infra;
	}
	
	
	
	//Getter de chacun des attributs de la classe
		/** @return string du terrain */
	public CaseType getTerrain() {
		return terrain;
	}
		/** @return string de l'ennemi present sur la case */
	public Ennemies getEnnemy() {
		return ennemy;
	}
		/** @return un boolean determinant si un ennemi est present ou non */
	public boolean isEnnemyThere() {
		if (ennemy != null) {
			return true;
		}
		return false;
	}
		/** @return un boolean donnant la presence d'une base */
	public boolean isInfrastructure() {
		if (infrastructure) {
			return true;
		}
		else {
			return false;
		}
		
	}
		/** setter du boolean pour la case si une base est construite / detruite */
	public void setInfrastructure(boolean infra) {
		this.infrastructure = infra;
	}
		/** @return liste du stuff present sur la case */
	public ArrayList<Objects_and_number> getStuff() {
		return stuff;
	}
	
	public boolean isStuffThere() {
		boolean bool = true;
		if (this.stuff.isEmpty()) {
			bool = false;
		}
		return bool;
	}
		/** @return doublet d'int representant les coordonnees de la case */
	public int[] getCoordinates () {
		return coordinates;
	}


	
	//Setter de chacun des attributs de la classe
		/** <p> Setter pour le stuff </p>
		 * <p> /!\ Recupere un Arraylist de string </p> 
		 * @param stuff sous forme d'un Arraylist de String
		 */
	public void setStuff(ArrayList<Objects_and_number> stuff) {
		this.stuff = stuff;
	}
		/** Setter pour le terrain 
		 * @param terrain un string */
	public void setTerrain(CaseType terrain) {
		
		if (terrain != CaseType.base && terrain != CaseType.rock && terrain != CaseType.forest && terrain != CaseType.grassland && terrain != CaseType.nonexistent && terrain != CaseType.nothing && terrain != CaseType.water && terrain != CaseType.rock && terrain != CaseType.city) {
			throw new IllegalArgumentException("You entered a wrong CaseType");
		}
		else {
		this.terrain = terrain;
		}
	}
		/** Setter pour l'ennemi
		* @param ennemy un string */
	public void setEnnemy(Ennemies ennemy) {
		this.ennemy = ennemy;
	}
		/** Setter pour les coordonnees
		 * @param x un integer
		 * @param y un integer */
	public void setCoordinates(int x, int y) {
		this.coordinates [0] = x;
		this.coordinates [1] = y;
	}
	
	
	
	//Fonctions supplementaires pour la gestion du stuff sur la case
		/** Ajouter un objet a la case (TODO : gerer les objets en plusieurs exemplaires comme X fois l'objet) 
		 * @param object un String donnant le nom de l'objet a add
		 */
	public void addStuff (Objects object, int number_to_add) {
		Objects_and_number objects_to_add = new Objects_and_number(object, number_to_add);	

		/* Vieux code que je supprimerai quand je serai sûr que ca marche
		int index_of_object = this.stuff.lastIndexOf(objects_to_drop);
		if (index_of_object == -1 || index_of_object == 0) {
			System.out.println("vous ajoutez" + objects_to_drop.object.name + "sur cette case");
			this.stuff.add(objects_to_drop);
		}
		else {
			index_of_object = this.stuff.lastIndexOf(objects_to_drop);
			this.stuff.get(index_of_object).nbr_object = this.stuff.get(index_of_object).nbr_object + number_to_add;			
		}
		*/
		
		for (int i=0; i < stuff.size(); i++) {
			if (this.stuff.get(i).object.name == object.name) {
				this.stuff.get(i).nbr_object = this.stuff.get(i).nbr_object + number_to_add;
				return;
			}
		}	
		this.stuff.add(objects_to_add);

		
		
		
	}
		/** Enlever un objet a la case (TODO : gerer le nombre d'exemplaires a retirer)
		 * @param stuffToRm un String donnant le nom de l'objet a add
		 */

	public void rmStuff (Objects_and_number stuffToRm) {

		int index_of_object = -1;
		
		for (int i=0; i<this.stuff.size(); i++){
			if (stuffToRm.name == this.stuff.get(i).name){
				index_of_object = i ;

			}
		}

		if (index_of_object == -1 || this.stuff.get(index_of_object).nbr_object == 0) {
			System.out.println("Il n'y a pas de " + stuffToRm.name + " sur cette case.");
		}
		else {
			this.stuff.get(index_of_object).nbr_object = this.stuff.get(index_of_object).nbr_object - stuffToRm.nbr_object;
			if (this.stuff.get(index_of_object).nbr_object == 0) {
				this.stuff.remove(index_of_object);
			}
		}
	}
	
	public int howManyObjectOnCase (Objects object) {
		
		int number = 0;
		for (int i=0; i < stuff.size(); i++) {
			if (this.stuff.get(i).object.name == object.name) {
				number = this.stuff.get(i).nbr_object;
			}
		}
		return number;
		
	}
}