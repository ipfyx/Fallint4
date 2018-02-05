package Tests;

import Characters.Character;
import Characters.Ennemies;
import Characters.Group;
import Characters.Healing_potion;
import Characters.Magic_Sword;
import Characters.Objects;
import environment.CaseType;
import exception.CaseOutOfRangeException;
import exception.InventoryFullException;
import exception.NoResourcesOnCaseException;
import exception.WantToDumpTooManyException;
import game_engine.*;
import Characters.Shield;
import exception.*;

public class Test_Group extends Group {
	private static int failure_count =0;
	private static int test_count =1;
	
	public Test_Group(String team_name, Character character) {
		super(team_name, character);
		}
	
	public void test(){
		
		System.out.println("\n *** Group Unit Tests ***\n");
				
				//Test n°1: 
				System.out.println(test_count+": Add_Character_To_Group(Character character) - Add a character in the Group and actualize variables of the Group.");
				boolean problem = false;
				Character Char_Test = new Character("Char");
					//Stock the actual variable to compare after
					int group_health = this.getHealth();
					int group_strength = this.getStrength();
					int group_food = this.getFood();
					int group_wood = this.getWood();
					int group_water = this.getWater();
					int char_health = Char_Test.get_health();
					int char_strength = Char_Test.get_strength();
					int char_food = Char_Test.inventory.food;
					int char_wood = Char_Test.inventory.wood;
					int char_water = Char_Test.inventory.water;
				this.Add_Character_To_Group(Char_Test);
				if (this.getHealth() != group_health + char_health){
					problem = true;
				}
				if (this.getStrength() != group_strength + char_strength){
					problem = true;
				}
				if (this.getFood() != group_food + char_food){
					problem = true;
				}
				if (this.getWood() != group_wood + char_wood){
					problem = true;
				}
				if (this.getWater() != group_water + char_water){
					problem = true;
				}
			    if (problem){
			    	failure_count++;
			    	System.out.println("WARNING - test of Add_Character_To_Group failed.");
			    }
			    
			    
			    test_count++;
			    
			    
			    //Test n°2: 
				System.out.println(test_count+": Remove_Character_To_Group(Character character) - test to remove a character in the Group and actualize variables of the Group(normal way) .");
				problem = false;
					//Stock the actual variable to compare after
					group_health = this.getHealth();
					group_strength = this.getStrength();
					char_health = Char_Test.get_health();
					char_strength = Char_Test.get_strength();
				try{
					this.Remove_Character_To_Group(Char_Test);
				}
				catch(Exception e){
					problem = true;
				}
				if (this.getHealth() != group_health - char_health){
					problem = true;
				}
				if (this.getStrength() != group_strength - char_strength){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of Remove_Character_To_Group(normal way) failed .");
				}
				
				test_count++;
				
				
				//Test n°3: 
				System.out.println(test_count+": Remove_Character_To_Group(Character character) - test to remove a character in the Group and actualize variables of the Group(group Empty) .");
				problem = true;
				int nb_of_players = this.group.size();
				for (int i=0;i<nb_of_players;i++){
					try{
						this.Remove_Character_To_Group(this.group.get(i));
					}
					catch(Exception e){
						problem = true;
					}
				}
				try{
					this.Remove_Character_To_Group(this.group.get(0));
				}
				catch(Exception e){
					problem = false;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of Remove_Character_To_Group (group Empty) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°4: 
				System.out.println(test_count+": Remove_Character_To_Group(Character character) - test to remove a character in the Group and actualize variables of the Group(Character not in the group) .");
				problem = true;
				this.Add_Character_To_Group(Char_Test);
				Character Char_Test2 = new Character("Char_Test2");
				try{
					this.Remove_Character_To_Group(Char_Test2);
				}
				catch(Exception e){
					problem = false;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of Remove_Character_To_Group (Character not in the group) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°5: 
				System.out.println(test_count+": move_group(int x, int y, Game game) - test to move the group (on a case without ennemy).");
				problem = false;
				Game GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test); //Warning herer we need a game so the test is not only on a group so we create a game and so a game to test that method, generation with no ennemy around
				int x = GameTest.group.getPosition_x();
				int y = GameTest.group.getPosition_y();
				int food = GameTest.group.getFood();
				int water = GameTest.group.getWater();
				int action_points = GameTest.group.getAction_point();
				try{
					GameTest.group.move_group(x+1, y+1, GameTest);
				}
				catch(Exception e){
					problem = true;
				}
				if (GameTest.group.getPosition_x() != x+1 && GameTest.group.getPosition_y() != y+1){
					problem = true;
					System.out.println(GameTest.group.getPosition_y());
				}
				if (GameTest.group.getAction_point() != action_points - 1){
					problem = true;
				}
				if (GameTest.group.getWater() != water - 1){
					problem = true;
				}
				if (GameTest.group.getFood() != food - 1){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of move_group(int x, int y, Game game) (on a case without ennemy) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°6: 
				System.out.println(test_count+": move_group(int x, int y, Game game) - test to move the group (on your actual place).");
				problem = true;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test); //Warning herer we need a game so the test is not only on a group so we create a game and so a game to test that method
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y();
				try{
					GameTest.group.move_group(x, y, GameTest);
				}
				catch(Exception e){
					problem = false;
				}
				if (GameTest.group.getAction_point() != action_points){
					problem = true;
				}
				if (GameTest.group.getWater() != water){
					problem = true;
				}
				if (GameTest.group.getFood() != food){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of move_group(int x, int y, Game game) (on your actual place) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°7: 
				System.out.println(test_count+": move_group(int x, int y, Game game) - test to move the group (on your actual place).");
				problem = false;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test); //Warning here we need a game so the test is not only on a group so we create a game and so a game to test that method
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y();
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				action_points = GameTest.group.getAction_point();
				Ennemies Ennemy_Test = new Ennemies("Ennemies_test");
				Ennemy_Test.setStrength(0);
				GameTest.board.mapMatrix[x+1][y+1].setEnnemy(Ennemy_Test);
				try{
					GameTest.group.move_group(x+1, y+1, GameTest);
				}
				catch(Exception e){
					problem = true;
				}
				if (GameTest.group.getAction_point() != action_points - 2){
					problem = true;
				}
				if (GameTest.group.getWater() != water - 2){
					problem = true;
				}
				if (GameTest.group.getFood() != food - 2){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of move_group(int x, int y, Game game) (on your actual place) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°8: 
				System.out.println(test_count+": collect(int x, int y, Game game) - test to collect resources (all differents cases).");
				problem = false;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test); //Warning here we need a game so the test is not only on a group so we create a game and so a game to test that method
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y(); 
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				int wood = GameTest.group.getWood();
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.forest);
				try{
				GameTest.group.collect(x, y, GameTest);
				}
				catch (Exception e){
					problem = true;
				}
				if (GameTest.group.getWood()!=wood +NUMBER_OF_RESSOURCES_TO_COLLECT_ON_EACH_CASE && GameTest.group.getFood() != food && GameTest.group.getWater() != water){
					problem = true;
				}
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.water);
				try{
					GameTest.group.collect(x, y, GameTest);
				}
				catch (Exception e){
					problem = true;
				}
				if (GameTest.group.getWood()!=wood && GameTest.group.getFood() != food && GameTest.group.getWater() != water +NUMBER_OF_RESSOURCES_TO_COLLECT_ON_EACH_CASE ){
					problem = true;
				}
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.grassland);
				try{
					GameTest.group.collect(x, y, GameTest);
				}
				catch (Exception e){
					problem = true;
				}
				if (GameTest.group.getWood()!=wood && GameTest.group.getFood() != food+NUMBER_OF_RESSOURCES_TO_COLLECT_ON_EACH_CASE && GameTest.group.getWater() != water ){
					problem = true;
				}
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.rock);
				try{
					GameTest.group.collect(x, y, GameTest);
				}
				catch (Exception e){
					problem = true;
				}
				if (GameTest.group.getWood()!=wood && GameTest.group.getFood() != food+2 && GameTest.group.getWater() != water+2){
					problem = true;
				}
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.base);
				try{
					GameTest.group.collect(x, y, GameTest);
				}
				catch (NoResourcesOnCaseException e){
					problem = false;
				}
				catch (InventoryFullException e){
					problem = true;
				}
				catch (CaseOutOfRangeException e){
					problem = true;
				}
				if (GameTest.group.getWood()!=wood && GameTest.group.getFood() != food && GameTest.group.getWater() != water){
					problem = true;
				}
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.city);
				try{
					GameTest.group.collect(x, y, GameTest);
				}
				catch (NoResourcesOnCaseException e){
					problem = false;
				}
				catch (InventoryFullException e){
					problem = true;
				}
				catch (CaseOutOfRangeException e){
					problem = true;
				}
				if (GameTest.group.getWood()!=wood && GameTest.group.getFood() != food && GameTest.group.getWater() != water){
					problem = true;
				}
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.nonexistent);
				try{
					GameTest.group.collect(x, y, GameTest);
				}
				catch (NoResourcesOnCaseException e){
					problem = false;
				}
				catch (InventoryFullException e){
					problem = true;
				}
				catch (CaseOutOfRangeException e){
					problem = true;
				}
				if (GameTest.group.getWood()!=wood && GameTest.group.getFood() != food && GameTest.group.getWater() != water){
					problem = true;
				}
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.nothing);
				try{
					GameTest.group.collect(x, y, GameTest);
				}
				catch (NoResourcesOnCaseException e){
					problem = false;
				}
				catch (InventoryFullException e){
					problem = true;
				}
				catch (CaseOutOfRangeException e){
					problem = true;
				}
				if (GameTest.group.getWood()!=wood && GameTest.group.getFood() != food && GameTest.group.getWater() != water){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of collect(int x, int y, Game game) (all differents cases) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°9: 
				System.out.println(test_count+": collect(int x, int y, Game game) - test to collect resources (inventory full).");
				problem = true;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test); //Warning here we need a game so the test is not only on a group so we create a game and so a game to test that method
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y(); 
				GameTest.group.setFood(40);
				GameTest.group.setWater(40);
				GameTest.group.setWood(20);
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.forest);
				try{
				GameTest.group.collect(x, y, GameTest);
				}
				catch (CaseOutOfRangeException e){
					problem = true;
				}
				catch (NoResourcesOnCaseException e){
					problem = true;
				}
				catch (InventoryFullException e){
					problem = false;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of collect(int x, int y, Game game) (inventory full) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°10: 
				System.out.println(test_count+": collect(int x, int y, Game game) - test to collect resources (wrong case).");
				problem = true;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test); //Warning here we need a game so the test is not only on a group so we create a game and so a game to test that method
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y(); 
				GameTest.group.setFood(10);
				GameTest.group.setWater(10);
				GameTest.group.setWood(10);
				GameTest.board.mapMatrix[x][y].setTerrain(CaseType.forest);
				try{
				GameTest.group.collect(x+1, y+1, GameTest);
				}
				catch (CaseOutOfRangeException e){
					problem = false;
				}
				catch (NoResourcesOnCaseException e){
					problem = true;
				}
				catch (InventoryFullException e){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of collect(int x, int y, Game game) (wrong case) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°11: 
				System.out.println(test_count+": dump_ressources (int x, int y, Game game, String ressource, int number_of_ressource_to_dump) - test to dump resources (normal way).");
				problem = false;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test); //Warning here we need a game so the test is not only on a group so we create a game and so a game to test that method
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y(); 
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				try{
				GameTest.group.dump_ressources(x, y, GameTest, "food", 2);
				}
				catch (WantToDumpTooManyException e){
					problem = true;
				}
				if (GameTest.group.getFood() != food-2 && GameTest.group.getWater() != water && GameTest.group.getWood() != wood){
					problem = true;
				}
				try{
					GameTest.group.dump_ressources(x, y, GameTest, "wood", 2);
					}
				catch (WantToDumpTooManyException e){
					problem = true;
				}
				if (GameTest.group.getFood() != food-2 && GameTest.group.getWater() != water && GameTest.group.getWood() != wood-2){
					problem = true;
				}
				try{
					GameTest.group.dump_ressources(x, y, GameTest, "water", 2);
				}
				catch (WantToDumpTooManyException e){
					problem = true;
				}
				if (GameTest.group.getFood() != food-2 && GameTest.group.getWater() != water-2 && GameTest.group.getWood() != wood-2){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of dump_ressources (int x, int y, Game game, String ressource, int number_of_ressource_to_dump) (normal way) failed .");
				}

				
				test_count++;
				
				
				//Test n°12: 
				System.out.println(test_count+": dump_ressources (int x, int y, Game game, String ressource, int number_of_ressource_to_dump) - test to dump resources (not enough to dump).");
				problem = true;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test); //Warning here we need a game so the test is not only on a group so we create a game and so a game to test that method
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y(); 
				food = GameTest.group.getFood();
				water = GameTest.group.getWater();
				wood = GameTest.group.getWood();
				try{
				GameTest.group.dump_ressources(x, y, GameTest, "food", 11);
				}
				catch (WantToDumpTooManyException e){
					problem = false;
				}
				try{
					GameTest.group.dump_ressources(x, y, GameTest, "wood", 11);
					}
				catch (WantToDumpTooManyException e){
					problem = false;
				}
				try{
					GameTest.group.dump_ressources(x, y, GameTest, "water", 11);
				}
				catch (WantToDumpTooManyException e){
					problem = false;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of dump_ressources (int x, int y, Game game, String ressource, int number_of_ressource_to_dump) (not enough to dump) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°13: 
				System.out.println(test_count+": quiTank() - test to dump resources (normal way).");
				problem = false;
				Group group_test=new Group("Team_test",Char_Test);
				int n_quitank = group_test.quiTank();
				if (n_quitank != 0){
					problem = true;
				}
				group_test.Add_Character_To_Group(Char_Test2);
				n_quitank = group_test.quiTank();
				if (n_quitank != 1){
					problem = true;
				}
				Character Char_Test3 = new Character("Char_Test3");
				group_test.Add_Character_To_Group(Char_Test3);
				n_quitank = group_test.quiTank();
				if (n_quitank != 2){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of quiTank (normal way) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°14: 
				System.out.println(test_count+": quiTank() - test to dump resources (character with no health).");
				problem = false;
				group_test=new Group("Team_test",Char_Test);
				Char_Test2.health = 0;
				group_test.Add_Character_To_Group(Char_Test2);
				n_quitank = group_test.quiTank();
				if (n_quitank != 0){
					problem = true;
				}
				group_test.group.get(1).variation_health(+5);
				Char_Test3.health = 0;
				group_test.Add_Character_To_Group(Char_Test3);
				n_quitank = group_test.quiTank();
				if (n_quitank != 1){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of quiTank (character with no health) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°15: 
				System.out.println(test_count+": IsPossibleToBuild(int x, int y, Game game) - test know if it is possible to build (all casetype).");
				problem = false;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test);
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y();
				GameTest.board.set_casetype(x, y, CaseType.base);
				boolean test15 = IsPossibleToBuild(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.nonexistent);
				test15 = IsPossibleToBuild(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.water);
				test15 = IsPossibleToBuild(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.nothing);
				test15 = IsPossibleToBuild(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.city);
				test15 = IsPossibleToBuild(x, y, GameTest);
				if (test15 != true){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.forest);
				test15 = IsPossibleToBuild(x, y, GameTest);
				if (test15 != true){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.grassland);
				test15 = IsPossibleToBuild(x, y, GameTest);
				if (test15 != true){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.rock);
				test15 = IsPossibleToBuild(x, y, GameTest);
				if (test15 != true){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of IsPossibleToBuild (all casetype) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°16: 
				System.out.println(test_count+": IsAlreadyABase(int x, int y, Game game) - test know if there is already a base (all casetype).");
				problem = false;
				GameTest = new Game(null,null,null,null);
				GameTest.new_game("Team_Test", Char_Test);
				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y();
				GameTest.board.set_casetype(x, y, CaseType.base);
				test15 = IsAlreadyABase(x, y, GameTest);
				if (test15 != true){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.nonexistent);
				test15 = IsAlreadyABase(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.water);
				test15 = IsAlreadyABase(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.nothing);
				test15 = IsAlreadyABase(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.city);
				test15 = IsAlreadyABase(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.forest);
				test15 = IsAlreadyABase(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.grassland);
				test15 = IsAlreadyABase(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				GameTest.board.set_casetype(x, y, CaseType.rock);
				test15 = IsAlreadyABase(x, y, GameTest);
				if (test15 != false){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of IsAlreadyABase (all casetype) failed .");
				}
				
				
				test_count++;
				
				
				//Test n°17: 
				System.out.println(test_count+": EnoughWood(int nb_of_wood) - test know if there is enough wood.");
				problem = false;
				this.inventory.wood=5;
				if (!EnoughWood(4)){
					problem = true;
				}
				this.inventory.wood=0;
				if (EnoughWood(4)){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of EnoughWood failed .");
				}
				
				
				test_count++;
				
				
				//Test n°18: 
				System.out.println(test_count+": EnoughFood(int nb_of_food) - test know if there is enough wood.");
				problem = false;
				this.inventory.food=5;
				if (!EnoughFood(4)){
					problem = true;
				}
				this.inventory.food=0;
				if (EnoughFood(4)){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of EnoughFood failed .");
				}
				
				
				test_count++;
				
				
				//Test n°19: 
				System.out.println(test_count+": EnoughWater(int nb_of_water) - test know if there is enough wood.");
				problem = false;
				this.inventory.water=5;
				if (!EnoughWater(4)){
					problem = true;
				}
				this.inventory.water=0;
				if (EnoughWater(4)){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of EnoughWater failed .");
				}
				
				
				test_count++;
				
				
				//Test n°20: 
				System.out.println(test_count+": EnoughActionPoint(int nb_of_actionpoint_needed) - test know if there is enough wood.");
				problem = false;
				this.action_point=5;
				if (!EnoughActionPoint(4)){
					problem = true;
				}
				this.action_point=0;
				if (EnoughActionPoint(4)){
					problem = true;
				}
				if (problem){
					failure_count++;
					System.out.println("WARNING - test of EnoughActionPoint failed .");
				}
				
				
				test_count++;
				
				
				//Test n°21: 
				System.out.println(test_count+": dump_object(int x, int y, Game game, Objects object, int number_of_object_to_dump) -test to dump(normal way).");
				problem = false;

				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y();
				Magic_Sword Magic_Sword = new Magic_Sword();
				GameTest.board.mapMatrix[x][y].addStuff(Magic_Sword, 1);
				try{
					GameTest.group.collect_object(x, y, GameTest, Magic_Sword, 1);
				}
				catch(Exception e){
					problem = true;
				}
				int strength = GameTest.group.strength;
				try{
					GameTest.group.dump_object(x,y, GameTest, Magic_Sword, 1);
				}
				catch (WantToDumpTooManyException e){
					problem = true;
				}
				if (GameTest.group.strength >= strength || GameTest.board.mapMatrix[x][y].stuff.get(0).name != "Magic_Sword") {
					problem = true;

				}
				Healing_potion Healing_potion = new Healing_potion();
				GameTest.board.mapMatrix[x][y].addStuff(Healing_potion, 1);
				try{
					GameTest.group.collect_object(x, y, GameTest, Healing_potion, 1);
				}
				catch(Exception e){
					problem = true;
				}
				int health = GameTest.group.health;
				try{
					GameTest.group.dump_object(x,y, GameTest, Healing_potion, 1);
				}
				catch (WantToDumpTooManyException e){
					problem = true;
				}
				if (GameTest.group.health >= health || GameTest.board.mapMatrix[x][y].stuff.get(1).name != "Healing_potion") {
					problem = true;
				}
				Shield Shield = new Shield();
				GameTest.board.mapMatrix[x][y].addStuff(Shield, 1);
				try{
					GameTest.group.collect_object(x, y, GameTest, Shield, 1);
				}
				catch(Exception e){
					problem = true;
				}
				strength = GameTest.group.strength;
				try{
					GameTest.group.dump_object(x,y, GameTest, Shield, 1);
				}
				catch (WantToDumpTooManyException e){
					problem = true;
				}
				if (GameTest.group.strength >= strength || GameTest.board.mapMatrix[x][y].stuff.get(2).name != "Shield") {
					problem = true;

				}
				if (problem) {
					failure_count++;
					System.out.println("WARNING - test of dump_object(normal way) failed.");
				}	
				
				
				test_count++;
				
				
				//Test n°22: 
				System.out.println(test_count+": dump_object(int x, int y, Game game, Objects object, int number_of_object_to_dump) -test to dump(not enough to dump).");
				problem = true;

				x = GameTest.group.getPosition_x();
				y = GameTest.group.getPosition_y();
				Magic_Sword = new Magic_Sword();
				try{
					GameTest.group.dump_object(x, y, GameTest, Magic_Sword, 2);;
				}
				catch (WantToDumpTooManyException e){
					problem =false;
				}
				Healing_potion = new Healing_potion();
				try{
					GameTest.group.dump_object(x, y, GameTest, Healing_potion, 2);;
				}
				catch (WantToDumpTooManyException e){
					problem =false;
				}
				Shield = new Shield();
				try{
					GameTest.group.dump_object(x, y, GameTest, Shield, 2);;
				}
				catch (WantToDumpTooManyException e){
					problem =false;
				}
				if (problem) {
					failure_count++;
					System.out.println("WARNING - test of dump_object(not enough to dump) failed.");
				}
				
				
				test_count++;//Prepared to had a next test.
				System.out.println("\n *** Test Results ***\n");
				if (failure_count==0) System.out.println("All "+(test_count-1)+" tests have passed !");
				else System.out.println("WARNING : "+failure_count+" failures from "+(test_count-1)+" tests.");
			}
			


			/**
			 * Make a test of class character and execute the tests on this character
			 * @param args is not used
			 */
			public static void main (String [] args){
				
				Test_Group group= new Test_Group("group_test",new Character("Char_Test"));
				group.test();
				
				}

}
