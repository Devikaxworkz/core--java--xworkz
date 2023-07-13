class Karnataka{
static String cityNames[]= {null,null,null,null,null,null,null};
static int index ;
public static boolean addCity(String city){
boolean isAdded = false;
if(index<cityNames.length ){
	if(city!=null&&city.length()> 0){	
		cityNames[index] = city;
		index++;
		isAdded = true;
		System.out.println("city Added" + isAdded);
		}else{
		System.out.println("Cannot add the data at null value");
		}
		}else{
			//System.out.println("size is full cannot add city anymore");
		}
		return isAdded;
	}
	
	
	
		//method
	   public static void getAllCityNames(){
	   System.out.println("Invoking getAllCityNames");
	   for(int city= 0; city< cityNames.length;city++){
	   String reference = cityNames[city];  
	   System.out.println("type of city " + reference +" at index value " + city);
	   }
	   System.out.println("End of getAllCityNames");
	   
	   }
	   public static boolean updateCityNames(String exisitingCityNames, String updateCityNames){
		   boolean isUpdated = false;
		   for(int cityIndex = 0; cityIndex< cityNames.length ;cityIndex++){
			   // "banglore" == "banglore"
			   if(cityNames[cityIndex].equals(exisitingCityNames)){
				   cityNames[cityIndex]= updateCityNames;
				   isUpdated = true;
				   
			   }
		   }
		   
		 return isUpdated;  
	   }
	   public static int deleteCityNames(String deleteCityNames){
	System.out.println("Invoking editCityNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int cityIndex;
	int noOfElements = cityNames.length;
	for (cityIndex = 0; cityIndex<cityNames.length;cityIndex++){
		if(cityNames[cityIndex].equals(deleteCityNames)){
		break;
		}
	}
	if(cityIndex<noOfElements){
		noOfElements = noOfElements-1;
		for(int newCityIndex = cityIndex; newCityIndex<noOfElements;newCityIndex++){
		cityNames[newCityIndex]= cityNames[newCityIndex+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllCityNamesPostDeletion(int newLength){
	for(int cityIndex = 0; cityIndex< newLength; cityIndex++){
		System.out.println(cityNames[cityIndex]);
	}
	
}
}
