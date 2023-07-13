class GardenTester{
public static void main(String flowers[]){
 Garden.createFlower("LILY");
 Garden.createFlower("ROSE");
 Garden.createFlower("LOTUS");
 Garden.createFlower("JASMINE");
 Garden.createFlower("DAFFODIL");
 Garden.createFlower("IRIS");
 Garden.createFlower("TULIP");
 Garden.getAllFlowerNames();
 boolean isUpdated= Garden.updateFlowerNames("DAFFODIL","MARIGOLD");
 System.out.println("Is flower name updated" + isUpdated);
 Garden.getAllFlowerNames();
   int  newLength = Garden.deleteFlowerNames("LOTUS");
 System.out.println("Calling getAllFlowerNamesPostDeletion");
 Garden.getAllFlowerNamesPostDeletion(newLength);
}
}
