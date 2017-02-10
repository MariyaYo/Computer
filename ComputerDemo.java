public class ComputerDemo {
	public static void main(String[] args){
		
		Computer comp1 = new Computer(2002, 200.5, 200.0, 140.0);
		Computer comp2 = new Computer(2010, 1100.99, 1000.0, 950.0, false, "Win 8");
		Computer comp3 = new Computer();
		
		if (comp1.comparePrice(comp2) == 1){
			System.out.println("The second computer is more expensive.");
		}
		else{
			if(comp1.comparePrice(comp2) == -1){
				System.out.println("The first computer is more expensive.");
			}
			else{
				System.out.println("Both computers are equal price.");
			}
		}
	}
}