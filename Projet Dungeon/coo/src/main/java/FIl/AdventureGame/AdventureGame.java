package FIl.AdventureGame;
import FIl.Room.*;
import FIl.GameCharacter.*;
import FIl.ListChoser.*;
import FIl.Actions.*;
import FIl.Items.*;

/**
 * @author HOCINE Ferhat, Kabouche Aissa
 * AdventureGame the class that launch the game and let's us play and use all the other classes
 **/

public class AdventureGame{
	private Room currentRoom;
	private Player player;
    
	public AdventureGame(Player P) {
		this.player=P;
	}
	public AdventureGame(Player P,Room currentRoom) {
		this.player=P;
		this.currentRoom=currentRoom;
	}
	/**
	* get the room where the player is
	 * @return  the room where the player is
	 **/
	public Room getcurrentRoom(){
		return this.currentRoom;
	}
	
	/**
	 * 	set a room to the player  
	 * @param  room a Room
	 **/
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	/**
	 * reload the actions available in the new room
	 **/
	public void RoomsAction(){
		this.player.removeAllAction();
		this.currentRoom=this.player.getRoom();
		MoveAction ma= new MoveAction(this.currentRoom);
		LookAction la= new LookAction(this.currentRoom);
		AttackAction aa= new AttackAction(this.currentRoom);
		UseAction us= new UseAction(this.currentRoom);
		Points poi=new Points(this.currentRoom);
		if (ma.ispossible()){
			this.player.addAction(ma);
		}
		if (la.ispossible()){
			this.player.addAction(la);
		}
		if (aa.ispossible()){
			this.player.addAction(aa);
		}
		if (us.ispossible()){
			this.player.addAction(us);
		}
		if (poi.ispossible()){
			this.player.addAction(poi);
		}
	}
		public void play(Player p){
			this.RoomsAction();
		}

	/**
	 * cheak if the game is finished 
	 * @return true if the game is finished
	 * @return false if not
	 **/
	public boolean isFinished(){
		return (this.player.isDead()||(this.currentRoom instanceof Exit && this.currentRoom.getListMonstre().isEmpty()));

		
}


}
