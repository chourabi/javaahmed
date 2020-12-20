
public class Cat extends Animal {
	String name;
	public Cat(String name) throws ErrException{
		if( name.length() >=3 ){
			this.name= name;
		}else{
			throw new ErrException("Sorry cat name cannot be less than 3 chas");
		}
	}

		
	public  void animalSleep(){
		System.out.print("Cat is zZzZz");
	}	
		
	public  void animalSleep(int hours) throws SleepException {
		
		if( hours <= 5 ){
			System.out.print("Cat is zZzZz");
		}else{
			throw new SleepException("Sorry cat cannot sleep more than 5 hours");
		}
		
	}	
		
		
}
