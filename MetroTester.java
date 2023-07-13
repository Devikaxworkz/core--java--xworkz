class MetroTester{
public static void main(String stations[]){
 Metro.addStation("whitefield");
 Metro.addStation("indiranagar");
 Metro.addStation("halasuru");
 Metro.addStation("MG road");
 Metro.addStation("majestic");
 Metro.addStation("kengerii");
 Metro.addStation("nayandana hali");
 Metro.addStation("bhanashakari");
 Metro.getAllStationNames();
  boolean isUpdated= Metro.updateStationNames("kengerii","jaynagar");
 System.out.println("Is station name updated" + isUpdated);
 Metro.getAllStationNames();
 
 int  newLength = Metro.deleteStationNames("kengerii");
 System.out.println("Calling getAllStationNamesPostDeletion");
 Metro.getAllStationNamesPostDeletion(newLength);
}
}