package fil.coo.ResourceUser;
import fil.coo.Resource.*;


public class ResourceUser<T extends Resource> {
	public T ressource=null;
	public ResourceUser(){
		
	}
	public T getResource() {
		return this.ressource;
	}
	public void setResource(T r) {
		this.ressource=r;
	}
	public void resetResource() {
		this.ressource=null;
	}
	public boolean hasResource() {
		return this.ressource!=null;
	}
	
	
	

}
