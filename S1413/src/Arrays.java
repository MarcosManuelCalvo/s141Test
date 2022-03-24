class Arrays {
	private int id;
	
	Arrays() throws ArrayIndexOutOfBoundsException{
		try{  	  
			/*String e = "oscar";
			if(e.contains("car")) {
				System.out.println(e);
			}*/
			int myArray[]=new int[5];    
			myArray[5]=10/10;    
		} 
		catch(ArrayIndexOutOfBoundsException e){
			//System.out.println(e);
			throw new ArrayIndexOutOfBoundsException("errorDeRango");
			
		}
	}
}