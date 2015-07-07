import java.util.TimerTask;
import java.util.Date;
import java.text.SimpleDateFormat;

//This is a simple class that uses the run() method of Threads when the task is invoked. 
//The String strObject will help us identify which task is running
class CustTimerTask extends TimerTask{
	//TimerTask is a abstract class so it's recommended/needed to make a class that extends to it & modify run method.
	//Not sure how run method is automatically executed tho.. Thought it was part of the Object class but didn't see it.

	String strObject;
	String strDateFormat = "hh:mm:ss a dd-MMM-yyyy";

	public CustTimerTask (String strObject){
		this.strObject = strObject;
	}

	public void run(){
		Date objDate = new Date(); //Adding to get timestamp feature ;-)
		//is there a diff if I put the date variable as part of the class varible?
		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		//Interesting: missing format string 'strDateFormat' caused same date to be printed over & over
		System.out.println("Name of task being run is: "+ strObject + "- "+objSDF.format(objDate));
	}
}