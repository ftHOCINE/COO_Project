package FIl.Actions;
import FIl.GameCharacter.*;
import FIl.Items.*;
import FIl.Room.*;
import FIl.ListChoser.ListChoser;

/**
 * @author HOCINE Ferhat, Kabouche Aissa
 * AttackAction the action that attack the Monster
 **/
public class AttackAction implements Action {
	private Room room;
	private int cptplayer=1;
	private int cptmonstre=0;
	public AttackAction(Room room){
		this.room=room;
	}
	
	/**
	 * cheak if the player can use the action
	 * @return true if the action is possible(the room is empty)
	 * @return false if the action is not possible 
	 */
	public boolean ispossible(){
		return !this.room.isEmptyList();
	}
	
	/**
	 * use an action by the player
	 * @param P the player
	 **/
	public void use(Player P){
		Monstre monstre;
		if(ispossible()){
			if(this.room.getListMonstre().size()==1){
				monstre = this.room.getListMonstre().get(0);
			}
			else {
			ListChoser l = new ListChoser();
			monstre = l.chose("which Monster do you want to attack", this.room.getListMonstre());
		}
		while (!monstre.isDead() && !P.isDead()){
			P.attack(monstre);
			if (!monstre.isDead()){
			monstre.attack(P);
			cptplayer++; 
			cptmonstre++;}
		}
		if (monstre.isDead()){
			P.changePointOr(P.getPointOr()+monstre.getPointOr());
			this.room.removeMonstre(monstre);
			System.out.println(" ");
			System.out.println("***** -- the monster "+monstre.toString()+" is dead after "+ cptplayer+" attack and he attacks you back "+cptmonstre+" times and deduct "+(cptmonstre*monstre.getForce())+" points from your life points -- *****");
			System.out.println(" ");
	

		}
		}
		}
	/**
	 * describe the action
	 * @return the description
	 **/
		public String toString(){
			return "Attack Action † ";}
		}
				
			
		
