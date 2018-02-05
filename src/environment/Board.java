/**
 * Class Board s'appuyant sur la class case pour creer une matrice de cases ayant tous les attributs voulus
 * 
 * @author Guillaume
 *
 */

package environment;
import Characters.Character;

import Characters.Ennemies;

import java.util.ArrayList;
import java.io.*;

import Characters.Base;
import Characters.Inventory;
import Characters.Magic_Sword;
import environment.CaseModel; //Besoin du modele de case pour faire une matrice de ces dernieres
import Characters.Objects;
import Characters.Shield;
import environment.CaseType;
import exception.CaseOutOfRangeException;
import environment.CaseType;
import game_engine.Game;
import Characters.Group;
import Characters.Healing_potion;

// TODO: faire tous les getters specifiques (coordonnees, recherche de cases et liens, etc)

public class Board implements java.io.Serializable{
	
	//pour l'uml:
	public CaseType casetype;
	public Base base;
	public PlayableGroupList list;
	
	private int plusXcoordinate = 50;
	private int plusYcoordinate = 50;
	private int minusXcoordinate = 0;
	private int minusYcoordinate = 0;
	
	
	public final int MAX_SIZE = 50;
	public static Board board_type=new Board();
	//definition de la matrice de la map, TODO: ajouter 3 autres matrices selon -X,Y ; X,-Y ; -X,-Y
	public CaseModel mapMatrix[][] = new CaseModel[plusXcoordinate][plusYcoordinate];
	//initialisation de la map de depart, TODO: rendre la map dynamique pour l'etendre si besoin

	
	/**
	 * Initialisation dans un premier temps d'une map de taille fixe de 20 lignes et 20 colonnes, TODO: pouvoir 
	 */
	public Board() {
		
		//mapMatrix = new CaseModel [plusXcoordinate][plusYcoordinate];
		
		for (int i = 0; i < plusXcoordinate; i++){
			for (int j = 0; j < plusYcoordinate; j++){
				int[] coordinates = {i,j};
				ArrayList stuff = new ArrayList();
				this.mapMatrix[i][j] = new CaseModel(CaseType.grassland, null, stuff, coordinates,false);
			}
		}
		
	}
	
	//Getter de chacuns des attributs
		/** @return la matrice en entier */
	public CaseModel[][] getMapMatrix() {
		return mapMatrix;
	}
		/** @return valeur max de la coordonnee +X */
	public int getPlusXcoordinate() {
		return plusXcoordinate;
	}
		/** @return valeur max de la coordonnee +Y */
	public int getPlusYcoordinate() {
		return plusYcoordinate;
	}
		/** @return valeur max de la coordonnee -X */
	public int getMinusXcoordinate() {
		return minusXcoordinate;
	}
		/** @return valeur max de la coordonnee -Y */
	public int getMinusYcoordinate() {
		return minusYcoordinate;
	}
	
	
	
	//Setter de chacuns des attributs
		/**	TODO: mettre a jour la map si les valeurs de X, Y, -X, -Y changent
		 * @param mapMatrix une matrice de cases - utile pour charger une partie */
	public void setMapMatrix(CaseModel[][] mapMatrix) {
		this.mapMatrix = mapMatrix;
	}
		/** @param plusXcoordinate la nouvelle valeur maximale pour X */
	public void setPlusXcoordinate(int plusXcoordinate) {
		this.plusXcoordinate = plusXcoordinate;
	}
		/** @param plusXcoordinate la nouvelle valeur maximale pour Y */
	public void setPlusYcoordinate(int plusYcoordinate) {
		this.plusYcoordinate = plusYcoordinate;
	}
		/** @param plusXcoordinate la nouvelle valeur maximale pour -X */
	public void setMinusXcoordinate(int minusXcoordinate) {
		this.minusXcoordinate = minusXcoordinate;
	}
		/** @param plusXcoordinate la nouvelle valeur maximale pour -Y */
	public void setMinusYcoordinate(int minusYcoordinate) {
		this.minusYcoordinate = minusYcoordinate;
	}
	
	
	/**
	 * Test case (x,y) for character character
	 */
	public boolean test_case(Group group, int x, int y) {
		int chara_x = group.getPosition_x() ;
		int chara_y = group.getPosition_y() ;
		boolean bool = true ;
		
		int diff_x = Math.abs(chara_x - x);
		int diff_y = Math.abs(chara_y - y);
		
		if (diff_x > 1 || diff_y > 1) {
			bool = false ;
		}
		
		CaseType terrain = get_casetype(x,y);
		
		if (terrain == CaseType.nonexistent) {
			bool = false ;
		}
		return bool;
	}
	
	
	public CaseType get_casetype(int x, int y){
		if (x >= minusXcoordinate && x < plusXcoordinate && y >= minusYcoordinate && y < plusYcoordinate) {
			return mapMatrix[x][y].getTerrain();
		}
		else {
			System.out.println("La case demandée est en dehors du plateau de jeux");
			return CaseType.nonexistent;
		}
	}
	public void set_casetype(int x, int y, CaseType terrain){
		mapMatrix[x][y].setTerrain(terrain);
		//System.out.println("Modification du terrain en x="+x+",y="+y);
	}
/*
	public boolean case_has_stuff(int x, int y) {
		boolean bool = false;
		if (this.mapMatrix[x][y].isStuffThere()) {
			bool = true;
		}
		return bool;
	}
*/	
	
	
	
	/*
	 * 
	 * 
	 * Toute la suite concerne la génération de la map
	 * 
	 * 
	 * 
	 */
	
	public void generate_default_patch_without_ennemy (int x, int y){
		
		for (int i=x; i<x+2; i++) {
			for (int j=y; j<y+3; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.forest);
			}
		}
		for (int i=x; i<x+3; i++) {
			for (int j=y+3; j<y+5; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.forest);
			}
		}
		for (int i=x+2; i<x+5; i++) {
			for (int j=y; j<y+3; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.rock);
			}
		}
		for (int i=x+3; i<x+5; i++) {
			for (int j=y+3; j<y+5; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.water);
			}
		}
		
	}
	
	
	public void generate_default_patch1 (int x, int y,Healing_potion healing_potion, Magic_Sword magic_sword, Shield shield){
		
		for (int i=x; i<x+2; i++) {
			for (int j=y; j<y+3; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.water);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
			}
		}
		for (int i=x; i<x+3; i++) {
			for (int j=y+3; j<y+5; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.grassland);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
			}
		}
		for (int i=x+2; i<x+5; i++) {
			for (int j=y; j<y+3; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.forest);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
			}
		}
		for (int i=x+3; i<x+5; i++) {
			for (int j=y+3; j<y+5; j++) {
				CaseType terrain = this.random_case_generator();
				this.mapMatrix[i][j].setTerrain(terrain);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
				
				if (terrain == CaseType.city) {
					this.mapMatrix[i][j].addStuff(this.random_objects_generator(healing_potion, magic_sword, shield), 1);
				}				
			}
		}
		
	}
	
	public void generate_default_patch2 (int x, int y,Healing_potion healing_potion, Magic_Sword magic_sword, Shield shield){
		
		for (int i=x; i<x+2; i++) {
			for (int j=y; j<y+3; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.grassland);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
			}
		}
		for (int i=x; i<x+3; i++) {
			for (int j=y+3; j<y+5; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.rock);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
			}
		}
		for (int i=x+2; i<x+5; i++) {
			for (int j=y; j<y+3; j++) {
				CaseType terrain = this.random_case_generator();
				this.mapMatrix[i][j].setTerrain(terrain);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
				
				if (terrain == CaseType.city) {
					this.mapMatrix[i][j].addStuff(this.random_objects_generator(healing_potion, magic_sword, shield), 1);
				}
			}
		}
		for (int i=x+3; i<x+5; i++) {
			for (int j=y+3; j<y+5; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.water);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
			}
		}
		
	}
	
	public void generate_default_patch3 (int x, int y,Healing_potion healing_potion, Magic_Sword magic_sword, Shield shield){
		
		for (int i=x; i<x+2; i++) {
			for (int j=y; j<y+3; j++) {
				CaseType terrain = this.random_case_generator();
				this.mapMatrix[i][j].setTerrain(terrain);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
				
				if (terrain == CaseType.city) {
					this.mapMatrix[i][j].addStuff(this.random_objects_generator(healing_potion, magic_sword, shield), 1);
				}
			}
		}
		for (int i=x; i<x+3; i++) {
			for (int j=y+3; j<y+5; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.forest);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
			}
		}
		for (int i=x+2; i<x+5; i++) {
			for (int j=y; j<y+3; j++) {
				CaseType terrain = this.random_case_generator();
				this.mapMatrix[i][j].setTerrain(terrain);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
				
				if (terrain == CaseType.city) {
					this.mapMatrix[i][j].addStuff(this.random_objects_generator(healing_potion, magic_sword, shield), 1);
				}
			}
		}
		for (int i=x+3; i<x+5; i++) {
			for (int j=y+3; j<y+5; j++) {
				this.mapMatrix[i][j].setTerrain(CaseType.water);
				Ennemies ennemy = this.random_enemy_generator_on_one_case();
				this.mapMatrix[i][j].setEnnemy(ennemy);
			}
		}
		
	}
	
	
	public CaseType random_case_generator () {
		double r = Math.random();
		if (0<=r && r<0.2) {
			return CaseType.water;
		}
		else if (0.2<=r && r<0.4) {
			return CaseType.forest;
		}
		else if (0.4<=r && r<0.6) {
			return CaseType.grassland;
		}
		else if (0.6<=r && r<0.7) {
			return CaseType.city;
		}
		else {
			return CaseType.rock;
		}
	}
	
	public Ennemies random_enemy_generator_on_one_case () {
		boolean bool = false;
		Ennemies ennemy = new Ennemies(random_enemy_name_generator());
		double r = Math.random();
		if (0<=r && r<0.25) {
			bool = true;
		}
		if (bool == true) {
			return ennemy;
		}
		else {
			return null;
		}
	}
	
	public String random_enemy_name_generator () {
		String name_generate;
		double r = Math.random() ;
		if (0 <= r && r <= 0.166){
			name_generate = "Sauron";
		}
		else if (0.166 < r && r <= 0.332 ){
			name_generate = "Dark Vador";
		}
		else if (0.332 < r && r <= 0.498 ){
			name_generate = "Dalek";
		}
		else if (0.498 < r && r <= 0.664 ){
			name_generate = "Dragon";
		}
		else if (0.664 < r && r <= 0.830 ){
			name_generate = "Requin";
		}
		else {
			name_generate = "Méchant Joker";
		}
		return name_generate;
	}
	
	public Objects random_objects_generator (Healing_potion healing_potion, Magic_Sword magic_sword, Shield shield) {
		double r = Math.random();
		if (0<=r && r<0.4) {
			return healing_potion;
		}
		else if (0.4<=r && r<0.7) {
			return magic_sword;
		}
		else {
			return shield;
		}
	}
	
	
	public void generate_map (Healing_potion healing_potion, Magic_Sword magic_sword, Shield shield) {
		
		
		
		for (int i=0; i<MAX_SIZE; i=i+5) {
			for (int j=0; j<MAX_SIZE; j=j+5) {

				if (i==25 && j==25){
					this.generate_default_patch_without_ennemy(25, 25);
				}
				else {
					double r = Math.random();
					if (0<=r && r<0.3){
						this.generate_default_patch1(i, j,healing_potion,magic_sword,shield);
					}
					else if (0.3<=r && r<0.6){
						this.generate_default_patch2(i, j,healing_potion,magic_sword,shield);
					}
					else {
						this.generate_default_patch3(i, j,healing_potion,magic_sword,shield);
					}
				}
				
				
				
				
				
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
