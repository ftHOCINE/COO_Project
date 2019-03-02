package FIl.Items;
import FIl.GameCharacter.*;


	/**
	 * 
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * potionVie class represents an item that increase the player life point
 */
public class PotionVie implements Items{
	
	private int Point;
	
	public PotionVie(int Point){
		this.Point=Point;
	}
		/**
	* the player use the item
	* @param  P the player 
	*/
	public void usedBy(Player P){
	P.changePointV(P.getPointv()+this.Point);
	}
	/**
	* get the name of the item
	* @return String name
	*/
	public String toString(){
		return "Potion De Vie";
	}
}
