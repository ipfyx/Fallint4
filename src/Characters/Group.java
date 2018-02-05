/**
 * Regroupement des characters crees en groupe pour simplifiant l'affichage et la sauvegarde, avec definition des actions et position de chaque groupe
 */

package Characters;
import Characters.Character;
import java.io.*;
import Characters.Character.STATUS;
import game_engine.Game;
import graphic_interface_controller.Board_controller;
import environment.*;
import exception.CaseOutOfRangeException;
import exception.InventoryFullException;
import exception.NoResourcesOnCaseException;
import exception.NoStuffOnCaseException;
import exception.RemoveCharacterException;
import exception.WantToCollectTooManyException;
import exception.WantToDumpTooManyException;

import java.util.ArrayList;
import java.util.Random;

public class Group implements java.io.Serializable{
	
	public final int NUMBER_OF_RESSOURCES_TO_COLLECT_ON_EACH_CASE = 5;
	final int BASE_HEALTH_BONUS = 10 ;
	
	final int MAX_HEALTH_GROUP = 100;
	
	public ArrayList<Character> group = new ArrayList();
	
	public String name;
	
	public int action_point;

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
	
	public Group(String team_name,Character character){
		group.add(character);
		name=team_name;
		action_point = 5;
		health = character.health;
		strength = character.strength;
		position_x = character.position_x;
		position_y = character.position_y;
		inventory.food = character.inventory.food;
		inventory.water = character.inventory.water;
		inventory.wood = character.inventory.wood;
		this.inventory.Weigth();
		
	}
	
	public String getName() {
		return name;
	}	
	
	public void setName(String name) {
		this.name = name;
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

	public int getFood() {
		return inventory.food;
	}

	public void setFood(int food) {
		this.inventory.food = food;
	}

	public int getWood() {
		return inventory.wood;
	}

	public void setWood(int wood) {
		this.inventory.wood = wood;
	}
	
	public int getWater() {
		return inventory.water;
	}

	public void setWater(int water) {
		this.inventory.water = water;
	}
	
	public STATUS getStatut() {
		return statut;
	}

	public void setStatut(STATUS statut) {
		this.statut = statut;
	}

	public void Add_Character_To_Group(Character character) {
		this.group.add(character);
		this.health = this.health + character.health;
		this.strength = this.strength + character.strength;
		this.inventory.food = this.inventory.food + character.inventory.food;
		this.inventory.wood = this.inventory.wood + character.inventory.wood;
		this.inventory.water = this.inventory.water+ character.inventory.water;
		this.inventory.Weigth();
	}
	
	public void Remove_Character_To_Group(Character character) throws RemoveCharacterException {
		if (this.group.isEmpty()) {
			throw new RemoveCharacterException("Le groupe est mort, vous avez perdu");
		} else if (this.group.lastIndexOf(character) < 0) {
			throw new RemoveCharacterException("Le joueur ne fait pas partie du groupe");
		} else {			
			this.group.remove(this.group.lastIndexOf(character));
			this.health = this.health - character.health;
			this.strength = this.strength - character.strength;
			//this.inventory.food = this.inventory.food - character.inventory.food;
			//this.inventory.wood = this.inventory.wood - character.inventory.wood;
			//this.inventory.water = this.inventory.water- character.inventory.water;
			this.inventory.Weigth();
		}
	}
	
	
	public String move_group (int x, int y, Game game) throws CaseOutOfRangeException {
		boolean bool_case = game.board.test_case(this,x,y);
		boolean bool_ennemy = game.board.mapMatrix[x][y].isEnnemyThere();
		int cost_in_actionpoints = 1;
		String texteAfficher = "Déplacement vers la case " + x + "," + y + "... \n \n";
		
		if (bool_case == true && EnoughActionPoint(cost_in_actionpoints)) {
			//Si le groupe quitte sa base, il perd de la defense/force
			if (game.board.get_casetype(this.getPosition_x(), this.getPosition_y()) == CaseType.base && (this.getPosition_x()!=x || this.getPosition_y()!=y)) {
				
				this.health = this.health - BASE_HEALTH_BONUS;
			}
			//Si le groupe va sur sa base, il gagne de la defense/force
			if (game.board.get_casetype(x,y) == CaseType.base) {
				this.health = this.health + BASE_HEALTH_BONUS;
			}
			
			if (this.getPosition_x() == x && this.getPosition_y() == y){
				throw new CaseOutOfRangeException("Vous ne pouvez pas vous déplacer sur la case sur laquelle vous vous trouvez");
			}
			else if (bool_ennemy == true) {
				texteAfficher += this.attack(x, y, game.board.mapMatrix[x][y].getEnnemy(), game); //consomme aussi action_point, eau, food
				this.position_x = x;
				this.position_y = y;
				//Le joueur consomme food, water and action_point quand il move
				if (this.inventory.food <= 0){
					int nbPlayer=this.MembersNbGroup();
			    	for (int i=1;i<=nbPlayer;i++){
			    		this.group.get(i-1).variation_health(-1);
			    	}
				}
				else {
					this.inventory.food = this.inventory.food - 1 ;
				}
				if (this.inventory.water <= 0){
					int nbPlayer=this.MembersNbGroup();
			    	for (int i=1;i<=nbPlayer;i++){
			    		this.group.get(i-1).variation_health(-1);
			    	}
				}
				else {
					this.inventory.water = this.inventory.water - 1 ;
				}
				if (this.action_point<=1) {
				this.action_point = 0 ;
				}
				else{
				this.action_point = this.action_point - cost_in_actionpoints ;
				}
			} 
			else {
				this.position_x = x;
				this.position_y = y;
				//Le joueur consomme food, water and action_point quand il move
				
				if (this.inventory.food <= 0){
					int nbPlayer=this.MembersNbGroup();
			    	for (int i=1;i<=nbPlayer;i++){
			    		this.group.get(i-1).variation_health(-1);
			    	}
				}
				else {
					this.inventory.food = this.inventory.food - 1 ;
				}
				if (this.inventory.water <= 0){
					int nbPlayer=this.MembersNbGroup();
			    	for (int i=1;i<=nbPlayer;i++){
			    		this.group.get(i-1).variation_health(-1);
			    	}
				}
				else {
					this.inventory.water = this.inventory.water - 1 ;
				}
				this.action_point = this.action_point - cost_in_actionpoints ;
			}
			
		}
		else if (!EnoughActionPoint(cost_in_actionpoints)){
			System.out.println("Vous n'avez pas assez de points d'actions.");
		}
		else {
			System.out.println("Vous ne pouvez pas vous deplacer sur cette case");
		}
		this.inventory.Weigth();
		
		return texteAfficher;
	}
	
	/**
	 * collecter les ressources sur la case (x,y)
	 */
	public void collect (int x, int y, Game game)throws CaseOutOfRangeException, NoResourcesOnCaseException, InventoryFullException{
		boolean bool_position = false;
		boolean bool_ressource = false;
		boolean bool_ennemy = false;
		if (this.position_x == x && this.position_y == y) {
			bool_position = true;
		}
		if (game.board.mapMatrix[x][y].getTerrain() != CaseType.nothing && game.board.mapMatrix[x][y].getTerrain() != CaseType.city && game.board.mapMatrix[x][y].getTerrain() != CaseType.base && game.board.mapMatrix[x][y].getTerrain() != CaseType.nothing) {
			bool_ressource = true;
		}
	
		if (this.check_if_inventory_is_full(game.group, NUMBER_OF_RESSOURCES_TO_COLLECT_ON_EACH_CASE) == true) {
			throw new InventoryFullException("Votre inventaire est plein");
		}
		else if (bool_position == true && bool_ressource == true && bool_ennemy == false) {
			CaseType ressource = game.board.get_casetype(x, y);
			if (ressource == CaseType.water) {
				this.inventory.water=this.inventory.water+NUMBER_OF_RESSOURCES_TO_COLLECT_ON_EACH_CASE;
			} 
			else if (ressource == CaseType.grassland) {
				this.inventory.food=this.inventory.food+NUMBER_OF_RESSOURCES_TO_COLLECT_ON_EACH_CASE;
			}
			else if (ressource == CaseType.forest) {
				this.inventory.wood=this.inventory.wood+NUMBER_OF_RESSOURCES_TO_COLLECT_ON_EACH_CASE;
			}
			else if (ressource == CaseType.rock) {
				this.inventory.water=this.inventory.water + 2;
				this.inventory.food=this.inventory.food + 2;
			}
			game.board.mapMatrix[x][y].setTerrain(CaseType.nothing);
			
			
		}else {
			if (bool_position == false) {
				throw new CaseOutOfRangeException("Vous devez être sur la case");
			}
			if (bool_ressource == false) {
				throw new NoResourcesOnCaseException("Il n'y a pas de ressources sur cette case");
			}
		}
		this.inventory.Weigth();
		
		}
	
	public void dump_ressources (int x, int y, Game game, String ressource, int number_of_ressource_to_dump) throws WantToDumpTooManyException{
		
		switch(ressource)
		{
		case "food":
			if (this.inventory.food < number_of_ressource_to_dump) {
				throw new WantToDumpTooManyException("Tu ne peux jeter plus de nourritures que tu en as.");
			}
			else {
				this.inventory.food = this.inventory.food - number_of_ressource_to_dump;
				this.inventory.Weigth();
			}
			break;
		case "wood":
			if (this.inventory.wood < number_of_ressource_to_dump) {
				throw new WantToDumpTooManyException("Tu ne peux jeter plus de nourritures que tu en as.");
			}
			else {
				this.inventory.wood = this.inventory.wood - number_of_ressource_to_dump;
				this.inventory.Weigth();
			}
			break;
		case "water":
			if (this.inventory.water < number_of_ressource_to_dump) {
				throw new WantToDumpTooManyException("Tu ne peux jeter plus de nourritures que tu en as.");
			}
			else {
				this.inventory.water = this.inventory.water - number_of_ressource_to_dump;
				this.inventory.Weigth();
			}
			break;
		}
		
		this.inventory.Weigth();


			
	}
	
	/**
	 * Attaque le campement ennemy sur la case (x,y)
	 * Si le joueur gagne, il ramasse toutes les ressources ennemies
	 * Sinon il meurt
	 */
	//TODO : a equilibrer pour que attaquer soit interessant
	public int quiTank (){
		if (this.group.size() == 3 && this.group.get(2).health > 0){
			return 2;
		}
		else if (this.group.size() == 3 && this.group.get(1).health > 0){
			return 1;
		}
		else if (this.group.size() == 2 && this.group.get(1).health > 0){
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public String attack (int x, int y, Ennemies ennemy, Game game) {
		
		int quelPersoTank = 0;
		int degats_restants;
		String texteAffichage = "Début du combat \n \n";
		boolean continueFight = true;
		
/* boucle de combat*/
		while (continueFight && this.group.size() > 0 && ennemy.health > 0){
		
			ennemy.health = ennemy.health - this.strength;
			
			if (ennemy.health > 0) {
				texteAffichage += "Vous infligez " + this.strength + " points de dégats à l'ennemi, il lui reste " + ennemy.health + " HP \n";	
			}
			else {
				texteAffichage += "Vous infligez " + this.strength + " points de dégats à l'ennemi, il n'est plus en état de se battre \n";	
			}
			
			if (ennemy.health > 0) {
				degats_restants = ennemy.strength;
				
			/* boucle d'attaque*/	
				while (continueFight && degats_restants > 0){
					quelPersoTank = quiTank();
					
					if (this.group.get(quelPersoTank).health > ennemy.strength){
						this.group.get(quelPersoTank).variation_health((-1)*ennemy.strength);
						degats_restants = 0;
						
						texteAffichage += "L'ennemi inflige " + ennemy.strength + " points de dégats à " + this.group.get(quelPersoTank).get_name() + ", il lui reste " + this.group.get(quelPersoTank).get_health() +" HP \n \n";
					}
					else {
						degats_restants = degats_restants - this.group.get(quelPersoTank).health;
						
						texteAffichage += this.group.get(quelPersoTank).get_name() + " a succombé au dernier coup de l'ennemi \n";

						if (quelPersoTank == 0) {
							continueFight = false;
						}
						else {
							try {
								this.Remove_Character_To_Group(this.group.get(this.group.size()-1));
							}
							catch (RemoveCharacterException e) {
								e.getMessage();
							}
						}
					}
				}
			}
		}
				
		if (!continueFight) {
			this.group.get(0).health = 0;
			texteAffichage += "\nTout ton groupe est mort, l'enterrement c'est jeudi. \n";
		}
		else {
			if (this.group.size() < 3 ) {
				double r = Math.random();
				if (r < 0.2) {
					texteAffichage += ennemy.getName() + " se rend et rejoint vos rangs \n";
					
					Character character_to_add = new Character(ennemy.getName());
					this.Add_Character_To_Group(character_to_add);
				}
			}
			game.board.mapMatrix[x][y].setEnnemy(null);
			
			try {
				this.move_group(x, y, game);
			} catch (CaseOutOfRangeException e) {
				e.getMessage();
			}
		}		
		return texteAffichage;
	}

	
	/**
	 * Construis un campement sur la case (x,y)
	 */
	public void build (int x, int y, Game game)  {
		boolean bool = false;
		bool = (IsPossibleToBuild(x, y, game) && !(IsAlreadyABase(x, y, game))) && (EnoughActionPoint(1));
		if (bool == true) {			
			if (EnoughWood(5)) {
				
				if (!EnoughFood(1)){
					int nbPlayer=this.MembersNbGroup();
			    	for (int i=1;i<=nbPlayer;i++){
			    		this.group.get(i-1).variation_health(-1);
			    	}
				}
				else {
					this.inventory.food = this.inventory.food - 1 ;
				}
				if (!EnoughWater(1)){
					int nbPlayer=this.MembersNbGroup();
			    	for (int i=1;i<=nbPlayer;i++){
			    		this.group.get(i-1).variation_health(-1);
			    	}
				}
			    else {
					this.inventory.water = this.inventory.water - 1 ;
			    }
			    	
			    	
				this.inventory.wood = this.inventory.wood - 5 ;
				game.board.set_casetype(x, y, CaseType.base);
				this.health = this.health + BASE_HEALTH_BONUS;
				this.action_point = this.action_point - 1; 
			}
			
			else {	
			System.out.println("Il n'y a pas assez de bois pour construire un camp");
			}
		}
		this.inventory.Weigth();
	}
	
	/**
	 * Useful to verify if you have the right to build here according to the CaseType
	 * @param x
	 * @param y
	 * @param game
	 * @return
	 */
	public boolean IsPossibleToBuild(int x, int y, Game game){
		if(game.board.get_casetype(x, y) == CaseType.nonexistent){
			return false;
		}
		else if(game.board.get_casetype(x, y) == CaseType.water){
			return false;
		}
		else if(game.board.get_casetype(x, y) == CaseType.base){
			return false;
		}
		else if(game.board.get_casetype(x, y) == CaseType.nothing){
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * Usefull to know if there is a base here
	 * @param x
	 * @param y
	 * @param game
	 * @return
	 */
	public boolean IsAlreadyABase(int x, int y, Game game){
		if (game.board.get_casetype(x,y)==CaseType.base){
			return true;
		}
		else {
			return false;
		}	
	}
	
	/**
	 * Usefull to know if you have enough wood to do something
	 * @param nb_of_wood
	 * @param game
	 * @return
	 */
	public boolean EnoughWood(int nb_of_wood){
		if (this.inventory.wood < nb_of_wood){
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean EnoughFood(int nb_of_food){
		if (this.inventory.food < nb_of_food){
			return false;
		}
		else {
			return true;
		}
	}
	public boolean EnoughWater(int nb_of_water){
		if (this.inventory.water < nb_of_water){
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public boolean EnoughActionPoint(int nb_of_actionpoint_needed){
		if (this.getAction_point() < nb_of_actionpoint_needed){
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 *  Detruit le campement sur la case (x,y)
	 */
	public void destroy (int x, int y, Game game) {
		if (IsAlreadyABase(x, y, game) && EnoughActionPoint(1)){
			game.group.inventory.wood+=2;						//recuperation du bois
			game.board.set_casetype(x, y, CaseType.nothing);	//desruction de la base
			this.health = this.health - BASE_HEALTH_BONUS ;	
			this.action_point = this.action_point - 1;//perte du bonus de defense
		}
		else {
			System.out.println("Il n'y a pas de base sur cette case");
		}
		this.inventory.Weigth();
	}
	
	
	public void collect_object(int x, int y, Game game, Objects object, int number_to_collect) throws InventoryFullException, NoStuffOnCaseException, WantToCollectTooManyException {
		Objects_and_number object_to_collect = new Objects_and_number(object, number_to_collect);
		if (this.check_if_inventory_is_full(game.group, object) == true) {
			throw new InventoryFullException("Votre inventaire est plein.");
		}
		
		else if (game.board.mapMatrix[x][y].isStuffThere() == false) {
			throw new NoStuffOnCaseException("Il n'y a pas d'objet ici.");
		}
		
		else if (game.board.mapMatrix[x][y].howManyObjectOnCase(object) < number_to_collect) {
			throw new WantToCollectTooManyException(x, y, game, object, number_to_collect);
		}
		
		else {
			if (object.name != "Healing_potion"){
				if (this.health + object.health_bonus > 100) {
					this.health = this.MAX_HEALTH_GROUP;
				} else {
					this.health = this.health + object.health_bonus;
				}
				this.strength = this.strength + object.strength_bonus;
			}
			

			this.inventory.AddObject(object, number_to_collect);

					
			game.board.mapMatrix[x][y].rmStuff(object_to_collect);
		}
		this.inventory.Weigth();
	}
	
	public void dump_object(int x, int y, Game game, Objects object, int number_of_object_to_dump) throws WantToDumpTooManyException{
		
		//on verifie d'abord si il y a bien un object Ã  jeter
		
		boolean bool = true;	// si bool reste a true, l'object pourra etre jete
		
		if (this.inventory.howManyObjectsInInventory(object) < number_of_object_to_dump) {
			throw new WantToDumpTooManyException("Vous n'avez pas assez de cet objet à jeter.");
		}
		else {
			this.inventory.DumpObject(object, number_of_object_to_dump);
			this.inventory.weigth = this.inventory.weigth - object.weigth;
			this.health = this.health - object.health_bonus;
			this.strength = this.strength - object.strength_bonus;
			game.board.mapMatrix[x][y].addStuff(object, number_of_object_to_dump);
		}
		this.inventory.Weigth();
		
	}
	
	public String UsePotion(int number_of_potion){ 
		Healing_potion potion = new Healing_potion();
		int nb_potion_of_group	 = this.inventory.howManyObjectsInInventory(potion);
		int nbPlayer = this.MembersNbGroup();
		int which_player = 0;
		int what_potion_will_give = 0; 
		int previous_health = 0; 
		
		if (nb_potion_of_group >= number_of_potion){
			what_potion_will_give = number_of_potion * potion.health_bonus;
			while (what_potion_will_give > 0 && which_player < nbPlayer){
				previous_health = this.group.get(which_player).health;
				this.group.get(which_player).health = Math.min(this.group.get(which_player).health +  what_potion_will_give , this.group.get(which_player).max_health );
				what_potion_will_give = what_potion_will_give - previous_health;
				which_player+=1;
				
			}
			this.inventory.objects_in_inventory.get(this.inventory.position_objects_in_inventory(potion)).nbr_object = this.inventory.objects_in_inventory.get(this.inventory.position_objects_in_inventory(potion)).nbr_object - number_of_potion;
			for (int i=0; i < nbPlayer; i++){
				this.group.get(i).set_STATUS("SAIN");
			}
			return "Vous avez utilisé " + number_of_potion + " potions, vous vous êtes soigné et les maladies ont été guéries";
		}
		else {
			return "Vous n'avez pas assez de potions !";
		}
	}

	public boolean check_if_inventory_is_full(Group group, Objects object){
		boolean bool = false;
		this.inventory.Weigth();
		if (this.inventory.weigth + object.weigth > inventory.MAX_WEIGTH)
			bool = true;
		return bool;
	}
	
	public boolean check_if_inventory_is_full(Group group, int ressource){
		boolean bool = false;
		this.inventory.Weigth();
		if (this.inventory.weigth + ressource > inventory.MAX_WEIGTH)
			bool = true;
		return bool;
	}
	
	public void displayGroup () {
		this.inventory.Weigth();
		System.out.println("Etat actuel du group : ");
		System.out.println("health = " + this.getHealth() + "\nforce = " + this.getStrength() + "\nx = " + this.getPosition_x() + "\ny =" + this.getPosition_y()+ "\nfood = " + this.inventory.food + "\nwater = " + this.inventory.water + "\nwood = "+this.inventory.wood+ "\naction_point = " + this.action_point + "\nweigth = " + this.inventory.weigth);
	
	}
	
	/**
	 * To know how many Characters are in the group
	 * @return
	 */
	public int MembersNbGroup(){
		return this.group.size();
	}
	
}
