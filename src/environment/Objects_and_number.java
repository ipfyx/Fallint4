package environment;

import Characters.Objects;
import java.io.*;
/**
 * Cette classe permet d'affecter un nombre à un objet spécial.
 * En effet, sur les cases du board ou dans l'inventaire, il faut stocker
 * dans des ArrayList, à la fois l'objet special et le nombre d'occurence
 * de cet objet sur la case
 */

public class Objects_and_number implements java.io.Serializable{
	
	public Objects object;
	public int nbr_object;
	public String name;

	public Objects_and_number() {
		this.object = null;
		this.nbr_object = 0;
		this.name = null;
	}
	
	public Objects_and_number(Objects object, int nbr_object) {
		this.object = object;
		this.nbr_object = nbr_object;
		this.name = object.name;
	}

	public Objects getObject() {
		return object;
	}

	public void setObject(Objects object) {
		this.object = object;
	}

	public int getNbr_object() {
		return nbr_object;
	}

	public void setNbr_object(int nbr_object) {
		this.nbr_object = nbr_object;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
