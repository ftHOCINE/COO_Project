package FIl.Actions;
import FIl.GameCharacter.Player;

/**
 * @author HOCINE Ferhat, Kabouche Aissa
 * Action is an interface that represente the actions that the player can do
 **/
 
public interface Action{
	/**
	 * use an action by the player
	 * @param p the player
	 **/
	public void use(Player p);
	/**
	 * cheak if the player can use the action
	 * @return true if the action is possible
	 * @return false if the action is not possible 
	 */
	public boolean ispossible();
	/**
	 * describe the action
	 * @return the description
	 **/
	public String toString();
}

