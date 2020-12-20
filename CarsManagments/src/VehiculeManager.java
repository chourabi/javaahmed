
import java.util.*;

public class VehiculeManager implements VehiculeManegerActions {
	
	
	private ArrayList<Vehicule> vehicules;
	Scanner s ;
	
	public VehiculeManager() {
		vehicules = new ArrayList<Vehicule>();
		s = new Scanner(System.in);
	}
	
	public void addNewVehicule(){
	 float odometre;
	 String matricul;
	 Model model;
	 String color;
	 int nbrDors;
	 
	 String markName;
	 String modelName;
	 
	 System.out.println("Donner le model");
	 modelName = s.nextLine();
	 System.out.println("Donner la mark");
	 markName = s.nextLine();
	 
	 System.out.println("Donner la matricul");
	 matricul = s.nextLine();
	 
	 model = new Model(modelName,markName);
	 
	 System.out.println("Donner le kilometrage");
	 odometre = Float.parseFloat(s.nextLine());
	 
	 System.out.println("Donner la couleur");
	 color = s.nextLine();
	 
	 
	 System.out.println("Donner le nombre des portes");
	 nbrDors = Integer.parseInt( s.nextLine()) ;
	 
	 Vehicule tmp = new Vehicule(odometre,matricul,model,color,nbrDors);
	 
	 this.vehicules.add(tmp);
	
	}
	
	public boolean  updateOdometre(String matricul,float odo){
		for( Vehicule v : this.vehicules ){
			if( v.getMatricul().compareTo(matricul) == 0 ){
				v.setOdometre(odo);
				return true;
			}
		}
		
		return false;	
	}
	
	
	public 	boolean  deleteVehicule(String matricul){
			Iterator<Vehicule> i = this.vehicules.iterator();
			
			if( i.hasNext() ){
				Vehicule v = i.next();
				if( v.getMatricul().compareTo(matricul) == 0 ){
					i.remove();
					return true;
				}
				
			}
			
			return false;
	
	
		}
	
	
	
	
	public void showListVehicules(){
		for( Vehicule v : this.vehicules ){
			v.showVehiculeDetails();
		}
	}
		
}
