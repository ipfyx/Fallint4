package game_engine;
import Characters.Character;
import Characters.Group;
import java.io.*;
import game_engine.Event;
/**
 * Classe de gestion des tours de jeu, ainsi que de la periode de la journee
 * 
 * @author FallINT 4's Team
 */
public class Turn implements java.io.Serializable{
	//TODO Définition des attributs
	public int number;
	public String period;
	public int action_point;
	public Event event;
	public Ennemies_turn ennemies_turn;
	public boolean sure_to_do_next_turn_if_already_action_points=false;
	
	//TODO Définition du constructeur
	public Turn(int number,int action_point){
		if (number < 0){
			throw new IllegalArgumentException(" number out of range [0,+oo[ ");
		}
		else this.number=number;
		
		this.action_point=action_point;
		this.event = new Event(0, null, null);
		this.event.no_event();
		UpdatePeriod();
		}
	
	//Définition des getters
	public int getnumber(){
		return this.number;
	}
	public String getperiod(){
		return this.period;
	}
	public int getaction_point(){
		return this.action_point;
	}
	
	public boolean getbool(){
		return this.sure_to_do_next_turn_if_already_action_points;
	}
	//Définition des setters
	public void setnumber(int number){
		this.number=number;
	}
	public void setperiod(String period){//techniquement on ne doit pas s'en servir
		this.period=period;
	}
	public void setaction_point(int action_point){
		this.action_point=action_point;
	}
	
	public void UpdatePeriod(){
		int i=(this.getnumber())%4;
		
		switch (i) {
		  case 0: 
			  this.period="Matin";
			  break;
		  case 1: 
			  this.period="Après Midi";
			  break;
		  case 2: 
			  this.period="Soirée";
			  break;
		  case 3: 
			  this.period="Nuit";
			  break;
		}
		
	}
	
	public void init_turn(int action_point, Group group){
		this.number=0;
		this.event.no_event();
		this.action_point=action_point;
		group.setAction_point(action_point);
		UpdatePeriod();
	}
	
	
	public void nextTurn(Game game){
		if (game.group.EnoughActionPoint(1) && !(this.getbool())){
			this.sure_to_do_next_turn_if_already_action_points=true;
		}
		else {
			this.number=this.getnumber()+1;
			UpdatePeriod();
			int action_point = 0;
			switch (period) {
			  case "Matin": 
				  action_point = 15;
				  break;
			  case "Après Midi": 
				  action_point = 20;
				  break;
			  case "Soirée": 
				  action_point = 15;
				  break;
			  case "Nuit": 
				  action_point = 10;
				  break;
			}
			this.action_point=action_point;
			game.group.setAction_point(action_point);
			this.sure_to_do_next_turn_if_already_action_points=false;
			this.event.choose_event(game);
		}
		
	}
	
}
