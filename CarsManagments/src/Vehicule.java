
public class Vehicule {
	
	private float odometre;
	private String matricul;
	private Model model;
	private String color;
	private int nbrDors;
	
	
	public Vehicule( 
		
	float odometre,
	String matricul,
	Model model,
	String color,
	int nbrDors
	
	) {
		
	this.odometre = odometre;
	this.matricul = matricul ;
	this.model = model;
	this.color = color;
	this.nbrDors = nbrDors;
	
	}
	
	
	
	float getOdometre(){
		return this.odometre;
	}	
	void setOdometre(float o){
	  	this.odometre = o;
	}	
	
	String getMatricul(){
		return this.matricul;
	}	
	void setMatricul(String matricul){
	  	this.matricul = matricul;
	}	
		
	Model getModel(){
		return this.model;
	}	
	
	void setModel( String m){
		this.model.setModelName(m);
	}
	
	 String getColor(){
	 	return this.color;
	 }
	 
	 void getColor(String c){
	 	this.color = c;
	 }
	 
	 
	 int  getNbrDors(){
	 	return this.nbrDors;
	 }
	 
	 void setNbrDors(int n){
	 	this.nbrDors = n;
	 }
	 
	 void showVehiculeDetails(){
	 	System.out.println(" * model: "+ model.getModelName() +", Mark : "+model.getMarkName()+", odo : "+odometre+", color : "+color+" * ");
	 }
	 
	 

		
}
