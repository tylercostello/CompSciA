package RealApTest;

import java.util.ArrayList;

public class Frq1 {

	public void updateRecentlyUsedApps(){
		for (App thisApp : allApps){
			if(thisApp.getUsed()){
				thisApp.setNumTimes(thisApp.getNumTimes()+1);
			}
		}
	}
	
	public ArrayList<App> updateAppStatus(){
		ArrayList<App> removableList = new ArrayList<App>();
		for (App thisApp : allApps){
			if (thisApp.getNumTimes()<6){
				thisApp.setRemovable(true);
				removableList.add(thisApp);
			}
			else{
				thisApp.setRemovable(false);
			}
		}
		return removableList;
		
	}
	
}
