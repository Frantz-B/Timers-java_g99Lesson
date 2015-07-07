# Timers-java_g99Lesson
###Lesson 37 (Java Timer) &amp; 38 (Date)


Found it interesting how G99 decided to go about Timer-java lesson & spliting up 3 classes to execute main goal.  Kinda feel like it's clean or @ the very least def showing another way to go about things. Classes on top of classes.  Also they actually OneUp TutorialsPoint by showing me how to format my date appearance.  That was grouped together really well & not easily findable on TP.  However, initially TP did explained better/easier.  Learned alot with both of these lessons:
* Seems with **TimerTask**, You have to create a class that extends to it in order to override the `run()` method.  **TimerTask** is solely a Abstract class & that's why eclipse compiler doesn't like for me to use it directly.
* I properly imported what was needed for each class on my own with no help from G99 on this lesson. (could've lead one to believe items needed to be imported for each class)
* **TimerTask** is a simple class that uses the `run()` method of Threads when the task is invoked. And in my **CustTimerTalk**, `String strObject` helped us identify which task is running.
* Liked, I was reminded that you can still do calculations within a method variable intake. (i.e. scheduling a task within **TimerCust** class)
* Read up on the `Runnable` interface and now have more of an understand of why the `run()` method is executed And that one shoould only use it if they intend to modify that method /the fundamental behavior of the class.
* More familiarity with 'new' keyword and using it soley without instantiating within a variable.

####Growing Pains: during coding session
* Many Errors all because I forgot to declare 'timingCapture_2' an int variable.. Felt 8 Errors, lots of red. Eclipse save me ~2hrs. -> **TimerzCust** class
* Got a lesson to make sure I **SELECT** the **PROPER Auto-Finish Selection** when completing rest of a word.  Timing was way off due to me pointing to timingCapture_2 for timingTask object. Made me thought Java couldn't handle running things in parallel or it gave priority to my 2nd task. -> **TimerzCust** class
* Interesting: missing format string 'strDateFormat' caused same date to be printed over & over. -> **CustTimerTask** class

Food for thought:
* Was thinking how to stop the timer task after a certain number of runs.  Then proceeded to ask myself how do I count the number of runs and Stop at a certain point.  Then realized that in the question lies my answer.  Essentially I would; insert a counter variable to increase in `CustTimerTask.run()`, then create a conditional boolean statement to run the `ojbTimer.cancel()` in my `TimerzCust` class.