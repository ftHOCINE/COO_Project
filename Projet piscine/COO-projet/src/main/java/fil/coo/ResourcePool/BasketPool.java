package fil.coo.ResourcePool;
import fil.coo.Resource.*;



/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 */
 
public  class BasketPool extends ResourcePool<Basket>{
	/**
	*/

	public BasketPool(int nbr){
		super(nbr);
	}
	public Basket CreateRessource(){
		return new Basket();
		}
  
	public String getDescription() {
		return "pool basket";
		
	}
	
}
		
