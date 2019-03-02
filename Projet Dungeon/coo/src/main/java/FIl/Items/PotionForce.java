package FIl.Items;
import FIl.Room.*;
import FIl.GameCharacter.*;
import FIl.ListChoser.*;
import FIl.Actions.*;
public class PotionForce implements Items{
	/**
	 * 
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * potionForce class represents an item that increase the player strength point
 */
	private int Point;
	
	public PotionForce(int Point){
		this.Point=Point;
	}
		/**
	* the player use the item
	* @param  P the player 
	*/
	public void usedBy(Player P){
	P.changeForce(P.getForce() +this.Point);
	}
		/**
	* get the name of the item
	* @return String name
	*/
	public String toString(){
		return "Potion De Force";
	}
}
