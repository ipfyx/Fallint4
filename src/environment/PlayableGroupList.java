/**
 * Package PlayableGroupList qui regroupe les identifiants de tous les groupes (allies et ennemis) sur le plateau, ainsi que leurs
 * caracteristiques
 * 
 * @author Guillaume
 *
 */

package environment;

import Characters.Group;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PlayableGroupList implements java.io.Serializable {
	public Group group;
	
	//Definition de la liste des groupes en jeu
	private HashMap <String, Group> playableGroup;
	
	
	/**
	 * Definition du constructeur de PlayableGroupList, sous forme d'une hashmap avec un nom unique, et un groupe qui lui est associe.
	 * La fonction recupere une arraylist de groupes a ajouter a la hashmap, et ajoute une par une les entrees en prenant garde a ce que
	 * les doublons se voient ajoutes un digit a la fin.
	 * 
	 * @param existentGroup une arraylist de group des groupes a ajouter
	 */
	public PlayableGroupList(ArrayList<Group> existentGroup) {
		
		this.playableGroup = new HashMap<String, Group>();
		
		boolean nameAlreadyTaken = false;
		Group groupToAdd;
		String name;
		
		if (existentGroup != null){
			//Parcours de la arraylist
			for (int i = 0; i < existentGroup.size(); i++) {
				
				groupToAdd = existentGroup.get(i);
				name = groupToAdd.getName();
				char charNumber;
				String newNumber;
				int intNumber;
				
				//Test si le nom est deja utilise
				do {
					if (this.playableGroup.containsKey(name)) {
						nameAlreadyTaken = true;
						
						//Si le nom possede deja un digit a la fin...
						if (name.endsWith("\\d")) {
							
							//On extrait le digit, l'augmente de 1 et le remplace
							charNumber = name.charAt(name.length() - 1);
							intNumber = Character.getNumericValue(charNumber) + 1;
							newNumber = Integer.toString(intNumber);
							
							name.replace(charNumber, (newNumber.toCharArray())[0] );
						}
						//Sinon
						else {
							name = name + "1";
						}
					}
					else {
						nameAlreadyTaken = false;
					}
				} while (nameAlreadyTaken);
				
				this.playableGroup.put(name, groupToAdd);
			}
		}
	}
	
	/**
	 * 
	 * 
	 * @param groupToAdd un objet Group d'un groupe a ajouter a la hashmap
	 * @return le String du nom auquel le groupe est associe
	 */
	public String addNewGroup (Group groupToAdd) {
		
		boolean nameAlreadyTaken = false;
		String name = groupToAdd.getName();
		char charNumber;
		String newNumber;
		int intNumber;
		
		//Test si le nom est deja utilise
		if (this.playableGroup == null){
			this.playableGroup = new HashMap<String, Group>();
			this.playableGroup.put(name, groupToAdd);
		}
		do {
			if (this.playableGroup.containsKey(name)) {
				nameAlreadyTaken = true;
				
				//Si le nom possede deja un digit a la fin...
				if (name.endsWith("\\d")) {
					
					//On extrait le digit, l'augmente de 1 et le remplace
					charNumber = name.charAt(name.length() - 1);
					intNumber = Character.getNumericValue(charNumber) + 1;
					newNumber = Integer.toString(intNumber);
					
					name.replace(charNumber, (newNumber.toCharArray())[0] );
				}
				//Sinon
				else {
					name = name + "1";
				}
			}
			else {
				nameAlreadyTaken = false;
			}
		} while (nameAlreadyTaken);
		
		this.playableGroup.put(name, groupToAdd);
		
		return name;
	}
	
	/**
	 * Retirer un groupe de la liste
	 * 
	 * @param nomGroupToRm le nom auquel est associe le groupe
	 */
	public void rmGroup (String nomGroupToRm) {
		this.playableGroup.remove(nomGroupToRm);
	}
	
	/**
	 * Pour recuperer les caracteristiques d'un groupe stocke
	 * 
	 * @param nameOfGroup un string auquel est associe le groupe
	 * @return les caracs du groupe sous forme de l'objet Group
	 */
	public Group caracOfGroup (String nameOfGroup) {
		return this.playableGroup.get(nameOfGroup);
	}
	
}
