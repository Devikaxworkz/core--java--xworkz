class MedicalStoreTester{
public static void main(String medicine[]){
 MedicalStore.addMedicine("LOSARTAN");
 MedicalStore.addMedicine("ANTIBIOTICS");
 MedicalStore.addMedicine("ANTIHISTAMINES");
 MedicalStore.addMedicine("GABAPENTIN");
 MedicalStore.addMedicine("OMEPRAZOLE");
 MedicalStore.addMedicine("ATORVASTATIN");
 MedicalStore.addMedicine("LEVOTHROXINE");
 MedicalStore.addMedicine("AYAHUASCA");
 MedicalStore.addMedicine("ALCOHOL");
 MedicalStore.addMedicine("HALLUCINOGENS");
MedicalStore.getAllMedicineNames();
boolean isUpdated= MedicalStore.updateMedicineNames("AYAHUASCA","NAZDOM");
 System.out.println("Is medicine names updated" + isUpdated);
 MedicalStore.getAllMedicineNames();
 int  newLength = MedicalStore.deleteMedicineNames("ALCOHOL");
 System.out.println("Calling getAllMedicineNamesPostDeletion");
 MedicalStore.getAllMedicineNamesPostDeletion(newLength);
}
}