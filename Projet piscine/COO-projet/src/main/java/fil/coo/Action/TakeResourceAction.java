package fil.coo.Action;
import java.util.*;

import fil.coo.Resource.Resource;
import fil.coo.ResourcePool.*;
import fil.coo.ResourceUser.ResourceUser;

public class TakeResourceAction<T extends Resource> extends ResourceAction<T>{
	private String s;
	public TakeResourceAction(ResourcePool<T> resources,ResourceUser<T> user,String s) {
		super(resources,user);
		this.s=s;
	}
	public boolean stopCondition() {
		return this.done;
	}
	public ResourceUser getUser(){
		return this.user;
        }
	public void process() throws NoSuchElementException, ActionFinishedException{

		try {
			T ressource=this.Resources.provideResource();
			System.out.println(" "+s+" trying to take resource from "+this.Resources.getDescription()+" ... success");
			this.user.setResource(ressource);
			

			this.done=true;
		} catch (EmptyListException e) {
			System.out.println(" "+s+" trying to take resource from "+this.Resources.getDescription()+" ...failed");
		}
			
		
	}
	
}
