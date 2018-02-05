/**
 * Enum sur les differents type de case existants
 */

package environment;
import java.io.*;
public enum CaseType implements java.io.Serializable{
	water,
	forest,
	rock,
	grassland,
	base,
	city,
	nonexistent,		//encore non utilisee, ca sera peut etre utile pour detecter une case en dehors de la map
	nothing				//case deserte, sans ressource
}
