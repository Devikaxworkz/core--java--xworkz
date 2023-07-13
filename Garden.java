class Garden{
static String flowerNames[]= {null,null,null,null,null,null,null};
static int index;
public static boolean createFlower(String flower){
boolean isCreated = false;
if(flower!= null){
		flowerNames[index] = flower;
		index++;
		isCreated = true;
		}else{
		System.out.println("Cannot add the data at null value");
		}
		return isCreated;
		}
		
		//method
	   public static void getAllFlowerNames(){
	   System.out.println("Invoking getAllFlowerNames");
	   for (int flower= 0; flower< flowerNames.length;flower++){
	   String reference = flowerNames[flower];  
	   System.out.println("type of flower " + reference +" at index value " + flower);
	   }
	   System.out.println("End of getAllFlowerNames");
	   
	   }
 public static boolean updateFlowerNames(String exisitingFlowerNames, String updateFlowerNames){
		   boolean isUpdated = false;
		   for(int flowerIndex = 0; flowerIndex< flowerNames.length ;flowerIndex++){
			   if(flowerNames[flowerIndex].equals(exisitingFlowerNames)){
				   flowerNames[flowerIndex]= updateFlowerNames;
				   isUpdated = true;
				   
			   }
		   }
		   
		 return isUpdated;  
	   }
	   public static int deleteFlowerNames(String deleteFlowerNames){
	System.out.println("Invoking editFlowerNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int flowerIndex;
	int noOfElements = flowerNames.length;
	for (flowerIndex = 0; flowerIndex<flowerNames.length;flowerIndex++){
		if(flowerNames[flowerIndex].equals(deleteFlowerNames)){
		break;
		}
	}
	if(flowerIndex<noOfElements){
		noOfElements = noOfElements-1;
		for(int newFlowerIndex = flowerIndex; newFlowerIndex<noOfElements;newFlowerIndex++){
		flowerNames[newFlowerIndex]= flowerNames[newFlowerIndex+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllFlowerNamesPostDeletion(int newLength){
	for(int flowerIndex = 0; flowerIndex< newLength; flowerIndex++){
		System.out.println(flowerNames[flowerIndex]);
	}
	
}
	   }