/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 20/12/15
 */
import java.util.*;
 
public class Tuto {
    

    public static void main(String[] args) {
        //;
        
        /*Operation o = new Operation();
        o.setSalary(15);
        System.out.println("hi salary :"+ o.getSalary() );*/
        
        
        /*Shape s = new Shape("Square");
        Square s1 = new Square("Square",18);
        
        Shape s3 = new Square("Square",15);
        
        s.hasName();
        
        s1.hasName();
        
        s3.hasName();*/
        
        // error cannot create Absract class
       // Animal a = new Animal();
       
       /*Cat c  = new Cat();
       
       c.animalSleep();
       
       c.sleep();
       
       Hero h = new Hero();
       
      h.canJump();
      h.canPunch();
      h.canWalk();*/
      
      
     /* Scanner s = new Scanner(System.in);
      
      String username;
      
      System.out.println("Enter user name :");
      username = s.nextLine();
      
      System.out.println("User name is : "+username);*/
      
        
        
        
	 /* ArrayList<Integer> x = new ArrayList<Integer>();
	  
	  
	  
	  
	  x.add(5);
	  x.add(6);
	  x.add(7);
	  System.out.println(x.toString()+x.size());*/
	  
	  
	  
	 // x.forEach( tmp -> System.out.println(tmp) );
	 
	 /*for( Integer tmp : x ){
	 	System.out.println(tmp);
	 }*/
	  
	  
	  //x.remove(0);
	  
	 // x.set(0,192);
	  
	  
	  
	  //x.clear();
	  /*System.out.println(x.toString()+x.size());
	  
	  
	  
        
        int x=;

		String y = "4";
		
		x= Integer.parseInt(y);  */
			
		
		
		/*ArrayList<Cat> cats = new ArrayList<Cat>();
		
		Cat c1 = new Cat("michou");
		Cat c2 = new Cat("sousou");
		Cat c3 = new Cat("mimi");
		
			
		cats.add(c1);
		cats.add(c2);
		cats.add(c3);
		
		for(Cat c : cats){
			System.out.println(c.name);
		}*/
		/*Cat c1 = new Cat("michou");
		Cat c2 = new Cat("sousou");
		Cat c3 = new Cat("mimi");
		
		
		HashMap<String, Cat> cats = new HashMap<String, Cat>();	
			
			
		cats.put("cat1",c1);
		cats.put("cat2",c2);
		cats.put("cat3",c3);
		
		System.out.println(cats.toString());
		
		Cat tm = cats.get("cat1");
		
		System.out.println(tm.name);	*/
		
		
	/*	ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(15);
		numbers.add(9);
		numbers.add(2);
		numbers.add(18);
		
		Iterator<Integer> it = numbers.iterator();
		
		while( it.hasNext() ){
			Integer i = it.next();
			
			if( i < 10 ){
				it.remove();
			}
		}
		
		System.out.println(numbers);*/
		
		
		
		
	/*	int x = 15;
		int y = 0;
		float r = 0;
		
		try{
			r = x/y;
		}catch( ArithmeticException e ){
			System.out.println("Sorry can't devide by zero");
		}catch( Exception e ){
			System.out.println("Something went wrong : "+e.toString());
		}
		
		System.out.println( "x / y = "+ r );*/
		
		
		// custom Exception
		
		
		Cat c;
		try{
			c = new Cat("zouzou");
			
			c.animalSleep(10);
			
		}catch( ErrException e ){
			System.out.println(e);
		}catch ( SleepException e ){
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			     
        
        
    }
}