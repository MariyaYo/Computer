public class Computer {

	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	Computer(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		if(year >= 2000 && year <2009){ //Sorry but after that it should be win7, and below well this task asks for winXP so win98 doesn't exist in this universe...
			this.year = year;
		}
		else{
			if(year >= 2009 && year <2016){ //and then win10 was forced to us
				this.operationSystem = "Win 7";
				this.year = year;
			}
			else{
				if(year >=2016){
					this.operationSystem = "Win10";
					this.year = year;
				}
			}
		}
		if(price > 0){
			this.price = price;
		}
		if (hardDiskMemory >= 100){ //that should be about right ...don't know if i have to make a memory cap here... 
			this.hardDiskMemory = hardDiskMemory;
		}
		if(freeMemory <this.hardDiskMemory - 50){ //for OS.. kind of generous amount of space ..oh well
			this.freeMemory = freeMemory;
		}
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory, boolean isNotebook, String operationSystem){
		if(year >= 2000){
			this.year = year;
		}
		if(price > 0){
			this.price = price;
		}
		if (hardDiskMemory >100){
			this.hardDiskMemory = hardDiskMemory;
		}
		if(operationSystem != null){
			this.operationSystem = operationSystem;
		}
		else{
			this.operationSystem = "WinXP";   //default win 
		}
		if(freeMemory < this.hardDiskMemory - 50){ 
			this.freeMemory = this.hardDiskMemory - 50; //that's a new computer! it should be empty
		}
		else{
			this.freeMemory = freeMemory; //external memory i guess
		}
		this.isNotebook = isNotebook;

	}
	
	int comparePrice(Computer c){
		if (this.price > c.price){
			return -1;
		}
		else{
			if(this.price < c.price){
				return 1;
			}
		}
		return 0;
	}
}