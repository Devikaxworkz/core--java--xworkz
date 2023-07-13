class Telecom{
static String simNames[]= {null,null,null,null,null,null,null};
static int index;
public static boolean addSim(String sim){
boolean isAdded = false;
if(sim!= null){
		simNames[index] = sim;
		index++;
		isAdded = true;
		}else{
		System.out.println("Cannot add the data at null value");
		}
		return isAdded;
		}
		
		//method
	   public static void getAllSimNames(){
	   System.out.println("Invoking getAllSimNames");
	   for (int sim= 0; sim< simNames.length;sim++){
	   String reference = simNames[sim];  
	   System.out.println("type of sim " + reference +" at index value " + sim);
	   }
	   System.out.println("End of getAllSimNames");
	   }
	   	   public static boolean updateSimNames(String exisitingSimNames, String updateSimNames){
		   boolean isUpdated = false;
		   for(int simIndex = 0; simIndex< simNames.length ;simIndex++){
			   if(simNames[simIndex].equals(exisitingSimNames)){
				   simNames[simIndex]= updateSimNames;
				   isUpdated = true;
				   
			   }
		   }
		   
		 return isUpdated;  
	   }
	   public static int deleteSimNames(String deleteSimNames){
	System.out.println("Invoking editSimNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int simIndex;
	int noOfElements = simNames.length;
	for (simIndex = 0; simIndex<simNames.length;simIndex++){
		if(simNames[simIndex].equals(deleteSimNames)){
		break;
		}
	}
	if(simIndex<noOfElements){
		noOfElements = noOfElements-1;
		for(int newSimIndex = simIndex; newSimIndex<noOfElements;newSimIndex++){
		simNames[newSimIndex]= simNames[newSimIndex+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllSimNamesPostDeletion(int newLength){
	for(int simIndex = 0; simIndex< newLength; simIndex++){
		System.out.println(simNames[simIndex]);
	}
	
}
	   }
