package FIl.Actions;
import FIl.GameCharacter.*;
import FIl.Items.*;
import FIl.Room.*;
import java.util.*;
import FIl.ListChoser.ListChoser;

/**
 * @author HOCINE Ferhat, Kabouche Aissa
 * UseAction the action to use the items available in the room
 **/
public class UseAction implements Action {
	private Room room;
	public UseAction(Room room){
		this.room=room;
	}
	public boolean ispossible(){
		return !this.room.getListObjects().isEmpty();
	}
		/**
	 * use an action by the player
	 * @param P the player
	 **/
	public void use(Player P){
		if (ispossible()){
			List<Items>items=new ArrayList<Items>();
			items=this.room.getListObjects();
			if(items.size()==1){
				items.get(0).usedBy(P);
				this.room.removeObject(items.get(0));
				System.out.println("Point de vie: " + P. getPointv() + ", force: " + P. getForce() + ",point d or: " + P.getPointOr());
				}
			else {
				ListChoser lc = new ListChoser();
				Items choice = lc.chose("Which item ? ", items);
				choice.usedBy(P);
				System.out.println("Point de vie: " + P. getPointv() + ", force: " + P. getForce() + ",point d or: " + P.getPointOr());
				this.room.removeObject(choice);
			}
			}
		}
		
	/**
	 * describe the action
	 * @return the description
	 **/
		public String toString(){
			return "Use Object 👉 ";}
		}
				
			
		
