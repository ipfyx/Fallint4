package Tests;

import Characters.Character;


public class Test_Character extends Characters.Character {
	
	private static int failure_count =0;
	private static int test_count =1;
	
	/**
	 * An incomplete test suite of unit tests.<br>
	 *  
     */
	
	public Test_Character(String name) {
		super(name);
	}
	
	public void test(){
		
System.out.println("\n *** Character Unit Tests ***\n");
		
		//Test n°1: 
		System.out.println(test_count+": set_STATUS(String statut) - Test to change the statut with a string.");
		boolean problem = false;
		this.set_STATUS("SAIN");
	    if (this.get_STATUS()!= STATUS.SAIN){
	    	problem = true;
	    }
	    this.set_STATUS("MALADE");
	    if (this.get_STATUS()!= STATUS.MALADE){
	    	problem = true;
	    }
	    this.set_STATUS("EMPOISONNE");
	    if (this.get_STATUS()!= STATUS.EMPOISONNE){
	    	problem = true;
	    }
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - test of set_STATUS(String statut) failed.");
	    }
	    
	    
		test_count++;
		
		
		//Test n°2:
		System.out.println(test_count+": get_STATUSstr() - Test to get the statut as a string.");
		problem = false;
		this.set_STATUS("SAIN");
	    if (this.get_STATUSstr()!= "SAIN"){
	    	problem = true;
	    }
	    this.set_STATUS("MALADE");
	    if (this.get_STATUSstr()!= "MALADE"){
	    	problem = true;
	    }
	    this.set_STATUS("EMPOISONNE");
	    if (this.get_STATUSstr()!= "EMPOISONNE"){
	    	problem = true;
	    }
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - test of get_STATUSstr() failed.");
	    }
		
	    
	    test_count++;
	    
	    
	    //Test n°3:
	    System.out.println(test_count+": variation_health(int n) - Test of variation health without overtaking.");
	    problem = false;
	    this.max_health = 10;
	    this.health = 5 ;
	    this.variation_health(+2);
	    if (this.health != 7){
	    	problem = true;
	    }
	    this.variation_health(-4);
	    if (this.health != 3){
	    	problem = true;
	    }
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - test of variation_health(int n) without overtaking failed.");
	    }
	    
	    
	    test_count++;
	    
	    
	    //Test n°4:
	    System.out.println(test_count+": variation_health(int n) - Test of variation_health with overtaking.");
	    problem = false;
	    this.max_health = 10;
	    this.health = 5 ;
	    this.variation_health(+6);
	    if (this.health != 10){
	    	problem = true;
	    }
	    this.variation_health(-15);
	    if (this.health != 0){
	    	problem = true;
	    }
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - test of variation_health with overtaking failed.");
	    }
	    
	    test_count++;
	    
	    
	  //Test n°5:
	    System.out.println(test_count+": variation_strength(int n) - Test of variation_strength without overtaking.");
	    problem = false;
	    this.strength = 5 ;
	    this.variation_strength(+2);
	    if (this.strength != 7){
	    	problem = true;
	    }
	    this.variation_strength(-4);
	    if (this.strength != 3){
	    	problem = true;
	    }
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - test of variation_strength(int n) without overtaking failed.");
	    }
	    
	    
	    test_count++;
	    
	    
	    //Test n°6:
	    System.out.println(test_count+": variation_strength(int n) - Test of variation_strength with overtaking.");
	    problem = false;
	    this.strength= 5 ;
	    this.variation_strength(-6);
	    if (this.health != 0){
	    	problem = true;
	    }
	    if (problem){
	    	failure_count++;
	    	System.out.println("WARNING - test of variation_strength with overtaking failed.");
	    }
	    
	    
	    test_count++;//Prepared to had a next test.
		System.out.println("\n *** Test Results ***\n");
		if (failure_count==0) System.out.println("All "+(test_count-1)+" tests have passed !");
		else System.out.println("WARNING : "+failure_count+" failures from "+test_count+" tests.");
	}
	


	/**
	 * Make a test of class character and execute the tests on this character
	 * @param args is not used
	 */
	public static void main (String [] args){
		
		Test_Character character= new Test_Character("Char_Test");
		character.test();
		
		}

}
