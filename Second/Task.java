package Second;

public class Task {
	private String name;
	private int workingHours = 8;
	
	
	
	Task(String name, int workingHours){
		if(name!= null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Steve";
		}
		this.setWorkingHours(workingHours);
	}
	
	public int getWorkingHours() {
		return workingHours;
	}
	
	public void setWorkingHours(int workingHours) {
		if(workingHours >= 0 && workingHours < this.workingHours){
		this.workingHours = workingHours;
		}
	}
	
	public String getName() {
		return name;
	}	
}
