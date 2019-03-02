package FIl.Items;
import FIl.GameCharacter.Player;
import FIl.ListChoser.*;

/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 *  an iterface that represente the items
 */
public interface Items{
	/**
	* the player use the item
	* @param  P the player 
	*/
		public void usedBy(Player P);
	/**
	* get the name of the item
	* @return String name
	*/
		public String toString();
	}

