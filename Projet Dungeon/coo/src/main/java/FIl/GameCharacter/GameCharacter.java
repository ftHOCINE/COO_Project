package FIl.GameCharacter;
import FIl.*;
/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * The GameCharacter class represents a player or a monster
 */
public class GameCharacter{

    protected int pt_vie;
    protected int force ;
    protected int pt_or ;
    
	public GameCharacter(int pt_vie,int force,int pt_or) {

		this.pt_vie=pt_vie;
		this.force= force;
		this.pt_or=pt_or;

	}

	/**
	* get the life point
	* @return int life point
	*/
    public int getPointv() {
    	return this.pt_vie;
    }
    /**
	* get the strength point
	* @return int strength point
	*/
    public int getForce() {
    	return this.force;
    }
    /**
	* get the gold point
	* @return int gold point
	*/
    public int getPointOr() {
    	return this.pt_or;
    }
    /**
	* set a new the life point
	* @param F int life point
	*/
    public void changeForce(int F) {
    	this.force= F;
    }
    /**
	* set a new the strength point
	* @param V int strength point
	*/
    public void changePointV(int V) {
    	this.pt_vie= V;
    }
    /**
	* set a new the gold point
	* @param O int gold point
	*/
    public void changePointOr(int O) {
    	this.pt_or= O;
    }
    /**
	* cheack if the character is dead
	* @return true if he is dead
	* @return flase if not
	*/
    public boolean isDead(){
		return this.getPointv()<=0;
	}
	/**
	* the achtion of a character to attack another
	* @param P Game charachter to be attacked
	*/
	public void attack(GameCharacter P){
			P.changePointV(P.getPointv()-this.force);
		}
    
    
    
}
