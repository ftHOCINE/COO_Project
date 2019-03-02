package FIl.Actions;
import FIl.GameCharacter.*;
import FIl.Items.*;
import FIl.Room.*;
import FIl.ListChoser.*;
import java.util.*;
import java.util.Map.Entry;

/**
 * @author HOCINE Ferhat, Kabouche Aissa
 * MoveAction the action to move from a room to anouther one
 **/
public class MoveAction implements Action {
	private Room room;
	private Room chosenRoom;

	public MoveAction(Room room){
		this.room=room;
	}
	/**
	 * cheak if the player can use the action
	 * @return true if the action is possible(no monster in the room and the room has neighbors)
	 * @return false if the action is not possible 
	 */
	public boolean ispossible(){
		if (this.room.isEmptyList() && !this.room.getNeighbors().isEmpty()){
			return true;}
		return false;
	}
		/**
	 * use an action by the player
	 * @param P the player
	 **/
	public void use(Player P){
		ListChoser lc = new ListChoser();
		List<Direction> possibleD= new ArrayList<Direction>();
		if (ispossible()){
			if(this.room.getNeighbors().size()==1){
				for( Entry<Direction,Room> entry : this.room.getNeighbors().entrySet()){
				chosenRoom =this.room.getNeighbor(entry.getKey());
			}}
			else {
			for( Entry<Direction,Room> entry : this.room.getNeighbors().entrySet()){
				possibleD.add(entry.getKey());
			}
			Direction choice =lc.chose("which DIRECTION ?", possibleD);
			chosenRoom = this.room.getNeighbor(choice);
		}
			P.setRoom(chosenRoom);
			System.out.println(" ");
			System.out.println(" Now you are in the room  "+chosenRoom.toString());


		
	}
	}
		
	/**
	 * describe the action
	 * @return the description
	 **/
		public String toString(){
			return "Move Action 👣 ";}
		}
				
			
		
