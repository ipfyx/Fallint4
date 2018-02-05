package Tests;

import java.util.ArrayList;

import Characters.*;
import Characters.Character;
import environment.*;

public class Test_Environment_CaseModel extends CaseModel {
	
	private static int failure_count = 0;
	private static int test_count = 0;
	
	public Test_Environment_CaseModel(CaseType typeTerrain, Ennemies ennemyOnCase, ArrayList<Objects_and_number> lootAndNumber, int[] caseCoordinates, boolean isInfraBuild) {
		super(typeTerrain, ennemyOnCase, lootAndNumber, caseCoordinates, isInfraBuild);
	}
	
	public void test() {
		
		// Initialisation de quelques variables pour les tests
		boolean problem = false;

		int[] caseCoordinates = new int [2];
		caseCoordinates[0] = 0;
		caseCoordinates[1] = 0;
		
		Objects magicSword = new Magic_Sword();
		Objects shield = new Shield();
		Objects potions = new Healing_potion();
		
		Objects_and_number nbMagicSword = new Objects_and_number(magicSword, 13);
		Objects_and_number nbShield = new Objects_and_number(shield, 1337);
		Objects_and_number nbPotions = new Objects_and_number(potions, 42);
		
		
		
		
		// Demarrage des tests
		
		System.out.println("\n*** Group Unit Tests ***\n");
		
		// Test n°1:
		test_count += 1;
		System.out.println("\nTest de la bonne initialisation de la case\n");
		problem = false;
		
		if (this.getTerrain() != CaseType.nonexistent){
			problem = true;
			System.out.println("\nProblème de terrain\n");
		}
		if (this.getEnnemy().getName() != "badGuy"){
			problem = true;
			System.out.println("Problème du nom de l'ennemi\n");
		}
		if (this.getEnnemy().getHealth() != 20 || this.getEnnemy().getStrength() != 3 || this.getEnnemy().getInventory().food != 5 || this.getEnnemy().getInventory().water != 5 || this.getEnnemy().getInventory().wood != 5){
			problem = true;
			System.out.println("Problème d'ennemi\n");
		}
		if (!this.isStuffThere()){
			problem = true;
			System.out.println("Problème du boolean stuff\n");
		}
		if (this.getStuff().get(0).equals(nbMagicSword) || this.getStuff().get(1).equals(nbShield) || this.getStuff().get(2).equals(nbPotions)){
			problem = true;
			System.out.println("Problème du stuff\n");
		}
		if (this.getCoordinates()[0] != caseCoordinates[0] || this.getCoordinates()[1] != caseCoordinates[1]){
			problem = true;
			System.out.println("Problème des coordonnées\n");
		}
		if (this.isInfrastructure()){
			problem = true;
			System.out.println("Problème du boolean de la base\n");
		}
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - test of case initialization failed");
	    }
		
	    
	    
	    
		// Test n°2:
		test_count += 1;
		System.out.println("\nTest des méthodes liées aux objets sur la case\n");
		problem = false;
		
		if (this.howManyObjectOnCase(potions) != 42) {
			problem = true;
			System.out.println("Problème du décompte d'objets\n");
		}
		
		this.addStuff(potions, 8);
		if (this.howManyObjectOnCase(potions) != 50) {
			problem = true;
			System.out.println("Problème dand l'ajout d'objets\n");
		}
		
		nbPotions.setNbr_object(howManyObjectOnCase(potions));
		this.rmStuff(nbPotions); // nbPotions est maintenant a 50
		if (this.howManyObjectOnCase(potions) != 0) {
			problem = true;
			System.out.println("Problème dand le retrait d'objets\n");
		}
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - la gestion d'objet a générée des erreurs");
	    }
	    
	    
	    
	    
		// Test n°3:
		test_count += 1;
		System.out.println("\nTest de modifications des attributs de la case\n");
		problem = false;
		
		this.setCoordinates(42, 42);
		this.setEnnemy(null);
		this.setInfrastructure(true);
		this.setTerrain(CaseType.rock);
		
		if (this.getTerrain() != CaseType.rock){
			problem = true;
			System.out.println("\nProblème de terrain\n");
		}
		if (isEnnemyThere()){
			problem = true;
			System.out.println("Problème lié à l'ennemi devant être enlevé\n");
		}
		if (!this.isStuffThere()){
			problem = true;
			System.out.println("Problème du boolean stuff\n");
		}
		if (this.getCoordinates()[0] != 42 || this.getCoordinates()[1] != 42){
			problem = true;
			System.out.println("Problème des coordonnées\n");
		}
		if (!this.isInfrastructure()){
			problem = true;
			System.out.println("Problème du boolean de la base\n");
		}
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - test of case initialization failed");
	    }
		
		
	    
		System.out.println("\n*** Test Results ***\n");
		if (failure_count==0) System.out.println("All "+(test_count)+" tests have passed !");
		else System.out.println("WARNING : "+failure_count+" failures from "+test_count+" tests.");
		
	}
	
	/**
	 * Make a test of class character and execute the tests on this character
	 * @param args is not used
	 */
	public static void main (String [] args){
		Ennemies ennemyToTest = new Ennemies("badGuy");
		ArrayList<Objects_and_number> availableObject = new ArrayList<Objects_and_number>();
		
		int[] caseCoordinates = new int [2];
		caseCoordinates[0] = 0;
		caseCoordinates[1] = 0;
		
		Objects magicSword = new Magic_Sword();
		Objects shield = new Shield();
		Objects potions = new Healing_potion();
		
		Objects_and_number nbMagicSword = new Objects_and_number(magicSword, 13);
		Objects_and_number nbShield = new Objects_and_number(shield, 1337);
		Objects_and_number nbPotions = new Objects_and_number(potions, 42);
		
		availableObject.add(0, nbMagicSword);
		availableObject.add(1, nbShield);
		availableObject.add(2, nbPotions);
		
		Test_Environment_CaseModel caseTest = new Test_Environment_CaseModel(CaseType.nonexistent, ennemyToTest, availableObject, caseCoordinates, false);
		
		caseTest.test();
	}
	
}
