package fil.coo.Action;
import fil.coo.Resource.Resource;
import fil.coo.ResourcePool.*;
import fil.coo.ResourceUser.ResourceUser;

public class FreeResourceAction<T extends Resource> extends ResourceAction<T>{
	private String s;
	public FreeResourceAction(ResourcePool<T> resources,ResourceUser<T> user,String s) {
		super(resources,user);
		this.s=s;
	}
	public boolean stopCondition() {
		return true;
	}
        public ResourceUser getUser(){
		return this.user;
        }
	public void process() throws ActionFinishedException{

		try {
			this.Resources.freeResource(this.user.getResource());
			System.out.println(" "+s+" freeing resource from "+this.Resources.getDescription());
			this.user.resetResource();

		} catch (NotFoundException e) {
		}
			
		
	}
	
}
