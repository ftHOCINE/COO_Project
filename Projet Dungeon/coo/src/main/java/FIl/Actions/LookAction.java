package FIl.Actions;
import FIl.GameCharacter.*;
import FIl.Items.*;
import FIl.Room.*;
import java.util.*;
import java.util.Map.Entry;

/**
 * @author HOCINE Ferhat, Kabouche Aissa
 * LookAction the action to look around 
 **/
public class LookAction implements Action {
	private Room room;
	public LookAction(Room room){
		this.room=room;
	}
	
	/**
	 * the action of look is always possible
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
		List<Monstre> monstres=new ArrayList<Monstre>();
		monstres=this.room.getListMonstre();
		List<Items>obj=new ArrayList<Items>();
		obj=this.room.getListObjects();
		List<Direction>directions=new ArrayList<Direction>();
		for(Entry<Direction,Room> entry: this.room.getNeighbors().entrySet()){
			directions.add(entry.getKey());}
		System.out.println("~~~~~~~~~~~ This room has "+monstres.size()+" monster ~~~~~~~~~~~");
		for(int i=0;i<monstres.size();i++){
			System.out.println("-----------------> "+monstres.get(i).toString());}
			System.out.println(" ");
		System.out.println("~~~~~~~~~~~  This room has "+obj.size()+" items ~~~~~~~~~~~");
		for(int i=0;i<obj.size();i++){
			System.out.println("-----------------> "+obj.get(i).toString());}
			System.out.println(" ");
		System.out.println("~~~~~~~~~~~  This room has "+directions.size()+" neighbors ~~~~~~~~~~~");
		for(int i=0;i<directions.size();i++){
			System.out.println("-----------------> "+directions.get(i)+"");
			}
			System.out.println(" ");
	}
		
	/**
	 * describe the action
	 * @return the description
	 **/
		public String toString(){
			return "Look Action 👁  ";}
		}
				
			
		
