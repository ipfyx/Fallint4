/**
 * Package Main_menu_controller gerant le plateau de jeu, partie interaction
 * 
 * @author FallINT 4's Team
 *
 */

package graphic_interface_controller;


import game_engine.Game;
import Characters.*;
import Characters.Character;
import environment.Board;
import graphic_interface_models.Board_model;
import graphic_interface_models.Main_menu_model;
import environment.CaseType;

import graphic_interface_controller.Main_menu_controller;

import java.awt.MenuBar;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import exception.*;
import java.lang.Object;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
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
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Node;
import game_engine.Game;
import javafx.scene.control.TextField;
import java.io.File;
public class Board_controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane HexagonePaneSp4_0;

    @FXML
    private Button dumpRessourceButton;

    @FXML
    private Polygon Hexagonem3_2;

    @FXML
    private AnchorPane buttonPanel1;

    @FXML
    private Polygon Hexagonem3_1;

    @FXML
    private AnchorPane HexagonePaneSp3_m1;

    @FXML
    private AnchorPane HexagonePaneSp3_m2;

    @FXML
    private Polygon Hexagonem3_0;

    @FXML
    private Button woodInventButton;

    @FXML
    private AnchorPane HexagonePane2_0;

    @FXML
    private AnchorPane HexagonePane2_1;

    @FXML
    private AnchorPane HexagonePane2_2;

    @FXML
    private Button collectObjectButton;

    @FXML
    private Button dumpObjectButton;

    @FXML
    private Button collectRessourceButton;

    @FXML
    private Button buildButton;

    @FXML
    private Text Perso3_plus;

    @FXML
    private AnchorPane HexagonePane2_m2;

    @FXML
    private AnchorPane HexagonePane2_m1;

    @FXML
    private AnchorPane HexagonePaneSpm1_m1;

    @FXML
    private Text Perso1_barre;

    @FXML
    private AnchorPane HexagonePaneSpm1_m2;

    @FXML
    private Text maladieP3;

    @FXML
    private Text maladieP1;

    @FXML
    private Text maladieP2;

    @FXML
    private Text Perso3_force;

    @FXML
    private AnchorPane HexagonePane1_m1;

    @FXML
    private Text turnCountField2;

    @FXML
    private Text turnCountField1;

    @FXML
    private AnchorPane caseInfoPane;

    @FXML
    private Polygon Hexagonem4_2;

    @FXML
    private Polygon Hexagonem4_1;

    @FXML
    private Polygon Hexagonem4_0;

    @FXML
    private AnchorPane HexagonePane3_0;

    @FXML
    private AnchorPane HexagonePane3_1;

    @FXML
    private AnchorPane HexagonePane3_2;

    @FXML
    private Polygon Hexagonem1_m2;

    @FXML
    private Polygon Hexagonem1_m1;

    @FXML
    private Polygon Hexagonem1_m3;

    @FXML
    private Polygon Hexagone4_m3;

    @FXML
    private Polygon Hexagone4_m1;

    @FXML
    private Polygon Hexagone4_m2;

    @FXML
    private AnchorPane HexagonePaneSpm5_2;

    @FXML
    private Text dmgArmeP2;

    @FXML
    private Text dmgArmeP1;

    @FXML
    private Text dmgArmeP3;

    @FXML
    private Polygon Hexagonem5_2;

    @FXML
    private AnchorPane HexagonePanem1_2;

    @FXML
    private AnchorPane HexagonePaneSp4_m1;

    @FXML
    private AnchorPane HexagonePaneSp4_m2;

    @FXML
    private AnchorPane HexagonePanem2_m2;

    @FXML
    private AnchorPane HexagonePanem2_m3;

    @FXML
    private AnchorPane HexagonePanem1_1;

    @FXML
    private AnchorPane HexagonePanem2_m1;

    @FXML
    private AnchorPane HexagonePanem1_0;

    @FXML
    private AnchorPane HexagonePane1_m3;

    @FXML
    private Text currentInventoryLoad;

    @FXML
    private AnchorPane HexagonePane1_m2;

    @FXML
    private AnchorPane HexagonePane3_m1;

    @FXML
    private AnchorPane HexagonePane3_m2;

    @FXML
    private AnchorPane HexagonePane3_m3;

    @FXML
    private AnchorPane menuBas;

    @FXML
    private Polygon Hexagonem1_2;

    @FXML
    private Polygon Hexagonem1_1;

    @FXML
    private Polygon Hexagonem1_0;

    @FXML
    private AnchorPane HexagonePane4_0;

    @FXML
    private AnchorPane topMenuPane;

    @FXML
    private Polygon Hexagone0_2;

    @FXML
    private Polygon Hexagone0_1;

    @FXML
    private AnchorPane centerHexagonePaneSp;

    @FXML
    private Button destroyButton;

    @FXML
    private Text maxInventoryLoad;

    @FXML
    private AnchorPane HexagonePaneSp2_m2;

    @FXML
    private Button moveButton;

    @FXML
    private AnchorPane HexagonePaneSp2_m1;

    @FXML
    private Text caseInfo;

    @FXML
    private Polygon Hexagone5_m2;

    @FXML
    private Polygon Hexagone5_m3;

    @FXML
    private Button quitButton;

    @FXML
    private Polygon Hexagonem2_2;

    @FXML
    private Polygon Hexagonem2_1;

    @FXML
    private Polygon Hexagonem2_0;

    @FXML
    private AnchorPane HexagonePanem3_m2;

    @FXML
    private AnchorPane HexagonePanem3_m1;

    @FXML
    private Text hpP1;

    @FXML
    private Text hpP2;

    @FXML
    private AnchorPane HexagonePane2_m3;

    @FXML
    private Text hpP3;

    @FXML
    private Text Perso2_force;

    @FXML
    private Polygon Hexagone1_1;

    @FXML
    private Polygon Hexagone1_2;

    @FXML
    private Polygon Hexagone1_0;

    @FXML
    private Polygon Hexagone0_m1;

    @FXML
    private Polygon Hexagone0_m2;

    @FXML
    private Polygon Hexagone0_m3;

    @FXML
    private Text Perso1_force;

    @FXML
    private Button collectPotionButton;

    @FXML
    private AnchorPane HexagonePaneSp0_2;

    @FXML
    private AnchorPane HexagonePaneSp0_1;

    @FXML
    private Text hpMaxP1;

    @FXML
    private Text hpMaxP3;

    @FXML
    private Text hpMaxP2;

    @FXML
    private Button foodInventButton;

    @FXML
    private Polygon Hexagonem3_m1;

    @FXML
    private Polygon Hexagone2_2;

    @FXML
    private Polygon Hexagonem3_m2;

    @FXML
    private AnchorPane HexagonePaneSpm1_0;

    @FXML
    private Text Perso3_barre;

    @FXML
    private AnchorPane HexagonePaneSpm2_1;

    @FXML
    private AnchorPane HexagonePaneSpm2_0;

    @FXML
    private Polygon Hexagone2_m2;

    @FXML
    private Polygon Hexagone2_m1;

    @FXML
    private AnchorPane HexagonePaneSpm2_2;

    @FXML
    private Polygon Hexagone2_0;

    @FXML
    private Polygon Hexagone2_1;

    @FXML
    private AnchorPane persosInfoPane;

    @FXML
    private Polygon Hexagone2_m3;

    @FXML
    private AnchorPane HexagonePanem4_0;

    @FXML
    private AnchorPane HexagonePanem4_2;

    @FXML
    private AnchorPane HexagonePanem4_1;

    @FXML
    private Text ForceP3;

    @FXML
    private Text ForceP2;

    @FXML
    private Text ForceP1;

    @FXML
    private Button waterInventButton;

    @FXML
    private Polygon Hexagone1_m1;

    @FXML
    private Text Perso2_plus;

    @FXML
    private AnchorPane HexagonePaneSp1_2;

    @FXML
    private AnchorPane HexagonePaneSp1_1;

    @FXML
    private AnchorPane HexagonePaneSp1_0;

    @FXML
    private Polygon Hexagone1_m2;

    @FXML
    private Polygon Hexagone1_m3;

    @FXML
    private Button endturnButton;

    @FXML
    private ScrollPane scrollCommandPane;

    @FXML
    private AnchorPane HexagonePaneSp1_m2;

    @FXML
    private Polygon Hexagone3_1;

    @FXML
    private AnchorPane HexagonePaneSp1_m1;

    @FXML
    private Polygon Hexagone3_2;

    @FXML
    private AnchorPane menuDroite;

    @FXML
    private AnchorPane HexagonePaneSpm1_2;

    @FXML
    private AnchorPane HexagonePane4_m1;

    @FXML
    private AnchorPane HexagonePaneSpm1_1;

    @FXML
    private AnchorPane HexagonePane4_m2;

    @FXML
    private AnchorPane HexagonePane4_m3;

    @FXML
    private Text Perso1_vie;

    @FXML
    private Polygon Hexagone3_0;

    @FXML
    private Text playerPositionField;

    @FXML
    private Button potionInventButton;

    @FXML
    private Text Perso2_barre;

    @FXML
    private AnchorPane HexagonePanem5_2;

    @FXML
    private Polygon Hexagone3_m1;

    @FXML
    private Polygon Hexagone3_m3;

    @FXML
    private Polygon Hexagone3_m2;

    @FXML
    private Text Perso3_vie;

    @FXML
    private AnchorPane centerHexagonePane;

    @FXML
    private AnchorPane HexagonePaneSp2_2;

    @FXML
    private AnchorPane HexagonePaneSp2_1;

    @FXML
    private AnchorPane HexagonePaneSp2_0;

    @FXML
    private AnchorPane HexagonePaneSpm2_m1;

    @FXML
    private AnchorPane HexagonePaneSpm2_m2;

    @FXML
    private AnchorPane HexagonePanem1_m3;

    @FXML
    private AnchorPane HexagonePanem1_m1;

    @FXML
    private AnchorPane HexagonePane0_1;

    @FXML
    private AnchorPane HexagonePanem1_m2;

    @FXML
    private AnchorPane HexagonePane0_2;

    @FXML
    private AnchorPane HexagonePane0_m3;

    @FXML
    private AnchorPane HexagonePane0_m1;

    @FXML
    private Polygon Hexagone4_0;

    @FXML
    private AnchorPane HexagonePane0_m2;

    @FXML
    private Button swordInventButton;

    @FXML
    private AnchorPane HexagonePaneSpm4_1;

    @FXML
    private AnchorPane HexagonePaneSpm4_0;

    @FXML
    private AnchorPane HexagonePaneSpm4_2;

    @FXML
    private Button collectShieldButton;

    @FXML
    private AnchorPane HexagonePanem2_2;

    @FXML
    private AnchorPane HexagonePanem2_1;

    @FXML
    private Text Perso1_plus;

    @FXML
    private AnchorPane HexagonePanem2_0;

    @FXML
    private AnchorPane commandPane;

    @FXML
    private Polygon Hexagonem2_m1;

    @FXML
    private Polygon Hexagonem2_m3;

    @FXML
    private Polygon Hexagonem2_m2;

    @FXML
    private AnchorPane HexagonePane5_m3;

    @FXML
    private AnchorPane HexagonePane5_m2;

    @FXML
    private AnchorPane HexagonePaneSp3_1;

    @FXML
    private AnchorPane HexagonePaneSp3_0;

    @FXML
    private AnchorPane groupNameTextPane;

    @FXML
    private AnchorPane HexagonePaneSp3_2;

    @FXML
    private AnchorPane HexagonePaneSp5_m2;

    @FXML
    private AnchorPane HexagonePane1_0;

    @FXML
    private AnchorPane HexagonePane1_1;

    @FXML
    private AnchorPane HexagonePane1_2;

    @FXML
    private AnchorPane HexagonePaneSpm3_0;

    @FXML
    private AnchorPane HexagonePaneSpm3_2;

    @FXML
    private AnchorPane HexagonePaneSpm3_1;

    @FXML
    private Button shieldInventButton;

    @FXML
    private AnchorPane HexagonePaneSpm3_m1;

    @FXML
    private Polygon centerHexagone;

    @FXML
    private AnchorPane HexagonePaneSpm3_m2;

    @FXML
    private AnchorPane HexagonePanem3_1;

    @FXML
    private AnchorPane HexagonePanem3_0;

    @FXML
    private Text Perso2_vie;

    @FXML
    private AnchorPane HexagonePanem3_2;

    @FXML
    private AnchorPane HexagonePaneSp0_m2;

    @FXML
    private Text perso3;

    @FXML
    private Button collectWeaponButton;

    @FXML
    private Text groupNameText;

    @FXML
    private Text perso2;

    @FXML
    private AnchorPane HexagonePaneSp0_m1;

    @FXML
    private Text perso1;

    @FXML
    private Text ptActionField;

    @FXML
    private Text commandText;

    @FXML
    void initialize() {
        assert HexagonePaneSp4_0 != null : "fx:id=\"HexagonePaneSp4_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert dumpRessourceButton != null : "fx:id=\"dumpRessourceButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem3_2 != null : "fx:id=\"Hexagonem3_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert buttonPanel1 != null : "fx:id=\"buttonPanel1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem3_1 != null : "fx:id=\"Hexagonem3_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp3_m1 != null : "fx:id=\"HexagonePaneSp3_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp3_m2 != null : "fx:id=\"HexagonePaneSp3_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem3_0 != null : "fx:id=\"Hexagonem3_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert woodInventButton != null : "fx:id=\"woodInventButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane2_0 != null : "fx:id=\"HexagonePane2_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane2_1 != null : "fx:id=\"HexagonePane2_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane2_2 != null : "fx:id=\"HexagonePane2_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert collectObjectButton != null : "fx:id=\"collectObjectButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert dumpObjectButton != null : "fx:id=\"dumpObjectButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert collectRessourceButton != null : "fx:id=\"collectRessourceButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert buildButton != null : "fx:id=\"buildButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso3_plus != null : "fx:id=\"Perso3_plus\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane2_m2 != null : "fx:id=\"HexagonePane2_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane2_m1 != null : "fx:id=\"HexagonePane2_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm1_m1 != null : "fx:id=\"HexagonePaneSpm1_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso1_barre != null : "fx:id=\"Perso1_barre\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm1_m2 != null : "fx:id=\"HexagonePaneSpm1_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert maladieP3 != null : "fx:id=\"maladieP3\" was not injected: check your FXML file 'Board.fxml'.";
        assert maladieP1 != null : "fx:id=\"maladieP1\" was not injected: check your FXML file 'Board.fxml'.";
        assert maladieP2 != null : "fx:id=\"maladieP2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso3_force != null : "fx:id=\"Perso3_force\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane1_m1 != null : "fx:id=\"HexagonePane1_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert turnCountField2 != null : "fx:id=\"turnCountField2\" was not injected: check your FXML file 'Board.fxml'.";
        assert turnCountField1 != null : "fx:id=\"turnCountField1\" was not injected: check your FXML file 'Board.fxml'.";
        assert caseInfoPane != null : "fx:id=\"caseInfoPane\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem4_2 != null : "fx:id=\"Hexagonem4_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem4_1 != null : "fx:id=\"Hexagonem4_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem4_0 != null : "fx:id=\"Hexagonem4_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane3_0 != null : "fx:id=\"HexagonePane3_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane3_1 != null : "fx:id=\"HexagonePane3_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane3_2 != null : "fx:id=\"HexagonePane3_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem1_m2 != null : "fx:id=\"Hexagonem1_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem1_m1 != null : "fx:id=\"Hexagonem1_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem1_m3 != null : "fx:id=\"Hexagonem1_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone4_m3 != null : "fx:id=\"Hexagone4_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone4_m1 != null : "fx:id=\"Hexagone4_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone4_m2 != null : "fx:id=\"Hexagone4_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm5_2 != null : "fx:id=\"HexagonePaneSpm5_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert dmgArmeP2 != null : "fx:id=\"dmgArmeP2\" was not injected: check your FXML file 'Board.fxml'.";
        assert dmgArmeP1 != null : "fx:id=\"dmgArmeP1\" was not injected: check your FXML file 'Board.fxml'.";
        assert dmgArmeP3 != null : "fx:id=\"dmgArmeP3\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem5_2 != null : "fx:id=\"Hexagonem5_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem1_2 != null : "fx:id=\"HexagonePanem1_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp4_m1 != null : "fx:id=\"HexagonePaneSp4_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp4_m2 != null : "fx:id=\"HexagonePaneSp4_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem2_m2 != null : "fx:id=\"HexagonePanem2_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem2_m3 != null : "fx:id=\"HexagonePanem2_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem1_1 != null : "fx:id=\"HexagonePanem1_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem2_m1 != null : "fx:id=\"HexagonePanem2_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem1_0 != null : "fx:id=\"HexagonePanem1_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane1_m3 != null : "fx:id=\"HexagonePane1_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert currentInventoryLoad != null : "fx:id=\"currentInventoryLoad\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane1_m2 != null : "fx:id=\"HexagonePane1_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane3_m1 != null : "fx:id=\"HexagonePane3_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane3_m2 != null : "fx:id=\"HexagonePane3_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane3_m3 != null : "fx:id=\"HexagonePane3_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert menuBas != null : "fx:id=\"menuBas\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem1_2 != null : "fx:id=\"Hexagonem1_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem1_1 != null : "fx:id=\"Hexagonem1_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem1_0 != null : "fx:id=\"Hexagonem1_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane4_0 != null : "fx:id=\"HexagonePane4_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert topMenuPane != null : "fx:id=\"topMenuPane\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone0_2 != null : "fx:id=\"Hexagone0_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone0_1 != null : "fx:id=\"Hexagone0_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert centerHexagonePaneSp != null : "fx:id=\"centerHexagonePaneSp\" was not injected: check your FXML file 'Board.fxml'.";
        assert destroyButton != null : "fx:id=\"destroyButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert maxInventoryLoad != null : "fx:id=\"maxInventoryLoad\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp2_m2 != null : "fx:id=\"HexagonePaneSp2_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert moveButton != null : "fx:id=\"moveButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp2_m1 != null : "fx:id=\"HexagonePaneSp2_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert caseInfo != null : "fx:id=\"caseInfo\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone5_m2 != null : "fx:id=\"Hexagone5_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone5_m3 != null : "fx:id=\"Hexagone5_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert quitButton != null : "fx:id=\"quitButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem2_2 != null : "fx:id=\"Hexagonem2_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem2_1 != null : "fx:id=\"Hexagonem2_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem2_0 != null : "fx:id=\"Hexagonem2_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem3_m2 != null : "fx:id=\"HexagonePanem3_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem3_m1 != null : "fx:id=\"HexagonePanem3_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert hpP1 != null : "fx:id=\"hpP1\" was not injected: check your FXML file 'Board.fxml'.";
        assert hpP2 != null : "fx:id=\"hpP2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane2_m3 != null : "fx:id=\"HexagonePane2_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert hpP3 != null : "fx:id=\"hpP3\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso2_force != null : "fx:id=\"Perso2_force\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone1_1 != null : "fx:id=\"Hexagone1_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone1_2 != null : "fx:id=\"Hexagone1_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone1_0 != null : "fx:id=\"Hexagone1_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone0_m1 != null : "fx:id=\"Hexagone0_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone0_m2 != null : "fx:id=\"Hexagone0_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone0_m3 != null : "fx:id=\"Hexagone0_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso1_force != null : "fx:id=\"Perso1_force\" was not injected: check your FXML file 'Board.fxml'.";
        assert collectPotionButton != null : "fx:id=\"collectPotionButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp0_2 != null : "fx:id=\"HexagonePaneSp0_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp0_1 != null : "fx:id=\"HexagonePaneSp0_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert hpMaxP1 != null : "fx:id=\"hpMaxP1\" was not injected: check your FXML file 'Board.fxml'.";
        assert hpMaxP3 != null : "fx:id=\"hpMaxP3\" was not injected: check your FXML file 'Board.fxml'.";
        assert hpMaxP2 != null : "fx:id=\"hpMaxP2\" was not injected: check your FXML file 'Board.fxml'.";
        assert foodInventButton != null : "fx:id=\"foodInventButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem3_m1 != null : "fx:id=\"Hexagonem3_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone2_2 != null : "fx:id=\"Hexagone2_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem3_m2 != null : "fx:id=\"Hexagonem3_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm1_0 != null : "fx:id=\"HexagonePaneSpm1_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso3_barre != null : "fx:id=\"Perso3_barre\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm2_1 != null : "fx:id=\"HexagonePaneSpm2_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm2_0 != null : "fx:id=\"HexagonePaneSpm2_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone2_m2 != null : "fx:id=\"Hexagone2_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone2_m1 != null : "fx:id=\"Hexagone2_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm2_2 != null : "fx:id=\"HexagonePaneSpm2_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone2_0 != null : "fx:id=\"Hexagone2_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone2_1 != null : "fx:id=\"Hexagone2_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert persosInfoPane != null : "fx:id=\"persosInfoPane\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone2_m3 != null : "fx:id=\"Hexagone2_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem4_0 != null : "fx:id=\"HexagonePanem4_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem4_2 != null : "fx:id=\"HexagonePanem4_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem4_1 != null : "fx:id=\"HexagonePanem4_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert ForceP3 != null : "fx:id=\"ForceP3\" was not injected: check your FXML file 'Board.fxml'.";
        assert ForceP2 != null : "fx:id=\"ForceP2\" was not injected: check your FXML file 'Board.fxml'.";
        assert ForceP1 != null : "fx:id=\"ForceP1\" was not injected: check your FXML file 'Board.fxml'.";
        assert waterInventButton != null : "fx:id=\"waterInventButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone1_m1 != null : "fx:id=\"Hexagone1_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso2_plus != null : "fx:id=\"Perso2_plus\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp1_2 != null : "fx:id=\"HexagonePaneSp1_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp1_1 != null : "fx:id=\"HexagonePaneSp1_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp1_0 != null : "fx:id=\"HexagonePaneSp1_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone1_m2 != null : "fx:id=\"Hexagone1_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone1_m3 != null : "fx:id=\"Hexagone1_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert endturnButton != null : "fx:id=\"endturnButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert scrollCommandPane != null : "fx:id=\"scrollCommandPane\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp1_m2 != null : "fx:id=\"HexagonePaneSp1_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone3_1 != null : "fx:id=\"Hexagone3_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp1_m1 != null : "fx:id=\"HexagonePaneSp1_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone3_2 != null : "fx:id=\"Hexagone3_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert menuDroite != null : "fx:id=\"menuDroite\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm1_2 != null : "fx:id=\"HexagonePaneSpm1_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane4_m1 != null : "fx:id=\"HexagonePane4_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm1_1 != null : "fx:id=\"HexagonePaneSpm1_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane4_m2 != null : "fx:id=\"HexagonePane4_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane4_m3 != null : "fx:id=\"HexagonePane4_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso1_vie != null : "fx:id=\"Perso1_vie\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone3_0 != null : "fx:id=\"Hexagone3_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert playerPositionField != null : "fx:id=\"playerPositionField\" was not injected: check your FXML file 'Board.fxml'.";
        assert potionInventButton != null : "fx:id=\"potionInventButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso2_barre != null : "fx:id=\"Perso2_barre\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem5_2 != null : "fx:id=\"HexagonePanem5_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone3_m1 != null : "fx:id=\"Hexagone3_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone3_m3 != null : "fx:id=\"Hexagone3_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone3_m2 != null : "fx:id=\"Hexagone3_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso3_vie != null : "fx:id=\"Perso3_vie\" was not injected: check your FXML file 'Board.fxml'.";
        assert centerHexagonePane != null : "fx:id=\"centerHexagonePane\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp2_2 != null : "fx:id=\"HexagonePaneSp2_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp2_1 != null : "fx:id=\"HexagonePaneSp2_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp2_0 != null : "fx:id=\"HexagonePaneSp2_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm2_m1 != null : "fx:id=\"HexagonePaneSpm2_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm2_m2 != null : "fx:id=\"HexagonePaneSpm2_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem1_m3 != null : "fx:id=\"HexagonePanem1_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem1_m1 != null : "fx:id=\"HexagonePanem1_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane0_1 != null : "fx:id=\"HexagonePane0_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem1_m2 != null : "fx:id=\"HexagonePanem1_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane0_2 != null : "fx:id=\"HexagonePane0_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane0_m3 != null : "fx:id=\"HexagonePane0_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane0_m1 != null : "fx:id=\"HexagonePane0_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagone4_0 != null : "fx:id=\"Hexagone4_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane0_m2 != null : "fx:id=\"HexagonePane0_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert swordInventButton != null : "fx:id=\"swordInventButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm4_1 != null : "fx:id=\"HexagonePaneSpm4_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm4_0 != null : "fx:id=\"HexagonePaneSpm4_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm4_2 != null : "fx:id=\"HexagonePaneSpm4_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert collectShieldButton != null : "fx:id=\"collectShieldButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem2_2 != null : "fx:id=\"HexagonePanem2_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem2_1 != null : "fx:id=\"HexagonePanem2_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso1_plus != null : "fx:id=\"Perso1_plus\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem2_0 != null : "fx:id=\"HexagonePanem2_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert commandPane != null : "fx:id=\"commandPane\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem2_m1 != null : "fx:id=\"Hexagonem2_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem2_m3 != null : "fx:id=\"Hexagonem2_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert Hexagonem2_m2 != null : "fx:id=\"Hexagonem2_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane5_m3 != null : "fx:id=\"HexagonePane5_m3\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane5_m2 != null : "fx:id=\"HexagonePane5_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp3_1 != null : "fx:id=\"HexagonePaneSp3_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp3_0 != null : "fx:id=\"HexagonePaneSp3_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert groupNameTextPane != null : "fx:id=\"groupNameTextPane\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp3_2 != null : "fx:id=\"HexagonePaneSp3_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp5_m2 != null : "fx:id=\"HexagonePaneSp5_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane1_0 != null : "fx:id=\"HexagonePane1_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane1_1 != null : "fx:id=\"HexagonePane1_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePane1_2 != null : "fx:id=\"HexagonePane1_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm3_0 != null : "fx:id=\"HexagonePaneSpm3_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm3_2 != null : "fx:id=\"HexagonePaneSpm3_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm3_1 != null : "fx:id=\"HexagonePaneSpm3_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert shieldInventButton != null : "fx:id=\"shieldInventButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm3_m1 != null : "fx:id=\"HexagonePaneSpm3_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert centerHexagone != null : "fx:id=\"centerHexagone\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSpm3_m2 != null : "fx:id=\"HexagonePaneSpm3_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem3_1 != null : "fx:id=\"HexagonePanem3_1\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem3_0 != null : "fx:id=\"HexagonePanem3_0\" was not injected: check your FXML file 'Board.fxml'.";
        assert Perso2_vie != null : "fx:id=\"Perso2_vie\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePanem3_2 != null : "fx:id=\"HexagonePanem3_2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp0_m2 != null : "fx:id=\"HexagonePaneSp0_m2\" was not injected: check your FXML file 'Board.fxml'.";
        assert perso3 != null : "fx:id=\"perso3\" was not injected: check your FXML file 'Board.fxml'.";
        assert collectWeaponButton != null : "fx:id=\"collectWeaponButton\" was not injected: check your FXML file 'Board.fxml'.";
        assert groupNameText != null : "fx:id=\"groupNameText\" was not injected: check your FXML file 'Board.fxml'.";
        assert perso2 != null : "fx:id=\"perso2\" was not injected: check your FXML file 'Board.fxml'.";
        assert HexagonePaneSp0_m1 != null : "fx:id=\"HexagonePaneSp0_m1\" was not injected: check your FXML file 'Board.fxml'.";
        assert perso1 != null : "fx:id=\"perso1\" was not injected: check your FXML file 'Board.fxml'.";
        assert ptActionField != null : "fx:id=\"ptActionField\" was not injected: check your FXML file 'Board.fxml'.";
        assert commandText != null : "fx:id=\"commandText\" was not injected: check your FXML file 'Board.fxml'.";
        
        if (Main_menu_model.isNewGame()){
        	ChooseConfig("Choisissez un nom pour votre joueur.", game_engine.Game.newGamePlayer);
        }
        UpdateAll(); //Permet la mise à jour du plateau
		changeOutputCommand("Bienvenue sur FALLINT !  \nLe groupe " + game_engine.Game.newGamePlayer.group.name + " va lutter pour sa survie");

        
        

        
        quitButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Quitter le jeu");
				
				Stage stage = (Stage) quitButton.getScene().getWindow();
				stage.close();
			}
		});
        
        endturnButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				Game game = game_engine.Game.newGamePlayer;
				if (game.group.EnoughActionPoint(1) && !(game.turn.getbool())){ //Laisse une deuxieme chance au joueur si il clique sur next_turn
					game.turn.sure_to_do_next_turn_if_already_action_points=true;
					changeOutputCommand("Il vous reste des points d'actions, vous êtes sûr de vouloir passer au tour suivant?\nSi oui cliquez, à nouveau sur 'Fin du tour'! ");
				}
				else {
					game.turn.nextTurn(game);
					changeOutputCommand("Bienvenue sur le tour " + game.turn.getnumber() + "!\n" + game.turn.event.name + "\n" + game.turn.event.description);
				    UpdateAll(); //Il doit bien être dans le else sinon il va remetre la deuxieme chance à false.
				}
			}
		});
        
        buildButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event){
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();
				
				if (game.group.EnoughActionPoint(1)){
					if (game.group.IsAlreadyABase(x, y, game)){
						changeOutputCommand("Vous ne pouvez pas construire deux bases au même endroit.");
					}
					else{
						if (game.group.IsPossibleToBuild(x, y, game)){
							if (game.group.EnoughWood(5)){
								game.group.build(x,y,game);
								changeOutputCommand("Félicitation vous venez de construire votre base.");
								game_engine.Game.newGamePlayer.board.mapMatrix[x][y].setInfrastructure(true);
							}
							else {
								changeOutputCommand("Vous n'avez pas assez de bois, allez en récupérer.");
							}
						}
						else {
							changeOutputCommand("La case n'est pas adaptée à recevoir une base.");
						}
					}
				}
				else{
					changeOutputCommand("Vous n'avez pas suffisament de points d'actions.");
				}
				UpdateAll();
				
			}
		});
        
        destroyButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();


				if (game.group.EnoughActionPoint(1)){
					if (game.group.IsAlreadyABase(x, y, game)){
						game.group.destroy(x,y,game);
						changeOutputCommand("Votre base a bien été détruite.");
						game_engine.Game.newGamePlayer.board.mapMatrix[x][y].setInfrastructure(false);
					}
					else{
						changeOutputCommand("Il n'y a aucune base à détruire ici, vous devez être dans votre base pour la démonter.");
					}
				}
				else{
					changeOutputCommand("Vous n'avez pas suffisament de points d'actions.");
				}
					UpdateAll();
			}
		});
        
        moveButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				game_engine.Game.newGameBoardModel.setMoveWanted(true);
				
				UpdateAll();
			}
		});
        
        collectObjectButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				game_engine.Game.newGameBoardModel.setCollectObjectWanted(true);
				UpdateAll();
			}
		});
        
        dumpObjectButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				game_engine.Game.newGameBoardModel.setDumpObjectWanted(true);
				UpdateAll();
			}
		});
        
        collectRessourceButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();
				
				try {
					game.group.collect(x, y, game);
				}
				catch (Exception e){}//Traité avant d'entrer dans cette boucle
				UpdateAll();
			}
		});
        
        dumpRessourceButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				game_engine.Game.newGameBoardModel.setDumpResourcesWanted(true);
				UpdateAll();
			}
		});
        
        collectWeaponButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();
				Magic_Sword sword = new Magic_Sword();
				
				if (game_engine.Game.newGameBoardModel.isCollectObjectWanted()) {
            		
					try {
						game_engine.Game.newGamePlayer.group.collect_object(x, y, game, sword, 1);
					}
					catch (WantToCollectTooManyException e) {
					
    				changeOutputCommand("Il n'y a pas d'épée ici.");
    				e.printStackTrace();
					}
					catch (NoStuffOnCaseException e) {
						
	    				changeOutputCommand("Il n'y a pas d'épée ici.");
	    				e.printStackTrace();
					}
					catch (InventoryFullException e) {
						
	    				changeOutputCommand("Votre inventaire est plein, il faut faire une place pour pouvoir ramasser cette potion.");
	    				e.printStackTrace();
					}
					game_engine.Game.newGameBoardModel.setCollectObjectWanted(false);
					UpdateAll();
        		
				}
				UpdateAll();
			}
		});
        
        collectPotionButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();
				Healing_potion potion = new Healing_potion();
				
				if (game_engine.Game.newGameBoardModel.isCollectObjectWanted()) {
            		
					try {
						game_engine.Game.newGamePlayer.group.collect_object(x, y, game, potion, 1);
					}
					catch (WantToCollectTooManyException e) {
					
    				changeOutputCommand("Il n'y a pas de potion ici.");
    				e.printStackTrace();
					}
					catch (NoStuffOnCaseException e) {
						
	    				changeOutputCommand("Il n'y a pas de potion ici.");
	    				e.printStackTrace();
					}
					catch (InventoryFullException e) {
						
	    				changeOutputCommand("Votre inventaire est plein, il faut faire une place pour pouvoir ramasser cette potion.");
	    				e.printStackTrace();
					}
					game_engine.Game.newGameBoardModel.setCollectObjectWanted(false);
					UpdateAll();
        		
				}
			}
		});
        
        collectShieldButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();
				Shield shield = new Shield();
				
				if (game_engine.Game.newGameBoardModel.isCollectObjectWanted()) {
            		
					try {
						game_engine.Game.newGamePlayer.group.collect_object(x, y, game, shield, 1);
					}
					catch (WantToCollectTooManyException e) {
					
    				changeOutputCommand("Il n'y a pas de bouclier ici.");
    				e.printStackTrace();
					}
					catch (NoStuffOnCaseException e) {
						
	    				changeOutputCommand("Il n'y a pas de bouclier ici.");
	    				e.printStackTrace();
					}
					catch (InventoryFullException e) {
						
	    				changeOutputCommand("Votre inventaire est plein, il faut faire une place pour pouvoir ramasser ce bouclier.");
	    				e.printStackTrace();
					}
					game_engine.Game.newGameBoardModel.setCollectObjectWanted(false);
					UpdateAll();
        		
				}
			}
		});
        
        shieldInventButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();
				Shield shield = new Shield();
				
				if (game_engine.Game.newGameBoardModel.isDumpObjectWanted()) {
					if (game.group.inventory.howManyObjectsInInventory(shield)>0){
						try{
							game_engine.Game.newGamePlayer.group.dump_object(x, y, game, shield, 1);
						}
						catch (Exception e){} //TODO
					}
					else {
						changeOutputCommand("Vous ne possedez pas de bouclier.");
					}
					game_engine.Game.newGameBoardModel.setDumpObjectWanted(false);
					UpdateAll();
        		
				}
			}
		});
        
        potionInventButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();
				Healing_potion potion = new Healing_potion();
				
				
				if (game_engine.Game.newGameBoardModel.isDumpObjectWanted()) {
					if (game.group.inventory.howManyObjectsInInventory(potion)>0){
						try{
							game_engine.Game.newGamePlayer.group.dump_object(x, y, game, potion, 1);
						}
						catch (Exception e){}//TODO
					}
					else {
						changeOutputCommand("Vous ne possedez pas de potion.");
					}
					game_engine.Game.newGameBoardModel.setDumpObjectWanted(false);
					game_engine.Game.newGameBoardModel.setUsePotionWanted(false);
					UpdateAll();
        		
				}
				else if (game_engine.Game.newGameBoardModel.isUsePotionWanted()){
					String resultPotion = game.group.UsePotion(1);
					game_engine.Game.newGameBoardModel.setUsePotionWanted(false);
					changeOutputCommand(commandText.getText() + "\n" + resultPotion);
				}
			UpdateAll();
			game_engine.Game.newGameBoardModel.setUsePotionWanted(true);
			}
			
		});
        
        swordInventButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();
				Magic_Sword sword = new Magic_Sword();
				
				if (game_engine.Game.newGameBoardModel.isDumpObjectWanted()) {
					if (game.group.inventory.howManyObjectsInInventory(sword)>0){
						try{
							game_engine.Game.newGamePlayer.group.dump_object(x, y, game, sword, 1);
						}
						catch (Exception e){} //TODO
					}
					else {
						changeOutputCommand("Vous ne possedez pas d'épée.");
					}
					game_engine.Game.newGameBoardModel.setDumpObjectWanted(false);
					UpdateAll();
        		
				}
			}
		});
        
        
        woodInventButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();

				
				if (game_engine.Game.newGameBoardModel.isDumpResourcesWanted()) {
					try{
						game_engine.Game.newGamePlayer.group.dump_ressources(x, y, game, "wood", 1);
					}

					catch (WantToDumpTooManyException e){
						changeOutputCommand("Vous ne possedez pas de bois.");
					}
					game_engine.Game.newGameBoardModel.setDumpResourcesWanted(false);
					UpdateAll();
        		
				}
			}
		});
        
        waterInventButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();

				
				if (game_engine.Game.newGameBoardModel.isDumpResourcesWanted()) {
					try{
						game_engine.Game.newGamePlayer.group.dump_ressources(x, y, game, "water", 1);
					}
					catch (WantToDumpTooManyException e) {
						changeOutputCommand("Vous ne possedez pas d'eau.");
					}
					game_engine.Game.newGameBoardModel.setDumpResourcesWanted(false);
					UpdateAll();
        		
				}
			}
		});
        
        foodInventButton.setOnAction(new EventHandler<ActionEvent>()
        {
			@Override
			public void handle(ActionEvent event) {
				Game game = game_engine.Game.newGamePlayer;
				int x= game.group.getPosition_x();
				int y= game.group.getPosition_y();

				
				if (game_engine.Game.newGameBoardModel.isDumpResourcesWanted()) {
					try{
						game_engine.Game.newGamePlayer.group.dump_ressources(x, y, game, "food", 1);
					}
					catch (WantToDumpTooManyException e) {
						changeOutputCommand("Vous ne possedez pas de nourriture.");
					}
					game_engine.Game.newGameBoardModel.setDumpResourcesWanted(false);
					UpdateAll();
        		
				}
			}
		});
        /** Gestion des cliques de souris sur une case
         *      - disjonction de cas pour certains hexagone adjacent au central
         *      - case de base avec display des infos de la case
         */
        
        // Gestion des hexagones avec cas particuliers
        
        HexagonePaneSp0_1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x();
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 1;
            	
            	if (game_engine.Game.newGamePlayer.group.EnoughActionPoint(1)){
            		if (game_engine.Game.newGameBoardModel.isMoveWanted()) {
            		
            			try {
            				changeOutputCommand( game_engine.Game.newGamePlayer.group.move_group(x, y, game_engine.Game.newGamePlayer) );
            			} catch (CaseOutOfRangeException e) {
						
            				changeOutputCommand("Vous ne pouvez pas vous déplacer ici");
            				e.printStackTrace();
            			}
            			game_engine.Game.newGameBoardModel.setMoveWanted(false);
            		
            			UpdateAll();
            		
            		}
            		else {
            		
            			Ennemies ennemyOnCase = null;
            		
            			CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
            			boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
            			if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
            			boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
            		
            			String infoOfCase = stringFromCasetype(terrain) + " / ";
            		
            			if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
            			else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
            		
            			if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
            			else { infoOfCase = infoOfCase + "Pas de base construite"; }
            		
            			caseInfo.setText(infoOfCase);
            		}	
            	}
            	else {
            		changeOutputCommand("Vous n'avez pas suffisament de points d'actions.");
            	}
            }
        });
        
        HexagonePaneSp1_0.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
				if (game_engine.Game.newGamePlayer.group.EnoughActionPoint(1)){
					if (game_engine.Game.newGameBoardModel.isMoveWanted()) {
            		
						try {
							changeOutputCommand( game_engine.Game.newGamePlayer.group.move_group(x, y, game_engine.Game.newGamePlayer) );
						} catch (CaseOutOfRangeException e) {
						
							commandText.setText("Vous ne pouvez pas vous déplacer ici");
							e.printStackTrace();
						}
						game_engine.Game.newGameBoardModel.setMoveWanted(false);
            		
						UpdateAll();
            		
					}
					else {
            		
						Ennemies ennemyOnCase = null;
            		
						CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
						boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
						if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
						boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
            		
						String infoOfCase = stringFromCasetype(terrain) + " / ";
            		
						if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
						else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
            		
						if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
						else { infoOfCase = infoOfCase + "Pas de base construite"; }
            		
						caseInfo.setText(infoOfCase);
            		
					}
					
				}
				else {
					changeOutputCommand("Vous n'avez pas suffisament de points d'actions.");
	            }
            }
      });
        
        HexagonePaneSp1_m1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 1;
				if (game_engine.Game.newGamePlayer.group.EnoughActionPoint(1)){
					if (game_engine.Game.newGameBoardModel.isMoveWanted()) {
            		
						try {
							changeOutputCommand( game_engine.Game.newGamePlayer.group.move_group(x, y, game_engine.Game.newGamePlayer) );
						} catch (CaseOutOfRangeException e) {
						
							commandText.setText("Vous ne pouvez pas vous déplacer ici");
							e.printStackTrace();
						}
						game_engine.Game.newGameBoardModel.setMoveWanted(false);
            		
						UpdateAll();
            		
					}
					else {
            		
						Ennemies ennemyOnCase = null;
            		
						CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
						boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
						if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
						boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
            		
						String infoOfCase = stringFromCasetype(terrain) + " / ";
            		
						if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
						else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
            		
						if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
						else { infoOfCase = infoOfCase + "Pas de base construite"; }
            		
						caseInfo.setText(infoOfCase);
					}
            	}
				else {
					changeOutputCommand("Vous n'avez pas suffisament de points d'actions.");
            	}
            }
        });
        
        HexagonePaneSp0_m1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x();
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 1;
            	
				if (game_engine.Game.newGamePlayer.group.EnoughActionPoint(1)){
					if (game_engine.Game.newGameBoardModel.isMoveWanted()) {
            		
						try {
							changeOutputCommand( game_engine.Game.newGamePlayer.group.move_group(x, y, game_engine.Game.newGamePlayer) );
						} catch (CaseOutOfRangeException e) {
						
							commandText.setText("Vous ne pouvez pas vous déplacer ici");
							e.printStackTrace();
						}
						game_engine.Game.newGameBoardModel.setMoveWanted(false);
            		
						UpdateAll();
            		
					}
					else {
            		
						Ennemies ennemyOnCase = null;
            		
						CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
						boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
						if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
						boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
            		
						String infoOfCase = stringFromCasetype(terrain) + " / ";
            		
						if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
						else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
            		
						if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
						else { infoOfCase = infoOfCase + "Pas de base construite"; }
            		
						caseInfo.setText(infoOfCase);
					}
            	}
				else {
					changeOutputCommand("Vous n'avez pas suffisament de points d'actions.");
            	}
            }
        });
        
        HexagonePaneSpm1_0.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
				if (game_engine.Game.newGamePlayer.group.EnoughActionPoint(1)){
					if (game_engine.Game.newGameBoardModel.isMoveWanted()) {
            		
						try {
							changeOutputCommand( game_engine.Game.newGamePlayer.group.move_group(x, y, game_engine.Game.newGamePlayer) );
						} catch (CaseOutOfRangeException e) {
						
							commandText.setText("Vous ne pouvez pas vous déplacer ici");
							e.printStackTrace();
						}
						game_engine.Game.newGameBoardModel.setMoveWanted(false);
            		
						UpdateAll();
            		
					}
					else {
            		
						Ennemies ennemyOnCase = null;
            		
						CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
						boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
						if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
						boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
            		
						String infoOfCase = stringFromCasetype(terrain) + " / ";
            		
						if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
						else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
            		
						if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
						else { infoOfCase = infoOfCase + "Pas de base construite"; }
            		
						caseInfo.setText(infoOfCase);
					}
            	}
				else {
					changeOutputCommand("Vous n'avez pas suffisament de points d'actions.");
            	}
            }
        });
        
        HexagonePaneSpm1_1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 1;
            	
				if (game_engine.Game.newGamePlayer.group.EnoughActionPoint(1)){
					if (game_engine.Game.newGameBoardModel.isMoveWanted()) {
            		
						try {
							changeOutputCommand( game_engine.Game.newGamePlayer.group.move_group(x, y, game_engine.Game.newGamePlayer) );
						} catch (CaseOutOfRangeException e) {
						
							commandText.setText("Vous ne pouvez pas vous déplacer ici");
							e.printStackTrace();
						}
						game_engine.Game.newGameBoardModel.setMoveWanted(false);
            		
						UpdateAll();
            		
					}
					else {
            		
						Ennemies ennemyOnCase = null;
            		
						CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
						boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
            			if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
            			boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
            		
            			String infoOfCase = stringFromCasetype(terrain) + " / ";
            		
            			if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
            			else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
            		
            			if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
            			else { infoOfCase = infoOfCase + "Pas de base construite"; }
            		
            			caseInfo.setText(infoOfCase);
					}
            	}
				else {
					changeOutputCommand("Vous n'avez pas suffisament de points d'actions.");
            	}
            }
        });
        
        
        // Gestion des autres hexagones
        
        centerHexagonePaneSp.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x();
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm5_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 5;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm4_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 4;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm4_1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 4;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm4_0.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 4;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm3_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm3_1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm3_0.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm3_m1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm3_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm2_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm2_1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm2_0.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm2_m1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm2_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        Hexagonem2_m3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 3;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm1_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm1_m1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSpm1_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        Hexagonem1_m3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() - 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 3;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp0_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x();
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp0_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x();
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        Hexagone0_m3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x();
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 3;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp1_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp1_1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp1_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        Hexagone1_m3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 1;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 3;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp2_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp2_1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp2_0.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp2_m1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp2_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        Hexagone2_m3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 2;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 3;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp3_2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp3_1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() + 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp3_0.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp3_m1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp3_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        Hexagone3_m3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 3;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 3;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp4_0.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 4;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y();
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp4_m1.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 4;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 1;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp4_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 4;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        Hexagone4_m3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 4;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 3;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        HexagonePaneSp5_m2.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 5;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 2;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        Hexagone5_m3.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
            	
        		int x= game_engine.Game.newGamePlayer.group.getPosition_x() + 5;
				int y= game_engine.Game.newGamePlayer.group.getPosition_y() - 3;
            	
        		Ennemies ennemyOnCase = null;
        		
        		CaseType terrain = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getTerrain();
        		boolean isEnnemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isEnnemyThere();
        		if (isEnnemyOnCase) { ennemyOnCase = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].getEnnemy(); }
        		boolean isBaseHere = game_engine.Game.newGamePlayer.board.mapMatrix[x][y].isInfrastructure();
        		
        		String infoOfCase = stringFromCasetype(terrain) + " / ";
        		
        		if (isEnnemyOnCase) { infoOfCase = infoOfCase + ennemyOnCase.getName() + " / ";  }
        		else { infoOfCase = infoOfCase + "Aucun ennemi / "; }
        		
        		if (isBaseHere) { infoOfCase = infoOfCase + "Base construite";  }
        		else { infoOfCase = infoOfCase + "Pas de base construite"; }
        		
        		caseInfo.setText(infoOfCase);            	
            }
        });
        
        
        // TODO
    }
    
    //Definition des fonctions changeant le display
    
    
    /**
     * This function must update the board and also, all the interesting point of the player.
     */
    public void UpdateAll(){
    	UpdateGroupName();
    	UpdateGroupPosition();
    	UpdateTurnCounter();
    	UpdateActionPoint();
    	UpdatePlayersName();
    	UpdatePlayerStatus();
        UpdatePlayersHPs();
        UpdateMaxHPs();
        UpdatePlayersStrength();
        UpdateWeaponDmgPlayer();
        UpdateResourcesNumber();
        UpdateObjectsNumber();
        UpdateInventoryCounter();
        UpdateInventoryMax();
        UpdateObjectsNumberOnCase();
        UpdateSpritesMap();
        UpdatePlayerNotExistant();
        changeBackgroundCases(game_engine.Game.newGamePlayer);
        game_engine.Game.newGamePlayer.save(game_engine.Game.newGamePlayer);
        if (game_engine.Game.newGamePlayer.group.group.size()==0 || game_engine.Game.newGamePlayer.group.group.get(0).get_health()==0){
        	if (game_engine.Game.newGamePlayer.group.group.size()!=0){
        		for (int i=0;i<game_engine.Game.newGamePlayer.group.MembersNbGroup();i++){
        			try{
        			game_engine.Game.newGamePlayer.group.Remove_Character_To_Group(game_engine.Game.newGamePlayer.group.group.get(i));
        			}
        			catch(Exception e){}//That can't happen
        			UpdatePlayerNotExistant();
        		}
        	}
        	GameOver();
        }
        
      //Ceci permet de laisser aux joueurs la possibilité de changer de tour en ayant des action_point (+d'infos me demander)
        game_engine.Game.newGamePlayer.turn.sure_to_do_next_turn_if_already_action_points=false; 
        
    }
        
    /**
     * Update the display of PlayersHPs
     */
    public void UpdatePlayersHPs(){
    	int nbPlayer=game_engine.Game.newGamePlayer.group.MembersNbGroup();
    	for (int i=1;i<=nbPlayer;i++){
    		changeHpPlayer(game_engine.Game.newGamePlayer.group.group.get(i-1).get_health(), i);
    	}
    }
    
    
    /**
     * Update the display of PlayersMaxHPs
     */
    public void UpdateMaxHPs(){
    	int nbPlayer=game_engine.Game.newGamePlayer.group.MembersNbGroup();
    	for (int i=1;i<=nbPlayer;i++){
    		changeMaxHpPlayer(game_engine.Game.newGamePlayer.group.group.get(i-1).max_health, i);
    	}
    }
    
    /**
     * Update the display of PlayersStrength
     */
    public void UpdatePlayersStrength(){
    	int nbPlayer=game_engine.Game.newGamePlayer.group.MembersNbGroup();
    	for (int i=1;i<=nbPlayer;i++){
    		changeStrengthPlayer(game_engine.Game.newGamePlayer.group.group.get(i-1).get_strength(), i);
    	}
    }
    
    /**
     * Update the display of StrengthFromObject
     */
    public void UpdateWeaponDmgPlayer(){
    	int nbPlayer=game_engine.Game.newGamePlayer.group.MembersNbGroup();
    	for (int i=1;i<=nbPlayer;i++){
    		changeWeaponDmgPlayer(game_engine.Game.newGamePlayer.group.inventory.Strength_from_Objects(), i);
    	}
    }
    
      
    /**
     * Update the display of PlayersName
     */
    public void UpdatePlayersName(){
    	int nbPlayer=game_engine.Game.newGamePlayer.group.MembersNbGroup();
    	for (int i=1;i<=nbPlayer;i++){
    		changeCharacterName(game_engine.Game.newGamePlayer.group.group.get(i-1).get_name(), i);
    	}
    }
    
    /**
     * Update the display of PlayersStatus
     */
    public void UpdatePlayerStatus(){
    	int nbPlayer=game_engine.Game.newGamePlayer.group.MembersNbGroup();
    	Group group = game_engine.Game.newGamePlayer.group;
    	for (int i=1;i<=nbPlayer;i++){
    		changePlayerStatus(group.group.get(i-1).get_STATUSstr(), i);
    	}
    	for (int j = 0; j < Game.newGamePlayer.group.group.size(); j++) {
    		int strengthTemp;
    		
    		switch (Game.newGamePlayer.group.group.get(j).get_STATUS()) {
	    		case SAIN :
	    			if (game_engine.Game.newGameBoardModel.isStrengthDiminished(j)) {    				
	    				strengthTemp = Game.newGamePlayer.group.group.get(j).get_strength();
	    				Game.newGamePlayer.group.group.get(j).variation_strength(+ strengthTemp);
						Game.newGameBoardModel.setStrengthDiminished(false, j);
						changeOutputCommand(commandText.getText() + "\nVos personnages vont mieux \n");
	    			}
	    			break;
	    		case EMPOISONNE :			
	
					Game.newGamePlayer.group.group.get(j).variation_health(-1);
	
					changeOutputCommand(commandText.getText() + "\nVos personnages souffrent du poison \n");
	    			break;
	    		case MALADE :
	    			if (!Game.newGameBoardModel.isStrengthDiminished(j)) {    				
	    				strengthTemp = Game.newGamePlayer.group.group.get(j).get_strength() / 2;
	    				Game.newGamePlayer.group.group.get(j).variation_strength(- strengthTemp);
						Game.newGameBoardModel.setStrengthDiminished(true, j);
						changeOutputCommand(commandText.getText() + "\nVos personnages souffrent de la maladie \n");
	    			}
	    			break;
	    		default :
					changeOutputCommand(commandText.getText() + "\nBug concernant la gestion des maladies \n");
	    			break;
	    	}
    	}
    	Game.newGamePlayer.group.strength = 0;
    	
    	for (int k = 0; k < Game.newGamePlayer.group.group.size(); k++) {
    		Game.newGamePlayer.group.strength += Game.newGamePlayer.group.group.get(k).get_strength();
    	}
    }
    
    /**
     * Update the display of GroupName
     */
    public void UpdateGroupName(){
    	String group_name = game_engine.Game.newGamePlayer.group.getName();
    	changeNameGroup(group_name);
    }
    
    
    public void UpdateActionPoint(){
    	int action_point_already_avalaible= game_engine.Game.newGamePlayer.group.getAction_point();
    	changeActionPoint(action_point_already_avalaible);
    }
    
    public void UpdateTurnCounter(){
    	int turn_number = game_engine.Game.newGamePlayer.turn.getnumber();
    	changeTurnCount(turn_number);
    }
    
    public void UpdateGroupPosition(){
    	int x= game_engine.Game.newGamePlayer.group.getPosition_x();
		int y= game_engine.Game.newGamePlayer.group.getPosition_y();
		changeGroupPosition(x, y);
    	
    }
    
    public void UpdateResourcesNumber(){
    	Game game = game_engine.Game.newGamePlayer;
    	changeRessourcesNumber(woodInventButton, game.group.getWood());
    	changeRessourcesNumber(waterInventButton, game.group.getWater());
    	changeRessourcesNumber(foodInventButton, game.group.getFood());
    }
    
    public void UpdateObjectsNumber(){
    	Game game = game_engine.Game.newGamePlayer;
    	Magic_Sword sword = new Magic_Sword();
    	Healing_potion potion = new Healing_potion();
    	Shield shield = new Shield();
    	
    	changeObjectsNumber(potionInventButton, game.group.inventory.howManyObjectsInInventory(potion));
    	changeObjectsNumber(shieldInventButton, game.group.inventory.howManyObjectsInInventory(shield));
    	changeObjectsNumber(swordInventButton, game.group.inventory.howManyObjectsInInventory(sword));
    }
    
    public void UpdateObjectsNumberOnCase(){
    	Game game = game_engine.Game.newGamePlayer;
    	Magic_Sword sword = new Magic_Sword();
    	Healing_potion potion = new Healing_potion();
    	Shield shield = new Shield();
    	int x= game.group.getPosition_x();
		int y= game.group.getPosition_y();
				
    	changeObjectsNumberOnCase(collectPotionButton, game.board.mapMatrix[x][y].howManyObjectOnCase(potion));
    	changeObjectsNumberOnCase(collectShieldButton, game.board.mapMatrix[x][y].howManyObjectOnCase(shield));
    	changeObjectsNumberOnCase(collectWeaponButton, game.board.mapMatrix[x][y].howManyObjectOnCase(sword));
    }
    
    public void UpdateInventoryMax(){
    	Game game = game_engine.Game.newGamePlayer;
    	changeInventoryMax(game.group.inventory.MAX_WEIGTH);
    }
    
    public void UpdateInventoryCounter(){
    	Game game = game_engine.Game.newGamePlayer;
    	changeInventoryCounter(game.group.inventory.weigth);
    }
    
    public void UpdatePlayerNotExistant(){
    	int nbPlayer=game_engine.Game.newGamePlayer.group.MembersNbGroup();
    	for (int i=1;i<=nbPlayer;i++){
    		ShowPlayerInfo(i);
    	}
    	for (int i=nbPlayer+1;i<=3;i++){
    		HidePlayerInfo(i);
    	}
    }
    
    public void UpdateSpritesMap () {
    	Game game = game_engine.Game.newGamePlayer;
    	changeBackgroundSpritesCases(game);
    }
    
    
    /**
     * 
     * 
     * @param newHpValue
     * @param IdPlayer
     */
     public void changeHpPlayer(int newHpValueInt, int IdPlayer) {
    	
    	String newHpValue = Integer.toString(newHpValueInt);
    	
    	switch (IdPlayer) {
		case 1:
			hpP1.setText(newHpValue);
			break;
		case 2:
			hpP2.setText(newHpValue);
			break;
		case 3:
			hpP3.setText(newHpValue);
			break;
		default:
			System.out.println("L'identifiant du joueur n'est pas reconnu");
			break;
		}
    }
    
    public void changeMaxHpPlayer(int newMaxHpValueInt, int IdPlayer) {
    	
    	String newMaxHpValue = Integer.toString(newMaxHpValueInt);
    	
    	switch (IdPlayer) {
		case 1:
			hpMaxP1.setText(newMaxHpValue);
			break;
		case 2:
			hpMaxP2.setText(newMaxHpValue);
			break;
		case 3:
			hpMaxP3.setText(newMaxHpValue);
			break;
		default:
			System.out.println("L'identifiant du joueur n'est pas reconnu");
			break;
		}
    }
    
    public void changeStrengthPlayer (int newStrengthInt, int IdPlayer) {
    	
    	String newStrength = Integer.toString(newStrengthInt);
    	
    	switch (IdPlayer) {
		case 1:
			ForceP1.setText(newStrength);
			break;
		case 2:
			ForceP2.setText(newStrength);
			break;
		case 3:
			ForceP3.setText(newStrength);
			break;
		default:
			System.out.println("L'identifiant du joueur n'est pas reconnu");
			break;
		}
    }
    
    public void changeWeaponDmgPlayer (int newWeaponDmgInt, int IdPlayer) {
    	
    	String newWeaponDmg = Integer.toString(newWeaponDmgInt);
    	
    	switch (IdPlayer) {
		case 1:
			dmgArmeP1.setText(newWeaponDmg);
			break;
		case 2:
			dmgArmeP2.setText(newWeaponDmg);
			break;
		case 3:
			dmgArmeP3.setText(newWeaponDmg);
			break;
		default:
			System.out.println("L'identifiant du joueur n'est pas reconnu");
			break;
		}
    }
    
    public void changeCharacterName (String nameCharacter, int IdPlayer) {
    	
    	switch (IdPlayer) {
		case 1:
			perso1.setText(nameCharacter);
			break;
		case 2:
			perso2.setText(nameCharacter);
			break;
		case 3:
			perso3.setText(nameCharacter);
			break;
		default:
			System.out.println("L'identifiant du joueur n'est pas reconnu");
			break;
		}
    }
    
public void changePlayerStatus (String status, int IdPlayer) {
    	
    	switch (IdPlayer) {
		case 1:
			maladieP1.setText(status);
			break;
		case 2:
			maladieP2.setText(status);
			break;
		case 3:
			maladieP3.setText(status);
			break;
		default:
			System.out.println("L'identifiant du joueur n'est pas reconnu");
			break;
		}
    }
    
    public void changeTurnCount (int turnInt) {
    	String turn = Integer.toString(turnInt);
    	String period = game_engine.Game.newGamePlayer.turn.getperiod();
		turnCountField1.setText("Tour " + turn );
		turnCountField2.setText("Tour " + turn + " - " + period);
    }
    
    public void changeNameGroup (String nameGroup) {
    	
		groupNameText.setText(nameGroup);
    }
    
    public void changeActionPoint (int nbPtActionInt) {
    	String nbPtAction= Integer.toString(nbPtActionInt);
		ptActionField.setText(nbPtAction + " PA");
    }
    
    public void changeOutputCommand (String invitCommand) {
    	
		commandText.setText(invitCommand);

    }
    
    public void changeCaseInfo (String infoCase) {
    	
    	caseInfo.setText(infoCase);

    }
    
    public void changeRessourcesNumber (Button resources_button, int number_of_resources){
    	String number_of_resourcesStr= Integer.toString(number_of_resources);
    	
    	resources_button.setText(number_of_resourcesStr);
    }
    
    public void changeObjectsNumber (Button object_button, int number_of_Objects){
    	String number_of_ObjectsStr= Integer.toString(number_of_Objects);
    	
    	object_button.setText(number_of_ObjectsStr);
    }
    
    public void changeObjectsNumberOnCase (Button object_button, int number_of_Objects){
    	String number_of_ObjectsStr= Integer.toString(number_of_Objects);
    	
    	object_button.setText(number_of_ObjectsStr);
    }
    
    public void changeInventoryMax (int inventory_max){
    	String inventory_maxStr= Integer.toString(inventory_max);
    	
    	maxInventoryLoad.setText(inventory_maxStr);
    }  
    
    public void changeInventoryCounter (int number_of_Objects){
    	String number_of_ObjectsStr= Integer.toString(number_of_Objects);
    	
    	currentInventoryLoad.setText(number_of_ObjectsStr);
    }
    
    public void changeGroupPosition (int PositionxInt,int PositionyInt){
    	String Positionx= Integer.toString(PositionxInt);
    	String Positiony= Integer.toString(PositionyInt);
    	playerPositionField.setText("Position: " +" x = " + Positionx + " , y = " + Positiony);
    }
    
    public void HidePlayerInfo(int player_number){
    	switch (player_number){
    		case 1:	{
    			Perso1_barre.setText("");
    			Perso1_plus.setText("");
    			Perso1_vie.setText("");
    			Perso1_force.setText("");
    			perso1.setText("");
    			ForceP1.setText("");
    			dmgArmeP1.setText("");
    			hpP1.setText("");
    			hpMaxP1.setText("");
    			maladieP1.setText("");
    		}
    		case 2:{
    			Perso2_barre.setText("");
    			Perso2_plus.setText("");
    			Perso2_vie.setText("");
    			Perso2_force.setText("");
    			perso2.setText("");
    			ForceP2.setText("");
    			dmgArmeP2.setText("");
    			hpP2.setText("");
    			hpMaxP2.setText("");
    			maladieP2.setText("");
    		}
    		case 3:{
    			Perso3_barre.setText("");
    			Perso3_plus.setText("");
    			Perso3_vie.setText("");
    			Perso3_force.setText("");
    			perso3.setText("");
    			ForceP3.setText("");
    			dmgArmeP3.setText("");
    			hpP3.setText("");
    			hpMaxP3.setText("");
    			maladieP3.setText("");
    		}
    	}
    }
    
    public void ShowPlayerInfo (int player_number){
    	switch (player_number){
			case 1:	{
				Perso1_barre.setText("/");
				Perso1_plus.setText("+");
				Perso1_vie.setText("Vie:");
				Perso1_force.setText("Force:");
			}
			case 2:{
				Perso2_barre.setText("/");
				Perso2_plus.setText("+");
				Perso2_vie.setText("Vie:");
				Perso2_force.setText("Force:");
			}
			case 3:{
				Perso3_barre.setText("/");
				Perso3_plus.setText("+");
				Perso3_vie.setText("Vie:");
				Perso3_force.setText("Force:");
			}
    	}
    }
    
    public String stringFromCasetype (CaseType typeTerrain) {
    	
    	String stringTerrain;
    	
    	switch (typeTerrain) {
		case water:
			stringTerrain = "Marais";
			break;
		case forest:
			stringTerrain = "Forêt";
			break;
		case rock:
			stringTerrain = "Montagne";
			break;
		case grassland:
			stringTerrain = "Plaine";
			break;
		case city:
			stringTerrain = "Ville";
			break;
		case base:
			stringTerrain = "Terrain aménagé";
			break;
		case nonexistent:
			stringTerrain = "Vide";
			break;
		case nothing:
			stringTerrain = "Désert";
			break;
		default:
			stringTerrain = "I am error";
			System.out.println("Le type de terrain n'est pas reconnu");
			break;
		}
    	
    	return stringTerrain;
    }
    
    public String htmlCommandForTerrainType (CaseType typeTerrain) {
    	
    	String urlHTML = "-fx-background-image: url(\"/resources/images/";
    	switch (typeTerrain) {
		case water:
			urlHTML = urlHTML + "waterCase.png\")";
			break;
		case forest:
			urlHTML = urlHTML + "treeCase.png\")";
			break;
		case rock:
			urlHTML = urlHTML + "mountainCase.png\")";
			break;
		case grassland:
			urlHTML = urlHTML + "grassCase.png\")";
			break;
		case city:
			urlHTML = urlHTML + "caseCity.png\")";
			break;
		case base:
			urlHTML = urlHTML + "baseCase.png\")";
			break;
		case nonexistent:
			urlHTML = urlHTML + "nonExistentCase.png\")";
			break;
		case nothing:
			urlHTML = urlHTML + "nothingCase.png\")";
			break;
		default:
			System.out.println("Le type de terrain n'est pas reconnu");
			break;
		}
    	return urlHTML; 
    	
    }
    
    // Le changement en lui meme
    public void changeBackgroundCases (Game game) {
    	
		//int centreX = positionGroupePrincipal[0];
		//int centreY = positionGroupePrincipal[1];
		int centreX=game.group.getPosition_x();
		int centreY=game.group.getPosition_y();
		String htmlCommand;
		
		
		htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX][centreY].getTerrain() );
		centerHexagonePane.setStyle(htmlCommand);
		
		
		if (centreX - 5 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 5][centreY + 2].getTerrain() );
			HexagonePanem5_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem5_2.setStyle(htmlCommand);
		}
		
		
		if (centreX - 4 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 4][centreY + 2].getTerrain() );
			HexagonePanem4_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem4_2.setStyle(htmlCommand);
		}
		
		
		if (centreX - 4 >= game.board.getMinusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 4][centreY + 1].getTerrain() );
			HexagonePanem4_1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem4_1.setStyle(htmlCommand);
		}
		
		
		if (centreX - 4 >= game.board.getMinusXcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 4][centreY].getTerrain() );
			HexagonePanem4_0.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem4_0.setStyle(htmlCommand);
		}
		
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 3][centreY + 2].getTerrain() );
			HexagonePanem3_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem3_2.setStyle(htmlCommand);
		}
		
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 3][centreY + 1].getTerrain() );
			HexagonePanem3_1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem3_1.setStyle(htmlCommand);
		}
		
		
		if (centreX - 3 >= game.board.getMinusXcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 3][centreY].getTerrain() );
			HexagonePanem3_0.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem3_0.setStyle(htmlCommand);
		}
		
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 3][centreY - 1].getTerrain() );
			HexagonePanem3_m1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem3_m1.setStyle(htmlCommand);
		}
		
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 3][centreY - 2].getTerrain() );
			HexagonePanem3_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem3_m2.setStyle(htmlCommand);
		}
		
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 2][centreY + 2].getTerrain() );
			HexagonePanem2_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem2_2.setStyle(htmlCommand);
		}
		
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 2][centreY + 1].getTerrain() );
			HexagonePanem2_1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem2_1.setStyle(htmlCommand);
		}
		
		
		if (centreX - 2 >= game.board.getMinusXcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 2][centreY].getTerrain() );
			HexagonePanem2_0.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem2_0.setStyle(htmlCommand);
		}
		
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 2][centreY - 1].getTerrain() );
			HexagonePanem2_m1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem2_m1.setStyle(htmlCommand);
		}
		
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 2][centreY - 2].getTerrain() );
			HexagonePanem2_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem2_m2.setStyle(htmlCommand);
		}
		
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY - 3 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 2][centreY - 3].getTerrain() );
			HexagonePanem2_m3.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem2_m3.setStyle(htmlCommand);
		}
		
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 1][centreY + 2].getTerrain() );
			HexagonePanem1_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem1_2.setStyle(htmlCommand);
		}
		
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 1][centreY + 1].getTerrain() );
			HexagonePanem1_1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem1_1.setStyle(htmlCommand);
		}
		
		
		if (centreX - 1 >= game.board.getMinusXcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 1][centreY].getTerrain() );
			HexagonePanem1_0.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem1_0.setStyle(htmlCommand);
		}
		
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 1][centreY - 1].getTerrain() );
			HexagonePanem1_m1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem1_m1.setStyle(htmlCommand);
		}
		
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 1][centreY - 2].getTerrain() );
			HexagonePanem1_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem1_m2.setStyle(htmlCommand);
		}
		
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY - 3 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX - 1][centreY - 3].getTerrain() );
			HexagonePanem1_m3.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePanem1_m3.setStyle(htmlCommand);
		}
		
		
		if (centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX][centreY + 2].getTerrain() );
			HexagonePane0_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane0_2.setStyle(htmlCommand);
		}
		
		
		if (centreY + 1 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX][centreY + 1].getTerrain() );
			HexagonePane0_1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane0_1.setStyle(htmlCommand);
		}
		
		
		if (centreY - 1 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX][centreY - 1].getTerrain() );
			HexagonePane0_m1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane0_m1.setStyle(htmlCommand);
		}
		
		
		if (centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX][centreY - 2].getTerrain() );
			HexagonePane0_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane0_m2.setStyle(htmlCommand);
		}
		
		
		if (centreY - 3 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX][centreY - 3].getTerrain() );
			HexagonePane0_m3.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane0_m3.setStyle(htmlCommand);
		}
		
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 1][centreY + 2].getTerrain() );
			HexagonePane1_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane1_2.setStyle(htmlCommand);
		}
		
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 1][centreY + 1].getTerrain() );
			HexagonePane1_1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane1_1.setStyle(htmlCommand);
		}
		
		
		if (centreX + 1 < game.board.getPlusXcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 1][centreY].getTerrain() );
			HexagonePane1_0.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane1_0.setStyle(htmlCommand);
		}
		
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 1][centreY - 1].getTerrain() );
			HexagonePane1_m1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane1_m1.setStyle(htmlCommand);
		}
		
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 1][centreY - 2].getTerrain() );
			HexagonePane1_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane1_m2.setStyle(htmlCommand);
		}
		
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY - 3 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 1][centreY - 3].getTerrain() );
			HexagonePane1_m3.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane1_m3.setStyle(htmlCommand);
		}
		
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 2][centreY + 2].getTerrain() );
			HexagonePane2_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane2_2.setStyle(htmlCommand);
		}
		
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 2][centreY + 1].getTerrain() );
			HexagonePane2_1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane2_1.setStyle(htmlCommand);
		}
		
		
		if (centreX + 2 < game.board.getPlusXcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 2][centreY].getTerrain() );
			HexagonePane2_0.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane2_0.setStyle(htmlCommand);
		}
		
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 2][centreY - 1].getTerrain() );
			HexagonePane2_m1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane2_m1.setStyle(htmlCommand);
		}
		
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 2][centreY - 2].getTerrain() );
			HexagonePane2_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane2_m2.setStyle(htmlCommand);
		}
		
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY - 3 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 2][centreY - 3].getTerrain() );
			HexagonePane2_m3.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane2_m3.setStyle(htmlCommand);
		}
		
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 3][centreY + 2].getTerrain() );
			HexagonePane3_2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane3_2.setStyle(htmlCommand);
		}
		
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 3][centreY + 1].getTerrain() );
			HexagonePane3_1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane3_1.setStyle(htmlCommand);
		}
		
		
		if (centreX + 3 < game.board.getPlusXcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 3][centreY].getTerrain() );
			HexagonePane3_0.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane3_0.setStyle(htmlCommand);
		}
		
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 3][centreY - 1].getTerrain() );
			HexagonePane3_m1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane3_m1.setStyle(htmlCommand);
		}
		
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 3][centreY - 2].getTerrain() );
			HexagonePane3_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane3_m2.setStyle(htmlCommand);
		}
		
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY - 3 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 3][centreY - 3].getTerrain() );
			HexagonePane3_m3.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane3_m3.setStyle(htmlCommand);
		}
		
		
		if (centreX + 4 < game.board.getPlusXcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 4][centreY].getTerrain() );
			HexagonePane4_0.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane4_0.setStyle(htmlCommand);
		}
		
		
		if (centreX + 4 < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 4][centreY - 1].getTerrain() );
			HexagonePane4_m1.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane4_m1.setStyle(htmlCommand);
		}
		
		
		if (centreX + 4 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 4][centreY - 2].getTerrain() );
			HexagonePane4_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane4_m2.setStyle(htmlCommand);
		}
		
		
		if (centreX + 4 < game.board.getPlusXcoordinate() && centreY - 3 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 4][centreY - 3].getTerrain() );
			HexagonePane4_m3.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane4_m3.setStyle(htmlCommand);
		}
		
		
		if (centreX + 5 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 5][centreY - 2].getTerrain() );
			HexagonePane5_m2.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane5_m2.setStyle(htmlCommand);
		}
		
		
		if (centreX + 5 < game.board.getPlusXcoordinate() && centreY - 3 >= game.board.getMinusYcoordinate()) {
			htmlCommand = htmlCommandForTerrainType ( game.board.mapMatrix[centreX + 5][centreY - 3].getTerrain() );
			HexagonePane5_m3.setStyle(htmlCommand);
		}
		else {
			htmlCommand = htmlCommandForTerrainType (CaseType.nonexistent);
			HexagonePane5_m3.setStyle(htmlCommand);
		}
		

    }
    
    
    
    
    // Fonction permettant de generer l'html a integrer lors du changement des sprites de la map
    
    public String htmlCommandForSpriteType (String typeEnnemy) {
    	
    	String urlHTML = "-fx-background-image: url(\"/resources/images/";
    	switch (typeEnnemy) {
		case "Sauron":
			urlHTML = urlHTML + "sauron.png\")";
			break;
		case "Dark Vador":
			urlHTML = urlHTML + "vador.png\")";
			break;
		case "Méchant Joker":
			urlHTML = urlHTML + "joker.png\")";
			break;
		case "Dragon":
			urlHTML = urlHTML + "dragon.png\")";
			break;
		case "Requin":
			urlHTML = urlHTML + "shark.png\")";
			break;
		case "Dalek":
			urlHTML = urlHTML + "dalek.png\")";
			break;
		default:
			System.out.println("L'ennemi n'est pas reconnu");
			break;
		}
    	return urlHTML; 
    	
    }
    
    // Le changement en lui meme
    public void changeBackgroundSpritesCases (Game game) {
    	
		//int centreX = positionGroupePrincipal[0];
		//int centreY = positionGroupePrincipal[1];
		int centreX=game.group.getPosition_x();
		int centreY=game.group.getPosition_y();
		String htmlCommand;
		
		if (centreX - 5 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 5][centreY + 2].isEnnemyThere()) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 5][centreY + 2].ennemy.getName() );
			HexagonePaneSpm5_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm5_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 4 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 4][centreY + 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 4][centreY + 2].ennemy.getName() );
			HexagonePaneSpm4_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm4_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 4 >= game.board.getMinusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 4][centreY + 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 4][centreY + 1].ennemy.getName() );
			HexagonePaneSpm4_1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm4_1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 4 >= game.board.getMinusXcoordinate() && centreY < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 4][centreY].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 4][centreY].ennemy.getName() );
			HexagonePaneSpm4_0.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm4_0.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 3][centreY + 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 3][centreY + 2].ennemy.getName() );
			HexagonePaneSpm3_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm3_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 3][centreY + 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 3][centreY + 1].ennemy.getName() );
			HexagonePaneSpm3_1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm3_1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 3][centreY].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 3][centreY].ennemy.getName() );
			HexagonePaneSpm3_0.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm3_0.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX - 3][centreY - 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 3][centreY - 1].ennemy.getName() );
			HexagonePaneSpm3_m1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm3_m1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 3 >= game.board.getMinusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX - 3][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 3][centreY - 2].ennemy.getName() );
			HexagonePaneSpm3_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm3_m2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 2][centreY + 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 2][centreY + 2].ennemy.getName() );
			HexagonePaneSpm2_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm2_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 2][centreY + 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 2][centreY + 1].ennemy.getName() );
			HexagonePaneSpm2_1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm2_1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 2][centreY].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 2][centreY].ennemy.getName() );
			HexagonePaneSpm2_0.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm2_0.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX - 2][centreY - 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 2][centreY - 1].ennemy.getName() );
			HexagonePaneSpm2_m1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm2_m1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 2 >= game.board.getMinusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX - 2][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 2][centreY - 2].ennemy.getName() );
			HexagonePaneSpm2_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm2_m2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 1][centreY + 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 1][centreY + 2].ennemy.getName() );
			HexagonePaneSpm1_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm1_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 1][centreY + 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 1][centreY + 1].ennemy.getName() );
			HexagonePaneSpm1_1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm1_1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX - 1][centreY].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 1][centreY].ennemy.getName() );
			HexagonePaneSpm1_0.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm1_0.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX - 1][centreY - 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 1][centreY - 1].ennemy.getName() );
			HexagonePaneSpm1_m1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm1_m1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX - 1 >= game.board.getMinusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX - 1][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX - 1][centreY - 2].ennemy.getName() );
			HexagonePaneSpm1_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSpm1_m2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX < game.board.getPlusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX][centreY + 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX][centreY + 2].ennemy.getName() );
			HexagonePaneSp0_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp0_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX < game.board.getPlusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX][centreY + 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX][centreY + 1].ennemy.getName() );
			HexagonePaneSp0_1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp0_1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX][centreY - 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX][centreY - 1].ennemy.getName() );
			HexagonePaneSp0_m1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp0_m1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX][centreY - 2].ennemy.getName() );
			HexagonePaneSp0_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp0_m2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 1][centreY + 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 1][centreY + 2].ennemy.getName() );
			HexagonePaneSp1_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp1_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 1][centreY + 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 1][centreY + 1].ennemy.getName() );
			HexagonePaneSp1_1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp1_1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 1][centreY].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 1][centreY].ennemy.getName() );
			HexagonePaneSp1_0.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp1_0.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 1][centreY - 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 1][centreY - 1].ennemy.getName() );
			HexagonePaneSp1_m1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp1_m1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 1 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 1][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 1][centreY - 2].ennemy.getName() );
			HexagonePaneSp1_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp1_m2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 2][centreY + 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 2][centreY + 2].ennemy.getName() );
			HexagonePaneSp2_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp2_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 2][centreY + 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 2][centreY + 1].ennemy.getName() );
			HexagonePaneSp2_1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp2_1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 2][centreY].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 2][centreY].ennemy.getName() );
			HexagonePaneSp2_0.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp2_0.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 2][centreY - 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 2][centreY - 1].ennemy.getName() );
			HexagonePaneSp2_m1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp2_m1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 2 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 2][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 2][centreY - 2].ennemy.getName() );
			HexagonePaneSp2_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp2_m2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY + 2 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 3][centreY + 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 3][centreY + 2].ennemy.getName() );
			HexagonePaneSp3_2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp3_2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY + 1 < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 3][centreY + 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 3][centreY + 1].ennemy.getName() );
			HexagonePaneSp3_1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp3_1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 3][centreY].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 3][centreY].ennemy.getName() );
			HexagonePaneSp3_0.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp3_0.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 3][centreY - 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 3][centreY - 1].ennemy.getName() );
			HexagonePaneSp3_m1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp3_m1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 3 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 3][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 3][centreY - 2].ennemy.getName() );
			HexagonePaneSp3_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp3_m2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 4 < game.board.getPlusXcoordinate() && centreY < game.board.getPlusYcoordinate() && game.board.mapMatrix[centreX + 4][centreY].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 4][centreY].ennemy.getName() );
			HexagonePaneSp4_0.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp4_0.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 4 < game.board.getPlusXcoordinate() && centreY - 1 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 4][centreY - 1].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 4][centreY - 1].ennemy.getName() );
			HexagonePaneSp4_m1.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp4_m1.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 4 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 4][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 4][centreY - 2].ennemy.getName() );
			HexagonePaneSp4_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp4_m2.setStyle("-fx-opacity: 0.0;");
		}
		
		if (centreX + 5 < game.board.getPlusXcoordinate() && centreY - 2 >= game.board.getMinusYcoordinate() && game.board.mapMatrix[centreX + 5][centreY - 2].isEnnemyThere() ) {
			htmlCommand = htmlCommandForSpriteType ( game.board.mapMatrix[centreX + 5][centreY - 2].ennemy.getName() );
			HexagonePaneSp5_m2.setStyle(htmlCommand);
		}
		else {
			HexagonePaneSp5_m2.setStyle("-fx-opacity: 0.0;");
		}
		

    }
    
    private void GameOver() {
   	 
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        final Font fontDaysLater96 = Font.loadFont(getClass().getResourceAsStream("/resources/fonts/28DaysLater.ttf"),96);
        final Font fontDaysLater24 = Font.loadFont(getClass().getResourceAsStream("/resources/fonts/28DaysLater.ttf"),24);
        
        Text textLoad = new Text("Game Over");
        textLoad.setFont(fontDaysLater96);
        
        Button closeButton = new Button("Quitter");
        closeButton.setFont(fontDaysLater24);
        closeButton.setOnAction((ActionEvent e) -> {
        	stage.close();
        	Stage stage_game = (Stage) quitButton.getScene().getWindow();
			stage_game.close();
			new File("game_saved.ser").delete();	
        });
        
        VBox loadStage = new VBox();
        loadStage.getChildren().addAll(textLoad, closeButton);
        
        Scene scene = new Scene(loadStage, 500, 140);
        stage.setScene(scene);
        stage.showAndWait();
    }
    
  //Création d'un fenêtre en attente d'un texte
    private void ChooseConfig(String text,Game game){
    	
		final Font fontDaysLater24 = Font.loadFont(getClass().getResourceAsStream("/resources/fonts/28DaysLater.ttf"), 24);
		
    	Stage stage = new Stage();
    	
        stage.initModality(Modality.WINDOW_MODAL);
        Text textLoad_group = new Text("Choisissez un nom pour votre groupe");
        Text textLoad_character = new Text("Choisissez un nom pour votre joueur");
        textLoad_character.setFont(fontDaysLater24);
        textLoad_group.setFont(fontDaysLater24);
        
        final TextField text_entered_character = new TextField("");
        final TextField text_entered_group = new TextField("");
        
        Button submitButton = new Button("Valider");
        submitButton.setFont(fontDaysLater24);
        submitButton.setOnAction((ActionEvent e) -> {
        		game.group.setName(text_entered_group.getText());
            	game.group.group.get(0).set_name(text_entered_character.getText());
            	stage.close();
            
        });
        VBox loadStage = new VBox();
        loadStage.getChildren().addAll(textLoad_group, text_entered_group,textLoad_character, text_entered_character, submitButton);

        Scene scene = new Scene(loadStage, 500, 145);
        stage.setScene(scene);

        stage.showAndWait();
        
     
    }
}
