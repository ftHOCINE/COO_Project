package fil.coo.Action;
/**
 * Hello world!
 *
 */
public abstract class Action
{
	protected ActionState state;
	public Action (){
		this.state=ActionState.READY;
	}
	public ActionState getState(){
		return this.state;
	}
	public boolean isFinished(){
		return this.state== ActionState.FINISHED;
	}
	public abstract void process() throws ActionFinishedException;
	
	public abstract boolean stopCondition();
	
	public void doStep()throws ActionFinishedException{
        if (this.isFinished()) {
            throw new ActionFinishedException("action finished");
        }
        if (this.state == ActionState.READY) {
            this.state = ActionState.IN_PROGRESS;
        }
       this.process();
        if (this.stopCondition()) {
            this.state = ActionState.FINISHED;
        }
    }

	}
			
		

