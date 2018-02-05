/**
 * Package Main_menu_controller gerant le menu principal, partie interaction
 * 
 * @author FallINT 4's Team
 *
 */

package graphic_interface_controller;

import game_engine.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import Characters.Character;
import Characters.Group;
import environment.Board;
import graphic_interface_models.Main_menu_model;
import graphic_interface_controller.Board_controller;
import graphic_interface_models.Board_model;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import game_engine.Game;
import javafx.scene.control.TextField;


public class Main_menu_controller {

	
    @FXML
    private Button Load;

    @FXML
    private AnchorPane mainMenu;

    @FXML
    private Button Quit;

    @FXML
    private Text Title;

    @FXML
    private ToggleButton SoundButton;

    @FXML
    private Button NewGame;
    
    //Creation d'une fenetre annexe avec dialogue pour la charge de partie
    private void showDialog() {
    	 
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        
        Text textLoad = new Text("Dernière partie chargée. Bon jeu ! \n");
        
        Button closeButton = new Button("OK");
        closeButton.setOnAction(e -> stage.close());
        
        VBox loadStage = new VBox();
        loadStage.getChildren().addAll(textLoad, closeButton);
        
        Scene scene = new Scene(loadStage, 300, 70);
        stage.setScene(scene);
        stage.show();
    }
    
    
  //Creation d'une fenetre annexe avec un dialogue précisé
    private void showDialog(String text) {
    	 
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        
        Text textLoad = new Text(text);
        
        Button closeButton = new Button("OK");
        closeButton.setOnAction(e -> stage.close());
        
        VBox loadStage = new VBox();
        loadStage.getChildren().addAll(textLoad, closeButton);
        
        Scene scene = new Scene(loadStage, 500, 70);
        stage.setScene(scene);
        stage.show();
    }
    
    

    
    
    
    @FXML
    void initialize() {
    	
    	Main_menu_model modelData = new Main_menu_model();
    	
        assert Load != null : "fx:id=\"Load\" was not injected: check your FXML file 'Main_Menue.fxml'.";
        assert mainMenu != null : "fx:id=\"test\" was not injected: check your FXML file 'Main_Menue.fxml'.";
        assert Title != null : "fx:id=\"Title\" was not injected: check your FXML file 'Main_Menue.fxml'.";
        assert Quit != null : "fx:id=\"Quit\" was not injected: check your FXML file 'Main_Menue.fxml'.";
        assert SoundButton != null : "fx:id=\"Sound\" was not injected: check your FXML file 'Main_Menue.fxml'.";
        assert NewGame != null : "fx:id=\"NewGame\" was not injected: check your FXML file 'Main_Menue.fxml'.";
        
		// Chargement des polices        
		final Font fontDaysLater24 = Font.loadFont(getClass().getResourceAsStream("/resources/fonts/28DaysLater.ttf"), 24);
		final Font fontDaysLater96 = Font.loadFont(getClass().getResourceAsStream("/resources/fonts/28DaysLater.ttf"), 96);
		final Font fontDaysLater18 = Font.loadFont(getClass().getResourceAsStream("/resources/fonts/28DaysLater.ttf"), 18);
		
		
		Title.setFont(fontDaysLater96);
		Load.setFont(fontDaysLater24);
		Quit.setFont(fontDaysLater24);
		SoundButton.setFont(fontDaysLater18);
		NewGame.setFont(fontDaysLater24);
		
		//Parametrage des actions sur les boutons
        NewGame.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Nouvelle partie demandee");
				Main_menu_model.setNewGame(true);
				//Creation de la nouvelle partie
				
				Character Player1 = new Character("");
			
				String team_name="Team 'Seigneur des Anneaux' ";
				game_engine.Game.newGamePlayer.new_game(team_name, Player1);
						
						// TODO
						
				Parent newGameParent;
						
				try	{
					newGameParent = FXMLLoader.load(getClass().getResource("/graphic_interface_views/Board.fxml"));
				}
				catch(Exception e){
					e.printStackTrace();
					return;
				}
						
				Scene newGameScene = new Scene(newGameParent);
						
				Stage newGameStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
						
				newGameStage.hide();
				newGameStage.setScene(newGameScene);
				newGameStage.show();
				
				
				
				
				
			}
			
		});
        
        Quit.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Quitter le jeu");
				
				Stage stage = (Stage) Quit.getScene().getWindow();
				stage.close();
			}
		});
        
        Load.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Charger une partie");

				
				Main_menu_model.setNewGame(false);
				Game game=game_engine.Game.newGamePlayer;
				boolean isPossibleToCharge =true ;
				try
				{
					game.charge(game);	
				}
				catch(FileNotFoundException e){
					isPossibleToCharge = false;
				}
				catch(IOException e){
					isPossibleToCharge = false;
				}
				catch(ClassNotFoundException e){
					isPossibleToCharge = false;
				}
				if (isPossibleToCharge){

					Parent newGameParent;
					try{
					newGameParent = FXMLLoader.load(getClass().getResource("/graphic_interface_views/Board.fxml"));
					}
					catch(Exception e){
						e.printStackTrace();
						return;
					}
				
					Scene newGameScene = new Scene(newGameParent);
			
					Stage newGameStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				
					newGameStage.hide();
					newGameStage.setScene(newGameScene);
					newGameStage.show();
					showDialog();
				}
				else {
					showDialog("Aucune partie ne peut être chargée, tu es mort la dernière fois");
				}
			}
		});
        
        SoundButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				if (Main_menu_model.isSound()) {
					System.out.println("Son off");
					SoundButton.setText("SON OFF");
					Main_menu_model.setSound(false);
				}
				else {
					System.out.println("Son on");
					SoundButton.setText("SON ON");
					Main_menu_model.setSound(true);
				}
			}
		});
        
        
    }
}

















