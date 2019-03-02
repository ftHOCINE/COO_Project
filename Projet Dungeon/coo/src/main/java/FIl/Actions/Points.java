package FIl.Actions;
import FIl.GameCharacter.*;
import FIl.Room.*;
import java.util.*;

/**
 * @author HOCINE Ferhat, Kabouche Aissa
 * points the action to see the player's point
 **/
public class Points implements Action {
	private Room room;
	public Points(Room room){
		this.room=room;
	}
	/**
	 * the action of seeing the ponts is always possible
	 * @return true
	 **/
	public boolean ispossible(){
		return true;
	}
		/**
	 * use an action by the player
	 * @param P the player
	 **/
	public void use(Player P){
		System.out.println(" ");
		System.out.println("Life point ╬ "+P.getPointv()+" - Strength point † "+P.getForce()+" - GOld point 💰  "+P.getPointOr()+" ");
		System.out.println(" ");
		}
			/**
	 * describe the action
	 * @return the description
	 **/
		public String toString(){
			return "My Points █ ▌ ";}
		}
				
			
		
