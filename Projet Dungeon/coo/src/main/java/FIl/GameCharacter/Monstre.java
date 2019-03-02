package FIl.GameCharacter;
/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * The monstre class represents a Monster
 */
public class Monstre extends GameCharacter{
	private String name;
	
	public Monstre(String name,int pt_vie,int force,int pt_or) {
		super(pt_vie,force,pt_or);
		this.name=name;		
	}
	 /**
	* get the name of the monster
	* @return String name
	*/
	public String toString() {
		return name;
	}
}
