class TelecomTester{
public static void main(String sims[]){
 Telecom.addSim("JIO");
 Telecom.addSim("AIRTEL");
 Telecom.addSim("VODOFONE");
 Telecom.addSim("BSNL");
 Telecom.addSim("IDEA");
 Telecom.addSim("DOCOMO");
 Telecom.addSim("POCO");
 Telecom.getAllSimNames();
 
 boolean isUpdated= Telecom.updateSimNames("DOCOMO","TATA DOCOMO");
 System.out.println("Is sim name updated" + isUpdated);
 Telecom.getAllSimNames();
  int  newLength = Telecom.deleteSimNames("JIO");
 System.out.println("Calling getAllSimNamesPostDeletion");
 Telecom.getAllSimNamesPostDeletion(newLength);
}
}