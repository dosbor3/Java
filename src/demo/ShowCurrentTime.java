package demo;

//Mrs. James ~ Jan 20 ~ Period 8
public class ShowCurrentTime {
	public static void main(String[] args) {
		 //Obtain the total milliseconds since midnight Jan 1, 1970
		 long totalMilliseconds = System.currentTimeMillis();
		
		 //obtain the total seconds since midnight, Jan 1, 1970
		 long totalSeconds = totalMilliseconds / 1000;
		
		 //Compute the current second in the minute in the hour
		 long currentSecond = totalSeconds % 60;
		
		 //Obtain the total minutes
		 long totalMinutes = totalSeconds / 60;		
		
		 //Compute the current minute in the hour
		 long currentMinute = totalMinutes % 60;		
		
		 //Obtain the total hours
		 long totalHours = totalMinutes / 60;		
		
		 //Compute the current hour
		 long currentHour = totalHours % 24;
		
		 //Compute current hour for CST
		 long centralMilitaryTime = currentHour - 6;
		 
		 //Compute Current hour for Central Time 12 hour
		 long centralTime = centralMilitaryTime - 12;
		
		
		 //Checkpoint  ..Print statements to verify results
		 System.out.println("total Milliseconds: " + totalMilliseconds);
		 System.out.println("total Seconds: " +  totalSeconds);
		 System.out.println("Current Second: " + currentSecond);
		 System.out.println("Total Minutes: " + totalMinutes);
		 System.out.println("Current Minute: " + currentMinute);
		 System.out.println("Total Hours: " + totalHours);
		 System.out.println("Current Hour: " + currentHour);
		 System.out.println("Central Military Time: " + centralMilitaryTime);
		 System.out.println("Central Time: " + centralTime);
		 
		 //Display the results in the required format.... The current time is 17:18:53 GMT
		 System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
		 
		 //Display the results in the required format..... The current time is 17:18:53 CST
		 System.out.println("The current time is " + centralMilitaryTime + ":" + currentMinute + ":" + currentSecond + " CST");
		 
		//Display the results in the required format..... The current time is 02:18:53 CST 12 hour
		 System.out.println("The current time is " + centralTime + ":" + currentMinute + ":" + currentSecond + " CST"); 
		 	 
		 
		 
	}
}

