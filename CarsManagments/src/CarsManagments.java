/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 20/12/20
 */
public class CarsManagments {
    
    
    public static void main(String[] args) {
        VehiculeManager v = new VehiculeManager();
        
        
        v.addNewVehicule();
        v.addNewVehicule();
        
        
        
        
        v.showListVehicules();
        
       	if( v.updateOdometre("2001TU200",150000)){
       		System.out.println("Odo updated successfully");
       	}else{
       		System.out.println("Cannot find car whith mat : 2001TU200");
       	}
       	
       	v.showListVehicules();
       	
       	if( v.deleteVehicule("2001TU200")){
       		System.out.println("deleted successfully");
       	}else{
       		System.out.println("Cannot find car whith mat : 2001TU200");
       	}
       	
       	 if( v.deleteVehicule("201TU200")){
       		System.out.println("deleted successfully");
       	}else{
       		System.out.println("Cannot find car whith mat : 2001TU200");
       	}
       	
       	
       	v.showListVehicules();
       	
       	
    }
}