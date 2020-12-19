
public class Square extends Shape {

	int degree;	
	int side;	
	public Square(String name,int side) {
		super(name);
		this.degree = 90;
		this.side = side;
	}	
		
	public void hasName(){
		System.out.println("has name from sub class");
	}	
		
		
	public void hasNameAndShape(){
		
	}	
}
