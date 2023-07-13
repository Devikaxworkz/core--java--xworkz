class MedicalStore{
static String medicineNames[]= {null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addMedicine(String medicine){
boolean isAdded = false;
if(medicine!= null){
		medicineNames[index] = medicine;
		index++;
		isAdded = true;
		}else{
		System.out.println("Cannot add the data at null value");
		}
		return isAdded;
		}
		
		//method
	   public static void getAllMedicineNames(){
	   System.out.println("Invoking getAllMedicineNames");
	   for (int medicine= 0; medicine< medicineNames.length;medicine++){
	   String reference = medicineNames[medicine];  
	   System.out.println("type of places " + reference +" at index value " + medicine);
	   }
	   System.out.println("End of getAllMedicineNames");
	   
	   }
public static boolean updateMedicineNames(String exisitingMedicineNames, String updateMedicineNames){
		   boolean isUpdated = false;
		   for(int medicineIndex = 0; medicineIndex< medicineNames.length ;medicineIndex++){
			   if(medicineNames[medicineIndex].equals(exisitingMedicineNames)){
				   medicineNames[medicineIndex]= updateMedicineNames;
				   isUpdated = true; 
}
}
return isUpdated;
}
public static int deleteMedicineNames(String deleteMedicineNames){
	System.out.println("Invoking editMedicineNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int medicineIndex;
	int noOfElements = medicineNames.length;
	for (medicineIndex = 0; medicineIndex<medicineNames.length;medicineIndex++){
		if(medicineNames[medicineIndex].equals(deleteMedicineNames)){
		break;
		}
	}
	if(medicineIndex<noOfElements){
		noOfElements = noOfElements-1;
		for(int newMedicineIndex = medicineIndex; newMedicineIndex<noOfElements;newMedicineIndex++){
			medicineNames[newMedicineIndex]= medicineNames[newMedicineIndex+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllMedicineNamesPostDeletion(int newLength){
	for(int medicineIndex = 0; medicineIndex< newLength; medicineIndex++){
		System.out.println(medicineNames[medicineIndex]);
	}
	
}
}
