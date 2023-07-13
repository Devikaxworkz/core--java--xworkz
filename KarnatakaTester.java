class KarnatakaTester{
public static void main(String cities[]){
	
	// add,create
 Karnataka.addCity("Udpi");
 Karnataka.addCity("Mysuru");
 Karnataka.addCity("Chikamangluru");
 Karnataka.addCity("banglore");
 Karnataka.addCity("MANDYA");
 Karnataka.addCity("DHARVAD");
 Karnataka.addCity("HASSAN");
 
 //read,fetch,get
 Karnataka.getAllCityNames();
 // update,edit
 boolean isUpdated= Karnataka.updateCityNames("banglore","bengaluru");
 System.out.println("Is city name updated" + isUpdated);
 Karnataka.getAllCityNames();
 
 int  newLength = Karnataka.deleteCityNames("MANDYA");
 System.out.println("Calling getAllCityNamesPostDeletion");
 Karnataka.getAllCityNamesPostDeletion(newLength);
}
}