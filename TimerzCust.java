import java.util.Timer;
//This class show know to use my CustTimerTask class file.
public class TimerzCust{
	//This class was made to do a majority of the ground work for this lesson.  
	//Found it interesting how G99 decided to go about this.  Kinda feel like it's
	//clean or @ the very least def showing another way to go about things. Classes
	//on top of classes.
	public TimerzCust(int timingCapture_1 , int timingCapture_2){
		//Growing Pain Lesson: if I didn't double check this with eclipse, I would have had some
		//Many Errors all because I forgot to declare 'timingCapture_2' an int variable.. Felt 8 Errors, lots of red

		Timer timingTask_1 = new Timer();  //Originally G99 broke this up
		timingTask_1.schedule(new CustTimerTask("Alpha"), timingCapture_1 * 1000, timingCapture_1 * 1000);
		//Got a lesson to make sure I SELECT the PROPER Auto-Finish Selection when completing rest of a word.
		//Timing was way off due to me pointing to timingCapture_2 for timingTask object. Made me thought Java
		//couldn't handle running things in parallel or it gave priority to my 2nd task.

		//like how they reminded that you can still do calculations within a method variable
		Timer timingTask_2 = new Timer();
		timingTask_2.schedule(new CustTimerTask("Bravo"), timingCapture_2 * 6000, timingCapture_2 * 1500);
	}
}