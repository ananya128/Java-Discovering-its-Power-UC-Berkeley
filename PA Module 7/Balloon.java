
public class Balloon {
	
	int pressureOfBalloon=0;
	boolean overInflate=false;
	
	public void inflate() {
		
		pressureOfBalloon += 20;
		if( pressureOfBalloon==100) {
			System.out.println("the balloon is inflated to its max capacity");
		}
		else if(pressureOfBalloon > 100) {
			System.out.println("the balloon is over inflated and has burst !!!!");
			pressureOfBalloon = 0;
		}
	}
	
	
	public static void main(String args[]) {
		Balloon b1 =  new Balloon();
		b1.inflate();
		b1.inflate();
		b1.inflate();
		b1.inflate();
		b1.inflate();
		System.out.println(b1.pressureOfBalloon);
		b1.inflate();
		System.out.println(b1.pressureOfBalloon);
			
		}
	

}
