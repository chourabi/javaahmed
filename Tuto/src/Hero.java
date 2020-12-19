


enum Level {
  LOW,
  MEDIUM,
  HIGH
}




public class Hero implements HeroActions {
	int health;
	int speed;
	//etc
	
	public Hero() {
		// TODO: Add your code here
	}	
		
	public void canWalk(){
		System.out.println("hero is walking "+Level.LOW);
	}
	public void canJump(){
		System.out.println("hero is jumping");
	}
	public void canPunch(){
		System.out.println("hero is punching");
	}
		
		
}
