package PracticeApTest;

public class LeapYear {
	 public static int numberOfLeapYears(int year1, int year2)
	 { 
		 int leapYearCounter=0;
		 for (int i=year1;i<=year2;i++){
			 if (isLeapYear(i)){
				 leapYearCounter++;
			 }
		 }
		 return leapYearCounter;
	 }
	 
	 public static int dayOfWeek(int month, int day, int year)
	 { 
		 int firstDay = firstDayOfYear(year);
		 int numDays=dayOfYear(month,day,year);
		 return (numDays+firstDay)%7;
		 
		 
	 }
}
