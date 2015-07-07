import java.util.TimerTask;
import java.util.Date;

//This is a simple class that uses the run() method of Threads when the task is invoked. 
//The String strObject will help us identify which task is running
class CustTimerTask extends TimerTask{
	//TimerTask is a abstract class so it's recommended/needed to make a class that extends to it & modify run method.
	//Not sure how run method is automatically executed tho.. Thought it was part of the Object class but didn't see it.

	String strObject;

	public CustTimerTask (String strObject){
		this.strObject = strObject;
	}

	public void run(){
		Date objDate = new Date(); //Adding to get timestamp feature ;-)
		//is there a diff if I put the date variable as part of the class varible?
		System.out.println("Name of task being run is: "+ strObject + "- "+ objDate.toString());
	}
}