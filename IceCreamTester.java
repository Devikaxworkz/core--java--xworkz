class IceCreamTester{
public static void main(String flovors[]){
 IceCream.addFlovor("STRABERRY");
 IceCream.addFlovor("BUTTER PECAN");
 IceCream.addFlovor("ROCKY ROAD");
 IceCream.addFlovor("VANILLA");
 IceCream.addFlovor("MINT CHOCOLATE");
 IceCream.addFlovor("COOKIES CREAM");
 IceCream.addFlovor("PURPLE CREAM");
 IceCream.getAllFlovorsNames();
 boolean isUpdated= IceCream.updateFlovorsNames("PURPLE CREAM","YELLOW MINT");
 System.out.println("Is flovor name updated" + isUpdated);
 IceCream.getAllFlovorsNames();
 
 int  newLength = IceCream.deleteFlovorsNames("VANILLA");
 System.out.println("Calling getAllFlovorsNamesPostDeletion");
 IceCream.getAllFlovorsNamesPostDeletion(newLength);
}
}