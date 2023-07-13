class IceCream{
static String flovorsNames[]= {null,null,null,null,null,null,null};
static int index;
public static boolean addFlovor(String flovor){
boolean isAdded = false;
if(flovor!= null){
		flovorsNames[index] = flovor;
		index++;
		isAdded = true;
		}else{
		System.out.println("Cannot add the data at null value");
		}
		return isAdded;
		}
		
		//method
	   public static void getAllFlovorsNames(){
	   System.out.println("Invoking getAllFlovorsNames");
	   for (int flovor= 0; flovor< flovorsNames.length;flovor++){
	   String reference = flovorsNames[flovor];  
	   System.out.println("type of flovor " + reference +" at index value " + flovor);
	   }
	   System.out.println("End of getAllFlovorsNames");
	   }
public static boolean updateFlovorsNames(String exisitingFlovorsNames, String updateFlovorsNames){
		   boolean isUpdated = false;
		   for(int flovorIndex = 0; flovorIndex< flovorsNames.length ;flovorIndex++){
			   if(flovorsNames[flovorIndex].equals(exisitingFlovorsNames)){
				   flovorsNames[flovorIndex]= updateFlovorsNames;
				   isUpdated = true; 
}
}
return isUpdated;
}
public static int deleteFlovorsNames(String deleteFlovorsNames){
	System.out.println("Invoking editFlovorsNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int flovorIndex;
	int noOfElements = flovorsNames.length;
	for (flovorIndex = 0; flovorIndex<flovorsNames.length;flovorIndex++){
		if(flovorsNames[flovorIndex].equals(deleteFlovorsNames)){
		break;
		}
	}
	if(flovorIndex<noOfElements){
		noOfElements = noOfElements-1;
		for(int newFlovorIndex = flovorIndex; newFlovorIndex<noOfElements;newFlovorIndex++){
			flovorsNames[newFlovorIndex]= flovorsNames[newFlovorIndex+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllFlovorsNamesPostDeletion(int newLength){
	for(int flovorIndex = 0; flovorIndex< newLength; flovorIndex++){
		System.out.println(flovorsNames[flovorIndex]);
	}
	
}
public static String searchFlovorsByNames(String flovorsNames){
	System.out.println("Invoking getFlovorsByNames");
	System.out.println("No of parameter: 1, type String");
	String fName= null;
	for(String name : flovorsNames){
		
		// "Rocky Road". equals("Rocky Road")
		if(name.equals(flovorsNames)){
			fName= name;
			System.out.println("flovor name is found");
		}
		
		
	}
	
	return fName;	
}
}