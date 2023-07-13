class Metro{
static String stationNames[]= {null,null,null,null,null,null,null,null};
static int index;
public static boolean addStation(String station){
boolean isAdded = false;
if(station!= null){
		stationNames[index] = station;
		index++;
		isAdded = true;
		}else{
		System.out.println("Cannot add the data at null value");
		}
		return isAdded;
		}
		
		//method
	   public static void getAllStationNames(){
	   System.out.println("Invoking getAllStationNames");
	   for (int station= 0; station< stationNames.length;station++){
	   String reference = stationNames[station];  
	   System.out.println("type of station " + reference +" at index value " + station);
	   }
	   System.out.println("End of getAllStationNames");
	   
	   }
public static boolean updateStationNames(String exisitingStationNames, String updateStationNames){
		   boolean isUpdated = false;
		   for(int stationIndex = 0; stationIndex< stationNames.length ;stationIndex++){
			   if(stationNames[stationIndex].equals(exisitingStationNames)){
				   stationNames[stationIndex]= updateStationNames;
				   isUpdated = true; 
}
}
return isUpdated;
}
public static int deleteStationNames(String deleteStationNames){
	System.out.println("Invoking editStationNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int stationIndex;
	int noOfElements = stationNames.length;
	for (stationIndex = 0; stationIndex<stationNames.length;stationIndex++){
		if(stationNames[stationIndex].equals(deleteStationNames)){
		break;
		}
	}
	if(stationIndex<noOfElements){
		noOfElements = noOfElements-1;
		for(int newStationIndex = stationIndex; newStationIndex<noOfElements;newStationIndex++){
			stationNames[newStationIndex]= stationNames[newStationIndex+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllStationNamesPostDeletion(int newLength){
	for(int stationIndex = 0; stationIndex< newLength; stationIndex++){
		System.out.println(stationNames[stationIndex]);
	}
	
}
}