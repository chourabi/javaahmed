
public class Operation {
	
	private int salary = 1200;
	
	public Operation() {
		// TODO: Add your code here
	}	
		
	public int somme(int x , int y){
    	return (x+y);
    }
    
    public int somme(int x , int y , int z){
    	return (x+y+z);
    }
    
    
    int getSalary(){
    	return this.salary;
    }
    
    void setSalary( int v ){
    	this.salary = v;
    }
    
    	
}
