package game_engine;
import game_engine.* ;

import preloader.Main;
import graphic_interface_controller.Main_menu_controller;
import graphic_interface_models.Board_model;
import graphic_interface_models.Main_menu_model;
import graphic_interface_controller.Board_controller;
import Characters.Character;

import java.util.ArrayList;

import Characters.Base;
import Characters.Group;
import Characters.Healing_potion;
import Characters.Magic_Sword;
import Characters.Shield;
import environment.*;
import exception.CaseOutOfRangeException;
import game_engine.Ennemies_turn;
import game_engine.Turn;

import java.io.*;


/**
 * Cette classe dï¿½finie une partie.
 *  
 * Elle doit ï¿½tre capable de crï¿½er une partie, de reprendre une partie en cours, d'enregistrer une partie.
 * 
 * @author FallINT 4's Team
 *
 */

public class Game implements java.io.Serializable {
	
	//Definition des attributs type d'une partie
	public Board board;
	public Group group;
	public Turn turn;
	public PlayableGroupList group_list;

	public static Game newGamePlayer = new Game(null, null, null, null);
	
	public static Board_model newGameBoardModel = new Board_model(false, false, false, false, false, false, false, false);
	
	
	//Constructors
	/**
	 * Construit un jeu type. dans l'etat suivant
	 * @param actual_turn qui correspond au tour en cours
	 * @param board qui correspond au plateau utiliser
	 * @param group qui correspond au groupe qui joue
	 * @throws num_turn doit etre positif
	 *
	 */
	public Game(Turn actual_turn,Board board,Group group,PlayableGroupList group_list) {
		{
			this.turn=actual_turn;
			this.board=board;
			this.group=group;
			this.group_list=group_list;
		}
	}
	
	//DÃ©finition des getters:
	public Turn getturn() {
		return this.turn;
	}
	public Board getboard() {
		return this.board;
	}
	public Group getgroup() {
		return this.group;
	}
	public PlayableGroupList getgroup_list() {
		return this.group_list;
	}
	
	//Définition des setters:
	/**
	 * Cette mï¿½thode doit ï¿½tre capable d'incrï¿½menter le nombre de tours de 1.
	 * Elle sera utilisï¿½e lors d'un changement de tour.
	 */
	
	
	
	/**
	 * Typiquement cette mï¿½thode ne doit pas servir au cours du jeu, 
	 * elle sera utilisï¿½e uniquement lors des tests, 
	 * en effet on ne doit pas pouvoir changer de board en plein milieu de jeu.
	 * 
	 * @param board_to_set qui correspond au tableau remplaï¿½ant
	 */
	public void setboard(Board board_to_set) {
		this.board=board_to_set;
	}
	
	
	/**
	 * Typiquement cette mï¿½thode ne doit pas servir au cours du jeu, 
	 * elle sera utilisï¿½e uniquement lors des tests, 
	 * en effet on ne doit pas pouvoir changer de group en plein milieu de jeu. 
	 * Sauf si on invite un ami mais lï¿½ je ne penses pas que cela se fasse ici.
	 * 
	 * @param group_to_set qui correspond au tableau remplaï¿½ant
	 */
	public void setgroup(Group group_to_set){
		this.group=group_to_set;
	}
	
	
	/**
	 * This function is able to save a game previously saved.
	 * @param game
	 */
	public void charge(Game game) throws FileNotFoundException,IOException,ClassNotFoundException{
		ObjectInputStream game_to_charge = null;
		
		try {
			final FileInputStream fichier = new FileInputStream("game_saved.ser");
			game_to_charge = new ObjectInputStream(fichier);
			newGamePlayer = (Game) game_to_charge.readObject();
		}
		catch (final java.io.FileNotFoundException e){
			throw new FileNotFoundException();
		}	
		catch (final java.io.IOException e) {
			e.printStackTrace();
		} 
		catch (final ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		finally {

			try {
	
				if (game_to_charge != null) {
		
					game_to_charge.close();
		
				}
				
			} 
			catch (final IOException ex) {
	
			ex.printStackTrace();
			}
		}
	}
	
	
	/**
	 * This method is able to save a game.
	 * @param game
	 */
	public void save(Game game){
		ObjectOutputStream game_to_save = null;
		
		try {
			final FileOutputStream fichier = new FileOutputStream("game_saved.ser");
			game_to_save = new ObjectOutputStream(fichier);
			
			game_to_save.writeObject(game);
			
			game_to_save.flush();
			
			} 
		catch (final java.io.IOException e) {
			
			e.printStackTrace();
			
		}
		finally {
			
			try {
			
				if (game_to_save != null) {
					
					game_to_save.flush();
			
					game_to_save.close();
			
				}
			
			} 
			catch (final IOException ex) {
			
				ex.printStackTrace();
			
			}
		}
	}
	
	
	//Fonction nouvelle partie 
	
	public void new_game(String team_name , Character player){
		
		Group group_init = new Group(team_name,player);
		String nomGroupPlayer;
		
		Board board_init = new Board();
		
		ArrayList<Group> arrayGroupInit = new ArrayList<Group>();
		arrayGroupInit.add(group_init);
		
		PlayableGroupList group_list_init = new PlayableGroupList(null);
		nomGroupPlayer = group_list_init.addNewGroup(group_init);
		
		Turn turn_init = new Turn(0, 0);
		turn_init.init_turn(15, group_init);
		
		//Use to have an interesting board-Player appears on a grassland case.
		Healing_potion healing_potion = new Healing_potion();
		Magic_Sword magic_sword = new Magic_Sword();
		Shield shield = new Shield();
		board_init.generate_map(healing_potion,magic_sword,shield);
		CaseType terrain=CaseType.grassland;
		board_init.mapMatrix[player.get_x()][player.get_y()].setTerrain(terrain);
		if (board_init.mapMatrix[player.get_x()][player.get_y()].isEnnemyThere()==true){
			String x=board_init.mapMatrix[player.get_x()][player.get_y()].getEnnemy().getName();
			group_list_init.rmGroup(x);//Kill the ennemy if you pop on him case.
		}
		
		this.board = board_init;
		this.group = group_list_init.caracOfGroup(nomGroupPlayer);
		this.group_list = group_list_init;
		this.turn = turn_init;
		
	}

}
