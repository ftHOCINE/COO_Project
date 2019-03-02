package fil.coo.ResourcePool;
import java.util.*;
import fil.coo.Resource.*;
import fil.coo.ResourcePool.*;


/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 */

public abstract class ResourcePool<T extends Resource>{
	/**
	*/

	protected List<T> freeResources;
	protected List<T> busyResources;
	private int nbr;

	public ResourcePool(int nbr){
		this.nbr=nbr;
		this.freeResources=new ArrayList<T>();
		for(int i=0;i<nbr;i++){
			this.freeResources.add(this.CreateRessource());
			}
		this.busyResources=new ArrayList<T>();
	}
	protected abstract T CreateRessource();

  public List<T> getfreeResources(){
    return this.freeResources;}
  public List<T> getbusyResources(){
      return this.busyResources;}

	public T provideResource() throws EmptyListException{
		if (!this.freeResources.isEmpty()){
		T resource= this.freeResources.get(0);
		this.busyResources.add(resource);
		this.freeResources.remove(resource);
		return resource;
	}
	else {
		throw new EmptyListException();}
	}



    public void freeResource(T resource)throws NotFoundException{
		if (this.busyResources.contains(resource)){
			this.busyResources.remove(resource);
			this.freeResources.add(resource);
		}
		else{
			throw new NotFoundException();
		}
	}
	public abstract String getDescription();

}
