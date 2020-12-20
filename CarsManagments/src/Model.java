
public class Model extends Mark {
	
	private String name;
	
	public Model(String name, String markName) {
		super(markName);
		this.name = name;
	}
	
	String getModelName(){
		return name;
	}	
	
	void setModelName(String n){
		this.name = n;
	}	
	
		
}
