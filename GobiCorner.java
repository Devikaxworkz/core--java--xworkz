class GobiCorner{

      String location ="Mandya";
	  static String gobi ="vegetable munchuri";
	  static String gobi1 ="popcorn munchuri";
	  static String gobi2 ="dry munchuri";
	  static String gobiAvaliable[]={"gobi","gobi1","gobi2"};
	  
	  public static void getAllGobiAvaliable(){
	  System.out.println("Invoking getAllGobiAvaliable");
	  for(int gobi=0; gobi<gobiAvaliable.length;gobi++){
	  String reference = gobiAvaliable[gobi];
	  System.out.println(reference);	  
	  }
	  System.out.println("End of getAllGobiAvaliable");
}
}