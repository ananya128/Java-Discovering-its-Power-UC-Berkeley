
public class module5 {
	interface Domestic { }
	interface Import { }
	interface Japanese extends Import { }
	interface German extends Import { }
	interface Detroit extends Domestic { }
	interface SpringHill extends Domestic { }



	interface Vehicle { 
		int getWeightInPounds();
	}
	interface Automobile extends Vehicle { }
	interface LargeAutomobile extends Vehicle { }
	interface Sedan extends Automobile { }
	interface Van extends LargeAutomobile { }
	interface Truck extends LargeAutomobile { }
	interface Compact extends Automobile { }
	interface SportsUtilityVehicle extends Truck, Van { }

	class SaturnSL1 implements SpringHill,Sedan { 
		public int getWeightInPounds() {
			return 1000;
		}
	}
	class HondaCivic implements Japanese,Compact { 
		public int getWeightInPounds() {
			return 1000;
		}
	}
	class MercedesC230 implements German,Sedan { 
		public int getWeightInPounds() {
			return 1000;
		}
	}
	class ChevyS10 implements Detroit,Truck { 
		public int getWeightInPounds() {
			return 2500;
		}
	}
	class SubaruOutback implements Japanese,SportsUtilityVehicle {
		public int getWeightInPounds() {
			return 2500;
		}
	}


	public class ParkingGarage{
		int maxVehicles = 20;
		int maxWeight = 25000;
		int numOfVehicles=0;
		int weightOfAll=0;
		
		public void parkCar(Vehicle v) {
			if(numOfVehicles < maxVehicles && weightOfAll +  v.getWeightInPounds()<maxWeight) 
			{
				numOfVehicles++;
				weightOfAll = weightOfAll + v.getWeightInPounds();
				
			}
			else {
				System.out.println("Sorry the garage is filled to its capacity");
			}
			}
		
		void main() {
			System.out.println("the current capacity of garage is "+ numOfVehicles +
					" number of vehicles and "+ weightOfAll + " in pounds ");
		}
		
		
	}


		  public static void main(String[] args) {
			  SaturnSL1 sl =  new module5().new SaturnSL1();
			  HondaCivic hc = new module5().new HondaCivic();
			  SubaruOutback so = new module5().new SubaruOutback();
			  
			  ParkingGarage pk1 = new module5().new ParkingGarage();
			  pk1.parkCar(sl);
			  pk1.parkCar(hc);
			  pk1.parkCar(so);
			  pk1.main();
		  }

}
