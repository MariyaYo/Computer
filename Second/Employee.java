package Second;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	
	
	Employee(String name){
		//no need of setter... you don't change your name everyday
		if(name!= null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Steve";
		}
	}


	public Task getCurrentTask() {
		return currentTask;
	}


	public void setCurrentTask(Task currentTask) {
		if(currentTask !=null){
			this.currentTask = currentTask;
		}else{
			this.currentTask = new Task("No work available", 3);
		}
	}


	public int getHoursLeft() {
		return hoursLeft;
	}


	public void setHoursLeft(int hoursLeft) {
		if(hoursLeft > 0){
		this.hoursLeft = hoursLeft;
		}
		else{
			this.hoursLeft = 0;
		}
	}


	public String getName() {
		return name;
	}
	
	void work(){
		if(this.getCurrentTask()!=null){
			if(this.getHoursLeft() < this.currentTask.getWorkingHours()){
				int a = this.currentTask.getWorkingHours() - this.getHoursLeft();
				this.setHoursLeft(0);
				this.currentTask.setWorkingHours(a);
			}
			else{
				int a = this.getHoursLeft() - this.currentTask.getWorkingHours();
				this.setHoursLeft(a);
				this.currentTask.setWorkingHours(0);
			}
		}	
	}
	
	void showReport(){
		this.work();
		if(this.getCurrentTask()!= null){
			System.out.println("Employee: " + this.name);
			System.out.println("His/Her Task: " + this.currentTask.getName());
			System.out.println("Hours 'til the end of his/her shift: " + this.getHoursLeft());
			System.out.println("Hours left 'til the end of his/her task:" + this.currentTask.getWorkingHours());
		}
	}
	
}
