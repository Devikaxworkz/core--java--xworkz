class TravelAgencyTester{
public static void main(String tourist[]){
 TravelAgency.addTourist("MANALI");
 TravelAgency.addTourist("LEH LADAKH");
 TravelAgency.addTourist("COORG");
 TravelAgency.addTourist("ANDAMAN");
 TravelAgency.addTourist("LAKSHADEEP");
 TravelAgency.addTourist("GOA");
 TravelAgency.addTourist("UDAIPUR");
 TravelAgency.addTourist("SRINAGAR");
 TravelAgency.addTourist("GANGTOK");
TravelAgency.getAllTouristPlaces();
  boolean isUpdated= TravelAgency.updateTouristPlaces("COORG","KERALA");
 System.out.println("Is tourist places updated" + isUpdated);
 TravelAgency.getAllTouristPlaces();
 
  int  newLength = TravelAgency.deleteTouristPlaces("GOA");
 System.out.println("Calling getAllTouristPlacesPostDeletion");
 TravelAgency.getAllTouristPlacesPostDeletion(newLength);
}
}