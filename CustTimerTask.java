import java.util.TimerTask;

//This is a simple class that uses the run() method of Threads when the task is invoked. 
//The String strObject will help us identify which task is running
class CustTimerTask extends TimerTask{
	String strObject;

	public CustTimerTask (String strObject){
		this.strObject = strObject;
	}

	public void run(){
		System.out.println("Name of task being run is: "+ strObject);
	}
}