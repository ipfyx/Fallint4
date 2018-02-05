/**
 * Classe regroupant les differents evenements pouvant arriver au joueur
 */

package game_engine;
import Characters.Group.STATUS;
import java.io.*;
public class Event implements java.io.Serializable{
	//Définition des attributs
	public int event_nb;
	public String name;
	public String description;
	
	/**
	 * Il s'agit du constructeur d'événements, il doit avoir les paramètres suivants pour être entièrement déterminé.
	 * @param nb_event
	 * @param name
	 * @param description
	 */
	public Event(int event_nb, String name, String description){
		this.event_nb=event_nb;
		this.name=name;
		this.description=description;
	}
	
	
	//Choix de l'événement
	public void choose_event(Game game){
		double event_random = Math.random();
		double per_cent=0.01; //facilitera la vision
		
		//Définition des taux de chances (en pourcent)
		double taux_wolf_attack = 10 * per_cent ;
		double taux_ravaging = 10 * per_cent ;
		double taux_spoutnik = 5 * per_cent ;
		double taux_disease = 10 * per_cent ;
		double taux_election = 5 * per_cent ;
		
		//Aide au test: calcul les bornes selon le cas
		double lim_1 = taux_wolf_attack;
		double lim_2 = lim_1 + taux_ravaging ;
		double lim_3 = lim_2 + taux_spoutnik ;
		double lim_4 = lim_3 + taux_disease ;
		double lim_5 = lim_4 + taux_election ;
		
		if (event_random <= lim_1){
			this.wolf_attack(game);
		}
		else if ((lim_1 < event_random) && (event_random  <= lim_2 )){
			this.ravaging(game);
		}
		else if (( lim_2 <= event_random) && (event_random  <= lim_3)){
			this.spoutnik(game);
		}
		else if (( lim_3 <= event_random) && (event_random  <= lim_4)){
			this.disease(game);
		}
		else if (( lim_4 <= event_random) && (event_random  <= lim_5)){
			this.Election_of_BDE(game);
		}
		else{
			this.no_event();
		}
	}
	
	
	
	
	//Définition des différents events possibles
	
	
	
	public  void no_event(){
		this.event_nb=0;
		this.name="Rien ne s'est produit durant ce tour";
		this.description="Il n'y a ni avantage ni désavantage pour ce tour.";
		}
	/**
	 * Permet de définir l'Attaque des loups mutants
	 * @return 
	 */
	public void wolf_attack(Game game){
		this.event_nb=1;
		this.name="Attaque de loups mutants";
		this.description="De très méchants loups viennent de vous attaquer, vous avez subit de gros dégats, il faut vous soigner ou bien vous allez mourir."
				+ "\n De plus, ces loups ont mangé une partie de votre inventaire. ";
		//action de l'événement
		for (int i=0;i < game.group.group.size();i++){
			game.group.group.get(i).variation_health(-5);
		}
		if ( game.group.inventory.food < 2){
			game.group.inventory.food=0;
		}
		else {
		game.group.inventory.food-=2;}
		game.group.inventory.Weigth();
	}
	
	/**
	 * Permet de définir un pillage
	 */
	public void ravaging(Game game){
		this.event_nb=2;
		this.name="Pillage";
		this.description="Cette nuit a été rude pour votre groupe, des pilleurs ont pillé votre campement. \nVotre stock a été grandement affecté.";
		//action de l'événement
		
		
		game.group.inventory.food=game.group.inventory.food/2;
		game.group.inventory.water=game.group.inventory.water/2;
		game.group.inventory.wood=game.group.inventory.wood/2;
		game.group.inventory.Weigth();
	}
	
	/**
	 * Correspond à l'événement spoutnik
	 * @param game
	 */
	public void spoutnik(Game game){
		this.event_nb=3;
		this.name="Spoutnik";
		this.description="Votre campement vient de recevoir un satelitte.\nManque de chance vous vous êtes reposé au mauvais endroit.\nLes dégâts sont énormes !";
		
		
		//action de l'événement
		int x= game.group.getPosition_x();
		int y= game.group.getPosition_y();
		
		for (int i=0;i < game.group.group.size();i++){
			game.group.group.get(i).health=game.group.group.get(i).get_health()/3;   //A modifier
		}
		if (game.group.IsAlreadyABase(x, y, game)){
			game.group.destroy(x, y, game);
		}
		game.group.inventory.food=game.group.inventory.food/2;
		game.group.inventory.water=game.group.inventory.water/2;
		game.group.inventory.wood=game.group.inventory.wood/2;
		game.group.inventory.Weigth();
	}
	
	/**
	 * Evenement maladie
	 * @param game
	 */
	public void disease(Game game){
		this.event_nb=4;
		this.name="Maladie";
		this.description="Une maladie s'est abattu sur votre groupe !";
		//action de l'événement
		game.group.statut=STATUS.MALADE;
		int nbPlayer=game_engine.Game.newGamePlayer.group.MembersNbGroup();
    	for (int i=1;i<=nbPlayer;i++){
    		game_engine.Game.newGamePlayer.group.group.get(i-1).set_STATUS("MALADE");
    	}
	}
	
	/**
	 * Evenement election du BDE. Evenement positif 
	 * @param game
	 */
	public void Election_of_BDE(Game game){
		this.event_nb=5;
		this.name="Election du BDE";
		this.description="Une soirée pour fêter l'élection du nouveau BDE vient de passer, vous avez réussi à récupérer les miettes.";
		
		//action de l'événement
		
		if (game.group.inventory.weigth > 70 ) {
			int x= 100 - game.group.inventory.weigth ;
			game.group.inventory.food=game.group.inventory.food + Math.round(x/3) ;
			game.group.inventory.water=game.group.inventory.water + Math.round(x/3);
			game.group.inventory.wood=game.group.inventory.wood + Math.round(x/3);
		}
		else {
		game.group.inventory.food=game.group.inventory.food + 10;
		game.group.inventory.water=game.group.inventory.water + 10;
		game.group.inventory.wood=game.group.inventory.wood + 10;
		}
		game.group.inventory.Weigth();
	}
}


