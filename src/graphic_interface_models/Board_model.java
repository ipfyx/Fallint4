/**
 * Package Board_model gerant les donnees pertinentes pour le plateu de jeu
 * 
 * @author FallINT 4's Team
 *
 */

package graphic_interface_models;

import graphic_interface_controller.Board_controller;

public class Board_model {
	
	boolean moveWanted;
	boolean collectObjectWanted;
	boolean dumpObjectWanted;
	boolean dumpResourcesWanted;
	boolean UsePotionWanted;
	boolean strengthDiminP1 = false;
	boolean strengthDiminP2 = false;
	boolean strengthDiminP3 = false;
	
	public Board_model(boolean moveWantedInit,boolean collectObjectWantedInit, boolean dumpObjectWantedInit, boolean dumpResourcesWantedInit, boolean UsePotionWantedInit, boolean strengthDiminishedP1, boolean strengthDiminishedP2, boolean strengthDiminishedP3) {
		
		this.moveWanted = moveWantedInit;
		this.collectObjectWanted = collectObjectWantedInit;
		this.dumpObjectWanted = dumpObjectWantedInit;
		this.dumpResourcesWanted = dumpResourcesWantedInit;
		this.UsePotionWanted = UsePotionWantedInit;
		this.strengthDiminP1 = strengthDiminishedP1;
		this.strengthDiminP2 = strengthDiminishedP2;
		this.strengthDiminP3 = strengthDiminishedP3;
		
	}
	
	public boolean isUsePotionWanted() {
		return UsePotionWanted;
	}

	public void setUsePotionWanted(boolean usePotionWanted) {
		UsePotionWanted = usePotionWanted;
	}

	public boolean isDumpResourcesWanted() {
		return dumpResourcesWanted;
	}

	public void setDumpResourcesWanted(boolean dumpResourcesWanted) {
		this.dumpResourcesWanted = dumpResourcesWanted;
	}

	public boolean isDumpObjectWanted() {
		return dumpObjectWanted;
	}

	public void setDumpObjectWanted(boolean dumpObjectWanted) {
		this.dumpObjectWanted = dumpObjectWanted;
	}

	public boolean isCollectObjectWanted() {
		return collectObjectWanted;
	}

	public void setCollectObjectWanted(boolean collectObjectWanted) {
		this.collectObjectWanted = collectObjectWanted;
	}

	public boolean isMoveWanted() {
		return moveWanted;
	}

	public void setMoveWanted(boolean moveWanted) {
		this.moveWanted = moveWanted;
	}
	
	public boolean isStrengthDiminished (int idPlayer) {
		switch (idPlayer) {
			case 0 :
				return strengthDiminP1;
			case 1 :
				return strengthDiminP2;
			case 2 :
				return strengthDiminP3;
			default :
				return strengthDiminP1;
		}
	}

	public void setStrengthDiminished(boolean strDim, int idPlayer) {
		switch (idPlayer) {
		case 0 :
			strengthDiminP1 = strDim;
			break;
		case 1 :
			strengthDiminP2 = strDim;
			break;
		case 2 :
			strengthDiminP3 = strDim;
			break;
		}
	}
	
	
	
	
}
