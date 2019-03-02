package fil.coo.ResourcePool;
import fil.coo.Resource.*;

/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 */
 
public  class MockResourcePool extends ResourcePool<Mock>{
	
	public MockResourcePool(int nbr){
		super(nbr);
	}
	public  Mock CreateRessource(){
		return new Mock();
		}
	public String getDescription() {
		return "Mock ResourcePool";
		
	}
	
}
		
