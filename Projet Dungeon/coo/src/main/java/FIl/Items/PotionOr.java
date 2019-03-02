package FIl.Items;
import FIl.Room.*;
import FIl.GameCharacter.*;
import FIl.ListChoser.*;
import FIl.Actions.*;
	/**
	 * 
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * potionOr class represents an item that increase the player gold point
 */
public class PotionOr implements Items{
	
	private int Point;
	
	public PotionOr(int Point){
		this.Point=Point;
	}
		/**
	* the player use the item
	* @param  P the player 
	*/
	public void usedBy(Player P){
	P.changePointOr(P.getPointOr() +this.Point);
	}
		/**
	* get the name of the item
	* @return String name
	*/
	public String toString(){
		return "Potion D'or";
	}
}
