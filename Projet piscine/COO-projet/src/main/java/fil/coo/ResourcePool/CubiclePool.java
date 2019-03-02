package fil.coo.ResourcePool;
import fil.coo.Resource.*;

/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 */
 
public  class CubiclePool extends ResourcePool<Cubicle>{
	/**
	*/
	
	public CubiclePool(int nbr){
		super(nbr);
	}
	public  Cubicle CreateRessource(){
		
		return new Cubicle();
		}
	public String getDescription() {
		return "pool cubicle";
		
	}
	
}
		
