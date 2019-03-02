package fil.coo.Action;
import fil.coo.Resource.Resource;
import fil.coo.ResourcePool.*;
import fil.coo.ResourceUser.*;


public abstract class ResourceAction<T extends Resource> extends Action{
	protected boolean done;
	protected ResourcePool<T> Resources;
	protected ResourceUser<T> user;
	public ResourceAction(ResourcePool<T> resources,ResourceUser<T> user) {
		this.Resources=resources;
		this.user=user;
	}
	public abstract boolean stopCondition();
	public abstract void process() throws ActionFinishedException;

}
