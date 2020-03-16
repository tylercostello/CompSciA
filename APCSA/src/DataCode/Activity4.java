package DataCode;

import java.util.ArrayList;

import core.data.*;
public class Activity4 {

	public Activity4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSource ds = DataSource.connect("http://app.ntsb.gov/aviationquery/Download.ashx?type=xml").load();
	
		ds.printUsageString();//shows the names for paths 
		ArrayList<Crash> crashes = ds.fetchList(Crash.class, "ROWS/ROW/InjurySeverity");
	
		

		for (Crash crash : crashes) {
			System.out.println(crash.getSeverity());
		}
	}

}
class Crash{
	
	String severity;
	Crash(String severity){
		this.severity=severity;
	}
	public String getSeverity() {
		return severity;
	}
}