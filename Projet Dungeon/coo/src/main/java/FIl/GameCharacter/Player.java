package FIl.GameCharacter;
import FIl.Actions.*;
import FIl.Room.*;
import FIl.ListChoser.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * The Player class represents a player
 */
public class Player extends GameCharacter
{
	private List<Action> actions;
	private Room room;
	public Player(int pt_vie,int force,int pt_or,Room room) {
		super(pt_vie,force,pt_or);
		this.actions = new ArrayList<Action>();
		this.room=room;
		
	}
	/**
	* set a room to the player
	* @param R the room to be setten
	*/
	public void setRoom(Room R){
			this.room=R;}
			/**
	* get the player room
	* @return the room where the player is
	*/	
	public Room getRoom(){
			return this.room;}
	/**
	* get the player actions
	* @return the LIst of action that the player can do
	*/			
	public List<Action> getAction(){
		return this.actions;
	}
				/**
	* remove an action from the player list of actions 
	* @param Act the action to be removed
	*/	
	public void removeAction(Action Act){
		this.actions.remove(Act);
	}
	/**
	* ad an action to the player list of actions 
	* @param Act the action to be added
	*/	
	public void addAction(Action Act){
		this.actions.add(Act);
	}
	/**
	* remove all the actions from the player list of actions 
	*/
	public void removeAllAction(){
		this.actions = new ArrayList<Action>();
	}
					/**
	* give the user the possibility to chose an action
	* @return the action chosen
	*/	
	public Action chooseAction(){
		ListChoser lc = new ListChoser();
		Action chosen = lc.chose("which action you want to do?", this.actions);
		
		return chosen;
	}
	/**
	* use the achtion chosen by the user
	*/
	public void act(){
		Action chosen = this.chooseAction();
		System.out.println("**** you choose "+ chosen+" ****");
		System.out.println("^^^^---------------------------------------^^^^");
		chosen.use(this);		
		System.out.println("^^^^---------------------------------------^^^^");
		System.out.println(" ");
	
	}
}
