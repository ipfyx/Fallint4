package Tests;

import exception.CaseOutOfRangeException;
import java.util.ArrayList;

import Characters.*;
import Characters.Character;
import environment.*;
import exception.CaseOutOfRangeException;
import exception.InventoryFullException;
import exception.NoStuffOnCaseException;
import exception.RemoveCharacterException;
import exception.WantToCollectTooManyException;
import game_engine.Game;
import game_engine.Turn;


public class Test_Map {

	
	public void test() {
		
		Character gandalf = new Character("gandalf");
		Character sauron = new Character("sauron");
		Group group = new Group("Team de l'anneau",gandalf);
		
		Board boardTest = new Board();
		Turn turnTest = new Turn(0, 0);
		ArrayList<Group> arrayGroupTest = new ArrayList<Group>();
		arrayGroupTest.add(group);
		PlayableGroupList group_list_test = new PlayableGroupList(null);
		group_list_test.addNewGroup(group);
		
		Game gameTest = new Game(turnTest,boardTest, group,group_list_test);
		
		ArrayList<Objects_and_number> stuff = new ArrayList();
		
		Healing_potion healing_potion = new Healing_potion();
		Magic_Sword magic_sword = new Magic_Sword();
		Shield shield = new Shield();
		
		gameTest.board.generate_map(healing_potion,magic_sword,shield);
		
		int case_forest=0;
		int case_water=0;
		int case_grassland=0;
		int case_nothing=0;
		int case_city=0;
		int case_ennemy=0;
		
		int nbr_potion=0;
		int nbr_sword=0;
		int nbr_shield=0;
		
		
		for (int i=0; i<gameTest.board.MAX_SIZE; i++) {
			for (int j=0; j<gameTest.board.MAX_SIZE; j++){
				CaseType terrain = gameTest.board.mapMatrix[i][j].getTerrain();
				boolean bool = gameTest.board.mapMatrix[i][j].isEnnemyThere();
				if (terrain == CaseType.forest) {
					case_forest++;
				}
				if (terrain == CaseType.water) {
					case_water++;
				}
				if (terrain == CaseType.grassland) {
					case_grassland++;
				}
				if (terrain == CaseType.nothing) {
					case_nothing++;
				}
				if (terrain == CaseType.city) {
					case_city++;
					String objects_name = gameTest.board.mapMatrix[i][j].stuff.get(0).name;
					if (objects_name == healing_potion.name) {
						nbr_potion++;
					}
					if (objects_name == magic_sword.name) {
						nbr_sword++;
					}
					if (objects_name == shield.name) {
						nbr_shield++;
					}
					
				}
				if (bool == true) {
					case_ennemy++;
				}
				
			}
		}
		System.out.println("Nombre de case forest = "+case_forest);
		System.out.println("Nombre de case water = "+case_water);
		System.out.println("Nombre de case grassland = "+case_grassland);
		System.out.println("Nombre de case nothing = "+case_nothing);
		System.out.println("Nombre de case city = "+case_city);
		System.out.println("Nombre de case avec 1 ennemi = "+case_ennemy);
		System.out.println("Nombre de potions = "+nbr_potion);
		System.out.println("Nombre de magic sword = "+nbr_sword);
		System.out.println("Nombre de shield = "+nbr_shield);
	}
	
	public static void main(String[] args) {
		Test_Map map_under_test= new Test_Map();
		map_under_test.test();
	}


}
