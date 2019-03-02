package FIl.Room;
import FIl.Items.*;
import FIl.GameCharacter.*;
import FIl.ListChoser.*;
import FIl.Actions.*;
import FIl.Room.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * Room class that represents a Room
 */
public class Room{
	protected String name;
	protected List<Items> listObj;
	protected List<Monstre> listMonstre;
	protected Map<Direction, Room> neighbors;
	
	public Room(String name){
		this.listObj=new ArrayList<Items>();
		this.listMonstre=new ArrayList<Monstre>();
		this.name=name;
		this.neighbors= new HashMap<Direction, Room>();
		
		}
		    /**
	* add a new item to the room
	* @param o Iteam
	*/
	public void addObject(Items o){	
		this.listObj.add(o);
		}
	/**
	* get the name of the room
	* @return String  the name of the room
	*/
	public String toString(){	
		return this.name;
		}
		
	/**
	* add a new item to the room
	* @param m Monstre
	*/
	public void addMonstre(Monstre m){
		this.listMonstre.add(m);
		}
				    /**
	* remove monter from the room
	* @param m monstre
	*/
	public void removeMonstre(Monstre m){
		
			listMonstre.remove(m);
		}
						    /**
	* remove item from the room
	* @param o  iteam
	*/
	public void removeObject(Items o){
			listObj.remove(o);
		}
						    /**
	* cheack if there is no monter in the room
	* @return true if it's true
	* @return false if not
	*/
	public Boolean isEmptyList(){
		return this.listMonstre.isEmpty();
		}
		
	/**
	* get the list of the monsters
	* @return list of monsters  
	*/	
	public List<Monstre> getListMonstre(){
		return this.listMonstre;
		}
		
			/**
	* get the list of the items
	* @return list of items  
	*/
	public List<Items> getListObjects(){
		return this.listObj;
		}
			/**
	* get  the neigbhor(room) situated in the direction given
	* @param direction Direction
	* @return room the neigbhors  
	*/
	public Room getNeighbor(Direction direction) {
		return this.neighbors.get(direction);
	}
				/**
	* get the list of the neigbhors
	* @return list of the neigbhors  
	*/
	public Map<Direction, Room> getNeighbors() {
		return this.neighbors;
	}
	/**
	* add  the given neigbhor(room) situated in the direction given
	* @param direction Direction
	* @param room Room 
	**/


	public void addNeighbor(Direction direction,Room room) {
		 this.neighbors.put(direction, room);
	}
      
}
