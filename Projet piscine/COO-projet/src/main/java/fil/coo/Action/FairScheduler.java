package fil.coo.Action;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class FairScheduler extends Scheduler
{
	
	private Iterator<Action> it=null;
	
	
	public  FairScheduler(){
               
		super();
	this.it=it;
}

	@Override
	public Action nextAction() {
		if(it==null)
			this.it = actions.iterator();
		if(!it.hasNext())  
		{
			this.it = actions.iterator();
		}
		return it.next();
	}
		
	public  void removeAction(Action a){
		   it.remove();
}
       public Iterator<Action> getit(){
      return this.it;
       }
	
		}
	
	
	

