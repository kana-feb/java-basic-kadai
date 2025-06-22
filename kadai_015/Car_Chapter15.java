package kadai_015;

public class Car_Chapter15 {

		private int gear = 1;
		private int speed = 10;
		
		public Car_Chapter15(int afterGear,int speed){
			this.gear = afterGear;
			this.speed = speed;
		}
		
		public void gearChange(int afterGear) {
			this.gear = afterGear;
			
	        if (afterGear == 1) {
	            speed = 10;
	        } else if (afterGear == 2) {
	            speed = 20;
	        } else if (afterGear == 3) {
	            speed = 30;
	        } else if (afterGear == 4) {
	            speed = 40;
	        } else if (afterGear == 5) {
	            speed = 50;
	        } else {
	            speed = 10; 
	        }
	        
		}
	

	    public void run() {

		System.out.println("ギア1から" +  gear + "に切り替えました");
		System.out.println("速度は時速"+ speed + "です");
	}

}
