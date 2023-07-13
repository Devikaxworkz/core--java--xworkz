class Chocalates{
	static  String chocalate[]={"dairymilk","cadboury","milkybar","kitkat"};
	public static void main(String args[]){
		System.out.println("main started");
		System.out.println("List of chocalate");
		getChocalate();
		System.out.println("main ended");
		
		
	  
  }
  public static void getChocalate(){
	  System.out.println("Inside getChocalate");
	  for(String chocalates: chocalate){
		  System.out.println(chocalate);
	  }
  }
}

